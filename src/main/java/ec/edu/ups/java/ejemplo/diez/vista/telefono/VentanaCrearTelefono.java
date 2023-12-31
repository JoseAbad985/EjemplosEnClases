/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.java.ejemplo.diez.vista.telefono;


import ec.edu.ups.ejemplo.diez.controlador.OperadoraTelefonicaControlador;
import ec.edu.ups.ejemplo.diez.controlador.PersonaControlador;
import ec.edu.ups.ejemplo.diez.controlador.TelefonoControlador;
import ec.edu.ups.ejemplo.diez.modelo.OperadoraTelefonica;
import ec.edu.ups.ejemplo.diez.modelo.Persona;
import ec.edu.ups.ejemplo.diez.modelo.Telefono;
import ec.edu.ups.ejemplo.diez.modelo.TipoTelefono;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author samanthasuquilandaquilli
 */
public class VentanaCrearTelefono extends javax.swing.JInternalFrame {
    
    private TelefonoControlador telefonoControlador;
    private PersonaControlador personaControlador;
    private OperadoraTelefonicaControlador operadoraTelefonicaControlador;
    private OperadoraTelefonica operadoraTelefonicaSeleccionada;
    private Persona personaSeleccionada;
    /**
     * Creates new form VentanaCrearPersona
     */
    public VentanaCrearTelefono(TelefonoControlador telefonoControlador, PersonaControlador personaControlador, OperadoraTelefonicaControlador operadoraTelefonicaControlador) {
        initComponents();
        this.telefonoControlador = telefonoControlador;
        this.personaControlador = personaControlador;
        this.operadoraTelefonicaControlador = operadoraTelefonicaControlador;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCrearTelefono1 = new javax.swing.JPanel();
        lblCedulaCrearPersona1 = new javax.swing.JLabel();
        lblFechaNacimientoCrearPersona1 = new javax.swing.JLabel();
        lblNombreCrearPersona1 = new javax.swing.JLabel();
        txtNumeroCrearTelefono1 = new javax.swing.JTextField();
        txtTipoCrearTelefono1 = new javax.swing.JTextField();
        txtFechaNacimientoCrearPersona1 = new javax.swing.JTextField();
        btnAceptarCrearTelefono1 = new javax.swing.JButton();
        btnCancelarCrearTelefono1 = new javax.swing.JButton();
        buttonGroupTelefono = new javax.swing.ButtonGroup();
        panelCrearTelefono2 = new javax.swing.JPanel();
        lblCedulaCrearPersona2 = new javax.swing.JLabel();
        lblFechaNacimientoCrearPersona2 = new javax.swing.JLabel();
        lblNombreCrearPersona2 = new javax.swing.JLabel();
        txtNumeroCrearTelefono = new javax.swing.JTextField();
        cbxOperadoraTelefono = new javax.swing.JComboBox<>();
        radioButtonCasa = new javax.swing.JRadioButton();
        radioButtonCelular = new javax.swing.JRadioButton();
        radioButtonTrabajo = new javax.swing.JRadioButton();
        panelPersona = new javax.swing.JPanel();
        lblCedulaBuscarPersona = new javax.swing.JLabel();
        lblFechaNacimientoBuscarPersona = new javax.swing.JLabel();
        lblNombreBuscarPersona = new javax.swing.JLabel();
        txtCedulaBuscarPersona = new javax.swing.JTextField();
        txtNombreBuscarPersona = new javax.swing.JTextField();
        txtFechaNacimientoCrearPersona = new javax.swing.JTextField();
        btnBuscarBuscarPersona = new javax.swing.JButton();
        btnAceptarTelefono = new javax.swing.JButton();
        btnCancelarTelefono = new javax.swing.JButton();

        panelCrearTelefono1.setBackground(new java.awt.Color(204, 204, 204));
        panelCrearTelefono1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Crear Nueva Telefono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 0, 18))); // NOI18N
        panelCrearTelefono1.setToolTipText("Crear Nueva Persona");

        lblCedulaCrearPersona1.setFont(new java.awt.Font("Apple LiGothic", 0, 24)); // NOI18N
        lblCedulaCrearPersona1.setText("Numero:");

        lblFechaNacimientoCrearPersona1.setFont(new java.awt.Font("Apple LiGothic", 0, 24)); // NOI18N
        lblFechaNacimientoCrearPersona1.setText("Fecha de Nacimiento:");

        lblNombreCrearPersona1.setFont(new java.awt.Font("Apple LiGothic", 0, 24)); // NOI18N
        lblNombreCrearPersona1.setText("Tipo:");

        txtNumeroCrearTelefono1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNumeroCrearTelefono1.setToolTipText("Ingrese la cedula de la nueva persona");
        txtNumeroCrearTelefono1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroCrearTelefono1ActionPerformed(evt);
            }
        });

        txtTipoCrearTelefono1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTipoCrearTelefono1.setToolTipText("Ingrese el nombre de la nueva persona");
        txtTipoCrearTelefono1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoCrearTelefono1ActionPerformed(evt);
            }
        });

        txtFechaNacimientoCrearPersona1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtFechaNacimientoCrearPersona1.setToolTipText("Ingrese la fecha de nacimiento de la nueva persona (01/01/2004)");
        txtFechaNacimientoCrearPersona1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaNacimientoCrearPersona1ActionPerformed(evt);
            }
        });

        btnAceptarCrearTelefono1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnAceptarCrearTelefono1.setText("Aceptar");
        btnAceptarCrearTelefono1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarCrearTelefono1ActionPerformed(evt);
            }
        });

        btnCancelarCrearTelefono1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnCancelarCrearTelefono1.setText("Cancelar");
        btnCancelarCrearTelefono1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCrearTelefono1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCrearTelefono1Layout = new javax.swing.GroupLayout(panelCrearTelefono1);
        panelCrearTelefono1.setLayout(panelCrearTelefono1Layout);
        panelCrearTelefono1Layout.setHorizontalGroup(
            panelCrearTelefono1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearTelefono1Layout.createSequentialGroup()
                .addGroup(panelCrearTelefono1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrearTelefono1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(panelCrearTelefono1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCedulaCrearPersona1)
                            .addComponent(lblNombreCrearPersona1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaNacimientoCrearPersona1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearTelefono1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAceptarCrearTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(panelCrearTelefono1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelarCrearTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCrearTelefono1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtTipoCrearTelefono1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFechaNacimientoCrearPersona1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNumeroCrearTelefono1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        panelCrearTelefono1Layout.setVerticalGroup(
            panelCrearTelefono1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearTelefono1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(panelCrearTelefono1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCedulaCrearPersona1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroCrearTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(panelCrearTelefono1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreCrearPersona1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipoCrearTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(panelCrearTelefono1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaNacimientoCrearPersona1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaNacimientoCrearPersona1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelCrearTelefono1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarCrearTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarCrearTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Ingresar Nuevo Telefono");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        panelCrearTelefono2.setBackground(new java.awt.Color(204, 204, 204));
        panelCrearTelefono2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Crear Nuevo Telefono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 0, 18))); // NOI18N
        panelCrearTelefono2.setToolTipText("Crear Nuevo Telefono");

        lblCedulaCrearPersona2.setFont(new java.awt.Font("Apple LiGothic", 0, 24)); // NOI18N
        lblCedulaCrearPersona2.setText("Numero:");

        lblFechaNacimientoCrearPersona2.setFont(new java.awt.Font("Apple LiGothic", 0, 24)); // NOI18N
        lblFechaNacimientoCrearPersona2.setText("Operadora:");

        lblNombreCrearPersona2.setFont(new java.awt.Font("Apple LiGothic", 0, 24)); // NOI18N
        lblNombreCrearPersona2.setText("Tipo:");

        txtNumeroCrearTelefono.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNumeroCrearTelefono.setToolTipText("Ingrese la cedula de la nueva persona");
        txtNumeroCrearTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroCrearTelefonoActionPerformed(evt);
            }
        });

        cbxOperadoraTelefono.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione una Operadora--" }));
        cbxOperadoraTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxOperadoraTelefonoActionPerformed(evt);
            }
        });

        buttonGroupTelefono.add(radioButtonCasa);
        radioButtonCasa.setSelected(true);
        radioButtonCasa.setText("Casa");
        radioButtonCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonCasaActionPerformed(evt);
            }
        });

        buttonGroupTelefono.add(radioButtonCelular);
        radioButtonCelular.setText("Celular");

        buttonGroupTelefono.add(radioButtonTrabajo);
        radioButtonTrabajo.setText("Trabajo");

        javax.swing.GroupLayout panelCrearTelefono2Layout = new javax.swing.GroupLayout(panelCrearTelefono2);
        panelCrearTelefono2.setLayout(panelCrearTelefono2Layout);
        panelCrearTelefono2Layout.setHorizontalGroup(
            panelCrearTelefono2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearTelefono2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(panelCrearTelefono2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCedulaCrearPersona2)
                    .addComponent(lblNombreCrearPersona2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaNacimientoCrearPersona2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCrearTelefono2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelCrearTelefono2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNumeroCrearTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbxOperadoraTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCrearTelefono2Layout.createSequentialGroup()
                        .addComponent(radioButtonCasa)
                        .addGap(61, 61, 61)
                        .addComponent(radioButtonCelular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radioButtonTrabajo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCrearTelefono2Layout.setVerticalGroup(
            panelCrearTelefono2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearTelefono2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(panelCrearTelefono2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCedulaCrearPersona2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroCrearTelefono))
                .addGap(24, 24, 24)
                .addGroup(panelCrearTelefono2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreCrearPersona2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioButtonCasa)
                    .addComponent(radioButtonCelular)
                    .addComponent(radioButtonTrabajo))
                .addGap(36, 36, 36)
                .addGroup(panelCrearTelefono2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblFechaNacimientoCrearPersona2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxOperadoraTelefono))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        panelPersona.setBackground(new java.awt.Color(204, 204, 204));
        panelPersona.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Persona para asignar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 0, 18))); // NOI18N
        panelPersona.setToolTipText("Buscar Persona");

        lblCedulaBuscarPersona.setFont(new java.awt.Font("Apple LiGothic", 0, 24)); // NOI18N
        lblCedulaBuscarPersona.setText("Ingrese la Cedula:");

        lblFechaNacimientoBuscarPersona.setFont(new java.awt.Font("Apple LiGothic", 0, 24)); // NOI18N
        lblFechaNacimientoBuscarPersona.setText("La Fecha de Nacimiento es:");

        lblNombreBuscarPersona.setFont(new java.awt.Font("Apple LiGothic", 0, 24)); // NOI18N
        lblNombreBuscarPersona.setText("El Nombre es:");

        txtCedulaBuscarPersona.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCedulaBuscarPersona.setToolTipText("Ingrese la cedula de la persona a buscar");
        txtCedulaBuscarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaBuscarPersonaActionPerformed(evt);
            }
        });

        txtNombreBuscarPersona.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNombreBuscarPersona.setToolTipText("");
        txtNombreBuscarPersona.setEnabled(false);
        txtNombreBuscarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreBuscarPersonaActionPerformed(evt);
            }
        });

        txtFechaNacimientoCrearPersona.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtFechaNacimientoCrearPersona.setToolTipText("Ingrese la fecha de nacimiento de la nueva persona (01/01/2004)");
        txtFechaNacimientoCrearPersona.setEnabled(false);
        txtFechaNacimientoCrearPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaNacimientoCrearPersonaActionPerformed(evt);
            }
        });

        btnBuscarBuscarPersona.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnBuscarBuscarPersona.setText(" Buscar");
        btnBuscarBuscarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarBuscarPersonaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPersonaLayout = new javax.swing.GroupLayout(panelPersona);
        panelPersona.setLayout(panelPersonaLayout);
        panelPersonaLayout.setHorizontalGroup(
            panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPersonaLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreBuscarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaNacimientoBuscarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCedulaBuscarPersona))
                .addGap(26, 26, 26)
                .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPersonaLayout.createSequentialGroup()
                        .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCedulaBuscarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreBuscarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(btnBuscarBuscarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtFechaNacimientoCrearPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        panelPersonaLayout.setVerticalGroup(
            panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPersonaLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCedulaBuscarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCedulaBuscarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscarBuscarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreBuscarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreBuscarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaNacimientoBuscarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaNacimientoCrearPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(185, Short.MAX_VALUE))
        );

        btnAceptarTelefono.setText("Aceptar");
        btnAceptarTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarTelefonoActionPerformed(evt);
            }
        });

        btnCancelarTelefono.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelPersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCrearTelefono2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 184, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(btnAceptarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnCancelarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelCrearTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(panelPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancelarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        this.limpiarCampos();
    }//GEN-LAST:event_formInternalFrameClosing

    private void txtNumeroCrearTelefono1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroCrearTelefono1ActionPerformed
        
    }//GEN-LAST:event_txtNumeroCrearTelefono1ActionPerformed

    private void txtTipoCrearTelefono1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoCrearTelefono1ActionPerformed
        
    }//GEN-LAST:event_txtTipoCrearTelefono1ActionPerformed

    private void txtFechaNacimientoCrearPersona1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaNacimientoCrearPersona1ActionPerformed
        
    }//GEN-LAST:event_txtFechaNacimientoCrearPersona1ActionPerformed

    private void btnAceptarCrearTelefono1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarCrearTelefono1ActionPerformed
       
    }//GEN-LAST:event_btnAceptarCrearTelefono1ActionPerformed

    private void btnCancelarCrearTelefono1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCrearTelefono1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarCrearTelefono1ActionPerformed

    private void txtNumeroCrearTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroCrearTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroCrearTelefonoActionPerformed

    private void txtCedulaBuscarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaBuscarPersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaBuscarPersonaActionPerformed

    private void txtNombreBuscarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreBuscarPersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreBuscarPersonaActionPerformed

    private void txtFechaNacimientoCrearPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaNacimientoCrearPersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaNacimientoCrearPersonaActionPerformed

    private void btnBuscarBuscarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarBuscarPersonaActionPerformed

        String cedula = txtCedulaBuscarPersona.getText();
        personaSeleccionada = personaControlador.buscar(cedula);
        if(personaSeleccionada != null){
            txtNombreBuscarPersona.setText(personaSeleccionada.getNombre());
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String fechaNacimiento = sdf.format(personaSeleccionada.getFechaNcaimiento().getTime());
            txtFechaNacimientoCrearPersona.setText(fechaNacimiento);
        }else{
            JOptionPane.showMessageDialog(this, "La persona con cedula " + cedula + " no existe");
            limpiarCampos();
        }    
    }//GEN-LAST:event_btnBuscarBuscarPersonaActionPerformed

    private void btnAceptarTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarTelefonoActionPerformed
        if(camposObligatoriosConDatos()){
            JOptionPane.showMessageDialog(this,"Los datos del telefono son obligatorios de llenar. ");
        }else{
            
        String numero = txtNumeroCrearTelefono.getText();     
        TipoTelefono tipo;
        
        if(radioButtonCasa.isSelected()){
            tipo = TipoTelefono.CASA;
        }else if(radioButtonCelular.isSelected()){
            tipo = TipoTelefono.CELULAR;
        }else{
            tipo = TipoTelefono.TRABAJO;
        }
        
        operadoraTelefonicaSeleccionada = (OperadoraTelefonica) cbxOperadoraTelefono.getSelectedItem();
        
        Telefono telefonito = new Telefono(numero, tipo);
        telefonito.setUnaOperadoraTelefonica(operadoraTelefonicaSeleccionada);
        telefonito.setUnaPersona(personaSeleccionada);
        
        if(personaSeleccionada != null){
            JOptionPane.showMessageDialog(this, "Se creó correctamente el telefono y se le asignó correctamente la persona; " + personaSeleccionada.getNombre());
        }else{
            JOptionPane.showMessageDialog(this, "La persona con cedula" + personaSeleccionada.getCedula() + "a la cual quiere asignar el telefono no existe");
        }
        telefonito.setUnaPersona(personaSeleccionada);
        telefonoControlador.crear(telefonito);
        this.limpiarCampos();
        this.limpiarCamposTelefono();
        
        }
        
    }//GEN-LAST:event_btnAceptarTelefonoActionPerformed

    private void cbxOperadoraTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxOperadoraTelefonoActionPerformed
        /*System.out.println("hola");*/
    }//GEN-LAST:event_cbxOperadoraTelefonoActionPerformed

    private void radioButtonCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonCasaActionPerformed
        
        
    }//GEN-LAST:event_radioButtonCasaActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        cargarDatosOperadora();
    }//GEN-LAST:event_formInternalFrameActivated

    private void limpiarCampos(){
        this.txtNombreBuscarPersona.setText("");
        this.txtCedulaBuscarPersona.setText("");
        this.txtFechaNacimientoCrearPersona.setText("");
    }
    
    private void limpiarCamposTelefono(){
        this.txtNumeroCrearTelefono.setText("");
        this.cbxOperadoraTelefono.setSelectedIndex(0);
        this.radioButtonCasa.setSelected(true);
    }
    private void cargarDatosOperadora(){
        DefaultComboBoxModel<OperadoraTelefonica> modelo = (DefaultComboBoxModel)this.cbxOperadoraTelefono.getModel();
        List<OperadoraTelefonica> listaOperadorasTelefonicas = operadoraTelefonicaControlador.listar();
        modelo.removeAllElements();
        for(OperadoraTelefonica operadoraTelefonica : listaOperadorasTelefonicas){
            modelo.addElement(operadoraTelefonica);
        }
    }
    
    private boolean camposObligatoriosConDatos(){
        if(!this.txtNumeroCrearTelefono.getText().isEmpty() && this.cbxOperadoraTelefono.getSelectedIndex()>=0){
            return true;
        }else{
        return false;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarCrearTelefono1;
    private javax.swing.JButton btnAceptarTelefono;
    private javax.swing.JButton btnBuscarBuscarPersona;
    private javax.swing.JButton btnCancelarCrearTelefono1;
    private javax.swing.JButton btnCancelarTelefono;
    private javax.swing.ButtonGroup buttonGroupTelefono;
    private javax.swing.JComboBox<String> cbxOperadoraTelefono;
    private javax.swing.JLabel lblCedulaBuscarPersona;
    private javax.swing.JLabel lblCedulaCrearPersona1;
    private javax.swing.JLabel lblCedulaCrearPersona2;
    private javax.swing.JLabel lblFechaNacimientoBuscarPersona;
    private javax.swing.JLabel lblFechaNacimientoCrearPersona1;
    private javax.swing.JLabel lblFechaNacimientoCrearPersona2;
    private javax.swing.JLabel lblNombreBuscarPersona;
    private javax.swing.JLabel lblNombreCrearPersona1;
    private javax.swing.JLabel lblNombreCrearPersona2;
    private javax.swing.JPanel panelCrearTelefono1;
    private javax.swing.JPanel panelCrearTelefono2;
    private javax.swing.JPanel panelPersona;
    private javax.swing.JRadioButton radioButtonCasa;
    private javax.swing.JRadioButton radioButtonCelular;
    private javax.swing.JRadioButton radioButtonTrabajo;
    private javax.swing.JTextField txtCedulaBuscarPersona;
    private javax.swing.JTextField txtFechaNacimientoCrearPersona;
    private javax.swing.JTextField txtFechaNacimientoCrearPersona1;
    private javax.swing.JTextField txtNombreBuscarPersona;
    private javax.swing.JTextField txtNumeroCrearTelefono;
    private javax.swing.JTextField txtNumeroCrearTelefono1;
    private javax.swing.JTextField txtTipoCrearTelefono1;
    // End of variables declaration//GEN-END:variables
}
