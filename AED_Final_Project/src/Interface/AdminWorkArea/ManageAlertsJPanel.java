/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.AdminWorkArea;

import Business.Enterprise.Enterprise;
import Business.Enterprise.SuicideAwarenessEnterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chaitanya
 */
public class ManageAlertsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAlertsJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private SuicideAwarenessEnterprise suiAwe=null;

    public ManageAlertsJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
        suiAwe=(SuicideAwarenessEnterprise) this.enterprise;
        populateAlerts();
    }
    public void populateAlerts()
    {
        DefaultTableModel dtm=(DefaultTableModel) tblAlerts.getModel();
        dtm.setRowCount(0);
        for(String s:suiAwe.getReport().getLstAlerts())
        {
            Object[] row=new Object[1];
            row[0]=s;
            dtm.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlerts = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        tblAlerts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Alerts"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAlerts);
        if (tblAlerts.getColumnModel().getColumnCount() > 0) {
            tblAlerts.getColumnModel().getColumn(0).setResizable(false);
        }

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        ((CardLayout)userProcessContainer.getLayout()).previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAlerts;
    // End of variables declaration//GEN-END:variables
}