package vistas;

import java.util.ArrayList;
import modelos.Medico;
import java.util.List;
import javax.swing.JOptionPane;
import modelos.Citas;
import javax.swing.table.DefaultTableModel;
import dao.CitasDAO;

/**
 *
 * @author Keilyn Barrantes Mora
 */
public class PerfilMedico extends javax.swing.JFrame {
    
    private Medico medico;
    private List<Citas> citas = new ArrayList<>();
    private DefaultTableModel modeloCitas;

// CONSTRUCTOR VACÍO
    public PerfilMedico() {
        initComponents();
        inicializarTablaCitas();
        configurarPanel();
    }

// CONSTRUCTOR CON MÉDICO
    public PerfilMedico(Medico medico) {
        initComponents();
        this.medico = medico;

        configurarPanel();
        inicializarTablaCitas();
        cargarPerfil();
        cargarCitasEnTabla();

        // PRIMERO cargar datos desde BD
        CitasDAO dao = new CitasDAO();
        citas = dao.obtenerPorMedico(medico.getIdentificacion());

        // LUEGO mostrarlos
        cargarCitasEnTabla();

        setLocationRelativeTo(null);
    }

// CONFIGURAR PANEL
    private void configurarPanel() {
        panelCitas.setBorder(
            javax.swing.BorderFactory.createLineBorder(
                new java.awt.Color(220, 220, 220), 1
            )
        );
    }

// INICIALIZAR TABLA
    private void inicializarTablaCitas() {
        modeloCitas = new DefaultTableModel();
        modeloCitas.addColumn("Paciente");
        modeloCitas.addColumn("Fecha");
        modeloCitas.addColumn("Hora");
        modeloCitas.addColumn("Motivo");

        tblCitas.setModel(modeloCitas);
    }

// CARGAR DATOS DEL MÉDICO
    private void cargarPerfil() {
        lblNombre.setText("Nombre: " + medico.getNombre());
        lblEspecialidad.setText("Especialidad: " + medico.getEspecialidad());
        lblCorreo.setText("Correo: " + medico.getIdentificacion());
        lblTelefono.setText("Telefono: " + medico.getTelefono());
        lblTitulo.setText("Pacientes del Dr(a). " + medico.getNombre());
    }

// CARGAR CITAS EN TABLA
    private void cargarCitasEnTabla() {
        modeloCitas.setRowCount(0);

        for (Citas c : citas) {
            modeloCitas.addRow(new Object[]{
                c.getPaciente(),
                c.getFecha(),
                c.getHora(),
                c.getMotivo()
            });
        }
    }
  
// FILTRAR POR FECHA (CALENDARIO)
    private void filtrarCitasPorFecha(String fechaSeleccionada) {

        modeloCitas.setRowCount(0);

        for (Citas c : citas) {
            if (c.getFecha().equals(fechaSeleccionada)) {

                modeloCitas.addRow(new Object[]{
                    c.getPaciente(),
                    c.getFecha(),
                    c.getHora(),
                    c.getMotivo()
                });
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblEspecialidad = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        ButtonEditarPerfil = new javax.swing.JButton();
        calendario = new com.toedter.calendar.JCalendar();
        jPanel3 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        panelCitas = new javax.swing.JPanel();
        lblCitasTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCitas = new javax.swing.JTable();
        panelBotonesCitas = new javax.swing.JPanel();
        btnEditarCita = new javax.swing.JButton();
        btnEliminarCita = new javax.swing.JButton();
        btnNuevaCita2 = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Perfil de  Médico:");

        lblEspecialidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblEspecialidad.setForeground(new java.awt.Color(255, 255, 255));
        lblEspecialidad.setText("Especialidad:");

        lblCorreo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreo.setText("Correo:");

        lblTelefono.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefono.setText("Telefono:");

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre:");

        ButtonEditarPerfil.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonEditarPerfil.setForeground(new java.awt.Color(0, 0, 102));
        ButtonEditarPerfil.setText("Editar perfil");
        ButtonEditarPerfil.setBorder(null);
        ButtonEditarPerfil.setBorderPainted(false);
        ButtonEditarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditarPerfilActionPerformed(evt);
            }
        });

        calendario.setBackground(new java.awt.Color(0, 0, 102));
        calendario.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                calendarioPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(56, 56, 56))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(lblTelefono)
                            .addComponent(lblCorreo)
                            .addComponent(lblEspecialidad)
                            .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(ButtonEditarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(lblNombre)
                .addGap(12, 12, 12)
                .addComponent(lblEspecialidad)
                .addGap(12, 12, 12)
                .addComponent(lblCorreo)
                .addGap(18, 18, 18)
                .addComponent(lblTelefono)
                .addGap(18, 18, 18)
                .addComponent(ButtonEditarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 102));
        lblTitulo.setText("Pacientes del Dr(a). ");

        panelCitas.setBackground(new java.awt.Color(241, 241, 241));
        panelCitas.setPreferredSize(new java.awt.Dimension(700, 400));

        lblCitasTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCitasTitulo.setForeground(new java.awt.Color(0, 51, 102));
        lblCitasTitulo.setText("Citas programadas:");

        tblCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblCitas);

        panelBotonesCitas.setBackground(new java.awt.Color(255, 255, 255));
        panelBotonesCitas.setOpaque(false);

        btnEditarCita.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditarCita.setForeground(new java.awt.Color(0, 0, 102));
        btnEditarCita.setText("Editar");
        btnEditarCita.setBorder(null);
        btnEditarCita.setMaximumSize(new java.awt.Dimension(84, 27));
        btnEditarCita.setMinimumSize(new java.awt.Dimension(84, 27));
        btnEditarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCitaActionPerformed(evt);
            }
        });

        btnEliminarCita.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminarCita.setForeground(new java.awt.Color(0, 0, 102));
        btnEliminarCita.setText("Eliminar");
        btnEliminarCita.setBorder(null);
        btnEliminarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCitaActionPerformed(evt);
            }
        });

        btnNuevaCita2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNuevaCita2.setForeground(new java.awt.Color(0, 0, 102));
        btnNuevaCita2.setText("Nueva Cita");
        btnNuevaCita2.setBorder(null);
        btnNuevaCita2.setMaximumSize(new java.awt.Dimension(84, 27));
        btnNuevaCita2.setMinimumSize(new java.awt.Dimension(84, 27));
        btnNuevaCita2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaCita2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesCitasLayout = new javax.swing.GroupLayout(panelBotonesCitas);
        panelBotonesCitas.setLayout(panelBotonesCitasLayout);
        panelBotonesCitasLayout.setHorizontalGroup(
            panelBotonesCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesCitasLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnNuevaCita2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBotonesCitasLayout.setVerticalGroup(
            panelBotonesCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesCitasLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelBotonesCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevaCita2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelCitasLayout = new javax.swing.GroupLayout(panelCitas);
        panelCitas.setLayout(panelCitasLayout);
        panelCitasLayout.setHorizontalGroup(
            panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCitasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCitasLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(panelCitasLayout.createSequentialGroup()
                        .addComponent(lblCitasTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelBotonesCitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelCitasLayout.setVerticalGroup(
            panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCitasLayout.createSequentialGroup()
                .addGroup(panelCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCitasLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(lblCitasTitulo))
                    .addComponent(panelBotonesCitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flecha.png"))); // NOI18N
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblTitulo))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(panelCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // BOTON VOLVER
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        new VentanaPrincipal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    // EDITAR CITA
    private void btnEditarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCitaActionPerformed
        int fila = tblCitas.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una cita");
            return;
        }

        Citas citaSeleccionada = citas.get(fila);

        NuevaCita ventana = new NuevaCita(citaSeleccionada, citas, medico); 
        ventana.setVisible(true);

        ventana.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                cargarCitasEnTabla();
            }
        });

    }//GEN-LAST:event_btnEditarCitaActionPerformed

    // BOTÓN NUEVA CITA
    private void btnNuevaCita2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCita2ActionPerformed
        NuevaCita ventana = new NuevaCita(citas, medico); 
        ventana.setVisible(true);

        ventana.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {

                Citas nueva = ventana.getCita();

                if (nueva != null) {
                    citas.add(nueva);
                    cargarCitasEnTabla();
                }
            }
        });

    }//GEN-LAST:event_btnNuevaCita2ActionPerformed

    // ELIMINAR CITA
    private void btnEliminarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCitaActionPerformed
        int fila = tblCitas.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una cita");
            return;
        }

        int opcion = JOptionPane.showConfirmDialog(
            this,
            "¿Desea eliminar la cita seleccionada?",
            "Confirmar",
            JOptionPane.YES_NO_OPTION
        );

        if(opcion == JOptionPane.YES_OPTION){
            citas.remove(fila);
            cargarCitasEnTabla();
        }
    }//GEN-LAST:event_btnEliminarCitaActionPerformed

    // EDITAR PERFIL
    private void ButtonEditarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditarPerfilActionPerformed
        EditarPerfil ventana = new EditarPerfil(medico);
        ventana.setVisible(true);

        ventana.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                cargarPerfil();
            }
        });
    }//GEN-LAST:event_ButtonEditarPerfilActionPerformed

// EVENTO CALENDARIO
    private void calendarioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_calendarioPropertyChange
        
        if ("calendar".equals(evt.getPropertyName())) {

                java.text.SimpleDateFormat formato = new java.text.SimpleDateFormat("dd/MM/yyyy");
                String fechaSeleccionada = formato.format(calendario.getDate());

                filtrarCitasPorFecha(fechaSeleccionada);
            }

    }//GEN-LAST:event_calendarioPropertyChange

    
    
public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new PerfilMedico().setVisible(true);
        });
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEditarPerfil;
    private javax.swing.JButton btnEditarCita;
    private javax.swing.JButton btnEliminarCita;
    private javax.swing.JButton btnNuevaCita2;
    private javax.swing.JButton btnVolver;
    private com.toedter.calendar.JCalendar calendario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCitasTitulo;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblEspecialidad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelBotonesCitas;
    private javax.swing.JPanel panelCitas;
    private javax.swing.JTable tblCitas;
    // End of variables declaration//GEN-END:variables

    
}
