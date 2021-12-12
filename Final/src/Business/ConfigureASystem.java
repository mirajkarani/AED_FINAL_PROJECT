package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Role.MedicRole;
import Business.Role.RayOfHopeRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        Network network = system.createAndAddNetwork();
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        Employee enterprise1 = system.getEmployeeDirectory().createEmployee("Hospital");
        
        UserAccount ub = system.getUserAccountDirectory().createUserAccount("hospital", "hospital", employee, new MedicRole());
        
        Employee enterprise2 = system.getEmployeeDirectory().createEmployee("RayOfHope");
        
        UserAccount uc = system.getUserAccountDirectory().createUserAccount("rayofhope", "rayofhope", employee, new RayOfHopeRole());
        
        return system;
    }
    
}
