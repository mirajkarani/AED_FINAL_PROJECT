/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Person;

import java.util.Date;

/**
 *
 * @author mandardeshmukh
 */
public class Person {
    
    int PersonId;
    String name;
    int PersonAge;
    String status;
    String imgDetails;
    String identificationMark;
    String gender;
    private static int count = 1;
    
    public String getName() {
        return name;
    }
    
     public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }
    
     public void setGender(String gender) {
        this.gender = gender;
    }
    
     public String getIdentificationMark() {
        return identificationMark;
    }
    
     public void setIdentificationMark(String identificationMark) {
        this.identificationMark = identificationMark;
    }
     
     public int getPersonAge() {
        return PersonAge;
    }

    public void setPersonAge(int childAge) {
        this.PersonAge = childAge;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
     public String getImageDetails() {
        return imgDetails;
    }

    public void setImageDetails(String imageDetails) {
        this.imgDetails = imageDetails;
    }
}
