
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
public final class EmployeesList implements Serializable{
    
    private List <Employee> employees;
    private ObjectOutputStream output;
    private ObjectInputStream input;

    public EmployeesList() {
        employees = new LinkedList <Employee> (); 
        employeesReadFile();
    }
    
    public boolean addEmployee(Employee t) {
        Iterator<Employee> it = getEmployees().iterator();
        
        while (it.hasNext()) {
            if (it.next().getFirst_name().equals(t.getFirst_name()))
                return false;
        }
        this.getEmployees().add(t);
        this.employeesCreateFile();
        return true;        
    }
    
    public boolean deleteEmployee(Employee t) {
        Iterator<Employee> it = getEmployees().iterator();
        
        while (it.hasNext()) {
            if (it.next().equals(t)) {
                it.remove();
                this.employeesCreateFile();
                return true;
            }
        }
        return false;        
    }
    
    public void viewEmployees() {
        Iterator<Employee> it = getEmployees().iterator();
        
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
    
    public void employeesCreateFile(){    
    
         try {
            FileOutputStream Feout = new FileOutputStream("Employees.ser");
            ObjectOutputStream feout2 = new ObjectOutputStream(Feout);
            feout2.writeObject(this.getEmployees());
            feout2.close();
            Feout.close();
        }
        catch(FileNotFoundException o) {
            o.printStackTrace();
        }
        catch(IOException o) {
            o.printStackTrace();
        }
        
        
        
       /* try {
            this.output = new ObjectOutputStream(new FileOutputStream("Employees.ser"));
        }
        catch(IOException ioException) {
            System.err.println("Error opening file");
        }
        
        Iterator it = this.getEmployees().iterator();
        
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
        }  */  
    }  
    
    public void employeesReadFile(){    
    
            try {
            FileInputStream Fein = new FileInputStream("Employees.ser");
            ObjectInputStream fein2 = new ObjectInputStream(Fein);
            this.setEmployees((LinkedList)fein2.readObject());
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
        
      /*  try {
            this.input = new ObjectInputStream(new FileInputStream("Employees.ser"));
        }
        catch(IOException ioException) {
            System.err.println("Error opening file");
        }
        
        Employee cl;
        try {
            this.getEmployees().clear();

            while (true) {
                cl = (Employee) input.readObject();                
                this.getEmployees().add(cl);
            }    
        } 
        catch (EOFException endOfFileException) {
            return;
        }
        catch (ClassNotFoundException classNotFoundException) {
            System.err.println("Unable to creat Object.");
        }
        catch (IOException ioException) {
            System.err.println("Error during read from file.");
        }
        
        try {
            if (input != null)
                input.close();
        }
        catch (IOException ioException) {
            System.err.println("Error closing file.");
            System.exit(1);
        }        
    } */

    public ObjectInputStream getInput() {
        return input;
    }

    public ObjectOutputStream getOutput() {
        return output;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setInput(ObjectInputStream input) {
        this.input = input;
    }

    public void setOutput(ObjectOutputStream output) {
        this.output = output;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    } 
    
}
