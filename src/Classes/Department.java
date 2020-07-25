package Classes;

import java.util.ArrayList;

public class Department 
{
    private int ID ;
    private String Name;
    private int Num_of_Officies;
    private int Num_of_Cases;
    private String Date_of_Activation; 

   // hn5ali kol el ids int w nzabat kol 7ag delwa2ti tmam  dyh haga helwa bsra7a ana kont krhahom w homa string 3shan bnsaa a7weel -.-
    
    public Department(int Department_ID  , String Name ,  int Num_of_officies ,  int Num_of_cases  , String Date_of_Activation)
    {
        this.ID=Department_ID;
        this.Name=Name;
        this.Num_of_Officies=Num_of_officies;
        this.Num_of_Cases=Num_of_cases;
        this.Date_of_Activation=Date_of_Activation;
    }

    public void setNum_of_Officies(int Num_of_Officies) {
        this.Num_of_Officies = Num_of_Officies;
    }

    public void setNum_of_Cases(int Num_of_Cases) {
        this.Num_of_Cases = Num_of_Cases;
    }


    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public int getNum_of_Officies() {
        return Num_of_Officies;
    }

    public int getNum_of_Cases() {
        return Num_of_Cases;
    }

    public String getDate_of_Activation() {
        return Date_of_Activation;
    }
}
