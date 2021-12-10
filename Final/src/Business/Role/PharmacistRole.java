/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author mandardeshmukh
 */
public class PharmacistRole extends Role {
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, PersonDirectory Persondirectory, AdopterDirectory adopterdirectory,DonorDirectory donorDirectory) {
       return new PharmacyWorkArea(userProcessContainer, account, (PharmacistOrganization)organization,enterprise, business,Persondirectory);
    }
    
    @Override
    public String toString(){
        return (Role.RoleType.Pharmacist.getValue());
    }
}
