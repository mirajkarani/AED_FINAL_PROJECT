/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Sponsor;

import Business.Adopter.AdopterDirectory;
import Business.Person.PersonDirectory;
import Business.Donor.Donor;
import Business.Donor.DonorDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DonorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author milin
 */
public class SponsorWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    Enterprise enterprise;
    EcoSystem business;
    DonorOrganization donororganization;
    Donor donor;
    PersonDirectory persondirectory;
    DonorDirectory donorDirectory;
    AdopterDirectory adopterdirectory;
    
    public SponsorWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, AdopterDirectory adopterdirectory, PersonDirectory persondirectory, DonorDirectory donorDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise = enterprise;
        this.business = business;
        this.donororganization = (DonorOrganization) organization;
        this.persondirectory = persondirectory;
        this.donorDirectory = donorDirectory;
        this.adopterdirectory = adopterdirectory;
        valueLabel.setText(organization.getName());
        for (Donor a : donorDirectory.getDonorList()) {
            if (a.getUserName().equals(account.getUsername())) {
                donor = a;
            }
        }
        manageDonorWorkAreaJPanel();
    }
    
    private void manageDonorWorkAreaJPanel() {
        SponsorRequestTable panel = new SponsorRequestTable(rightSystemAdminPanel, account, donororganization, enterprise, business, adopterdirectory, persondirectory, donorDirectory);
        rightSystemAdminPanel.add("ManageNetworkJPanel", panel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }

    private void TrackStatus() {
      StatusSponsor panel = new StatusSponsor(rightSystemAdminPanel, account, donororganization, enterprise, business, adopterdirectory, persondirectory, donorDirectory);
        rightSystemAdminPanel.add("SceneDetailsGraph", panel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        systemAdminPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        manageNetworkPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        DonorWorkArea = new javax.swing.JLabel();
        lblViewYourStatus = new javax.swing.JPanel();
        lblViewStatus = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        rightSystemAdminPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(215, 81, 81));
        setPreferredSize(new java.awt.Dimension(1338, 840));
        setLayout(new java.awt.BorderLayout());

        systemAdminPanel.setBackground(new java.awt.Color(255, 204, 153));
        systemAdminPanel.setPreferredSize(new java.awt.Dimension(1338, 840));

        jPanel3.setBackground(new java.awt.Color(255, 204, 153));
        jPanel3.setMinimumSize(new java.awt.Dimension(280, 148));
        jPanel3.setPreferredSize(new java.awt.Dimension(280, 148));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageNetworkPanel.setBackground(new java.awt.Color(255, 204, 153));
        manageNetworkPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageNetworkPanelMousePressed(evt);
            }
        });
        manageNetworkPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manageIcon.png"))); // NOI18N
        manageNetworkPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 37, 36));

        DonorWorkArea.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        DonorWorkArea.setText("Sponsor Work Area");
        DonorWorkArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DonorWorkAreaMousePressed(evt);
            }
        });
        manageNetworkPanel.add(DonorWorkArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 6, 225, 36));

        jPanel3.add(manageNetworkPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 280, -1));

        lblViewYourStatus.setBackground(new java.awt.Color(255, 204, 153));
        lblViewYourStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblViewYourStatusMousePressed(evt);
            }
        });
        lblViewYourStatus.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblViewStatus.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblViewStatus.setText("Payment Status");
        lblViewStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblViewStatusMousePressed(evt);
            }
        });
        lblViewYourStatus.add(lblViewStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 230, 40));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/statusIcon.png"))); // NOI18N
        lblViewYourStatus.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        jPanel3.add(lblViewYourStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 280, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/donateLogo.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 190, 200));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Hello");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 50, 20));

        valueLabel.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jPanel3.add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 100, 20));

        rightSystemAdminPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightSystemAdminPanel.setPreferredSize(new java.awt.Dimension(1058, 840));
        rightSystemAdminPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout systemAdminPanelLayout = new javax.swing.GroupLayout(systemAdminPanel);
        systemAdminPanel.setLayout(systemAdminPanelLayout);
        systemAdminPanelLayout.setHorizontalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemAdminPanelLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        systemAdminPanelLayout.setVerticalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(systemAdminPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void DonorWorkAreaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DonorWorkAreaMousePressed
        manageDonorWorkAreaJPanel();
    }//GEN-LAST:event_DonorWorkAreaMousePressed

    private void manageNetworkPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageNetworkPanelMousePressed
        // TODO add your handling code here:
        manageDonorWorkAreaJPanel();
    }//GEN-LAST:event_manageNetworkPanelMousePressed

    private void lblViewStatusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewStatusMousePressed
        // TODO add your handling code here:
        TrackStatus();
    }//GEN-LAST:event_lblViewStatusMousePressed

    private void lblViewYourStatusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewYourStatusMousePressed
        // TODO add your handling code here:
        TrackStatus();
    }//GEN-LAST:event_lblViewYourStatusMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DonorWorkArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblViewStatus;
    private javax.swing.JPanel lblViewYourStatus;
    private javax.swing.JPanel manageNetworkPanel;
    private javax.swing.JPanel rightSystemAdminPanel;
    private javax.swing.JPanel systemAdminPanel;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
