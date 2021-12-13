/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.Funding;

import Business.Adopter.AdopterDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organizations.FinanceOrganization;
import Business.Organizations.Organization;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EducationAssistWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aniketmirajkar
 */
public class FinanceWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form FinanceWorkArea
     */
    
    JPanel userProcessContainer;
    UserAccount account;
    FinanceOrganization financeOrganization;
    Enterprise enterprise;
    EcoSystem business;
    PersonDirectory personDirectory;
    int countApprove=0, countDeny=0, countPending=0; 
    
    public FinanceWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, PersonDirectory personDirectory) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.financeOrganization = (FinanceOrganization) organization;
        this.enterprise = enterprise;
        this.personDirectory = personDirectory;
        this.business = business;
        
        btnProcess.setEnabled(false);
        populateRequesttable();
    }

    public FinanceWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, AdopterDirectory adopterdirectory) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        jTable1 = new javax.swing.JTable();
        btnAssigToMe = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(246, 226, 187));

        jTable1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Receiver", "Person ID", "Remarks", "Results", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnAssigToMe.setBackground(new java.awt.Color(255, 255, 255));
        btnAssigToMe.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnAssigToMe.setText("Assign To Me");
        btnAssigToMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssigToMeActionPerformed(evt);
            }
        });

        btnProcess.setBackground(new java.awt.Color(255, 255, 255));
        btnProcess.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MicrosoftTeams-image copy 2.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(71, 52, 58));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("View Finance Requests");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(254, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(308, 308, 308))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(150, 150, 150)
                            .addComponent(btnAssigToMe, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(307, 307, 307)
                            .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(110, 159, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(50, 50, 50)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAssigToMe, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 245, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssigToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssigToMeActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request");
            return;
        }
        EducationAssistWorkRequest req = (EducationAssistWorkRequest) jTable1.getValueAt(selectedRow, 0);
            if (("Approved".equalsIgnoreCase(req.getStatus())) || ("Assigned".equalsIgnoreCase(req.getStatus()))) {
                JOptionPane.showMessageDialog(null, "Request already processed.");
                return;
            }
            req.setReceiver(account);
            req.setStatus("Assigned");
            JOptionPane.showMessageDialog(this, "Request is assigned.");
            populateRequesttable();
            btnProcess.setEnabled(true);
    }//GEN-LAST:event_btnAssigToMeActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request");
            return;
        }
        EducationAssistWorkRequest req = (EducationAssistWorkRequest) jTable1.getValueAt(selectedRow, 0);

            if ("Approved".equalsIgnoreCase(req.getStatus())) {
                JOptionPane.showMessageDialog(null, "Request already processed.");
                return;
            }
            if (this.personDirectory != null && this.personDirectory.getPersonList().size() > 0) {
                for (Person p: this.personDirectory.getPersonList()) {
                    if (req.getPersonId() == p.getPersonId()) {
                        p.setFinancialHelp(true);
                        p.setAmt(req.getAmt());
                        break;
                    }
                }
            }
            req.setReceiver(account);
            req.setMessage("Send to donors");
            req.setStatus("Approved");
            JOptionPane.showMessageDialog(this, "Request is processed.");
            populateRequesttable();
    }//GEN-LAST:event_btnProcessActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssigToMe;
    private javax.swing.JButton btnProcess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    public void populateRequesttable() {
        DefaultTableModel dtms = (DefaultTableModel) jTable1.getModel();
        dtms.setRowCount(0);
        for (WorkRequest req : business.getWorkQueue().getWorkRequestList()) {
            if (req instanceof EducationAssistWorkRequest) {
                Object[] row = new Object[dtms.getColumnCount()];
                row[0] = req;
                row[1] = req.getSender();
                row[2] = req.getReceiver();
                row[3] = req.getPersonId();
                String remarks = ((EducationAssistWorkRequest) req).getRemarks();
                row[4] = remarks;
                String result = ((EducationAssistWorkRequest) req).getTestResult();
                row[5] = result == null ? "Waiting" : result;
                row[6] = req.getStatus();
                if (result == "Approved") {
                    countApprove++;
                } 
                else if (result == "Denied") {
                    countDeny++;
                } 
                else {
                    countPending++;
                }
                dtms.addRow(row);
            }
        }
    }
}
