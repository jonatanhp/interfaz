/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package igu.compra;

import igu.CambiarPanel;
import igu.producto.*;
import igu.cliente.*;
import igu.compra_det.CompraDetPanel;
import sistemaventa.JFrame;

/**
 *
 * @author jonatan
 */
public class CompraPanel extends javax.swing.JPanel {

    /** Creates new form ClientePanel */
    public CompraPanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundCompraPanel = new javax.swing.JPanel();
        clienteTablePanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        clienteTitlePanel = new javax.swing.JPanel();
        productoTitle = new javax.swing.JLabel();
        formClientePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        registarClienteButton = new javax.swing.JButton();
        actualizarClienteButton = new javax.swing.JButton();
        eliminarClienteButton = new javax.swing.JButton();
        clienteCombo = new javax.swing.JComboBox<>();
        nomCliente = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 255, 102));
        setMinimumSize(new java.awt.Dimension(944, 371));
        setPreferredSize(new java.awt.Dimension(944, 371));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout clienteTablePanelLayout = new javax.swing.GroupLayout(clienteTablePanel);
        clienteTablePanel.setLayout(clienteTablePanelLayout);
        clienteTablePanelLayout.setHorizontalGroup(
            clienteTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        clienteTablePanelLayout.setVerticalGroup(
            clienteTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        productoTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        productoTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productoTitle.setText("Compra");

        javax.swing.GroupLayout clienteTitlePanelLayout = new javax.swing.GroupLayout(clienteTitlePanel);
        clienteTitlePanel.setLayout(clienteTitlePanelLayout);
        clienteTitlePanelLayout.setHorizontalGroup(
            clienteTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clienteTitlePanelLayout.createSequentialGroup()
                .addComponent(productoTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        clienteTitlePanelLayout.setVerticalGroup(
            clienteTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productoTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jLabel2.setText("Cliente");

        registarClienteButton.setText("Registrar");
        registarClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registarClienteButtonActionPerformed(evt);
            }
        });

        actualizarClienteButton.setText("Actualizar");

        eliminarClienteButton.setText("Eliminar");

        clienteCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione cliente", " " }));

        nomCliente.setText("nomcliente");

        jLabel1.setText("Total");

        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout formClientePanelLayout = new javax.swing.GroupLayout(formClientePanel);
        formClientePanel.setLayout(formClientePanelLayout);
        formClientePanelLayout.setHorizontalGroup(
            formClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formClientePanelLayout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addComponent(actualizarClienteButton)
                .addGap(45, 45, 45)
                .addComponent(eliminarClienteButton)
                .addGap(43, 43, 43))
            .addGroup(formClientePanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(formClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registarClienteButton)
                    .addGroup(formClientePanelLayout.createSequentialGroup()
                        .addGroup(formClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(44, 44, 44)
                        .addGroup(formClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clienteCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        formClientePanelLayout.setVerticalGroup(
            formClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formClientePanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(clienteCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(formClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(formClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminarClienteButton)
                    .addComponent(actualizarClienteButton)
                    .addComponent(registarClienteButton))
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout backgroundCompraPanelLayout = new javax.swing.GroupLayout(backgroundCompraPanel);
        backgroundCompraPanel.setLayout(backgroundCompraPanelLayout);
        backgroundCompraPanelLayout.setHorizontalGroup(
            backgroundCompraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundCompraPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundCompraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clienteTitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(backgroundCompraPanelLayout.createSequentialGroup()
                        .addComponent(formClientePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clienteTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        backgroundCompraPanelLayout.setVerticalGroup(
            backgroundCompraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundCompraPanelLayout.createSequentialGroup()
                .addComponent(clienteTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(backgroundCompraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(formClientePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clienteTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundCompraPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundCompraPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registarClienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registarClienteButtonActionPerformed
        // TODO add your handling code here:
        new CambiarPanel(JFrame.changePanel, new CompraDetPanel());
        
    }//GEN-LAST:event_registarClienteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarClienteButton;
    private javax.swing.JPanel backgroundCompraPanel;
    private javax.swing.JComboBox<String> clienteCombo;
    private javax.swing.JPanel clienteTablePanel;
    private javax.swing.JPanel clienteTitlePanel;
    private javax.swing.JButton eliminarClienteButton;
    private javax.swing.JPanel formClientePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel nomCliente;
    private javax.swing.JLabel productoTitle;
    private javax.swing.JButton registarClienteButton;
    // End of variables declaration//GEN-END:variables

}
