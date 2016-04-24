
import java.util.Date;
import java.io.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author hp
 */
public class Prescription implements Serializable{
    
   private String name;
   private String date;
   private String diagnostique;
   private String examen;
   private String description;

    public Prescription(String name, String date, String diagnostique, String examen, String description) {
        this.name = name;
        this.date = date;
        this.diagnostique = diagnostique;
        this.examen = examen;
        this.description = description;
    }
        public Prescription(String name,String diagnostique, String examen, String description) {
        this.name = name;
        this.diagnostique = diagnostique;
        this.examen = examen;
        this.description = description;
    }




    public void setDate(String date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDiagnostique(String diagnostique) {
        this.diagnostique = diagnostique;
    }

    public void setExamen(String examen) {
        this.examen = examen;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getDiagnostique() {
        return diagnostique;
    }

    public String getExamen() {
        return examen;
    }

    public String getName() {
        return name;
    }
   
   
    
}
