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
public class FinanceRole extends Role {
    
      @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, PersonDirectory Persondirectory, AdopterDirectory adopterdirectory,DonorDirectory donorDirectory) {
        return new FinanceWorkArea(userProcessContainer,account, organization, enterprise,  business,  adopterdirectory);
    }
    
    @Override
    public String toString(){
        return (RoleType.FinanceCheck.getValue());
    }
    
}
