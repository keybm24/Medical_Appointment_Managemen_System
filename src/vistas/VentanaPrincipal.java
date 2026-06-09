package vistas;

import javax.swing.ImageIcon;
import java.awt.Image;
import modelos.Medico;
import javax.swing.JOptionPane;
import dao.Conexion;
import dao.MedicoDAO;

/**
 *
 * @author Keilyn Barrantes Mora
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    private Medico medicoDemo;
    public VentanaPrincipal() {
        initComponents();
        
        
        System.out.println(">>> ENTRÓ AL CONSTRUCTOR <<<");
        dao.Conexion.getConexion();

        
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        
        txtEmail.setBorder(
            javax.swing.BorderFactory.createCompoundBorder(
            txtEmail.getBorder(),
                javax.swing.BorderFactory.createEmptyBorder(5, 8, 5, 8)
            )
        );
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        
        txtPassword.setBorder(
            javax.swing.BorderFactory.createCompoundBorder(
            txtPassword.getBorder(),
                javax.swing.BorderFactory.createEmptyBorder(5, 8, 5, 8)
            )
        );

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        button1 = new java.awt.Button();
        txtPassword = new javax.swing.JPasswordField();
        textField1 = new java.awt.TextField();
        txtEmail = new javax.swing.JTextField();
        btnRegistrarMedico = new javax.swing.JButton();
        btnVerMedicos = new javax.swing.JButton();
        panel2 = new java.awt.Panel();
        lblLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion de Citas Médicas");
        setMinimumSize(new java.awt.Dimension(900, 500));

        panel1.setBackground(new java.awt.Color(204, 204, 204));
        panel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel1.setName("panelTitulo"); // NOI18N

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(204, 204, 204));
        label1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 0, 102));
        label1.setText("Ingreso de Médicos ");

        label2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 0, 102));
        label2.setName(""); // NOI18N
        label2.setText("¡Bienvenido de nuevo! Por favor, ingrese su cuenta.");

        label3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 0, 102));
        label3.setText("Correo electronico");

        label4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label4.setForeground(new java.awt.Color(0, 0, 102));
        label4.setText("Contraseña");

        button1.setBackground(new java.awt.Color(0, 0, 51));
        button1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setLabel("Iniciar Sesion");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        textField1.setText("textField1");

        btnRegistrarMedico.setText("Agregar Medico");
        btnRegistrarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarMedicoActionPerformed(evt);
            }
        });

        btnVerMedicos.setText("Ver medicos");
        btnVerMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerMedicosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                            .addComponent(txtEmail)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(btnRegistrarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(btnVerMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarMedico)
                    .addComponent(btnVerMedicos))
                .addGap(30, 30, 30))
        );

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblLogo)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        String email = txtEmail.getText();
        String password = new String(txtPassword.getPassword());

        if (email.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Complete todos los campos");
            return;
        }

        MedicoDAO dao = new MedicoDAO();
        Medico medico = dao.login(email, password);

        if (medico != null) {
            new PerfilMedico(medico).setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this,
                "Usuario o contraseña incorrectos");
        }
    }//GEN-LAST:event_button1ActionPerformed

    private void btnRegistrarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarMedicoActionPerformed
        new RegistroMedico().setVisible(true);
    }//GEN-LAST:event_btnRegistrarMedicoActionPerformed

    private void btnVerMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerMedicosActionPerformed
        new VerMedico().setVisible(true);
    }//GEN-LAST:event_btnVerMedicosActionPerformed

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarMedico;
    private javax.swing.JButton btnVerMedicos;
    private java.awt.Button button1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private javax.swing.JLabel lblLogo;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.TextField textField1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
