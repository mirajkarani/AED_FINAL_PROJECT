/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.UserRegisteration;


import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Utility.SendMail;
import Business.Utility.ValidationHelper;
import Business.WorkQueue.WorkQueue;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Business.WorkQueue.AdopterRegistrationRequest;
import java.awt.event.ActionListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;



/**
 *
 * @author milin
 */
public class AdopterRegistrationJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private ActionListener eventListener;
    private boolean emailValid;
    private boolean contactValid;
    private boolean userUnique;
    private boolean income;
    private boolean age;
    private boolean ssn;
    /**
     * Creates new form AdopterRegistrationJPanel
     */
    public AdopterRegistrationJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        usernameExistsMsg.setVisible(false);
        emailValidateMsg.setVisible(false);
        emailCorrect.setVisible(false);
        userNameCorrect.setVisible(false);
        contactNoCorrect.setVisible(false);
        contactNoValidate.setVisible(false);
        AnnualIncomeValidate.setVisible(false);
        annualIncomeCorrect.setVisible(false);
        ageCorrect.setVisible(false);
        ageValidate.setVisible(false);
        ssnCorrect.setVisible(false);
        ssnValidate.setVisible(false);
        populateNetworkComboBox();

    }

    public void populateNetworkComboBox() {
        cmbCity.removeAllItems();
        for (Network network : system.getNetworkCatalog()) {
            cmbCity.addItem(network);
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
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPwd = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        usernameExistsMsg = new javax.swing.JLabel();
        emailValidateMsg = new javax.swing.JLabel();
        emailCorrect = new javax.swing.JLabel();
        userNameCorrect = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        rdbMale = new javax.swing.JRadioButton();
        rdbFemale = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAdd1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAdd2 = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbCity = new javax.swing.JComboBox<>();
        lblSSN = new javax.swing.JLabel();
        txtSSN = new javax.swing.JTextField();
        lblIncome = new javax.swing.JLabel();
        txtIncome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        contactNoCorrect = new javax.swing.JLabel();
        contactNoValidate = new javax.swing.JLabel();
        annualIncomeCorrect = new javax.swing.JLabel();
        AnnualIncomeValidate = new javax.swing.JLabel();
        ageCorrect = new javax.swing.JLabel();
        ageValidate = new javax.swing.JLabel();
        ssnCorrect = new javax.swing.JLabel();
        ssnValidate = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1338, 900));
        setPreferredSize(new java.awt.Dimension(1338, 900));
        setRequestFocusEnabled(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 52, 58));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Adopter Registration");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 430, -1));

        lblName.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(71, 52, 58));
        lblName.setText("Name");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 70, 20));

        txtName.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(25, 56, 82));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 250, 40));

        lblUserName.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(71, 52, 58));
        lblUserName.setText("Username");
        add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 230, 80, -1));

        txtUserName.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(25, 56, 82));
        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserNameKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserNameKeyReleased(evt);
            }
        });
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 250, 40));

        txtPwd.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtPwd.setForeground(new java.awt.Color(25, 56, 82));
        txtPwd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPwdKeyTyped(evt);
            }
        });
        add(txtPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 250, 40));

        lblPassword.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(71, 52, 58));
        lblPassword.setText("Password");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 300, 70, 20));

        lblEmail.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(71, 52, 58));
        lblEmail.setText("Email Id");
        add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 380, 60, 20));

        txtEmail.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(25, 56, 82));
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 250, 40));

        btnRegister.setBackground(new java.awt.Color(255, 255, 255));
        btnRegister.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(25, 56, 82));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 670, 140, -1));

        usernameExistsMsg.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        usernameExistsMsg.setForeground(new java.awt.Color(255, 0, 0));
        usernameExistsMsg.setText("Username already exists");
        add(usernameExistsMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, -1, -1));

        emailValidateMsg.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        emailValidateMsg.setForeground(new java.awt.Color(255, 0, 0));
        emailValidateMsg.setText("Email format incorrect");
        add(emailValidateMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, -1, -1));

        emailCorrect.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        emailCorrect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tick.png"))); // NOI18N
        add(emailCorrect, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, -1, -1));

        userNameCorrect.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        userNameCorrect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tick.png"))); // NOI18N
        add(userNameCorrect, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, -1, -1));

        lblAge.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblAge.setForeground(new java.awt.Color(71, 52, 58));
        lblAge.setText("Age");
        add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 70, 20));

        txtAge.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgeKeyReleased(evt);
            }
        });
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, 250, 40));

        lblGender.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblGender.setForeground(new java.awt.Color(71, 52, 58));
        lblGender.setText("Gender");
        add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 100, 20));

        rdbMale.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        rdbMale.setText("Male");
        add(rdbMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, -1, -1));

        rdbFemale.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        rdbFemale.setText("Female");
        add(rdbFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(71, 52, 58));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Screen Shot 2021-12-12 at 5.30.29 AM.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 940, 470));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(71, 52, 58));
        jLabel4.setText("Street Address Line1");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 150, -1, 30));

        txtAdd1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(txtAdd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 150, 240, 40));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(71, 52, 58));
        jLabel3.setText("Street Address Line2");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 220, -1, 30));

        txtAdd2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(txtAdd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 220, 240, 40));

        txtContact.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContactKeyReleased(evt);
            }
        });
        add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 290, 240, 40));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(71, 52, 58));
        jLabel5.setText("City");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 370, 60, -1));

        cmbCity.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cmbCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCityActionPerformed(evt);
            }
        });
        add(cmbCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 370, 240, -1));

        lblSSN.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblSSN.setForeground(new java.awt.Color(71, 52, 58));
        lblSSN.setText("SSN");
        add(lblSSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 450, 50, -1));

        txtSSN.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtSSN.setForeground(new java.awt.Color(25, 56, 82));
        txtSSN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSSNKeyReleased(evt);
            }
        });
        add(txtSSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 440, 230, 40));

        lblIncome.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblIncome.setForeground(new java.awt.Color(71, 52, 58));
        lblIncome.setText("Annual Income");
        add(lblIncome, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 530, -1, 30));

        txtIncome.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtIncome.setForeground(new java.awt.Color(25, 56, 82));
        txtIncome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIncomeKeyReleased(evt);
            }
        });
        add(txtIncome, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 520, 230, 40));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(71, 52, 58));
        jLabel7.setText("Contact No");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 290, -1, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 650, -1, -1));

        contactNoCorrect.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        contactNoCorrect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tick.png"))); // NOI18N
        add(contactNoCorrect, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 300, -1, -1));

        contactNoValidate.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        contactNoValidate.setForeground(new java.awt.Color(255, 0, 0));
        contactNoValidate.setText("Phone format incorrect");
        add(contactNoValidate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 310, -1, -1));

        annualIncomeCorrect.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        annualIncomeCorrect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tick.png"))); // NOI18N
        add(annualIncomeCorrect, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 530, -1, 30));

        AnnualIncomeValidate.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        AnnualIncomeValidate.setForeground(new java.awt.Color(255, 0, 0));
        AnnualIncomeValidate.setText("Enter numeric value");
        add(AnnualIncomeValidate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 540, -1, -1));

        ageCorrect.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        ageCorrect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tick.png"))); // NOI18N
        add(ageCorrect, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 540, -1, -1));

        ageValidate.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        ageValidate.setForeground(new java.awt.Color(255, 0, 0));
        ageValidate.setText("Enter numeric value");
        add(ageValidate, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 550, -1, -1));

        ssnCorrect.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        ssnCorrect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tick.png"))); // NOI18N
        add(ssnCorrect, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 450, -1, -1));

        ssnValidate.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        ssnValidate.setForeground(new java.awt.Color(255, 0, 0));
        ssnValidate.setText("Enter valid SSN");
        add(ssnValidate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 460, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        Network network = (Network) cmbCity.getSelectedItem();
        if (txtName.getText().isEmpty() || txtUserName.getText().isEmpty() || txtPwd.getText().isEmpty() || txtEmail.getText().isEmpty()
                || txtSSN.getText().isEmpty() || txtAge.getText().isEmpty()
                || (!rdbMale.isSelected() && !rdbFemale.isSelected())
                || txtIncome.getText().isEmpty()
                || txtAdd1.getText().isEmpty() || txtAdd2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter all fields");
        } else if (emailValid && userUnique && contactValid && income && age && ssn) {
            AdopterRegistrationRequest registrationRequest = new AdopterRegistrationRequest();
            String gender = "";
            if (rdbMale.isSelected()) {
                gender = "Male";
            } else if (rdbFemale.isSelected()) {
                gender = "Female";
            }
            registrationRequest.setName(txtName.getText());
            registrationRequest.setUserName(txtUserName.getText());
            registrationRequest.setUserPassword(txtPwd.getText());
            registrationRequest.setUserEmailId(txtEmail.getText());
            registrationRequest.setGender(gender);
            registrationRequest.setNetwork(network);
            registrationRequest.setSsn(txtSSN.getText());
            registrationRequest.setAddress1(txtAdd1.getText());
            registrationRequest.setAddress2(txtAdd2.getText());
            registrationRequest.setUserContact(txtContact.getText());
            registrationRequest.setStatus("Request access");
            registrationRequest.setAnnualIncome(txtIncome.getText());
            registrationRequest.setAge(txtAge.getText());
            String subject = "Adopter Registration";
            String content = "Dear Adopter, thank you for registering with us. Your account will be activated within 24 hours. We will keep you posted with your status.";
            SendMail.sendEmailMessage(txtEmail.getText(), subject, content);
            for (Network network1 : system.getNetworkCatalog()) {
                for (Enterprise enterprise : network1.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Adoption) {
                        if (enterprise.getWorkQueue() == null) {
                            enterprise.setWorkQueue(new WorkQueue());
                        }
                        enterprise.getWorkQueue().getWorkRequestList().add(registrationRequest);
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "You have been registered succesfully");
            txtUserName.setText("");
            txtName.setText("");
            txtPwd.setText("");
            txtEmail.setText("");
            txtSSN.setText("");
            txtIncome.setText("");
            txtAge.setText("");
            txtAdd1.setText("");
            txtAdd2.setText("");
            txtContact.setText("");
            rdbFemale.setSelected(false);
            rdbMale.setSelected(false);
            usernameExistsMsg.setVisible(false);
            emailValidateMsg.setVisible(false);
            emailCorrect.setVisible(false);
            userNameCorrect.setVisible(false);
            contactNoCorrect.setVisible(false);
            contactNoValidate.setVisible(false);
            AnnualIncomeValidate.setVisible(false);
            annualIncomeCorrect.setVisible(false);
            ageCorrect.setVisible(false);
            ageValidate.setVisible(false);
            ssnCorrect.setVisible(false);
            ssnValidate.setVisible(false);

        } else {
            JOptionPane.showMessageDialog(null, "Invalid credentials");
        }

    }//GEN-LAST:event_btnRegisterActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtUserNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameKeyTyped

    private void txtPwdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPwdKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtPwdKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped

        txtEmail.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                warn();
            }

            public void removeUpdate(DocumentEvent e) {
                warn();
            }

            public void insertUpdate(DocumentEvent e) {
                warn();
            }

            public void warn() {
                if (!ValidationHelper.isValidEmailId(txtEmail.getText())) {
                    emailValidateMsg.setVisible(true);
                    emailCorrect.setVisible(false);
                    emailValid = false;
                } else {
                    emailValidateMsg.setVisible(false);
                    emailCorrect.setVisible(true);
                    emailValid = true;
                }
            }
        });

    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtUserNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyReleased
        // TODO add your handling code here:
        txtUserName.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                warn();
            }

            public void removeUpdate(DocumentEvent e) {
                warn();
            }

            public void insertUpdate(DocumentEvent e) {
                warn();
            }

            public void warn() {
                if (!system.checkIfUserIsUnique(txtUserName.getText())) {
                    usernameExistsMsg.setVisible(true);
                    userNameCorrect.setVisible(false);
                    userUnique = false;
                }    
                 else {
                    usernameExistsMsg.setVisible(false);
                    userNameCorrect.setVisible(true);
                    userUnique = true;
                }
            }
        });

    }//GEN-LAST:event_txtUserNameKeyReleased

    private void txtContactKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyReleased
        // TODO add your handling code here:
        txtContact.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                warn();
            }

            public void removeUpdate(DocumentEvent e) {
                warn();
            }

            public void insertUpdate(DocumentEvent e) {
                warn();
            }

            public void warn() {
                if (!ValidationHelper.isValidContactNo(txtContact.getText())) {
                    contactNoCorrect.setVisible(false);
                    contactNoValidate.setVisible(true);
                    contactValid = false;
                } else {
                   contactNoCorrect.setVisible(true);
                    contactNoValidate.setVisible(false);
                    contactValid = true;
                }
            }
        });
    }//GEN-LAST:event_txtContactKeyReleased

    private void txtIncomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIncomeKeyReleased
        // TODO add your handling code here:
        txtIncome.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                warn();
            }

            public void removeUpdate(DocumentEvent e) {
                warn();
            }

            public void insertUpdate(DocumentEvent e) {
                warn();
            }

            public void warn() {
                if (!ValidationHelper.isNumeric(txtIncome.getText())) {
                    AnnualIncomeValidate.setVisible(true);
                    annualIncomeCorrect.setVisible(false);
                    income = false;
                } else {
                    annualIncomeCorrect.setVisible(true);
                    AnnualIncomeValidate.setVisible(false);
                    income = true;
                }
            }
        });
    }//GEN-LAST:event_txtIncomeKeyReleased

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased
        // TODO add your handling code here:
        txtAge.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                warn();
            }

            public void removeUpdate(DocumentEvent e) {
                warn();
            }

            public void insertUpdate(DocumentEvent e) {
                warn();
            }

            public void warn() {
                if (!ValidationHelper.isNumeric(txtAge.getText())) {
                    ageValidate.setVisible(true);
                    ageCorrect.setVisible(false);
                    age = false;
                } else {
                    ageCorrect.setVisible(true);
                    ageValidate.setVisible(false);
                    age = true;
                }
            }
        });
    }//GEN-LAST:event_txtAgeKeyReleased

    private void cmbCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCityActionPerformed

    private void txtSSNKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSSNKeyReleased
        // TODO add your handling code here:
        txtSSN.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                warn();
            }

            public void removeUpdate(DocumentEvent e) {
                warn();
            }

            public void insertUpdate(DocumentEvent e) {
                warn();
            }

            public void warn() {
                if (!ValidationHelper.isValidSSN(txtSSN.getText())) {
                    ssnValidate.setVisible(true);
                    ssnCorrect.setVisible(false);
                    ssn = false;
                } else {
                    ssnCorrect.setVisible(true);
                    ssnValidate.setVisible(false);
                    ssn = true;
                }
            }
        });
    }//GEN-LAST:event_txtSSNKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnnualIncomeValidate;
    private javax.swing.JLabel ageCorrect;
    private javax.swing.JLabel ageValidate;
    private javax.swing.JLabel annualIncomeCorrect;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<Network> cmbCity;
    private javax.swing.JLabel contactNoCorrect;
    private javax.swing.JLabel contactNoValidate;
    private javax.swing.JLabel emailCorrect;
    private javax.swing.JLabel emailValidateMsg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblIncome;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JRadioButton rdbFemale;
    private javax.swing.JRadioButton rdbMale;
    private javax.swing.JLabel ssnCorrect;
    private javax.swing.JLabel ssnValidate;
    private javax.swing.JTextField txtAdd1;
    private javax.swing.JTextField txtAdd2;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIncome;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPwd;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JLabel userNameCorrect;
    private javax.swing.JLabel usernameExistsMsg;
    // End of variables declaration//GEN-END:variables
}
