/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package userinterface;

import Business.Adopter.AdopterDirectory;
import Business.DB4OUtil.DB4OUtil;
import Business.Donor.DonorDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organizations.Organization;
import Business.Person.PersonDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import static java.time.Clock.system;
import javax.swing.JOptionPane;
import userinterface.UserRegisteration.SponsorRegistrationJPanel;
import userinterface.UserRegisteration.AdopterRegistrationJPanel;

/**
 *
 * @author aniketmirajkar
 */
public class MainJFrame extends javax.swing.JFrame {

    /** Creates new form MainJFrame */
    
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    UserAccount userAccount;
    Enterprise inEnterprise;
    Organization inOrganization;
    Network networkEmergency;
    private PersonDirectory persondirectory;
    private AdopterDirectory adopterdirectory;
    private DonorDirectory donorDirectory;
    
    public MainJFrame() {
        this.setUndecorated(true);
        initComponents();
        system = dB4OUtil.retrieveSystem();
        EcoSystem.setInstance(system);
        loginJPanel.setVisible(true);
        container.setVisible(false);
        UpperPanel.setVisible(false);
        this.setSize(1320, 790);
        adopterdirectory = system.getAdopterDirectory();
        persondirectory = system.getPersonDirectory();
        donorDirectory = system.getDonorDirectory();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UpperPanel = new javax.swing.JPanel();
        btnLogoutLabel = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        loginJPanel = new javax.swing.JPanel();
        upperPanel = new javax.swing.JPanel();
        lblPic = new javax.swing.JLabel();
        UserPanel = new javax.swing.JPanel();
        lblUserPic = new javax.swing.JLabel();
        lblUserName = new javax.swing.JTextField();
        lblPwd = new javax.swing.JPanel();
        lblPwdPic = new javax.swing.JLabel();
        lblPasswrd = new javax.swing.JPasswordField();
        lblLogin = new javax.swing.JLabel();
        lblAdopt = new javax.swing.JLabel();
        lblSponsor = new javax.swing.JLabel();
        bottomPanel = new javax.swing.JPanel();
        lblBottom = new javax.swing.JLabel();
        lblInfo = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        lblInfo1 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        lblCancel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UpperPanel.setBackground(new java.awt.Color(255, 255, 255));
        UpperPanel.setMinimumSize(new java.awt.Dimension(1338, 60));
        UpperPanel.setPreferredSize(new java.awt.Dimension(1338, 60));
        UpperPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogoutLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnLogoutLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnLogoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLogoutLabelMousePressed(evt);
            }
        });
        UpperPanel.add(btnLogoutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 0, 60, 50));

        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBackMousePressed(evt);
            }
        });
        UpperPanel.add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 10, 50, 40));

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setForeground(new java.awt.Color(31, 50, 97));
        container.setPreferredSize(new java.awt.Dimension(1338, 840));
        container.setLayout(new java.awt.CardLayout());

        loginJPanel.setBackground(new java.awt.Color(255, 255, 255));
        loginJPanel.setPreferredSize(new java.awt.Dimension(1338, 900));
        loginJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        upperPanel.setBackground(new java.awt.Color(71, 52, 58));
        upperPanel.setPreferredSize(new java.awt.Dimension(840, 554));

        lblPic.setBackground(new java.awt.Color(71, 52, 58));
        lblPic.setForeground(new java.awt.Color(71, 52, 58));
        lblPic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/460d763b03bde42280bf12b493874a04.gif"))); // NOI18N

        javax.swing.GroupLayout upperPanelLayout = new javax.swing.GroupLayout(upperPanel);
        upperPanel.setLayout(upperPanelLayout);
        upperPanelLayout.setHorizontalGroup(
            upperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, upperPanelLayout.createSequentialGroup()
                .addComponent(lblPic, javax.swing.GroupLayout.DEFAULT_SIZE, 1334, Short.MAX_VALUE)
                .addContainerGap())
        );
        upperPanelLayout.setVerticalGroup(
            upperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upperPanelLayout.createSequentialGroup()
                .addComponent(lblPic, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        loginJPanel.add(upperPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1340, 370));

        UserPanel.setBackground(new java.awt.Color(255, 255, 255));
        UserPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(71, 52, 58)));
        UserPanel.setPreferredSize(new java.awt.Dimension(302, 34));

        lblUserPic.setBackground(new java.awt.Color(255, 255, 255));
        lblUserPic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Screen Shot 2021-12-11 at 9.51.57 PM.png"))); // NOI18N
        lblUserPic.setMaximumSize(new java.awt.Dimension(20, 20));
        lblUserPic.setMinimumSize(new java.awt.Dimension(20, 20));
        lblUserPic.setPreferredSize(new java.awt.Dimension(20, 20));

        lblUserName.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblUserName.setToolTipText("");
        lblUserName.setBorder(null);
        lblUserName.setCaretColor(new java.awt.Color(255, 255, 255));
        lblUserName.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        lblUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblUserNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UserPanelLayout = new javax.swing.GroupLayout(UserPanel);
        UserPanel.setLayout(UserPanelLayout);
        UserPanelLayout.setHorizontalGroup(
            UserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserPanelLayout.createSequentialGroup()
                .addComponent(lblUserPic, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
        );
        UserPanelLayout.setVerticalGroup(
            UserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUserPic, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
            .addComponent(lblUserName)
        );

        loginJPanel.add(UserPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 560, 300, 40));

        lblPwd.setBackground(new java.awt.Color(255, 255, 255));
        lblPwd.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(71, 52, 58)));
        lblPwd.setPreferredSize(new java.awt.Dimension(302, 34));

        lblPwdPic.setBackground(new java.awt.Color(255, 255, 255));
        lblPwdPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Screen Shot 2021-12-11 at 9.52.09 PM.png"))); // NOI18N
        lblPwdPic.setMaximumSize(new java.awt.Dimension(20, 20));
        lblPwdPic.setMinimumSize(new java.awt.Dimension(20, 20));
        lblPwdPic.setPreferredSize(new java.awt.Dimension(20, 20));

        lblPasswrd.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblPasswrd.setBorder(null);
        lblPasswrd.setCaretColor(new java.awt.Color(255, 255, 255));
        lblPasswrd.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        lblPasswrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblPasswrdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lblPwdLayout = new javax.swing.GroupLayout(lblPwd);
        lblPwd.setLayout(lblPwdLayout);
        lblPwdLayout.setHorizontalGroup(
            lblPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblPwdLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPwdPic, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPasswrd, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        lblPwdLayout.setVerticalGroup(
            lblPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPwdPic, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
            .addComponent(lblPasswrd)
        );

        loginJPanel.add(lblPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 620, 300, 40));

        lblLogin.setBackground(new java.awt.Color(71, 52, 58));
        lblLogin.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(0, 153, 102));
        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin.setText("LOGIN");
        lblLogin.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(71, 52, 58)));
        lblLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblLoginMousePressed(evt);
            }
        });
        loginJPanel.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 690, 300, 40));

        lblAdopt.setBackground(new java.awt.Color(255, 255, 255));
        lblAdopt.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblAdopt.setForeground(new java.awt.Color(0, 153, 102));
        lblAdopt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdopt.setText("Start your journey\n");
        lblAdopt.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(71, 52, 58)));
        lblAdopt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAdoptMousePressed(evt);
            }
        });
        loginJPanel.add(lblAdopt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 730, 150, 40));

        lblSponsor.setBackground(new java.awt.Color(255, 255, 255));
        lblSponsor.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblSponsor.setForeground(new java.awt.Color(0, 153, 102));
        lblSponsor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSponsor.setText("Send a care package");
        lblSponsor.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(71, 52, 58)));
        lblSponsor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSponsorMousePressed(evt);
            }
        });
        loginJPanel.add(lblSponsor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, 160, 40));

        lblBottom.setText("jLabel5");

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblBottom, javax.swing.GroupLayout.PREFERRED_SIZE, 1249, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        loginJPanel.add(bottomPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 790, 1340, 110));

        lblInfo.setBorder(null);
        lblInfo.setForeground(new java.awt.Color(255, 0, 255));

        jTextPane1.setEditable(false);
        jTextPane1.setFont(new java.awt.Font("SansSerif", 3, 16)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(0, 153, 102));
        jTextPane1.setText("Many senior citizens find themselves in a long-term care facility with increasing life expectancy in modern times.  At Ray Of Hope, we like to provide for the elderly to keep their spirits high and bellies full.");
        lblInfo.setViewportView(jTextPane1);

        loginJPanel.add(lblInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 630, 720, 80));

        lblInfo1.setBorder(null);
        lblInfo1.setForeground(new java.awt.Color(255, 0, 255));

        jTextPane3.setEditable(false);
        jTextPane3.setFont(new java.awt.Font("SansSerif", 3, 16)); // NOI18N
        jTextPane3.setForeground(new java.awt.Color(0, 153, 102));
        jTextPane3.setText("Ray Of Hope allows us to bring joy to senior citizens by showcasing hope to let them know they are not forgotten and alone.");
        lblInfo1.setViewportView(jTextPane3);

        loginJPanel.add(lblInfo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 720, 100));

        lblCancel1.setBackground(new java.awt.Color(255, 255, 255));
        lblCancel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCancel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/66847.png"))); // NOI18N
        lblCancel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblCancel1.setMaximumSize(new java.awt.Dimension(20, 20));
        lblCancel1.setMinimumSize(new java.awt.Dimension(20, 20));
        lblCancel1.setPreferredSize(new java.awt.Dimension(20, 20));
        lblCancel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCancel1MousePressed(evt);
            }
        });
        loginJPanel.add(lblCancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 10, -1, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/sun-rays-logo-11549878082pielo0cy42.png"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(148, 151));
        jLabel4.setMinimumSize(new java.awt.Dimension(148, 151));
        jLabel4.setPreferredSize(new java.awt.Dimension(148, 151));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        loginJPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 370, 230, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UpperPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(loginJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UpperPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(loginJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, 1048, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutLabelMousePressed
        logout();
    }//GEN-LAST:event_btnLogoutLabelMousePressed

    private void lblBackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMousePressed
        // TODO add your handling code here:
        logout();
    }//GEN-LAST:event_lblBackMousePressed

    private void lblUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblUserNameActionPerformed

    private void lblPasswrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblPasswrdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblPasswrdActionPerformed

    private void lblLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMousePressed
        // TODO add your handling code here:
        String userName = lblUserName.getText();
        char[] passwordCharArray = lblPasswrd.getPassword();
        String password = String.valueOf(passwordCharArray);

        userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);
        inEnterprise = null;
        inOrganization = null;
        networkEmergency = null;

        if (userAccount == null) {
            for (Network network : system.getNetworkCatalog()) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {

                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    networkEmergency = network;
                    if (userAccount == null) {
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            userAccount = organization.getUserAccountDirectory().authenticateUser(userName, password);
                            if (userAccount != null) {
                                inEnterprise = enterprise;
                                inOrganization = organization;
                                networkEmergency = network;
                                break;
                            }
                        }

                    } else {
                        inEnterprise = enterprise;
                        break;
                    }
                    if (inOrganization != null) {
                        break;
                    }
                }
                if (inEnterprise != null) {
                    break;
                }
            }
        }
        if (userAccount == null) {
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        } else {
            loginJPanel.setVisible(false);
            container.setVisible(true);
            UpperPanel.setVisible(true);
            btnLogoutLabel.setVisible(true);
            lblUserName.setText("");
            lblPasswrd.setText("");
            if (userAccount != null && userAccount.getRole() != null) {

                container.add("workArea",userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, system, persondirectory, adopterdirectory,donorDirectory));

                CardLayout layout = (CardLayout) container.getLayout();
                layout.next(container);
            }
        }
    }//GEN-LAST:event_lblLoginMousePressed

    private void lblAdoptMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdoptMousePressed
        // TODO add your handling code here:
        AdopterRegistrationJPanel panel = new AdopterRegistrationJPanel(container, system);
        loginJPanel.setVisible(false);
        container.setVisible(true);
        UpperPanel.setVisible(true);
        btnLogoutLabel.setVisible(false);
        lblUserName.setText("");
        lblPasswrd.setText("");
        container.add("workArea", panel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);

    }//GEN-LAST:event_lblAdoptMousePressed

    private void lblSponsorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSponsorMousePressed
        // TODO add your handling code here:
        SponsorRegistrationJPanel panel = new SponsorRegistrationJPanel(container, system);
        loginJPanel.setVisible(false);
        container.setVisible(true);
        UpperPanel.setVisible(true);
        btnLogoutLabel.setVisible(false);
        lblUserName.setText("");
        lblPasswrd.setText("");
        container.add("workArea", panel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_lblSponsorMousePressed

    private void lblCancel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancel1MousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lblCancel1MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel UpperPanel;
    private javax.swing.JPanel UserPanel;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JLabel btnLogoutLabel;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JLabel lblAdopt;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBottom;
    private javax.swing.JLabel lblCancel1;
    private javax.swing.JScrollPane lblInfo;
    private javax.swing.JScrollPane lblInfo1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JPasswordField lblPasswrd;
    private javax.swing.JLabel lblPic;
    private javax.swing.JPanel lblPwd;
    private javax.swing.JLabel lblPwdPic;
    private javax.swing.JLabel lblSponsor;
    private javax.swing.JTextField lblUserName;
    private javax.swing.JLabel lblUserPic;
    private javax.swing.JPanel loginJPanel;
    private javax.swing.JPanel upperPanel;
    // End of variables declaration//GEN-END:variables

    private void logout() {
        container.removeAll();
        dB4OUtil.storeSystem(system);
        loginJPanel.setVisible(true);
        container.setVisible(false);
        UpperPanel.setVisible(false);
    }
}
