/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.java.ejemplo.diez.vista;

import ec.edu.ups.ejemplo.diez.controlador.OperadoraTelefonicaControlador;
import ec.edu.ups.ejemplo.diez.controlador.PersonaControlador;
import ec.edu.ups.ejemplo.diez.modelo.OperadoraTelefonica;
import ec.edu.ups.ejemplo.diez.modelo.Persona;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author samanthasuquilandaquilli
 */
public class VentanaEliminarOperadoraTelefonica extends javax.swing.JInternalFrame {
    private OperadoraTelefonicaControlador operadoraTelefonicaControlador;
    /**
     * Creates new form VentanaActualizarPersona
     */
    public VentanaEliminarOperadoraTelefonica(OperadoraTelefonicaControlador operadoraTelefonicaControlador) {
        initComponents();
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

        jPanel1 = new javax.swing.JPanel();
        lblCedulaEliminarOperadoraTelefonica = new javax.swing.JLabel();
        lblNombreEliminarOperadoraTelefonica = new javax.swing.JLabel();
        txtCedulaEliminarOperadoraTelefonica = new javax.swing.JTextField();
        txtNombreEliminarOperadoraTelefonica = new javax.swing.JTextField();
        btnAceptarEliminarOperadoraTelefonica = new javax.swing.JButton();
        btnCancelarEliminarOperadoraTelefonica = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Eliminar Operadora Telefonica", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 1, 18))); // NOI18N

        lblCedulaEliminarOperadoraTelefonica.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblCedulaEliminarOperadoraTelefonica.setText("Cedula de la persona:");

        lblNombreEliminarOperadoraTelefonica.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblNombreEliminarOperadoraTelefonica.setText("Nombre:");

        txtCedulaEliminarOperadoraTelefonica.setToolTipText("Ingrese la nueva cedula de la persona");
        txtCedulaEliminarOperadoraTelefonica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaEliminarOperadoraTelefonicaActionPerformed(evt);
            }
        });

        txtNombreEliminarOperadoraTelefonica.setToolTipText("Ingrese el nuevo nombre de de la persona");
        txtNombreEliminarOperadoraTelefonica.setEnabled(false);
        txtNombreEliminarOperadoraTelefonica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEliminarOperadoraTelefonicaActionPerformed(evt);
            }
        });

        btnAceptarEliminarOperadoraTelefonica.setText("Eliminar");
        btnAceptarEliminarOperadoraTelefonica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarEliminarOperadoraTelefonicaActionPerformed(evt);
            }
        });

        btnCancelarEliminarOperadoraTelefonica.setText("Cancelar");
        btnCancelarEliminarOperadoraTelefonica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEliminarOperadoraTelefonicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAceptarEliminarOperadoraTelefonica)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblCedulaEliminarOperadoraTelefonica)
                        .addComponent(lblNombreEliminarOperadoraTelefonica)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreEliminarOperadoraTelefonica, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCedulaEliminarOperadoraTelefonica, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnCancelarEliminarOperadoraTelefonica)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedulaEliminarOperadoraTelefonica)
                    .addComponent(txtCedulaEliminarOperadoraTelefonica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreEliminarOperadoraTelefonica)
                    .addComponent(txtNombreEliminarOperadoraTelefonica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarEliminarOperadoraTelefonica)
                    .addComponent(btnCancelarEliminarOperadoraTelefonica))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreEliminarOperadoraTelefonicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEliminarOperadoraTelefonicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEliminarOperadoraTelefonicaActionPerformed

    private void txtCedulaEliminarOperadoraTelefonicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaEliminarOperadoraTelefonicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaEliminarOperadoraTelefonicaActionPerformed

    private void btnAceptarEliminarOperadoraTelefonicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarEliminarOperadoraTelefonicaActionPerformed
         int codigo = Integer.parseInt(txtCedulaEliminarOperadoraTelefonica.getText());
         OperadoraTelefonica operadoraTelefonica = operadoraTelefonicaControlador.buscar(codigo);
         txtNombreEliminarOperadoraTelefonica.setText(operadoraTelefonica.getNombre());
         operadoraTelefonicaControlador.eliminar(operadoraTelefonica);
         
         JOptionPane.showMessageDialog(this, "La operadora telefonica ha sido eliminada exitosamente! :D ");
         this.limpiarCampos();
    }//GEN-LAST:event_btnAceptarEliminarOperadoraTelefonicaActionPerformed
         
         
               
    private void btnCancelarEliminarOperadoraTelefonicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEliminarOperadoraTelefonicaActionPerformed
        this.limpiarCampos();
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarEliminarOperadoraTelefonicaActionPerformed

    private void limpiarCampos(){
        this.txtCedulaEliminarOperadoraTelefonica.setText("");
        this.txtNombreEliminarOperadoraTelefonica.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarEliminarOperadoraTelefonica;
    private javax.swing.JButton btnCancelarEliminarOperadoraTelefonica;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCedulaEliminarOperadoraTelefonica;
    private javax.swing.JLabel lblNombreEliminarOperadoraTelefonica;
    private javax.swing.JTextField txtCedulaEliminarOperadoraTelefonica;
    private javax.swing.JTextField txtNombreEliminarOperadoraTelefonica;
    // End of variables declaration//GEN-END:variables
}