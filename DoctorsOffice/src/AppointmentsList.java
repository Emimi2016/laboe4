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
public final class AppointmentsList implements Serializable {
    
    private List <Appointments> appointments;
    private ObjectOutputStream output;
    private ObjectInputStream input;

    public AppointmentsList() {
        appointments = new LinkedList <Appointments> (); 
        appointmentsReadFile();
    }
    
    public boolean addAppointments(Appointments t) {
        Iterator<Appointments> it = getAppointments().iterator();
        
        while (it.hasNext()) {
            if (it.next().getName().equals(t.getName()))
                return false;
        }
       this.getAppointments().add(t);
       this.appointmentsCreateFile();
        return true;        
    }
    
    public boolean deleteAppointments(Appointments t) {
        Iterator<Appointments> it = getAppointments().iterator();
        
        while (it.hasNext()) {
            if (it.next().equals(t)) {
                it.remove();
                this.appointmentsCreateFile();
                return true;
            }
        }
        return false;        
    }
    
    public void viewAppointments() {
        Iterator<Appointments> it = getAppointments().iterator();
        
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
    
    public void appointmentsCreateFile(){    
    
        
      
         try {
            FileOutputStream Feout = new FileOutputStream("App.ser");
            ObjectOutputStream feout2 = new ObjectOutputStream(Feout);
            feout2.writeObject(this.getAppointments());
            feout2.close();
            Feout.close();
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
    
    
    
    
    public void appointmentsReadFile(){    
            try {
            FileInputStream Fein = new FileInputStream("App.ser");
            ObjectInputStream fein2 = new ObjectInputStream(Fein);
            this.setAppointments((LinkedList)fein2.readObject());
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

    public List<Appointments> getAppointments() {
        return appointments;
    }

    public void setInput(ObjectInputStream input) {
        this.input = input;
    }

    public void setOutput(ObjectOutputStream output) {
        this.output = output;
    }

    public void setAppointments(List<Appointments> appointments) {
        this.appointments = appointments;
    }

   

        
}

