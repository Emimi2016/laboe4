
import java.io.Serializable;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author hp
 */
public class Employee implements Serializable {
    
    private String first_name;
    private String last_name;
    private String birth_date;
    private String cin;
    private String adress;
    private String phone_number;
    private String salary ;
    private String hiring_date;
    private String cnss_no;

    public Employee(String first_name, String last_name, String birth_date, String cin, String adress, String phone_number, String salary, String hiring_date, String cnss_no) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.birth_date = birth_date;
        this.cin = cin;
        this.adress = adress;
        this.phone_number = phone_number;
        this.salary = salary;
        this.hiring_date = hiring_date;
        this.cnss_no = cnss_no;
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

    public String getCnss_no() {
        return cnss_no;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getHiring_date() {
        return hiring_date;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getSalary() {
        return salary;
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

    public void setCnss_no(String cnss_no) {
        this.cnss_no = cnss_no;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setHiring_date(String hiring_date) {
        this.hiring_date = hiring_date;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    
    
    
}
