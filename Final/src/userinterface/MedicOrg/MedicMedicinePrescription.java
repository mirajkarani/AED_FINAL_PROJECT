/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.MedicOrg;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.PharmacyOrganization;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.MedicalAssistanceWorkRequest;
import Business.WorkQueue.PharmacistAssistWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author mandardeshmukh
 */
public class MedicMedicinePrescription extends javax.swing.JPanel {

    /**
     * Creates new form MedicMedicinePrescription
     */
    
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private PersonDirectory persondirectory;
    private Person person;
    private  MedicalAssistanceWorkRequest request;
    private  EcoSystem business;
    Network network;
    public MedicMedicinePrescription(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, Person person, PersonDirectory persondirectory, MedicalAssistanceWorkRequest request, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.person = person;
        this.persondirectory = persondirectory;
        this.business = business;
        this.request = request;
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

        jLabel1 = new javax.swing.JLabel();
        lblPrescription = new javax.swing.JLabel();
        txtPrescription = new javax.swing.JTextField();
        Save = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MEDICINE PRESCRIPTION");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 309, -1));

        lblPrescription.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        lblPrescription.setText("Prescription");
        add(lblPrescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 160, 20));
        add(txtPrescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 270, 90));

        Save.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 120, 30));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 550, 570));
    }// </editor-fold>//GEN-END:initComponents

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        
        String prescription = txtPrescription.getText();
        if (prescription.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter medicines to be prescribed");
        } else {
            PharmacistAssistWorkRequest pharrequest = new PharmacistAssistWorkRequest();
            pharrequest.setMessage("Medicine Prescribed");
            pharrequest.setSender(userAccount);
            pharrequest.setPersonId(request.getPersonId());
            pharrequest.setPersonName(request.getPersonName());
            pharrequest.setStatus("Prescription Sent");
            pharrequest.setPrescription(prescription);
            request.setStatus("Medicine Prescribed");
            request.setTestResult("Child Treated and medicines Prescribed");
            JOptionPane.showMessageDialog(this, "Medicines prescribed! ");
            Organization org = null;
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof PharmacyOrganization) {
                    org = organization;
                    break;
                }
            }
            if (org != null) {
                org.getWorkQueue().getWorkRequestList().add(pharrequest);
                userAccount.getWorkQueue().getWorkRequestList().add(pharrequest);
            }
        }
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AssignPersonJPanel panel = (AssignPersonJPanel) component;
        panel.populateMedicationTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_SaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblPrescription;
    private javax.swing.JTextField txtPrescription;
    // End of variables declaration//GEN-END:variables
}
