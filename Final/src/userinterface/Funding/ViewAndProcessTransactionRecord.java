/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.Funding;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organizations.FinanceOrganization;
import Business.Organizations.Organization;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.UserAccount.UserAccount;
import Business.Utility.SendMail;
import Business.WorkQueue.DonorWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aniketmirajkar
 */
public class ViewAndProcessTransactionRecord extends javax.swing.JPanel {

    /**
     * Creates new form ViewAndProcessTransactionRecord
     */
    
    JPanel userProcessContainer;
    UserAccount account;
    FinanceOrganization financeOrganization;
    Enterprise enterprise;
    EcoSystem business;
    PersonDirectory personDirectory;
    int countApprove=0, countDeny=0, countPending=0; 
    
    public ViewAndProcessTransactionRecord(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, PersonDirectory personDirectory) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.financeOrganization = (FinanceOrganization) organization;
        this.enterprise = enterprise;
        this.personDirectory = personDirectory;
        this.business = business;
        btnProcess.setEnabled(false);
        populateDonorRequesttable();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtComments = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TRANSACTION RECORD");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Receiver", "Child ID", "Child Name", "Remarks", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        btnAssign.setText("Assign To Me");
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

        jLabel2.setText("Comments");

        txtComments.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(276, 276, 276)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(390, 390, 390)
                            .addComponent(txtComments, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(730, 730, 730)
                            .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(270, 270, 270)
                            .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(170, 170, 170)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(118, 118, 118)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(txtComments, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(300, 300, 300)
                            .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(300, 300, 300)
                            .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(300, 300, 300)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable2.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request");
            return;
        }
        Object statusval = jTable2.getValueAt(selectedRow, 6);
        DonorWorkRequest req = (DonorWorkRequest) jTable2.getValueAt(selectedRow, 0);
        if ("Received".equals(statusval) || "Assigned".equals(statusval)) {
            JOptionPane.showMessageDialog(null, "Request already processed");
        } 
        else {
            req.setReceiver(account);
            req.setMessage("Payment processed");
            req.setStatus("Assigned");
            JOptionPane.showMessageDialog(null, "Request is assigned");
            populateDonorRequesttable();
            btnProcess.setEnabled(true);
        }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable2.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request");
            return;
        }
        Object statusval = jTable2.getValueAt(selectedRow, 6);
        DonorWorkRequest req = (DonorWorkRequest) jTable2.getValueAt(selectedRow, 0);
        if ("Received".equals(statusval)) {
            JOptionPane.showMessageDialog(null, "Request already processed");
        } 
        else {
            req.setMessage(txtComments.getText());
            req.setStatus("Received");
            JOptionPane.showMessageDialog(null, "Request is processed");
            if (this.personDirectory != null && this.personDirectory.getPersonList().size() > 0) {
                for (Person p: this.personDirectory.getPersonList()) {
                    if (req.getPersonId() == p.getPersonId()) {
                        p.setFinancialHelp(false);
                        break;
                    }
                }
            }
            String subject = "Payment Receipt";
            String content = "Dear Sponsor, this is an acknowledgement receipt. We have recieved your payment. Thank you so much for your kind donation. Your caring support will make a great difference in the child's academic success. We hope that you will continue serving and make world a better place for children.";
            SendMail.sendEmailMessage(req.getEmailId(), subject, content);
        }
        populateDonorRequesttable();
        txtComments.setText("");
    }//GEN-LAST:event_btnProcessActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnProcess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtComments;
    // End of variables declaration//GEN-END:variables

    public void populateDonorRequesttable() {
        DefaultTableModel dtms = (DefaultTableModel) jTable2.getModel();
        dtms.setRowCount(0);

        for (WorkRequest req : business.getWorkQueue().getWorkRequestList()) {
            if (req instanceof DonorWorkRequest) {
                Object[] row = new Object[dtms.getColumnCount()];
                req.setReceiver(account);
                row[0] = req;
                row[1] = req.getSender();
                row[2] = req.getReceiver();
                row[3] = req.getPersonId();
                row[4] = req.getPersonName();
                String remarks = ((DonorWorkRequest) req).getRemarks();
                row[5] = remarks;
                row[6] = req.getStatus();
                dtms.addRow(row);
            }
        }
    }
}
