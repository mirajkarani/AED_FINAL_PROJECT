/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.RayOfHope.PersonRegistrationRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organizations.Organization;
import Business.Organizations.PersonRegistrationOrganization;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author mandardeshmukh
 */
public class PersonRegistrationMainWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form PersonRegistrationMainWorkArea
     */
     JPanel userProcessContainer;
    UserAccount account;
    PersonRegistrationOrganization personRegistrationOrganization;
    Enterprise enterprise;
    Person person;
    PersonDirectory persondirectory;
    EcoSystem business;
    Network network;
    public PersonRegistrationMainWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, PersonDirectory persondirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.personRegistrationOrganization = (PersonRegistrationOrganization) organization;
        this.business = business;
        this.persondirectory = persondirectory;
        this.enterprise = enterprise;
        valueLabel.setText(organization.getName());
        personRegistrationArea();
    }
    
    private void personRegistrationArea() {
        NewPersonRegistrationJPanel panel = new NewPersonRegistrationJPanel(rightSystemAdminPanel, persondirectory, account, enterprise, business, personRegistrationOrganization);
        rightSystemAdminPanel.add("ManageNetworkJPanel", panel);
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
        LabNetworkPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        childRegistration = new javax.swing.JLabel();
        lblViewChild = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        view = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        rightSystemAdminPanel = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        systemAdminPanel.setBackground(new java.awt.Color(255, 204, 153));
        systemAdminPanel.setPreferredSize(new java.awt.Dimension(1338, 840));

        jPanel3.setBackground(new java.awt.Color(255, 204, 153));
        jPanel3.setMinimumSize(new java.awt.Dimension(280, 148));
        jPanel3.setPreferredSize(new java.awt.Dimension(280, 148));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabNetworkPanel.setBackground(new java.awt.Color(255, 204, 153));
        LabNetworkPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LabNetworkPanelMousePressed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        childRegistration.setBackground(new java.awt.Color(255, 204, 204));
        childRegistration.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        childRegistration.setText("Person Registration Area");
        childRegistration.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                childRegistrationMousePressed(evt);
            }
        });

        javax.swing.GroupLayout LabNetworkPanelLayout = new javax.swing.GroupLayout(LabNetworkPanel);
        LabNetworkPanel.setLayout(LabNetworkPanelLayout);
        LabNetworkPanelLayout.setHorizontalGroup(
            LabNetworkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LabNetworkPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(childRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        LabNetworkPanelLayout.setVerticalGroup(
            LabNetworkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LabNetworkPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LabNetworkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(childRegistration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.add(LabNetworkPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 280, -1));

        lblViewChild.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblViewChild.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblViewChild.setText("View Person Records");
        lblViewChild.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblViewChildMousePressed(evt);
            }
        });
        jPanel3.add(lblViewChild, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 230, 40));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 180, 180));
        jPanel3.add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 280, 40));
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 50, 40));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Organization");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, 110, 20));

        valueLabel.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jPanel3.add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 110, 20));

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
            .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        add(systemAdminPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void childRegistrationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_childRegistrationMousePressed
        personRegistrationArea();
    }//GEN-LAST:event_childRegistrationMousePressed

    private void LabNetworkPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabNetworkPanelMousePressed
        // TODO add your handling code here:
        personRegistrationArea();
    }//GEN-LAST:event_LabNetworkPanelMousePressed

    private void lblViewChildMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewChildMousePressed
        // TODO add your handling code here:
        ViewPersonTable panel = new ViewPersonTable(rightSystemAdminPanel, account, personRegistrationOrganization, enterprise, business, persondirectory);
        rightSystemAdminPanel.add("ManageNetworkJPanel", panel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }//GEN-LAST:event_lblViewChildMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LabNetworkPanel;
    private javax.swing.JLabel childRegistration;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblViewChild;
    private javax.swing.JPanel rightSystemAdminPanel;
    private javax.swing.JPanel systemAdminPanel;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JLabel view;
    // End of variables declaration//GEN-END:variables
}
