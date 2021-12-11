/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.RayOfHope.PersonCare;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organizations.Organization;
import Business.Organizations.FinanceOrganization;
import Business.Organizations.PersonCareOrganization;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EducationAssistWorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author aniketmirajkar
 */
public class RequestFinancialHelp extends javax.swing.JPanel {

    /**
     * Creates new form RequestFinancialHelp
     */
    
    JPanel userProcessContainer;
    UserAccount account;
    PersonCareOrganization personCareOrganization;
    Enterprise enterprise;
    EcoSystem business;
    PersonDirectory personDirectory;
    Person person;
    String data;
    Network network;
    
    public RequestFinancialHelp(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, PersonDirectory personDirectory, Person person, String data) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.personCareOrganization = (PersonCareOrganization) organization;
        this.enterprise = enterprise;
        this.business = business;
        this.personDirectory = personDirectory;
        this.person = person;
        
        for (Network net : business.getNetworkCatalog()) {
            for (Enterprise ent : net.getEnterpriseDirectory().getEnterpriseList()) {
                if (ent.equals(enterprise)) {
                    network = net;
                }
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

        jPanel1 = new javax.swing.JPanel();
        lblEduFunds = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEduFunds = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtFundsMedExp = new javax.swing.JTextField();
        txtFundsLiving = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFundsMisc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEduFunds.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblEduFunds.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEduFunds.setText("Funds for Education");
        jPanel1.add(lblEduFunds, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 190, 40));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Miscellaneous");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 213, 38));
        jPanel1.add(txtEduFunds, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 222, 27));

        btnSubmit.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSubmit.setText("Request");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, 133, 33));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Funds for Medical Expenses");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 240, 36));

        txtFundsMedExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFundsMedExpActionPerformed(evt);
            }
        });
        jPanel1.add(txtFundsMedExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 222, 27));
        jPanel1.add(txtFundsLiving, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 222, 27));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Funds for Living Expenses");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 230, 36));
        jPanel1.add(txtFundsMisc, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 222, 27));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REQUEST FOR FUNDS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 870, 40));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 860, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 999, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 999, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        if (txtEduFunds.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter the Message for finance team");
            return;
        }
        EducationAssistWorkRequest fccwr = new EducationAssistWorkRequest();
        try {
            Long amt = Long.parseLong(txtEduFunds.getText()) + Long.parseLong(txtFundsMedExp.getText()) + Long.parseLong(txtFundsLiving.getText())
            + Long.parseLong(txtFundsMisc.getText());
            fccwr.setAmt(amt.toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter numeric amount");
            return;
        }
        fccwr.setMessage("Requesting funds");
        fccwr.setStatus("Initiated");
        fccwr.setSender(account);
        fccwr.setPersonId(person.getPersonId());
        fccwr.setRemarks("Request for Finance Team");
        List<Organization> org = new ArrayList<>();
        for (Network network : business.getNetworkCatalog()) {
            for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof FinanceOrganization) {
                        org.add(organization);
                        organization.getWorkQueue().getWorkRequestList().add(fccwr);
                    }
                }
            }
        }

        if (org.size() > 0) {
            account.getWorkQueue().getWorkRequestList().add(fccwr);
            business.getWorkQueue().getWorkRequestList().add(fccwr);
        }
        JOptionPane.showMessageDialog(null, "Request raised to Funding team");
        ViewCompletePersonDetails vccd = new ViewCompletePersonDetails(userProcessContainer, account, personCareOrganization, enterprise, business, personDirectory, person, false);
        this.userProcessContainer.add("ViewCompleteChildDetails", vccd);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtFundsMedExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFundsMedExpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFundsMedExpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEduFunds;
    private javax.swing.JTextField txtEduFunds;
    private javax.swing.JTextField txtFundsLiving;
    private javax.swing.JTextField txtFundsMedExp;
    private javax.swing.JTextField txtFundsMisc;
    // End of variables declaration//GEN-END:variables
}
