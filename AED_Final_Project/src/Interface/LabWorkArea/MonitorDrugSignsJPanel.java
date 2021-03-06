/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.LabWorkArea;

import Business.DrugAbuseControl.DrugEvaluation;
import Business.DrugRecord.DrugRecord;
import Business.EcoSystem;
import Business.Enterprise.DrugFreeEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.User.UserAccount;
import Business.WorkRequest.WorkResponse;
import Interface.DoctorWorkArea.DoctorWorkAreaJPanel;
//import Interface.Reception.RegisterPatientJPanel;
import java.awt.CardLayout;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Suyog Sathe
 */
public class MonitorDrugSignsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private WorkResponse wr;
    private UserAccount account;
    private LabOrganization organization;
    private Enterprise etrp;
    private EcoSystem business;
    
    private HospitalEnterprise h;
    private int count=0;

    MonitorDrugSignsJPanel(JPanel userProcessContainer, WorkResponse wr, UserAccount account, LabOrganization organization, Enterprise etrp, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.wr = wr;
        this.account = account;
        this.organization = organization;
        this.etrp = etrp;
        this.h = (HospitalEnterprise) this.etrp;
        this.business = business;
        populateVitals();

    }

    public void populateVitals() {
        Person p = wr.getPerson();
        DrugEvaluation de = (DrugEvaluation) wr.getResult()[0];
        if(de!=null)
        {
            Random r=new Random();
        //int bodyMass = 1;
        int bodyMass=r.nextInt(5)+28;
        bodyMassT.setText(String.valueOf(bodyMass));
        count++;
        
        int cocaine = 11;
        cocaineT.setText(String.valueOf(cocaine));
        count++;
        
        int drugTolerance = 12;
        drugToleranceT.setText(String.valueOf(drugTolerance));
        count++;
        
        int marijuana = 13;
        marijuanaT.setText(String.valueOf(marijuana));
        count++;
        
        int metabolicRate = 14;
        metabolicRateT.setText(String.valueOf(metabolicRate));
        count++;
        
        //int urinePH = 15;
         int urinePH=r.nextInt(8)+6;
        urinePHT.setText(String.valueOf(urinePH));
        count++;
        
        int weed = 16;
        weedT.setText(String.valueOf(weed));
        count++;
        
        de.setA(count*3);
        
        
        //factor a is assigned
        for(DrugRecord dr : h.getDrugDir().getListDrugRecord())
        {
            if(dr.getPerson()==wr.getPerson())
            {
                bodyMass=dr.getSigns().getBodyMass();
                urinePH=dr.getSigns().getUrinePh();
                metabolicRate=dr.getSigns().getMetabolicRate();
                drugTolerance=dr.getSigns().getDrugTolerance();
                cocaine=dr.getSigns().getCocaine();
                weed=dr.getSigns().getWeed();
                marijuana=dr.getSigns().getMarijuana();
                break;
            }
        }
        DrugRecord dr = h.getDrugDir().addDrugRecord();
        
        dr.getSigns().setBodyMass(bodyMass);
        dr.getSigns().setCocaine(cocaine);
        dr.getSigns().setDrugTolerance(drugTolerance);
        dr.getSigns().setMarijuana(marijuana);
        dr.getSigns().setMetabolicRate(metabolicRate);
        dr.getSigns().setUrinePh(urinePH);
        dr.getSigns().setWeed(weed);
        dr.setPerson(p);
        
        
        if (bodyMass > 0 && bodyMass <=30) //&& urinePH > 8) && (cocaine > 10 || marijuana > 10 || weed > 10)) {
                {
            dr.setPl(DrugRecord.PriorityLevel.Low);
        } else if (bodyMass >30 && bodyMass <=60) //&& (cocaine > 10 || marijuana > 10 || weed > 10)) {
                {
            dr.setPl(DrugRecord.PriorityLevel.Medium);
        } else {

            dr.setPl(DrugRecord.PriorityLevel.High);
String pr=dr.getPl().toString();
wr.getResult()[1]=pr;
        }
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
        jLabel2 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        diagnoseBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        metabolicRateT = new javax.swing.JTextField();
        urinePHT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        drugToleranceT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        bodyMassT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cocaineT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        weedT = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        marijuanaT = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Monitor Vital Signs - Drug Test");

        jLabel2.setText("Test Results:");

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        diagnoseBtn.setText("Diagnose");
        diagnoseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagnoseBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Metabolic Rate:");

        metabolicRateT.setEnabled(false);

        urinePHT.setEnabled(false);

        jLabel4.setText("UrinePH:");

        drugToleranceT.setEnabled(false);

        jLabel5.setText("Drug Tolerance:");

        bodyMassT.setEnabled(false);

        jLabel6.setText("bodyMass:");

        cocaineT.setEnabled(false);

        jLabel7.setText("Cocaine:");

        weedT.setEnabled(false);

        jLabel8.setText("Weed:");

        marijuanaT.setEnabled(false);

        jLabel9.setText("Marijuana:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(407, 407, 407)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backBtn)
                                .addGap(42, 42, 42)
                                .addComponent(diagnoseBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5))
                                        .addGap(37, 37, 37))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(42, 42, 42)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bodyMassT, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(urinePHT, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(metabolicRateT, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(drugToleranceT, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(18, 18, 18)
                                                .addComponent(cocaineT, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(18, 18, 18)
                                                .addComponent(marijuanaT, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(weedT, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(metabolicRateT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cocaineT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(urinePHT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(drugToleranceT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(weedT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(marijuanaT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bodyMassT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(diagnoseBtn))
                .addContainerGap(124, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        ((CardLayout) userProcessContainer.getLayout()).previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void diagnoseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagnoseBtnActionPerformed
        if (!wr.getOl().equals(WorkResponse.OperationalLevel.Lab)) {
            JOptionPane.showMessageDialog(null, "Request is being serviced at " + wr.getOl().name() + " operational level", "WARNING", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (wr.getReceiver() != account) {
            JOptionPane.showMessageDialog(null, "This request does not belong to this account", "WARNING", JOptionPane.WARNING_MESSAGE);
            return;
        }
        DoctorOrganization docOrg = null;
        wr.setSender(account);
        // workRequest.setPerson(person);
        wr.setReceiver(null);
        account.getWorkQueue().getLstWorkRequest().add(wr);
        //wr.setOl(WorkResponse.OperationalLevel.Lab);
        DrugRecord dr2=null;
        for(DrugRecord dr:h.getDrugDir().getListDrugRecord())
        {
            if(dr.getPerson()==wr.getPerson())
            {
                dr2=dr;
            }
        }
//        for (DrugRecord dr : h.getDrugDir().getListDrugRecord()) {
            if (dr2.getPl().equals(DrugRecord.PriorityLevel.High)) {
                wr.setSender(account);
                wr.setReceiver(null);

                account.getWorkQueue().getLstWorkRequest().add(wr);
                for (Organization org : etrp.getOrdDir().getLstOrganisation()) {
                    if (org instanceof DoctorOrganization) {
                        docOrg = (DoctorOrganization) org;
                    }
                }
                if (docOrg != null) {
                    docOrg.getWorkQueue().getLstWorkRequest().add(wr);
                    wr.setOl(WorkResponse.OperationalLevel.Doctor);
                    wr.setStatus("Pending - Sent to Doctor Organization");
                    JOptionPane.showMessageDialog(null, "This patient is sent to doctor");
                  //  break;
                }

            } else {
                wr.setSender(account);
                wr.setReceiver(null);
                account.getWorkQueue().getLstWorkRequest().add(wr);
                etrp.getWorkQueue().getLstWorkRequest().add(wr);
                wr.setOl(WorkResponse.OperationalLevel.Hospital);
                wr.setStatus("Pending - Sent to Hospital Enterprise");
                JOptionPane.showMessageDialog(null, "This patient is sent to Hospital for further checking");
            //    break;
            }
      //  }

//        etrp.getWorkQueue().getLstWorkRequest().add(wr);
//        wr.setOl(WorkResponse.OperationalLevel.Hospital);
//        //#TODO logicset request type to suicide or drug related problems.done for now
//       // wr.setRtype(WorkRequest.RequestType.SuicidePrevention);
//        wr.setStatus("Pending - Sent to Hospital Admin");
//        JOptionPane.showMessageDialog(null,"This patient needs to be further evaluated,Request sent to Hospital Enterprise");
//        }        
//        else
//        {
//         for(Organization org:etrp.getOrdDir().getLstOrganisation())
//         {
//             if(org instanceof DoctorOrganization)
//             {
//                 docOrg=(DoctorOrganization) org;
//             }
//         }
//         if(docOrg!=null)
//         {
//          docOrg.getWorkQueue().getLstWorkRequest().add(wr);
//          wr.setOl(WorkResponse.OperationalLevel.Doctor);
//          wr.setStatus("Pending - Sent to Doctor Organization"); 
//          JOptionPane.showMessageDialog(null,"This patient is sent to doctor");
//         }

    }//GEN-LAST:event_diagnoseBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField bodyMassT;
    private javax.swing.JTextField cocaineT;
    private javax.swing.JButton diagnoseBtn;
    private javax.swing.JTextField drugToleranceT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField marijuanaT;
    private javax.swing.JTextField metabolicRateT;
    private javax.swing.JTextField urinePHT;
    private javax.swing.JTextField weedT;
    // End of variables declaration//GEN-END:variables
}
