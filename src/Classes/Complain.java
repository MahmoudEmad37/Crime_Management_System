/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Mahmoud Emad
 */
public class Complain {
    private int complain_id;
    private String complain_text;
    private String complain_date;
    private boolean complain_bool;
    private int officer_id;
    private boolean isSeen;

    public Complain(int complain_id, String complain_text, String complain_date, boolean complain, boolean isSeen, int officer_id)
    {
        this.complain_id = complain_id;
        this.complain_text = complain_text;
        this.complain_date = complain_date;
        this.complain_bool = complain;
        this.isSeen = isSeen;
        this.officer_id = officer_id;
    }

    public int getCompliain_id() {
        return complain_id;
    }

    public boolean IsSeen() {
        return isSeen;
    }

    public void setSeen(boolean isSeen) {
        this.isSeen = isSeen;
    }

    
    public String getComplain_text() {
        return complain_text;
    }

    public String getComplain_date() {
        return complain_date;
    }

    public int getOfficer_id() {
        return officer_id;
    }

    public boolean isComplain_bool() {
        return complain_bool;
    }

    public void setComplain_bool(boolean complain_bool) {
        this.complain_bool = complain_bool;
    }
    
    
}
