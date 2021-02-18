package Vista;

import Controlador.Ctrl_Oracle;
import java.io.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Consultas extends javax.swing.JFrame {

    public static Ctrl_Oracle co; 
    int i = 0;

    public Consultas() {    
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch(Exception ex) {}
        initComponents();
        dlgFormulario.setLocationRelativeTo(null); 
        dlgFormulario.pack();
        modificarLblSistema();
        rellenarFormulario();
        
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
               //all cells false
               return false;
            }
        };
        tblTablas.setModel(model);
    }
    
    public void modificarLblSistema() {
        String hostname = "Unknown";

        try {
            InetAddress addr;
            addr = InetAddress.getLocalHost();
            hostname = addr.getHostName();
            lblNombreSistema.setText(hostname);
        } catch (UnknownHostException ex) {
            System.out.println("No se ha podido encontrar el nombre del equipo.");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgFormulario = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        txtPuerto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        txtServidor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblNombreSistema = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        chxRecordar = new javax.swing.JCheckBox();
        btnConectar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmbColumnas1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cmbTablas = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cmbColumnas2 = new javax.swing.JComboBox<>();
        cmbOperadores = new javax.swing.JComboBox<>();
        txtFiltro = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtEjecutar = new javax.swing.JTextField();
        btnEjecutar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTablas = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        mniLimpiar = new javax.swing.JMenuItem();

        dlgFormulario.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dlgFormulario.setTitle("Iniciar sesión");
        dlgFormulario.setResizable(false);
        dlgFormulario.setSize(new java.awt.Dimension(428, 542));

        jPanel3.setToolTipText("");
        jPanel3.setMaximumSize(new java.awt.Dimension(428, 542));
        jPanel3.setMinimumSize(new java.awt.Dimension(428, 542));

        txtPuerto.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtPuerto.setText("1521");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Oracle.png"))); // NOI18N

        txtContrasena.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtServidor.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtServidor.setText("@localhost");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setText("Servidor");

        lblNombreSistema.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNombreSistema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreSistema.setText("Usuario");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Bienvenido al consultor personalizado de SQL");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setText("Puerto");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel10.setText("Contraseña");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel11.setText("Usuario");

        chxRecordar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        chxRecordar.setText("Recordar estos datos para la siguiente sesión");

        btnConectar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        btnConectar.setText("Conectar");
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreSistema, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtServidor)
                    .addComponent(txtPuerto)
                    .addComponent(txtUsuario)
                    .addComponent(txtContrasena)
                    .addComponent(chxRecordar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombreSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(chxRecordar)
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        dlgFormulario.getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestor de consultas de José Carlos López Henestrosa");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Parámetros de la consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 15))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setText("SELECT");

        cmbColumnas1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setText("FROM");

        cmbTablas.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cmbTablas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTablasItemStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setText("WHERE");

        cmbColumnas2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cmbColumnas2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbColumnas2ItemStateChanged(evt);
            }
        });

        cmbOperadores.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txtFiltro.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtFiltro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFiltroFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbColumnas1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbTablas, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbColumnas2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(cmbOperadores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbColumnas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cmbTablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cmbColumnas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbOperadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Consulta a realizar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 15))); // NOI18N

        txtEjecutar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        btnEjecutar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnEjecutar.setText("Ejecutar");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NOTA: Si deseas buscar un registro que empiece por, por ejemplo, \"PE\", tienes que poner al final el carácter %. De igual forma, si deseas que");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("el registro termine por \"PE\", tendrás que poner al principio el carácter %, quedando como resultado %PE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtEjecutar)
                        .addGap(21, 21, 21)
                        .addComponent(btnEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 926, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEjecutar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        tblTablas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTablas);

        jMenu2.setText("Consulta");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        mniLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        mniLimpiar.setText("Limpiar consulta");
        mniLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLimpiarActionPerformed(evt);
            }
        });
        jMenu2.add(mniLimpiar);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLimpiarActionPerformed
        DefaultTableModel model = (DefaultTableModel)tblTablas.getModel();
        model.setRowCount(0);
        model.setColumnCount(0);
        txtEjecutar.setText("");
    }//GEN-LAST:event_mniLimpiarActionPerformed

    private void rellenarFormulario() {
        File f = new File("conexion.txt");
        BufferedReader reader;
        
        if (f.exists() && !f.isDirectory()) {
            try {
                reader = new BufferedReader(new FileReader(f));
                
                txtServidor.setText(reader.readLine());
                txtPuerto.setText(reader.readLine());
                txtUsuario.setText(reader.readLine());
                txtContrasena.setText(reader.readLine());
                
                reader.close();
            } catch (Exception ex) {}
        } 
    }
    
    private void txtFiltroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFiltroFocusLost
        String column1 = (String) cmbColumnas1.getSelectedItem().toString(); 
        String table = (String) cmbTablas.getSelectedItem().toString(); 
        String column2 = (String) cmbColumnas2.getSelectedItem().toString(); 
        String operador = (String) cmbOperadores.getSelectedItem().toString(); 
        String filtro = txtFiltro.getText(); 

        String consulta = "SELECT " + column1 + " FROM " + table + " WHERE " + column2 + " " + operador + " " + "'" + filtro + "'"; 
        
        txtEjecutar.setText(consulta);
    }//GEN-LAST:event_txtFiltroFocusLost

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        String sentencia = txtEjecutar.getText();
        
        DefaultTableModel model = (DefaultTableModel)tblTablas.getModel();
        co.ejecutarConsulta(sentencia, model);
    }//GEN-LAST:event_btnEjecutarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        String servidor = txtServidor.getText();
        String puerto = txtPuerto.getText();
        String usuario = txtUsuario.getText();
        String contrasena = txtContrasena.getText();

        co = new Ctrl_Oracle();
        
        if (co.conectarBD(servidor, puerto, usuario, contrasena)) {
            this.setVisible(true);
            this.setLocationRelativeTo(null);
            dlgFormulario.dispose();
            
            co.obtenerTablas(cmbTablas);
            co.obtenerColumnas(cmbColumnas1, cmbColumnas2);
            
            if (chxRecordar.isSelected()) {
                try {
                    BufferedWriter bw = new BufferedWriter(new FileWriter("conexion.txt"));
                    bw.write(servidor);
                    bw.newLine();
                    bw.write(puerto);
                    bw.newLine();
                    bw.write(usuario);
                    bw.newLine();
                    bw.write(contrasena);
                    bw.newLine();
                    bw.close();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "No se han podido escribir los datos en el fichero.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Conexión fallida", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }//GEN-LAST:event_btnConectarActionPerformed

    private void cmbColumnas2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbColumnas2ItemStateChanged
        if (i >= 1) {
            int index = 1 + cmbColumnas2.getSelectedIndex();
            String tabla = cmbTablas.getSelectedItem().toString();
            co.setOperadores(index, cmbOperadores, tabla);
        }
        i++;
    }//GEN-LAST:event_cmbColumnas2ItemStateChanged

    private void cmbTablasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTablasItemStateChanged
        DefaultTableModel model = (DefaultTableModel)tblTablas.getModel();
        String sentencia = "SELECT * FROM " + cmbTablas.getSelectedItem().toString();
        co.ejecutarConsulta(sentencia, model);
    }//GEN-LAST:event_cmbTablasItemStateChanged
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultas().dlgFormulario.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConectar;
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JCheckBox chxRecordar;
    public javax.swing.JComboBox<String> cmbColumnas1;
    public javax.swing.JComboBox<String> cmbColumnas2;
    public javax.swing.JComboBox<String> cmbOperadores;
    public javax.swing.JComboBox<String> cmbTablas;
    private javax.swing.JDialog dlgFormulario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombreSistema;
    private javax.swing.JMenuItem mniLimpiar;
    public javax.swing.JTable tblTablas;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtEjecutar;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JTextField txtPuerto;
    private javax.swing.JTextField txtServidor;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
