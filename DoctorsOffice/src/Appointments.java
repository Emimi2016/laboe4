
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
public class Appointments implements Serializable {
    
    private String name;
    private String date;
    private String heure;
    private String reason;

    public String getDate() {
        return date;
    }

    public String getHeure() {
        return heure;
    }

    public String getName() {
        return name;
    }

    public String getReason() {
        return reason;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
   
   

    public Appointments(String name, String date, String heure, String reason) {
        this.name = name;
        this.date = date;
        this.heure = heure;
        this.reason = reason;
        
    }

  

   
    
   

    

    @Override
    public String toString() {
        return "Appointment{" + "name=" + name + ", date=" + date + ", heure=" + heure + ", reason=" + reason + '}';
    }
    
    
    
    
    
}
