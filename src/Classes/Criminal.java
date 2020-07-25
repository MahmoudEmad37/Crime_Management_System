package Classes;

import java.util.ArrayList;
import java.awt.image.BufferedImage; 

public class Criminal extends Person
{
    private String Location;
    private String Dangerous_Level;
    private String Status;
    private ArrayList<Integer> Cases ; 
    
    public Criminal(int id,String name,String gender,String birth_date,String address,String phone,String location,String dangerous_level,String status ,ArrayList<Integer> Cases_List)
    {
        super(id,name,gender,birth_date,address,phone);
        this.Location=location;
        this.Dangerous_Level=dangerous_level;
        this.Status=status;
        this.Cases=Cases_List;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public void setDangerous_Level(String Dangerous_Level) {
        this.Dangerous_Level = Dangerous_Level;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    
    
    public String getLocation() {
        return Location;
    }

    public String getDangerous_Level() {
        return Dangerous_Level;
    }

    public String getStatus() {
        return Status;
    }

    public ArrayList<Integer> getCases() {
        return Cases;
    }
    public void setCases(int case_id) {
        Cases.add(case_id);
    }
}
