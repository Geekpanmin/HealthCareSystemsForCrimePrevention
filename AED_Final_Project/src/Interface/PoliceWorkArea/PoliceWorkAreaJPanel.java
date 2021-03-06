/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.PoliceWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.User.UserAccount;
//import Interface.Reception.RegisterPatientJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Chaitanya
 */
public class PoliceWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PoliceWorkAreaJPanel
     */
    
     private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organisation;
    private Enterprise etrp;
    private EcoSystem business;
    
   

    public PoliceWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organisation, Enterprise etrp, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        
        this.organisation = organisation;
        this.etrp = etrp;
        this.business = business;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        registerBtn = new javax.swing.JButton();
        viewCrminalsBtn = new javax.swing.JButton();
        manageWorkReq = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("POLICE WORK AREA PANEL");

        registerBtn.setBackground(new java.awt.Color(255, 51, 51));
        registerBtn.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        registerBtn.setText("REGISTER CRIMINALS");
        registerBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        viewCrminalsBtn.setBackground(new java.awt.Color(255, 51, 51));
        viewCrminalsBtn.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        viewCrminalsBtn.setText("VIEW CRIMINALS");
        viewCrminalsBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        viewCrminalsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCrminalsBtnActionPerformed(evt);
            }
        });

        manageWorkReq.setBackground(new java.awt.Color(255, 51, 51));
        manageWorkReq.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        manageWorkReq.setText("MANAGE WORKREQUEST");
        manageWorkReq.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        manageWorkReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageWorkReqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(registerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewCrminalsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(manageWorkReq, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))))
                .addContainerGap(233, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(viewCrminalsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(manageWorkReq, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.add("RegisterCriminalPanel",new RegisterCriminalPanel(userProcessContainer,account,organisation,etrp,business));
        ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);
        
    }//GEN-LAST:event_registerBtnActionPerformed

    private void viewCrminalsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCrminalsBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.add("ViewCriminalPanel",new ViewCriminalPanel(userProcessContainer,account,organisation,etrp,business));
        ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);
    }//GEN-LAST:event_viewCrminalsBtnActionPerformed

    private void manageWorkReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageWorkReqActionPerformed
        // TODO add your handling code here:
        userProcessContainer.add("ManageReqPanel",new ManageReqPanel(userProcessContainer,account,organisation,etrp,business));
        ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);
    }//GEN-LAST:event_manageWorkReqActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageWorkReq;
    private javax.swing.JButton registerBtn;
    private javax.swing.JButton viewCrminalsBtn;
    // End of variables declaration//GEN-END:variables
}
