package Classes;

import CaptainPackage.AssignCase;
import CaptainPackage.DisplayCase;
import CaptainPackage.DisplayOfficer;
import CaptainPackage.capJFrame;
import static CaptainPackage.capJFrame.HomePanel;
import static CaptainPackage.capJFrame.scroll;
import static LoginPackage.LoginForm.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
    *Captain responsible for assigning case , can display cases in his/her department and can display officers and send complain to the chief
*/
public class Captain extends Police 
{
    private int Evaluation;
    private int Department_ID;
    private double Bonus;

    public Captain(int id,String name,String password,String gender,String birth_date,String address,String phone,double salary,int Evaluation,double Bouns,String status,int Department_ID,String Rank)
    {
        super(id,name,gender,birth_date,address,phone,salary,password,Rank, status);
        this.Bonus = Bonus;
        this.Department_ID=Department_ID;
        this.Evaluation=Evaluation;
    }
    
    /**
        * @return Evaluation points when he/she was an officer
    */
    public int getEvaluation() {
        return Evaluation;
    }

    /**
        * @return Department of the captain
    */
    public int getDepartment_ID() {
        return Department_ID;
    }
    /**
        * @return Bonus Calculations when he/she was an officer
    */
    
    public double getBonus() {
        return Bonus;
    }

    /**
        * @param Bonus when he/she was an officer
    */
    public void setBonus(double Bonus) {
        this.Bonus = Bonus;
    }
    
    
    
    /**
        * @param CasesList - displays data of cases in his/her department
    */
    @Override
    public void display_cases(ArrayList<Cases> Cases_List)
    {
        BorderLayout b = new BorderLayout();
        JPanel BG = new JPanel();
        BG.setBackground(java.awt.Color.white);
        BG.setLayout(new FlowLayout(FlowLayout.LEFT));
        capJFrame.scroll = new JScrollPane(BG,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        HomePanel.setLayout(b);
        HomePanel.add(scroll);
        BG.setVisible(true);
        
        for (int i = 0; i < CasesList.size(); i++)
        {
            if(NowCap.getDepartment_ID()==CasesList.get(i).getDepartment_id()&& CasesList.get(i).isAssigned() == true)
            {
                DisplayCase dis = new DisplayCase();
                dis.caseID.setText("ID : "+CasesList.get(i).getCase_ID());
                dis.caseOcc.setText("Occurence Date : "+CasesList.get(i).getDate_Occurance());
                dis.caseStatus.setText("Status : "+CasesList.get(i).getStatus());
                dis.caseCT.setText("Crime Type : "+CasesList.get(i).getType());
                dis.caseLoc.setText("Crime Location : "+CasesList.get(i).getLocation());
                dis.caseStart.setText("Start Date : "+CasesList.get(i).getStart_date());
                dis.caseLastUp.setText("Last Update : "+CasesList.get(i).getLast_update_date());
                for(int j=0;j<DepartmentList.size();j++)
                {
                    if(CasesList.get(i).getDepartment_id()==DepartmentList.get(j).getID())
                    {
                        dis.caseDepName.setText("Department Name : "+DepartmentList.get(j).getName());
                        break;
                    }
                }
                
            BG.add(dis);
            dis.setVisible(true);
            }
        }
    }

    
    /**
        * @param OfficersList - Displays officers in the same department as the captain
    */
    public void display_officer(ArrayList<Officers> Officers_List)
    {
        BorderLayout b = new BorderLayout();
        JPanel BG = new JPanel();
        BG.setBackground(java.awt.Color.white);
        BG.setLayout(new FlowLayout(FlowLayout.LEFT));
        capJFrame.scroll = new JScrollPane(BG,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        HomePanel.setLayout(b);
        HomePanel.add(scroll);
        BG.setVisible(true);
        
        
        int Dep = -1;
        for (int j = 0; j < CaptainList.size(); j++)
        {
            if (CaptainList.get(j).getID()  == NowCap.getID())
            {
                Dep = CaptainList.get(j).getDepartment_ID();
            }
        }
        
        for(int i=0; i<OfficersList.size();i++)
        {
            if(OfficersList.get(i).getDepartment_ID() == Dep)
            {
                DisplayOfficer off = new DisplayOfficer();
                off.offID.setText(String.valueOf(OfficersList.get(i).getID()));
                off.offName.setText("Name : "+OfficersList.get(i).getName());
                off.offGen.setText("Gender : "+OfficersList.get(i).getGender());    
                off.offBD.setText("Birth Date : "+OfficersList.get(i).getBirth_Date());
                off.offRate.setText("Rate : "+String.valueOf(OfficersList.get(i).getEvaluation()));
                off.offStatus.setText("Status : " + OfficersList.get(i).getStatus());
                BG.add(off);
                off.setVisible(true);
            }
        }
    }
    
    /**
        * @param CasesList - help in displaying cases in the department that aren't assigned yet to officers
    */
    public void display_assign_cases(ArrayList<Cases> Cases_List)
    {
        BorderLayout b = new BorderLayout();
        JPanel BG = new JPanel();
        BG.setBackground(java.awt.Color.white);
        BG.setLayout(new FlowLayout(FlowLayout.LEFT));
        scroll = new JScrollPane(BG,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        HomePanel.setLayout(b);
        HomePanel.add(scroll);
        BG.setVisible(true);
        
        int Dep = -1;
        for (int j = 0; j < CaptainList.size(); j++)
        {
            if (CaptainList.get(j).getID() == NowCap.getID())
            {
                Dep = CaptainList.get(j).getDepartment_ID();
            }
        }
        for (int i = 0; i < CasesList.size(); i++)
         {
            if(CasesList.get(i).getDepartment_id() == Dep && CasesList.get(i).isAssigned() == false)
            {
                AssignCase assCase = new AssignCase();
                assCase.caseIDtxt.setText(String.valueOf(CasesList.get(i).getCase_ID()));
                assCase.caseOcctxt.setText(CasesList.get(i).getDate_Occurance());
                assCase.caseDesctxt.setText(CasesList.get(i).getDescription());
                assCase.caseCTtxt.setText(CasesList.get(i).getType());
                
                for(int j=0; j<OfficersList.size();j++)
                {
                    int DepID = OfficersList.get(j).getDepartment_ID();
                    assCase.depID = DepID;
                    if(Dep == DepID)
                    {
                        assCase.Off1CB.addItem(OfficersList.get(j).getID());
                    }
                }
                        BG.add(assCase);
                        assCase.setVisible(true);
             }
         }
    }
    
    /**
     * Process of assigning case to the officers
        * @param caseID - id of case that is needed to be assigned
        * @param offID1 - id of officer 1 that will be assigned to the case
        * @param offID2 - id of officer 2 that will be assigned to the case
    */
    public void assign_case(int caseID, int off1ID, int off2ID)
    {
        Date thisdate = new Date();
        SimpleDateFormat dateform = new SimpleDateFormat("dd/MM/Y");
        String Start_Date = dateform.format(thisdate);
        
        try
        {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crime_management_system", "root", "141198");
        Statement mystat=con.createStatement();
        String sql= "INSERT INTO `crime_management_system`.`case_officer_table` (`case_id`, `officer_id`)"
                    + "VALUES ("+ "\"" + caseID + "\"" +" , "+ "\"" + off1ID + "\"" +");";
        mystat.executeUpdate(sql);
        sql="INSERT INTO `crime_management_system`.`case_officer_table` (`case_id`, `officer_id`)"
                    + "VALUES ("+ "\"" + caseID + "\"" +" , "+ "\"" + off2ID + "\"" +");";
        mystat.executeUpdate(sql);
        
        String Anothersql = "update `crime_management_system`.`case_table` set `isAssigned` = "+true+" where `case_id` = "+ "\"" + caseID + "\"" +";";
             mystat.executeUpdate(Anothersql);
        
        Anothersql = "update `crime_management_system`.`case_table` set `start_date` = "+ "\"" + Start_Date + "\"" +" where `case_id` = "+ "\"" + caseID + "\"" +";";
             mystat.executeUpdate(Anothersql);
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
        for(int i = 0;i<OfficersList.size(); i++)
        {
            if(off1ID == OfficersList.get(i).getID())
            {
                OfficersList.get(i).setCases_List(caseID);
            }
            
        }
        
        for (int i = 0; i < CasesList.size(); i++)
        {
            if(caseID == CasesList.get(i).getCase_ID())
            {
                CasesList.get(i).setAssigned(true);
                CasesList.get(i).setStart_date(Start_Date);
            }
        }
    }

    /**
        *Send complain about an officer to the chief 
        * @param id - id of officer that will get the complain
        * @param reasonOfComplain - why did the officer send the complain
    */
    public void send_complain(int id, String reasonOfComplain)
    {
        Date thisdate = new Date();
        SimpleDateFormat dateform = new SimpleDateFormat("dd/MM/Y");
        String complain_date = dateform.format(thisdate);
        
        try                
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crime_management_system", "root", "141198");
            Statement mystat = con.createStatement();
            String sql = "INSERT INTO `crime_management_system`.`complain_table` (`complain_text`, `complain_date`, `complain_bool`, `officers_id`)"
                    + "VALUES ("+ "\"" + reasonOfComplain + "\"" +" , "+ "\"" + complain_date + "\"" +" , "+true+" , "+ "\"" + id + "\"" +");";
           
             mystat.executeUpdate(sql);

             con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e,"Erorr",JOptionPane.ERROR_MESSAGE);
        }
    }  
}
