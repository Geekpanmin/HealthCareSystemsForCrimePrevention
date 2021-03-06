/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.EducationReception;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.RegistrationOrganization;
import Business.Person.Person;
import Business.User.UserAccount;
//import Interface.Reception.RegisterPatientJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Chinmay
 */
public class EducationReceptionWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form EducationReceptionWorkAreaPanel
     */
   
          private JPanel userProcessContainer;
    private UserAccount account;
    private RegistrationOrganization organisation;
    private Enterprise etrp;
    private EcoSystem business;
    
    public EducationReceptionWorkAreaPanel(JPanel userProcessContainer, UserAccount account, RegistrationOrganization organisation, Enterprise etrp, EcoSystem business) {
      initComponents();     
         this.userProcessContainer=userProcessContainer;
        
         this.account=account;
         this.organisation=organisation;
         this.etrp=etrp;
         this.business=business;
        
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
        manageWorkReqBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("WorK Area - Education Reception");

        registerBtn.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        registerBtn.setText("REGISTER");
        registerBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        manageWorkReqBtn.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        manageWorkReqBtn.setText("MANAGE WORK REQUEST");
        manageWorkReqBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        manageWorkReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageWorkReqBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(registerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(manageWorkReqBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(388, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129)
                .addComponent(manageWorkReqBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(329, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
       // userProcessContainer.add("RegisterEducationPanel",new RegisterEducationPanel(userProcessContainer,account, organisation,etrp,business));
       // ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);


       userProcessContainer.add("RegisterEducationPanel",new dummyRegisterEducationPanel(userProcessContainer,account, organisation,etrp,business));
       ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);


    }//GEN-LAST:event_registerBtnActionPerformed

    private void manageWorkReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageWorkReqBtnActionPerformed
   
         userProcessContainer.add("ManageWorkReqPanel",new ManageWorkReqPanel(userProcessContainer,account,organisation,etrp,business));
        ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);

// TODO add your handling code here:
    }//GEN-LAST:event_manageWorkReqBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageWorkReqBtn;
    private javax.swing.JButton registerBtn;
    // End of variables declaration//GEN-END:variables
}
