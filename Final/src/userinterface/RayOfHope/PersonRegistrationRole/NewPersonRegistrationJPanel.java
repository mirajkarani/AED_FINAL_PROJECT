/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.RayOfHope.PersonRegistrationRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.MedicOrganization;
import Business.Organization.Organization;
import Business.Organization.PersonRegistrationOrganization;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.MedicalAssistanceWorkRequest;
import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author mandardeshmukh
 */
public class NewPersonRegistrationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewPersonRegistrationJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    Enterprise enterprise;
    EcoSystem business;
    PersonDirectory persondirectory;
    PersonRegistrationOrganization organization;
    Network network;
    Random rand;
    public NewPersonRegistrationJPanel(JPanel userProcessContainer, PersonDirectory persondirectory, UserAccount account, Enterprise enterprise, EcoSystem business, Organization organization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.persondirectory = persondirectory;
        this.account = account;
        this.enterprise = enterprise;
        this.business = business;
        this.organization = (PersonRegistrationOrganization) organization;
        jXDatePicker1.getMonthView().setUpperBound(new Date());
        rand = new Random();
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        maleRDB = new javax.swing.JRadioButton();
        femaleRDB = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        photoText = new javax.swing.JTextField();
        btnRegisterChild = new javax.swing.JButton();
        uploadButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jXDatePicker1 = new org.netbeans.modules.form.InvalidComponent();
        jLabel6 = new javax.swing.JLabel();
        txtMark = new javax.swing.JTextField();
        cmbAge = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        yesBtn = new javax.swing.JRadioButton();
        noBtn = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 130, 35));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Age");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 130, 40));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHILD REGISTRATION");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 320, 30));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 190, 30));

        maleRDB.setText("Male");
        add(maleRDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, 35));

        femaleRDB.setText("Female");
        add(femaleRDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, -1, 35));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Gender");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 130, 35));

        photoText.setMaximumSize(new java.awt.Dimension(6, 20));
        add(photoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 190, 30));

        btnRegisterChild.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnRegisterChild.setText("Register");
        btnRegisterChild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterChildActionPerformed(evt);
            }
        });
        add(btnRegisterChild, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 130, -1));

        uploadButton.setText("Upload");
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });
        add(uploadButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 110, 30));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Photo ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 130, 35));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Registration Date");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 130, 35));
        add(jXDatePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 190, 30));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Identification Mark");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 130, 35));
        add(txtMark, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 190, 30));

        cmbAge.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18" }));
        add(cmbAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 190, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel7.setText("Does child have special needs?");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 220, 30));

        yesBtn.setText("Yes");
        add(yesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, -1, -1));

        noBtn.setText("No");
        add(noBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, -1, -1));
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 720, 350));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterChildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterChildActionPerformed
    try {
            if (!validation()) {
                String personName = txtName.getText();
                String ageString = cmbAge.getSelectedItem().toString();
                int personAge = Integer.parseInt(ageString);
                String gender = "";
                if (maleRDB.isSelected()) {
                    gender = "Male";
                } else if (femaleRDB.isSelected()) {
                    gender = "Female";
                }
                Date date = jXDatePicker1.getDate();
                DateFormat formatit = new SimpleDateFormat("yyyy-MM-dd");
                String temp = "";
                Date regDate = new Date();
                try {
                    temp = formatit.format(date);
                    regDate = formatit.parse(temp);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Please select the registration date");
                }
                String identificationMark = txtMark.getText();
                Person person = new Person();
                int personId = rand.nextInt(100);
                person = persondirectory.addPerson();
                person.setPersonAge(personAge);
                person.setChildId(personId);
                person.setName(personName);
                person.setIdentificationMark(identificationMark);
                person.setImageDetails(photoText.getText());
                person.setRegistrationDate(regDate);
                person.setGender(gender);
                person.setStatus("Newly Registered");
                if (yesBtn.isSelected()) {
                    person.setIsChallenged(true);
                } else if (noBtn.isSelected()) {
                    person.setIsChallenged(false);
                }
                person.setMedicalStatus((person.getMedicalStatus() == null ? "" : person.getMedicalStatus()) + "Sent to Doctor");
                MedicalAssistanceWorkRequest docwrkreq = new MedicalAssistanceWorkRequest();
                docwrkreq.setStatus("Sent to Doctor");
                docwrkreq.setMessage("Please medically examine the newly registered child");
                docwrkreq.setSender(account);
                docwrkreq.setPersonId(person.getPersonId());
                docwrkreq.setPersonName(person.getName());
                List<MedicOrganization> list = new ArrayList<>();
                for (Network network : business.getNetworkCatalog()) {
                    for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
                        if (this.network.equals(network)) {
                            for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()) {
                                if (organization instanceof MedicOrganization) {
                                    list.add((MedicOrganization) organization);
                                }
                            }
                        }
                    }
                }
                for (MedicOrganization org : list) {
                    org.getWorkQueue().getWorkRequestList().add(docwrkreq);
                }
                if (list != null && list.size() > 0) {
                    account.getWorkQueue().getWorkRequestList().add(docwrkreq);
                    business.getWorkQueue().getWorkRequestList().add(docwrkreq);
                }
                txtName.setText("");
                buttonGroup1.clearSelection();
                cmbAge.getModel().setSelectedItem(0);
                jXDatePicker1.getEditor().setText("");
                txtMark.setText("");
                photoText.setText("");
                buttonGroup2.clearSelection();
                JOptionPane.showMessageDialog(null, "Child registered successfully");
            }
        } catch (ParseException ex) {
            Logger.getLogger(NewPersonRegistrationJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRegisterChildActionPerformed
               
    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed
       
         browseImageFile();
    }//GEN-LAST:event_uploadButtonActionPerformed

    private String browseImageFile() {
        JFileChooser chooseFile = new JFileChooser();
        chooseFile.showOpenDialog(null);
        File file = chooseFile.getSelectedFile();
        String pathofFile = file.getPath();
        photoText.setText(pathofFile);
        return pathofFile;
    }
    
    public boolean validation() throws ParseException {
        DateFormat formait = new SimpleDateFormat("yyyy/MM/dd");

        String selectedFormaString = "";
        try {
            Date selected = jXDatePicker1.getDate();
            selectedFormaString = formait.format(selected);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please select the registration date");
            return true;
        }
        if (txtName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter the name of the child");
            return true;
        } //else if (!ValidationHelper.validateName(txtName.getText())) {
           // JOptionPane.showMessageDialog(null, "Please enter the name in the correct format(No special characters)");
           // return true;
        //} 
        else if (cmbAge.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Please provide the age of the child");
            return true;
        } else if (!maleRDB.isSelected() && !femaleRDB.isSelected()) {
            JOptionPane.showMessageDialog(null, "Please select the gender of the child");
            return true;
        } else if (selectedFormaString.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please select the registration date");
            return true;
        } else if (txtMark.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter the identification mark. If there are none, please write NA/None");
            return true;
        } //else if (!ValidationHelper.validateIdentity(txtMark.getText())) {
          //  JOptionPane.showMessageDialog(null, "No special character in identification mark");
           // return true;
       // } 
        else if (photoText.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please select the image of the child");
            return true;
        } else if (!yesBtn.isSelected() && !noBtn.isSelected()) {
            JOptionPane.showMessageDialog(null, "Please select whether child has special needs question");
            return true;
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegisterChild;
    private javax.swing.JComboBox<String> cmbAge;
    private javax.swing.JRadioButton femaleRDB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private org.netbeans.modules.form.InvalidComponent jXDatePicker1;
    private javax.swing.JRadioButton maleRDB;
    private javax.swing.JRadioButton noBtn;
    private javax.swing.JTextField photoText;
    private javax.swing.JTextField txtMark;
    private javax.swing.JTextField txtName;
    private javax.swing.JButton uploadButton;
    private javax.swing.JRadioButton yesBtn;
    // End of variables declaration//GEN-END:variables
}