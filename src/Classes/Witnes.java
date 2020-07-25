package Classes;

public class Witnes extends Person 
{
    int case_id;
    public Witnes(int id,String name,String gender,String birth_date,String address,String phone,int case_id)
    {
        super(id,name,gender,birth_date,address,phone);
        this.case_id=case_id;
    }

    public int getCase_id() {
        return case_id;
    }
}
