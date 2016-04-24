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
public class Transaction implements Serializable {
    
    private String type;
    private String date;
    private String rev_dep;
    private double amount;
    


    public Transaction (String type, String date, String rev_dep, double amount) {
        this.type = type;
        this.date = date;
        this.rev_dep = rev_dep;
        this.amount = amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setRev_dep(String rev_dep) {
        this.rev_dep = rev_dep;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    public String getRev_dep() {
        return rev_dep;
    }

    public String getType() {
        return type;
    }

  

   
    
   

    @Override
    public String toString() {
        return "Transaction{" + "type=" + type + ", date=" + date + ", rev_dep=" + rev_dep + ", amount=" + amount+ '}';
    }
    
    
    
    
    
}
