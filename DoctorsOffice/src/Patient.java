
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author hp
 */
public class Patient implements Serializable {
    
    private String name;
    private String birth_date;
    private String cin;
    private String adress;
    private String phone_number;
    private String medical_description;
    private List <Prescription> prescriptions;

    public Patient(String name, String birth_date, String cin, String adress, String phone_number, String medical_description) {
        this.name = name;
        this.birth_date = birth_date;
        this.cin = cin;
        this.adress = adress;
        this.phone_number = phone_number;
        this.medical_description = medical_description;
        prescriptions = new LinkedList <Prescription>();
    }

  

   
    
    public List <Prescription> getPriscriptions(){
        return prescriptions;
    }

    public void setPrescriptions(List<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }
    
    

    public String getAdress() {
        return adress;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public String getCin() {
        return cin;
    }

 



    public String getMedical_description() {
        return medical_description;
    }

    public String getPhone_number() {
        return phone_number;
    }

    
    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }


   
    public void setMedical_description(String medical_description) {
        this.medical_description = medical_description;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getName() {
        return name;
    }

    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Patient{" + "name=" + name + ", birth_date=" + birth_date + ", cin=" + cin + ", adress=" + adress + ", phone_number=" + phone_number + ", medical_description=" + medical_description + ", prescriptions=" + prescriptions + '}';
    }
    
    
    
    
    
}
