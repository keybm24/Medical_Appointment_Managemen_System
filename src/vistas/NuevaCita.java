package vistas;

import modelos.Citas;
import javax.swing.JOptionPane;
import java.util.List;
import modelos.Medico;
import dao.CitasDAO;

/**
 *
 * @author Keilyn Barrantes Mora
 */
public class NuevaCita extends javax.swing.JFrame {

    private Citas cita;
    private List<Citas> citas;
    private Medico medico;
    
// NUEVA CITA
    public NuevaCita(List<Citas> citas, Medico medico) {
        initComponents();
        setLocationRelativeTo(null);

        this.citas = citas;
        this.medico = medico;

        cargarHorasDisponibles("");

        // EVENTO PARA CUANDO CAMBIA LA FECHA
        fechaChooser.addPropertyChangeListener(evt -> {
            if (fechaChooser.getDate() != null) {

                java.text.SimpleDateFormat formato = new java.text.SimpleDateFormat("dd/MM/yyyy");
                String fecha = formato.format(fechaChooser.getDate());

                cargarHorasDisponibles(fecha);
            }
        });
    }

// EDITAR CITA
    public NuevaCita(Citas cita, List<Citas> citas, Medico medico) {
        initComponents();
        setLocationRelativeTo(null);

        this.cita = cita;
        this.citas = citas;
        this.medico = medico;

        txtPaciente.setText(cita.getPaciente());
        txtMotivo.setText(cita.getMotivo());

        // Cargar fecha
        try {
            java.text.SimpleDateFormat formato = new java.text.SimpleDateFormat("dd/MM/yyyy");
            fechaChooser.setDate(formato.parse(cita.getFecha()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // cargar horas según fecha
        cargarHorasDisponibles(cita.getFecha());
        cmbHora.setSelectedItem(cita.getHora());
   
        // EVENTO
        fechaChooser.addPropertyChangeListener(evt -> {
            if (fechaChooser.getDate() != null) {

                java.text.SimpleDateFormat formato = new java.text.SimpleDateFormat("dd/MM/yyyy");
                String fecha = formato.format(fechaChooser.getDate());

                cargarHorasDisponibles(fecha);
            }
        });

    }

    // GENERAR HORAS DISPONIBLES
    private void cargarHorasDisponibles(String fechaSeleccionada) {

        cmbHora.removeAllItems();

        String[] horasBase = {
            "08:00", "09:00", "10:00", "11:00",
            "12:00", "13:00", "14:00", "15:00", "16:00"
        };

        for (String hora : horasBase) {

            boolean ocupada = false;

            if (citas != null) {
                for (Citas c : citas) {
                    if (c.getFecha().equals(fechaSeleccionada) && c.getHora().equals(hora)) {
                        ocupada = true;
                        break;
                    }
                }
            }

            if (!ocupada) {
                cmbHora.addItem(hora);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPaciente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMotivo = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        fechaChooser = new com.toedter.calendar.JDateChooser();
        cmbHora = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Nueva Cita Medica");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Hora:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Paciente:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Fecha:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Motivo de la cita:");

        btnGuardar.setBackground(new java.awt.Color(0, 0, 102));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 0, 102));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(txtPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(txtMotivo, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fechaChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbHora, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbHora, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // BOTÓN CANCELAR
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

     // BOTÓN GUARDAR
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String paciente = txtPaciente.getText();
        String motivo = txtMotivo.getText();

        if (fechaChooser.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Seleccione una fecha");
            return;
        }

        java.text.SimpleDateFormat formato = new java.text.SimpleDateFormat("dd/MM/yyyy");
        String fecha = formato.format(fechaChooser.getDate());

        if (cmbHora.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Seleccione una hora");
            return;
        }

        String hora = cmbHora.getSelectedItem().toString();

        if (paciente.isEmpty() || motivo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Complete todos los campos");
            return;
        }

        if (this.cita == null) {

            this.cita = new Citas(
                paciente,
                fecha,
                hora,
                motivo,
                medico.getIdentificacion()
            );

            // guardar en BD
            CitasDAO dao = new CitasDAO();
            dao.guardar(this.cita);

        } else {
            this.cita.setPaciente(paciente);
            this.cita.setFecha(fecha);
            this.cita.setHora(hora);
            this.cita.setMotivo(motivo);
        }

        JOptionPane.showMessageDialog(this, "Cita guardada correctamente ✅");

        this.dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

    
 


public Citas getCita() {
        return cita;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmbHora;
    private com.toedter.calendar.JDateChooser fechaChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtMotivo;
    private javax.swing.JTextField txtPaciente;
    // End of variables declaration//GEN-END:variables
}
