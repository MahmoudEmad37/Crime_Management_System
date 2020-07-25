package Classes;

import java.util.ArrayList;

public class Cases {

    private int Case_ID;
    private String Date_Occurance;
    private String Status;
    private String Type;
    private String Location;
    private String Start_date;
    private String Last_update_date;
    private String Description;
    private int Department_id;
    private ArrayList<Integer> Criminal_List;
    private ArrayList<Integer> officer_list;
    private boolean assigned;

    public Cases(int Case_ID, String Date_Occurance, String Status, String Type, String Location, String Start_date, String Last_update_date, String Description, int Department_id, ArrayList<Integer> Criminal_List, ArrayList<Integer> officer_list, boolean assigned) 
    {
        this.Case_ID = Case_ID;
        this.Date_Occurance = Date_Occurance;
        this.Status = Status;
        this.Type = Type;
        this.Location = Location;
        this.Start_date = Start_date;
        this.Last_update_date = Last_update_date;
        this.Description = Description;
        this.Department_id = Department_id;
        this.Criminal_List = Criminal_List;
        this.officer_list = officer_list;
        this.assigned = assigned;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    public void setStart_date(String Start_date) {
        this.Start_date = Start_date;
    }
    
    public int getCase_ID() {
        return Case_ID;
    }

    public String getDate_Occurance() {
        return Date_Occurance;
    }

    public String getStatus() {
        return Status;
    }

    public String getType() {
        return Type;
    }

    public String getLocation() {
        return Location;
    }

    public String getStart_date() {
        return Start_date;
    }

    public String getLast_update_date() {
        return Last_update_date;
    }

    public String getDescription() {
        return Description;
    }

    public int getDepartment_id() {
        return Department_id;
    }

    public ArrayList<Integer> getCriminal_List() {
        return Criminal_List;
    }

    public ArrayList<Integer> getOfficer_list() {
        return officer_list;
    }
    
    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public void setCriminal_List(int criminal_id) {
        Criminal_List.add(criminal_id);
    }

    public void setLast_update_date(String Last_update_date) {
        this.Last_update_date = Last_update_date;
    }    
}
