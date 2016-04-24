
import java.io.*;
import java.util.Iterator;
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
public final class PrescriptionsList implements Serializable{
    
    
    private List <Prescription> prescriptions;
    private ObjectOutputStream output;
    private ObjectInputStream input;

    public PrescriptionsList() {
        prescriptions = new LinkedList <Prescription> (); 
        prescriptionsReadFile();
    }
    
    public boolean addPrescription(Prescription t) {
        Iterator<Prescription> it = getPrescriptions().iterator();
        
        while (it.hasNext()) {
            if (it.next().getName().equals(t.getName()))
                return false;
        }
        this.getPrescriptions().add(t);
        this.prescriptionsCreateFile();
        return true;        
    }
    
     public boolean deletePrescription(Prescription t) {
        Iterator<Prescription> it = getPrescriptions().iterator();
        
        while (it.hasNext()) {
            if (it.next().equals(t)) {
                it.remove();
                this.prescriptionsCreateFile();
                return true;
            }
        }
        return false;        
    }
    
    public void viewPrescriptions() {
        Iterator<Prescription> it = getPrescriptions().iterator();
        
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
    

       public void prescriptionsCreateFile(){    
    
        
      
        try {
            FileOutputStream Fprout = new FileOutputStream("Prescriptions.ser");
            ObjectOutputStream fprout2 = new ObjectOutputStream(Fprout);
            fprout2.writeObject(this.getPrescriptions());
            fprout2.close();
            Fprout.close();
        }
        catch(FileNotFoundException o) {
            o.printStackTrace();
        }
        catch(IOException o) {
            o.printStackTrace();
        }
        
       }    
    
        public void prescriptionsReadFile(){    
            try {
                FileInputStream Fprin = new FileInputStream("Prescriptions.ser");
                ObjectInputStream fprin2 = new ObjectInputStream(Fprin);
                this.setPrescriptions((LinkedList)fprin2.readObject());
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

    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setInput(ObjectInputStream input) {
        this.input = input;
    }

    public void setOutput(ObjectOutputStream output) {
        this.output = output;
    }

    public void setPrescriptions(List<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }
    
}
