/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.RayOfHope.PersonCare;

import Business.Adopter.Adopter;
import Business.Adopter.AdopterDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organizations.Organization;
import Business.Organizations.PersonCareOrganization;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import Business.Person.PersonDirectory;
import userinterface.RayOfHope.PersonCare.ViewAdoptionRequest;

/**
 *
 * @author aniketmirajkar
 */
public class PersonCareWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form PersonCareWorkArea
     */
    
    JPanel userProcessContainer;
    Enterprise enterprise;
    Organization organization;
    UserAccount account;
    PersonCareOrganization personCareOrganization;
    PersonDirectory personDirectory;
    Person person;
    EcoSystem business;
    AdopterDirectory adopterDirectory;
    Adopter adopter;
    Role role;
    Network network;
    
    public PersonCareWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, PersonDirectory personDirectory, AdopterDirectory adopterDirectory) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.business = business;
        this.personCareOrganization = (PersonCareOrganization) organization;
        this.personDirectory = personDirectory;
        this.adopterDirectory = adopterDirectory;
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
        LeftPanel = new javax.swing.JPanel();
        ChildWorkArea = new javax.swing.JPanel();
        lblCCIcon = new javax.swing.JLabel();
        CC = new javax.swing.JLabel();
        lblViewChild = new javax.swing.JPanel();
        lblIcon = new javax.swing.JLabel();
        ViewChild = new javax.swing.JLabel();
        lblPic = new javax.swing.JLabel();
        lblOrg = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        AdoptionPanel = new javax.swing.JPanel();
        lblicon = new javax.swing.JLabel();
        lblViewAdoption = new javax.swing.JLabel();
        rightSystemAdminPanel = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        systemAdminPanel.setBackground(new java.awt.Color(255, 204, 153));
        systemAdminPanel.setPreferredSize(new java.awt.Dimension(1338, 840));

        LeftPanel.setBackground(new java.awt.Color(255, 204, 153));
        LeftPanel.setMinimumSize(new java.awt.Dimension(280, 148));
        LeftPanel.setPreferredSize(new java.awt.Dimension(280, 148));
        LeftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ChildWorkArea.setBackground(new java.awt.Color(255, 204, 153));
        ChildWorkArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ChildWorkAreaMousePressed(evt);
            }
        });
        ChildWorkArea.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCCIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCCIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manageIcon.png"))); // NOI18N
        ChildWorkArea.add(lblCCIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 37, -1));

        CC.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        CC.setText("Person Care Area");
        CC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CCMousePressed(evt);
            }
        });
        ChildWorkArea.add(CC, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 220, 40));

        LeftPanel.add(ChildWorkArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 280, -1));

        lblViewChild.setBackground(new java.awt.Color(255, 204, 153));
        lblViewChild.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblViewChildMousePressed(evt);
            }
        });
        lblViewChild.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/statusIcon.png"))); // NOI18N
        lblViewChild.add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 40, 40));

        ViewChild.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        ViewChild.setText("View Person Details");
        ViewChild.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ViewChildMousePressed(evt);
            }
        });
        lblViewChild.add(ViewChild, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 0, 231, 38));

        LeftPanel.add(lblViewChild, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 280, -1));

        lblPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/childCare.png"))); // NOI18N
        LeftPanel.add(lblPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 180, 170));

        lblOrg.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        lblOrg.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOrg.setText("Organization");
        LeftPanel.add(lblOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 100, 20));

        valueLabel.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        LeftPanel.add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 110, 20));

        AdoptionPanel.setBackground(new java.awt.Color(255, 204, 153));
        AdoptionPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AdoptionPanelMousePressed(evt);
            }
        });

        lblicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/orgIcon.png"))); // NOI18N

        lblViewAdoption.setBackground(new java.awt.Color(255, 204, 153));
        lblViewAdoption.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblViewAdoption.setText("View Adoption Request");
        lblViewAdoption.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblViewAdoptionMousePressed(evt);
            }
        });

        javax.swing.GroupLayout AdoptionPanelLayout = new javax.swing.GroupLayout(AdoptionPanel);
        AdoptionPanel.setLayout(AdoptionPanelLayout);
        AdoptionPanelLayout.setHorizontalGroup(
            AdoptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdoptionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblicon, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblViewAdoption, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
        );
        AdoptionPanelLayout.setVerticalGroup(
            AdoptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdoptionPanelLayout.createSequentialGroup()
                .addComponent(lblViewAdoption, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdoptionPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblicon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        LeftPanel.add(AdoptionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 280, 40));

        rightSystemAdminPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightSystemAdminPanel.setPreferredSize(new java.awt.Dimension(1058, 840));
        rightSystemAdminPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout systemAdminPanelLayout = new javax.swing.GroupLayout(systemAdminPanel);
        systemAdminPanel.setLayout(systemAdminPanelLayout);
        systemAdminPanelLayout.setHorizontalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemAdminPanelLayout.createSequentialGroup()
                .addComponent(LeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        systemAdminPanelLayout.setVerticalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );

        add(systemAdminPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void CCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CCMousePressed
        managePersonAreaJPanel();
    }//GEN-LAST:event_CCMousePressed

    private void ChildWorkAreaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChildWorkAreaMousePressed
        // TODO add your handling code here:
        managePersonAreaJPanel();
    }//GEN-LAST:event_ChildWorkAreaMousePressed

    private void ViewChildMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewChildMousePressed
        // TODO add your handling code here:
        ViewPerson();
    }//GEN-LAST:event_ViewChildMousePressed

    private void lblViewChildMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewChildMousePressed
        // TODO add your handling code here:
        ViewPerson();
    }//GEN-LAST:event_lblViewChildMousePressed

    private void lblViewAdoptionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewAdoptionMousePressed
        // TODO add your handling code here:
        ViewAdopterRequest();
    }//GEN-LAST:event_lblViewAdoptionMousePressed

    private void AdoptionPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdoptionPanelMousePressed
        // TODO add your handling code here:
        ViewAdopterRequest();
    }//GEN-LAST:event_AdoptionPanelMousePressed

    private void managePersonAreaJPanel() {
        AcquirePerson panel = new AcquirePerson(rightSystemAdminPanel, account, personCareOrganization, enterprise, business, personDirectory, adopterDirectory);
        rightSystemAdminPanel.add("ManageNetworkJPanel", panel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }

    private void ViewPerson() {
        ViewPersonDetails panel = new ViewPersonDetails(rightSystemAdminPanel, account, personCareOrganization, enterprise, business, personDirectory, adopterDirectory);
        rightSystemAdminPanel.add("ManageNetworkJPanel", panel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }

    private void ViewAdopterRequest() {
        ViewAdoptionRequest panel = new ViewAdoptionRequest(rightSystemAdminPanel, account, personCareOrganization, enterprise, business, personDirectory, adopterDirectory);
        rightSystemAdminPanel.add("ManageNetworkJPanel", panel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdoptionPanel;
    private javax.swing.JLabel CC;
    private javax.swing.JPanel ChildWorkArea;
    private javax.swing.JPanel LeftPanel;
    private javax.swing.JLabel ViewChild;
    private javax.swing.JLabel lblCCIcon;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblOrg;
    private javax.swing.JLabel lblPic;
    private javax.swing.JLabel lblViewAdoption;
    private javax.swing.JPanel lblViewChild;
    private javax.swing.JLabel lblicon;
    private javax.swing.JPanel rightSystemAdminPanel;
    private javax.swing.JPanel systemAdminPanel;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
