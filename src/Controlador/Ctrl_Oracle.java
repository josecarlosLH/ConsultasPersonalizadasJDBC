package Controlador;

import Vista.Consultas;
import java.sql.*;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Ctrl_Oracle {

    public Ctrl_Oracle() {
        this.con = new Consultas();
    }
 
    public Connection conexion;
    private ResultSet rs;
    private DatabaseMetaData md;
    private Statement st;
    private Consultas con;
    private boolean resultado;
        
    public boolean conectarBD(String servidor, String puerto, String usuario, String contrasena) {
        try {
            conexion = DriverManager.getConnection("jdbc:oracle:thin:" + servidor + ":" + puerto + ":xe", usuario, contrasena);
            resultado = true;
        } catch (SQLException ex) {
            resultado = false;
        }
        return resultado;
    }
    
    public Connection getConexion() {
        return conexion;
    }
    
    public boolean getResultado() {
        return resultado;
    }

    public void obtenerTablas(JComboBox cmbTablas) {
        String[] tipos = {"TABLE","VIEW"};
        
        try {
            md = conexion.getMetaData();
            rs = md.getTables(null, md.getUserName(), "%", tipos);
            
            while (rs.next()) {
                cmbTablas.addItem(rs.getString(3));
            }
            
            rs.close();
        } catch (SQLException ex) {}        
    }
    
    public void obtenerColumnas(JComboBox cmbColumnas1, JComboBox cmbColumnas2) {
        try {
            rs = md.getColumns(null, md.getUserName(), "%", null);

            cmbColumnas1.removeAllItems();
            cmbColumnas2.removeAllItems();
            cmbColumnas1.addItem("*");

            while (rs.next()) {
                cmbColumnas1.addItem(rs.getString(4));
                cmbColumnas2.addItem(rs.getString(4));
            }
            
            rs.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudieron obtener las columnas.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void setOperadores(int index, JComboBox cmbOperadores, String tabla) {
        try {
            st = conexion.createStatement();
            rs = st.executeQuery("SELECT * FROM " + tabla);
            ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
                        
            String tipoOperador = rsmd.getColumnTypeName(index);
            cmbOperadores.removeAllItems();
            
            if ("NUMBER".equals(tipoOperador) || "DATE".equals(tipoOperador) || "LONG".equals(tipoOperador) || "FLOAT".equals(tipoOperador) || "DOUBLE".equals(tipoOperador) || "NUMERIC".equals(tipoOperador) || "INTEGER".equals(tipoOperador)) {
                cmbOperadores.addItem("<");
                cmbOperadores.addItem("<=");
                cmbOperadores.addItem(">");
                cmbOperadores.addItem(">=");
                cmbOperadores.addItem("=");
            } else if ("VARCHAR".equals(tipoOperador) || "VARCHAR2".equals(tipoOperador)) {
                cmbOperadores.addItem("NOT LIKE");
                cmbOperadores.addItem("LIKE");
                cmbOperadores.addItem("=");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudieron obtener los operadores.", "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    
    public void ejecutarConsulta(String sentencia, DefaultTableModel model) {
        try {
            st = conexion.createStatement();
            rs = st.executeQuery(sentencia);

            ResultSetMetaData metaData = rs.getMetaData();
            model.setRowCount(0);
            model.setColumnCount(0);
            
            int numeroColumnas = metaData.getColumnCount();
            
            for (int column = 1; column <= numeroColumnas; column++) {
                model.addColumn(metaData.getColumnName(column));
            }
            
            Vector<Vector<Object>> datosFila = new Vector<Vector<Object>>();
            while (rs.next()) {
                Vector<Object> vector = new Vector<Object>();
                for (int columnaIndex = 1; columnaIndex <= numeroColumnas; columnaIndex++) {
                    vector.add(rs.getObject(columnaIndex));
                }
                datosFila.add(vector);
                model.addRow(vector);
            }      

            st.close();
            rs.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void cerrarConexion() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        } catch (SQLException ex) {
            
        }
    }
}