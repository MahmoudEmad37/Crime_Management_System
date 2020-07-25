package Classes;

public class Person 
{
    private int ID;
    private String Name;
    private String Gender;
    private String Birth_Date;
    private String Address;
    private String Phone;

    public Person(int ID, String Name, String Gender, String Birth_Date, String Address, String Phone) 
    {
        this.ID = ID;
        this.Name = Name;
        this.Gender = Gender;
        this.Birth_Date = Birth_Date;
        this.Address = Address;
        this.Phone = Phone;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }
    
    public void setName(String Name) {
        this.Name = Name;
    }
    
    
    
    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getGender() {
        return Gender;
    }

    public String getBirth_Date() {
        return Birth_Date;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhone() {
        return Phone;
    }
    
}
