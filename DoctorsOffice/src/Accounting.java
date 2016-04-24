/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author hp
 */
public class Accounting {
    
  public String name;
  public String amount;
  public String date;
  public String revenue;
  public String expense;
  public String total;

    public Accounting(String name, String amount, String date) {
        this.name = name;
        this.amount = amount;
        this.date = date;
    }

    public String getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    

   
  
  
}
