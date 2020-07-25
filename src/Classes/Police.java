package Classes;

import java.util.ArrayList;

public abstract class Police  extends Person
{
    private double Salary;
    private double Bouns;
    private String Password;
    private String Rank;
    private String status;
    public Police(int id,String name,String gender,String birth_date,String address,String phone,double salary,String password,String Rank, String status)
    {
        super(id,name,gender,birth_date,address,phone);
        this.Salary=salary;
        this.Password=password;
        this.Rank=Rank;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    abstract void display_cases(ArrayList<Cases> Cases_List);

    public String getRank() {
        return Rank;
    }

    public void setRank(String Rank) {
        this.Rank = Rank;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }
    
    public double getSalary() {
        return Salary;
    }

    public String getPassword() {
        return Password;
    }

    void cacl_salary(int eval)
    {
        this.Bouns = eval/3;
        this.Salary *= this.Bouns;
    }
    
}
