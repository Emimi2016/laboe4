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
public final class TransactionsList implements Serializable {
    
    private List <Transaction> transactions;
    private ObjectOutputStream output;
    private ObjectInputStream input;

    public TransactionsList() {
        transactions = new LinkedList <Transaction> (); 
        transactionsReadFile();
    }
    
    public boolean addTransaction(Transaction t) {
        Iterator<Transaction> it = getTransactions().iterator();
        
        /* while (it.hasNext()) {
            if (it.next().getType().equals(t.getType()))
                return false;
        } */
       this.getTransactions().add(t);
       this.transactionsCreateFile();
        return true;        
    }
    
    public boolean deleteTransaction(Transaction t) {
        Iterator<Transaction> it = getTransactions().iterator();
        
        while (it.hasNext()) {
            if (it.next().equals(t)) {
                it.remove();
                this.transactionsCreateFile();
                return true;
            }
        }
        return false;        
    }
    
    public void viewTransactions() {
        Iterator<Transaction> it = getTransactions().iterator();
        
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
    
    public void transactionsCreateFile(){    
    
        
      
        try {
            FileOutputStream Ftpout = new FileOutputStream("Transactions.ser");
            ObjectOutputStream ftpout2 = new ObjectOutputStream(Ftpout);
            ftpout2.writeObject(this.getTransactions());
            ftpout2.close();
            Ftpout.close();
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
    
    
    
    
    public void transactionsReadFile(){    
    try {
            FileInputStream Ftpin = new FileInputStream("Transactions.ser");
            ObjectInputStream ftpin2 = new ObjectInputStream(Ftpin);
            this.setTransactions((LinkedList)ftpin2.readObject());
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

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setInput(ObjectInputStream input) {
        this.input = input;
    }

    public void setOutput(ObjectOutputStream output) {
        this.output = output;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

   

        
}

