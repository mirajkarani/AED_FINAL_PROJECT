/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.Pharmacy;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.PharmacyOrganization;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PharmacistAssistWorkRequest;
import javax.swing.JPanel;

/**
 *
 * @author aniketmirajkar
 */
public class PharmacyProcessJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PharmacyProcessJPanel
     */
    
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private EcoSystem business;
    PharmacistAssistWorkRequest request ;
    private PersonDirectory personDirectory;
    private Person person;
    Network network;
    
    public PharmacyProcessJPanel(JPanel userProcessContainer, PharmacistAssistWorkRequest request, UserAccount userAccount, Enterprise enterprise, Person person, PersonDirectory personDirectory, EcoSystem business, PharmacyOrganization pharmacyOrganization) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.person = person;
        this.personDirectory = personDirectory;
        this.business = business;
        
        for (Network n : business.getNetworkCatalog()) {
            for (Enterprise ent : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (ent.equals(enterprise)) {
                    network = n;
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
