/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.RayOfHope.PersonCare;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organizations.MedicOrganization;
import Business.Organizations.Organization;
import Business.Organizations.PersonCareOrganization;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.MedicalAssistanceWorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author aniketmirajkar
 */
public class RequestMedicalHelp extends javax.swing.JPanel {

    /**
     * Creates new form RequestMedicalHelp
     */
    
    JPanel userProcessContainer;
    Person person;
    UserAccount account;
    PersonCareOrganization personCareOrganization;
    Enterprise enterprise;
    EcoSystem business;
    PersonDirectory personDirectory;
    Network network;
    
    public RequestMedicalHelp(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, PersonDirectory personDirectory, Person person) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.person = person;
        this.account = account;
        this.personCareOrganization = (PersonCareOrganization) organization;
        this.enterprise = enterprise;
        this.business = business;
        this.personDirectory = personDirectory;
        
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSymptoms = new javax.swing.JTextArea();
        btnSubmit = new javax.swing.JButton();
        lblHeading = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(246, 226, 187));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Symptoms");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 87, 42));

        txtSymptoms.setColumns(20);
        txtSymptoms.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtSymptoms.setRows(5);
        jScrollPane1.setViewportView(txtSymptoms);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 310, 110));

        btnSubmit.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 133, 33));

        lblHeading.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(71, 52, 58));
        lblHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading.setText("Request Medical Help");
        jPanel1.add(lblHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 460, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Screen Shot 2021-12-12 at 3.23.00 PM.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 450, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 947, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 947, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 769, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        if (txtSymptoms.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter the symptoms");
            return;
        }
        String symptoms = txtSymptoms.getText();
        person.setMedicalStatus(person.getMedicalStatus() + "\n" + symptoms + " on date " + new Date());
        person.setMedicalHelp(true);
        MedicalAssistanceWorkRequest docwrkreq = new MedicalAssistanceWorkRequest();
        docwrkreq.setStatus("Medically Unfit");
        docwrkreq.setMessage(symptoms);
        docwrkreq.setSender(account);
        docwrkreq.setPersonId(person.getPersonId());
        docwrkreq.setRemark("Request for Doctor");
        docwrkreq.setPersonName(person.getName());
        Organization org = null;
        for (Network network : business.getNetworkCatalog()) {
            for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof MedicOrganization) {
                        org = organization;
                        break;
                    }
                }
            }
        }
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(docwrkreq);
            account.getWorkQueue().getWorkRequestList().add(docwrkreq);
            business.getWorkQueue().getWorkRequestList().add(docwrkreq);
        }
        ViewCompletePersonDetails vccd = new ViewCompletePersonDetails(userProcessContainer, account, personCareOrganization, enterprise, business, personDirectory, person, true);
        this.userProcessContainer.add("ViewCompleteChildDetails", vccd);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JTextArea txtSymptoms;
    // End of variables declaration//GEN-END:variables
}
