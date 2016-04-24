/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

    
/**
 *
 * @author hp
 */
public final class PatientsList implements Serializable {
    
    private List <Patient> patients;
    
    private ObjectOutputStream output;
    
    private ObjectInputStream input;

    public PatientsList() {
        patients = new LinkedList <Patient> (); 
        patientsReadFile();
    }
    
    public boolean addPatient(Patient t) {
        Iterator<Patient> it = getPatients().iterator();
        
        while (it.hasNext()) {
            if (it.next().getName().equals(t.getName()))
                return false;
        }
       this.getPatients().add(t);
       this.patientsCreateFile();
        return true;        
    }
    
    public boolean deletePatient(Patient t) {
        Iterator<Patient> it = getPatients().iterator();
        
        while (it.hasNext()) {
            if (it.next().equals(t)) {
                it.remove();
                this.patientsCreateFile();
                return true;
            }
        }
        return false;        
    }
    
    public void viewPatients() {
        Iterator<Patient> it = getPatients().iterator();
        
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
    
    public void patientsCreateFile(){    
    
        
      
        try {
            FileOutputStream Fpout = new FileOutputStream("Patients.txt");
            ObjectOutputStream fpout2 = new ObjectOutputStream(Fpout);
            fpout2.writeObject(this.getPatients());
            fpout2.close();
            Fpout.close();
           
        }
        catch(FileNotFoundException o) {
            o.printStackTrace();
        }
        catch(IOException o) {
            o.printStackTrace();
        }
        /*
        try {
            this.output = new ObjectOutputStream(new FileOutputStream("//Patients.ser"));
        }
        catch(IOException ioException) {
            System.err.println("Error opening file aaaaaahhhhh");
        }
        
        Iterator it = this.getPatients().iterator();
        
        while (it.hasNext()) {
            try {
                output.writeObject(it.next());
            } catch (IOException ex) {
                System.err.println("Error writing to file");
            }
        }
        
        try {
            if (output != null)
                output.close();
        }
        catch (IOException ioException) {
            System.err.println("Error closing file.");
            System.exit(1);
        }    */
    }  
    
    
    
    
    public void patientsReadFile(){    
    try {
            FileInputStream Fpin = new FileInputStream("Patients.txt");
            ObjectInputStream fpin2 = new ObjectInputStream(Fpin);
            this.setPatients((LinkedList)fpin2.readObject());
            fpin2.close();
        }
        catch (ClassNotFoundException o) {
            o.printStackTrace();
        }
        catch(FileNotFoundException o) {
            o.printStackTrace();
        }
        catch (IOException o) {
            o.printStackTrace();
        }
    }

    public ObjectInputStream getInput() {
        return input;
    }

    public ObjectOutputStream getOutput() {
        return output;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setInput(ObjectInputStream input) {
        this.input = input;
    }

    public void setOutput(ObjectOutputStream output) {
        this.output = output;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

   

        
}

