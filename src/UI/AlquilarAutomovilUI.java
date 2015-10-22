/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Control.AlquilarAutoController;
import Logica.Auto;
import Logica.Cliente;
import java.util.ArrayList;

/**
 *
 * @author joshua
 */
public class AlquilarAutomovilUI extends javax.swing.JFrame {

    /**
     * Creates new form AlquilarAutomovilUI
     */
    private javax.swing.JFrame ventanaAnterior;
    private AlquilarAutoController controller;
    public AlquilarAutomovilUI(javax.swing.JFrame ventanaAnterior, 
            AlquilarAutoController controller, ArrayList<Auto> pAutos,
            ArrayList<Cliente> pClientes) {
        initComponents();
        
        for(Auto a: pAutos){
            cbAutos.addItem(a);
        }
        
        for(Cliente c: pClientes){
            cbClientes.addItem(c);
        }
        this.ventanaAnterior= ventanaAnterior;
        this.controller= controller;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbClientes = new javax.swing.JComboBox();
        lblTitulo = new javax.swing.JLabel();
        lblAuto = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblDuracion = new javax.swing.JLabel();
        cbAutos = new javax.swing.JComboBox();
        btnAlquilar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        fechaDevolucion = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbClientesActionPerformed(evt);
            }
        });

        lblTitulo.setText("ALQUILER DE AUTOMOVILES");

        lblAuto.setText("Auto:");

        lblCliente.setText("Cliente:");

        lblDuracion.setText("Fecha de devolucion");

        cbAutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAutosActionPerformed(evt);
            }
        });

        btnAlquilar.setText("Alquilar");
        btnAlquilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlquilarActionPerformed(evt);
            }
        });

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAlquilar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDuracion)
                                    .addComponent(lblCliente)
                                    .addComponent(lblAuto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbAutos, 0, 128, Short.MAX_VALUE)
                                    .addComponent(cbClientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fechaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTitulo)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAuto)
                    .addComponent(cbAutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliente)
                    .addComponent(cbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDuracion)
                    .addComponent(fechaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlquilar)
                    .addComponent(jButton1))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbClientesActionPerformed

    private void cbAutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAutosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ventanaAnterior.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAlquilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlquilarActionPerformed
        // TODO add your handling code here:
        controller.alquilarAuto((Cliente)cbClientes.getSelectedItem(), fechaDevolucion.getDate(),(Auto)cbAutos.getSelectedItem());
        this.setVisible(false);
        ventanaAnterior.setVisible(true);
    }//GEN-LAST:event_btnAlquilarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlquilar;
    private javax.swing.JComboBox cbAutos;
    private javax.swing.JComboBox cbClientes;
    private com.toedter.calendar.JDateChooser fechaDevolucion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblAuto;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblDuracion;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
