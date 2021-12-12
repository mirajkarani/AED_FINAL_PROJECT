/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Espousal.Espousal;
import Business.Adopter.Adopter;
import Business.Adopter.AdopterDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organizations.AdopterOrganization;
import Business.Organizations.EspousalOrganization;
import Business.Organizations.VerificationOrganization;
import Business.Organizations.Organization;
import Business.UserAccount.UserAccount;
import Business.Utility.SendMail;
import Business.WorkQueue.AdopterWorkStatusCheckRequest;
import Business.WorkQueue.AdoptionProcessWorkRequest;
import Business.WorkQueue.BackgroundCheckWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author milin
 */
public class AdoptionCheckProcess extends javax.swing.JPanel {

    /**
     * Creates new form AdoptionCheckProcess
     */
    
    JPanel userProcessContainer;
    UserAccount account;
    Enterprise enterprise;
    EcoSystem business;
    AdopterDirectory adopterdirectory;
    EspousalOrganization adoptionOrganization;
    Adopter adopter;
    AdoptionProcessWorkRequest adoptionWorkRequest;
    
    public AdoptionCheckProcess(JPanel userProcessContainer,UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, AdopterDirectory adopterdirectory, AdoptionProcessWorkRequest adoptionWorkRequest, Adopter adopter) {
        initComponents();
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.adopterdirectory=adopterdirectory;
        this.account=account;
        this.enterprise=enterprise;
        this.business = business;
        this.adoptionOrganization = (EspousalOrganization)organization;
        this.adopter = adopter;
        this.adoptionWorkRequest = adoptionWorkRequest;
        populateWorkRequest();
        setUserDetailsField();
        txtName.setEnabled(false);
        txtAge.setEnabled(false);
        txtEmail.setEnabled(false);
        txtIncome.setEnabled(false);
        rdbMale.setEnabled(false);
        rdbFemale.setEnabled(false);
        txtSSN.setEnabled(false);
    }
    
    public void setUserDetailsField() {
        txtAge.setText(String.valueOf(adopter.getAge()));
        txtEmail.setText(adopter.getEmailId());
        txtIncome.setText(String.valueOf(adopter.getAnnualIncome()));
        txtName.setText(adopter.getName());
        txtSSN.setText(adopter.getSsn());
        if (adopter.getGender().equalsIgnoreCase("Male")) {
            rdbMale.setSelected(true);
        } else {
            rdbFemale.setSelected(true);
        }
    }
    
    
    public void populateWorkRequest() {

        DefaultTableModel model = (DefaultTableModel) tblInitiateBCG.getModel();
        model.setRowCount(0);

        for (WorkRequest request : adoptionOrganization.getWorkQueue().getWorkRequestList()) {

            if (request instanceof AdoptionProcessWorkRequest) {
                if (request.getUserId() == adoptionWorkRequest.getUserId()) {
                    Object[] row = new Object[model.getColumnCount()];
                    row[0] = request;
                    row[1] = request.getName();
                    row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
                    row[3] = request.getUserId();
                    row[4] = request.getStatus();
                    model.addRow(row);
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

        lblHeading = new javax.swing.JLabel();
        lblAdopterDetails = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtSSN = new javax.swing.JTextField();
        txtIncome = new javax.swing.JTextField();
        rdbMale = new javax.swing.JRadioButton();
        rdbFemale = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInitiateBCG = new javax.swing.JTable();
        btnInitiateBCG = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblRefresh = new javax.swing.JLabel();

        setBackground(new java.awt.Color(246, 226, 187));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHeading.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        lblHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading.setText("Start your Adoption Journey");
        add(lblHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 460, 30));

        lblAdopterDetails.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblAdopterDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdopterDetails.setText("Your Details");
        add(lblAdopterDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 350, 20));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setText("Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 100, 20));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Age");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 80, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Gender");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 60, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("SSN");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 50, 20));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("Income");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 70, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setText("Email ID");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 70, -1));

        txtEmail.setEditable(false);
        txtEmail.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 200, -1));

        txtName.setEditable(false);
        txtName.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 210, -1));

        txtAge.setEditable(false);
        txtAge.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 210, 30));

        txtSSN.setEditable(false);
        txtSSN.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(txtSSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 200, -1));

        txtIncome.setEditable(false);
        txtIncome.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(txtIncome, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 200, -1));

        rdbMale.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        rdbMale.setText("Male");
        rdbMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbMaleActionPerformed(evt);
            }
        });
        add(rdbMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, -1));

        rdbFemale.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        rdbFemale.setText("Female");
        add(rdbFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, -1, -1));

        tblInitiateBCG.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblInitiateBCG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Name", "Receiver", "Adopter ID", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblInitiateBCG);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 810, 110));

        btnInitiateBCG.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnInitiateBCG.setText("Start Verification");
        btnInitiateBCG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInitiateBCGActionPerformed(evt);
            }
        });
        add(btnInitiateBCG, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 580, 150, 30));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/grandparents-parents-kids-icon-family-design-vector-graph-cartoon-concept-represented-isolated-colorfull-illustration-74239628 (1).png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 930, 510));

        lblRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refreshBtn.png"))); // NOI18N
        lblRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblRefreshMousePressed(evt);
            }
        });
        add(lblRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, 30, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void rdbMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbMaleActionPerformed

    private void btnInitiateBCGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInitiateBCGActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblInitiateBCG.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a workrequest");
            return;
        }

        Object receiverval = tblInitiateBCG.getValueAt(selectedRow, 2);
        Object statusval = tblInitiateBCG.getValueAt(selectedRow, 4);
        AdoptionProcessWorkRequest request = (AdoptionProcessWorkRequest) tblInitiateBCG.getValueAt(selectedRow, 0);

        if ("Initialized BGC".equalsIgnoreCase(request.getStatus())) {
            JOptionPane.showMessageDialog(null, "BGC already initiated");
        } else {
            if (receiverval.equals(account.getUsername()) && "Pending with Adoption Organization".equals(statusval)) {
                request.setStatus("Initialized BGC");
                request.setSender(account);
                request.setUserId(adopter.getUserId());
                request.setName(adopter.getName());

                //populateWorkRequest();
                BackgroundCheckWorkRequest bgcreq = new BackgroundCheckWorkRequest();
                bgcreq.setMessage("Please initiate BGC");
                bgcreq.setStatus("Pending with BGC organization");
                bgcreq.setSender(account);
                bgcreq.setUserId(adopter.getUserId());
                bgcreq.setName(adopter.getName());

                Organization org = null;
                for (Network network : business.getNetworkCatalog()) {
                    for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
                        for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()) {
                            if (organization instanceof VerificationOrganization) {

                                org = organization;
                                break;
                            }
                        }
                    }
                }

                if (org != null) {
                    org.getWorkQueue().getWorkRequestList().add(bgcreq);
                    account.getWorkQueue().getWorkRequestList().add(bgcreq);
                    business.getWorkQueue().getWorkRequestList().add(bgcreq);
                }

                AdopterWorkStatusCheckRequest wrk = new AdopterWorkStatusCheckRequest();
                wrk.setUserId(adopter.getUserId());
                wrk.setBgcStatus("Pending");
                wrk.setFinanceStatus("Pending");
                wrk.setMessage("BGC initialized");
                wrk.setName(adopter.getName());

                Organization org1 = null;
                for (Network network : business.getNetworkCatalog()) {
                    for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
                        for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()) {
                            if (organization instanceof AdopterOrganization) {
                                        if(adopter.getName().equalsIgnoreCase(organization.getName())){
                                org1 = organization;
                                break;
                                        }
                            }
                        }
                    }
                }

                if (org1 != null) {
                    org1.getWorkQueue().getWorkRequestList().add(wrk);
                    account.getWorkQueue().getWorkRequestList().add(wrk);
                    business.getWorkQueue().getWorkRequestList().add(wrk);
                }
                String subject = "Background check process initiated";
                String content = "Your background check process has been initiated and sent to respective team. You can check your status through your credentials. \nThank you.";
                try {
                    SendMail.sendEmailMessage(adopter.getEmailId(), subject, content);
                } catch (UnsupportedEncodingException ex) {
                    Logger.getLogger(AdoptionCheckProcess.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null, "BGC check initialized successfully!");
            } else if (!receiverval.equals(account.getUsername())) {
                JOptionPane.showMessageDialog(null, "Please select the work request assigned to you to proceed");
            } else if (!"Pending with Adoption Organization".equals(statusval)) {
                JOptionPane.showMessageDialog(null, "The selected work request assigned to you is already processed");
            }
        }
        
    }//GEN-LAST:event_btnInitiateBCGActionPerformed

    private void lblRefreshMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRefreshMousePressed
        // TODO add your handling code here:
        populateWorkRequest();
    }//GEN-LAST:event_lblRefreshMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInitiateBCG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAdopterDetails;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblRefresh;
    private javax.swing.JRadioButton rdbFemale;
    private javax.swing.JRadioButton rdbMale;
    private javax.swing.JTable tblInitiateBCG;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIncome;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSSN;
    // End of variables declaration//GEN-END:variables
}
