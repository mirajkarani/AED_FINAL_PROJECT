/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Adopter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author milin
 */
public class AdopterDirectory {
    List<Adopter> adoptersList;
    private static AdopterDirectory adopterdirectory;
    
    public static AdopterDirectory getInstance(){
       
        if(adopterdirectory==null){
            adopterdirectory=new AdopterDirectory();
        }
        
}
