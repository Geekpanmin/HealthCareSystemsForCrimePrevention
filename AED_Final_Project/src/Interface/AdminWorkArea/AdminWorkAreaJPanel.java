/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.AdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.User.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Chaitanya
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private Enterprise enterprise;
    private UserAccount ua;
    public AdminWorkAreaJPanel(JPanel userProcessContainer,UserAccount ua,Enterprise enterprise ,EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        this.ua=ua;
        this.enterprise=enterprise;
        valueLabel.setText(enterprise.getName());
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
        enterpriseLabel = new javax.swing.JLabel();
        btnManageOrganization = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        btnManageEmployee = new javax.swing.JButton();
        btnManageUsers = new javax.swing.JButton();
        btnManageWorkRequest = new javax.swing.JButton();
        btnDataAnalysis = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("My Work Area -Adminstrative Role");

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        btnManageOrganization.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnManageOrganization.setText("Manage Organization");
        btnManageOrganization.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnManageOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrganizationActionPerformed(evt);
            }
        });

        btnManageEmployee.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnManageEmployee.setText("Manage Employee");
        btnManageEmployee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnManageEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEmployeeActionPerformed(evt);
            }
        });

        btnManageUsers.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnManageUsers.setText("Manage User");
        btnManageUsers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnManageUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageUsersActionPerformed(evt);
            }
        });

        btnManageWorkRequest.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnManageWorkRequest.setText("Manage WorkRequest");
        btnManageWorkRequest.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnManageWorkRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageWorkRequestActionPerformed(evt);
            }
        });

        btnDataAnalysis.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDataAnalysis.setText("Data Analysis");
        btnDataAnalysis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDataAnalysis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataAnalysisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnManageOrganization, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnManageEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnManageUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnManageWorkRequest, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                            .addComponent(btnDataAnalysis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueLabel)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnManageOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnManageEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnManageUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnManageWorkRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDataAnalysis, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrganizationActionPerformed

        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(userProcessContainer,enterprise, enterprise.getOrdDir());
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageOrganizationActionPerformed

    private void btnManageEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEmployeeActionPerformed

        ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(userProcessContainer,enterprise.getOrdDir());
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnManageEmployeeActionPerformed

    private void btnManageUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageUsersActionPerformed
        // TODO add your handling code here:
        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(userProcessContainer, enterprise,system);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageUsersActionPerformed

    private void btnManageWorkRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageWorkRequestActionPerformed
        // TODO add your handling code here:
        if(enterprise.getEt().equals(Enterprise.ErpType.Hospital))
        {
         ManageWorkRequestHospitalJPanel wrhejp=new ManageWorkRequestHospitalJPanel(userProcessContainer,ua,enterprise,system);
         userProcessContainer.add("ManageWorkRequestHospitalJPanel",wrhejp);
         ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);
        }
        else if(enterprise.getEt().equals(Enterprise.ErpType.SuicideAwareness))
        {
         ManageWorkRequestAFSPJPanel wrhejp=new ManageWorkRequestAFSPJPanel(userProcessContainer,ua,enterprise,system);
         userProcessContainer.add("ManageWorkRequestNgoJPanel",wrhejp);
         ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);
        }
        else if(enterprise.getEt().equals(Enterprise.ErpType.Security))
        {
         ManageWorkRequestSecurityJPanel wrhejp=new ManageWorkRequestSecurityJPanel(userProcessContainer,ua,enterprise,system);
         userProcessContainer.add("ManageWorkRequestSecurityJPanel",wrhejp);
         ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);
        }
        else if(enterprise.getEt().equals(Enterprise.ErpType.DrugFree))
        {
         ManageWorkRequestDrugFreeJPanel mwrdf=new ManageWorkRequestDrugFreeJPanel(userProcessContainer,ua,enterprise,system);
         userProcessContainer.add("ManageWorkRequestSecurityJPanel",mwrdf);
         ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);
        }
        
        else if(enterprise.getEt().equals(Enterprise.ErpType.EducationInstitute))
        {
         ManageWorkRequestEducationJPanel mwrdf=new ManageWorkRequestEducationJPanel(userProcessContainer,ua,enterprise,system);
         userProcessContainer.add("ManageWorkRequestEducationJPanel",mwrdf);
         ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);
        }
        //#TODO respective work request panels for admins.
//        else
//        {
//            WorkResponseSupplierEnterpriseJPanel wrsejp=new WorkResponseSupplierEnterpriseJPanel(userProcessContainer,ua,enterprise,system);
//         userProcessContainer.add("WorkResponseSupplierEnterpriseJPanel",wrsejp);
//         ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);
//        }
    }//GEN-LAST:event_btnManageWorkRequestActionPerformed

    private void btnDataAnalysisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataAnalysisActionPerformed
        // TODO add your handling code here:
       if(enterprise.getEt().equals(Enterprise.ErpType.SuicideAwareness))
        {
         ManageSuicidePreventionAnalysisJPanel wrhejp=new ManageSuicidePreventionAnalysisJPanel(userProcessContainer,ua,enterprise,system);
         userProcessContainer.add("ManageSuicidePreventionAnalysisJPanel",wrhejp);
         ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);
        }
       else if(enterprise.getEt().equals(Enterprise.ErpType.EducationInstitute))
       {
           ManageDataAnalysisEducationJPanel mjp=new ManageDataAnalysisEducationJPanel(userProcessContainer,ua,enterprise,system);
           userProcessContainer.add("ManageSuicidePreventionAnalysisJPanel",mjp);
         ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);
       }
       else if(enterprise.getEt().equals(Enterprise.ErpType.DrugFree))
       {
           ManageDrugAnalysisJPanel mda=new ManageDrugAnalysisJPanel(userProcessContainer,ua,enterprise,system);
           userProcessContainer.add("ManageDrugAnalysisJPanel",mda);
         ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);
       }
       else
       {
           JOptionPane.showMessageDialog(null,"Sorry! this enterprise doesnt perform any data analysis");
           return;
       }
    }//GEN-LAST:event_btnDataAnalysisActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDataAnalysis;
    private javax.swing.JButton btnManageEmployee;
    private javax.swing.JButton btnManageOrganization;
    private javax.swing.JButton btnManageUsers;
    private javax.swing.JButton btnManageWorkRequest;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}