/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Espousal.Espousal;



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
    AdoptionOrganization adoptionOrganization;
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
        this.adoptionOrganization = (AdoptionOrganization)organization;
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

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHeading.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        lblHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading.setText("ADOPTION PROCESS");
        add(lblHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 460, 30));

        lblAdopterDetails.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        lblAdopterDetails.setText("Adopter Details");
        add(lblAdopterDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 180, 20));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 100, 20));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Age");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 80, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("Gender");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 60, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setText("SSN");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 50, 20));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setText("Income");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 70, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel6.setText("Email ID");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 70, -1));

        txtEmail.setEditable(false);
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 200, -1));

        txtName.setEditable(false);
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 210, -1));

        txtAge.setEditable(false);
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 210, 30));

        txtSSN.setEditable(false);
        add(txtSSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 200, -1));

        txtIncome.setEditable(false);
        add(txtIncome, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 200, -1));

        rdbMale.setText("Male");
        rdbMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbMaleActionPerformed(evt);
            }
        });
        add(rdbMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, -1));

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

        btnInitiateBCG.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnInitiateBCG.setText("Initiate BGC");
        btnInitiateBCG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInitiateBCGActionPerformed(evt);
            }
        });
        add(btnInitiateBCG, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 580, 150, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/kids11.png"))); // NOI18N
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
