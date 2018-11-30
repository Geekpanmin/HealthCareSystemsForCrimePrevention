/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ProctorWorkArea;

import Business.CriminalRecord.Crime;
import Business.CriminalRecord.CriminalRecord;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.SecurityEnterprise;
import Business.Network.Network;
import Business.Organization.CitizenComplaintOrganization;
import Business.Organization.Organization;
import Business.SuicidePrevention.Event;
import Business.User.UserAccount;
import Business.WorkRequest.WorkRequest;
import Business.WorkRequest.WorkResponse;
import java.awt.CardLayout;
import java.util.Random;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chaitanya
 */
public class ManageProctorWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageProctorWorkRequestJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private CitizenComplaintOrganization citizenComplaintOrg;
    private Enterprise etrp;
    private SecurityEnterprise se=null;
    private EcoSystem business;
    public ManageProctorWorkRequestJPanel(JPanel userProcessContainer, UserAccount account, CitizenComplaintOrganization citizenComplaintOrganization, Enterprise etrp, EcoSystem business) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.citizenComplaintOrg=citizenComplaintOrganization;
        this.etrp=etrp;
        se=(SecurityEnterprise) this.etrp;
        this.business=business;
        populateWorkRequest();
    }

    public void populateWorkRequest()
    {
        DefaultTableModel dtm = (DefaultTableModel) tblWorkReq.getModel();
        dtm.setRowCount(0);
        for(WorkRequest wr : citizenComplaintOrg.getWorkQueue().getLstWorkRequest())
        {
            Object row[] = new Object[4];
            row[0]=wr;
            row[1]=wr.getPerson();
            row[2]=wr.getStatus();
            row[3]=wr.getReceiver()==null?"UnAssigned":wr.getReceiver();
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkReq = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage Work Requests");

        tblWorkReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Work Request", "Person", "Status", "Receiver"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblWorkReq);

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAssign.setText("Assign");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnBack)
                            .addGap(244, 244, 244)
                            .addComponent(btnAssign)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnProcess))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnProcess)
                    .addComponent(btnAssign))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        ((CardLayout)userProcessContainer.getLayout()).previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRow=tblWorkReq.getSelectedRow();
        if(selectedRow>-1)
        {
            WorkRequest wr=(WorkRequest) tblWorkReq.getValueAt(selectedRow,0);
            if(!wr.getOl().equals(WorkRequest.OperationalLevel.CitizenCompliant))
            {
                JOptionPane.showMessageDialog(null,"Request is being serviced at "+wr.getOl().name() +" operational level","WARNING",JOptionPane.WARNING_MESSAGE);
                return;
            }
            if(wr.getReceiver()!=null && wr.getReceiver()!=account)
            {
                JOptionPane.showMessageDialog(null,"Request is assigned to some other user","WARNING",JOptionPane.WARNING_MESSAGE);
                return;
            }
            if(wr.getReceiver()==account)
            {

                JOptionPane.showMessageDialog(null,"Request already assigned to current user","WARNING",JOptionPane.WARNING_MESSAGE);
                return;
            }

            wr.setReceiver(account);
            // wr.setOl(WorkRequest.OperationalLevel.Lab);
            JOptionPane.showMessageDialog(null,"Request id - "+wr.getRequestId()+" has been assigned to you!");
            populateWorkRequest();

        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a request from table","WARNING",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        int selectedRow=tblWorkReq.getSelectedRow();
        if(selectedRow>-1)
        {
            WorkResponse wr=(WorkResponse) tblWorkReq.getValueAt(selectedRow,0);
            if(wr!=null)
            {
                if(wr.isIsComplete())
                {
                    JOptionPane.showMessageDialog(null,"Request has been completed");
                    return;
                }
                if(!wr.getOl().equals(WorkRequest.OperationalLevel.CitizenCompliant))
                {
                    JOptionPane.showMessageDialog(null,"Request is being serviced at "+wr.getOl().name() +" operational level","WARNING",JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if(wr.getReceiver()!=account)
                {
                    JOptionPane.showMessageDialog(null,"Request is not assigned to current user","WARNING",JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if(wr.getRtype().equals(WorkResponse.RequestType.SuicidePrevention))
                {
                    if(wr.isIsComplete())
                    {
                       JOptionPane.showMessageDialog(null,"This Request has already been completed by user");
                    return;
                    }
                    
                    Event eve=(Event) wr.getResult()[0];
                    int ext=0;
                    int sev=0;
                    int sum=0;
                    for(CriminalRecord cr:se.getCriminalRecDir().getLstCriminalRecord())
                    {
                     if(cr.getPerson().getSsnNumber()==wr.getPerson().getSsnNumber())
                     {
                         for(Crime c:cr.getLstCrime())
                         {
                             Random r=new Random();
                             //Pattern p=Pattern.compile("(Suicide)");
                             if(c.getCrimeType().equalsIgnoreCase("Suicide"))
                             {
                                 ext=3;
                               // ext=3; 
                             }
                             else
                             {
                                ext=2 ;
                             }
                             if(c.getSeverityLevel()>4)
                             {
                                 sev=2;
                             }
                             else
                             {
                                 sev=1;
                             }
                             
                             
                         }
                     }
                     
                    }
                    if(eve!=null)
                    {
                        sum=eve.getSeObj().getExternalFactors();
                        sum=sum+ext*2+sev;
                        eve.getSeObj().setExternalFactors(sum);
                        wr.setIsComplete(true);
                        JOptionPane.showMessageDialog(null,"Request completed and sent back to suicide prevention enterprise ");
                    }                    
                }
                
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row from table","WARNING",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnProcessActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnProcess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblWorkReq;
    // End of variables declaration//GEN-END:variables
}