 package Classes;

import ChiefPackage.*;
import static ChiefPackage.CaseChief.ScroolPanelCase;
import static ChiefPackage.DepChief.ScroolPanelDep;
import static ChiefPackage.OfficerChief.ScroolPanelOff;
import static LoginPackage.LoginForm.*;
import java.awt.FlowLayout;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;

public class Cheif extends Police 
{

    public Cheif(int id,String name,String password,String gender,String birth_date,String address,String phone,double salary,String Rank, String status)
    {
        super(id,name,gender,birth_date,address,phone,salary,password,Rank, status);
    }
    
    public void add_department(Department dep)
    { 
        DepartmentList.add(dep);
        try
        {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crime_management_system", "root", "141198");
        Statement mystat=con.createStatement();
        String sql="INSERT INTO `crime_management_system`.`department_table`\n" +
                                                                                "(`department_id`,\n" +
                                                                                "`department_name`,\n" +
                                                                                "`num_of_officers`,\n" +
                                                                                "`num_of_cases`,\n" +
                                                                                "`date_of_activation`)\n" +
                                                                                "VALUES\n" +
                                                                                "("+dep.getID()+",\n" +
                                                                                "'"+dep.getName()+"',\n" +
                                                                                dep.getNum_of_Officies()+",\n" +
                                                                                +dep.getNum_of_Cases()+",\n" +
                                                                                "'"+dep.getDate_of_Activation()+"');";
        mystat.executeUpdate(sql);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    
    }
    
    public void add_captain(Captain cap)
    {
        CaptainList.add(cap);
        try 
        {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crime_management_system", "root", "141198");
        Statement mystat=con.createStatement();
        String sql="INSERT INTO `crime_management_system`.`police_table`\n" +
                                                                                "(`police_id`,\n" +
                                                                                "`police_name`,\n" +
                                                                                "`police_password`,\n" +
                                                                                "`police_gender`,\n" +
                                                                                "`police_birth_date`,\n" +
                                                                                "`police_address`,\n" +
                                                                                "`police_phone`,\n" +
                                                                                "`police_rank`,\n" +
                                                                                "`police_salary`,\n" +
                                                                                "`police_evaluation`,\n" +
                                                                                "`police_bouns`,\n" +
                                                                                "`police_status`,\n" +
                                                                                "`department_id`)\n" +
                                                                                
                                                                                "VALUES\n" +
                                                                                "("+cap.getID()+",\n" +
                                                                                "'"+cap.getName()+"',\n" +
                                                                                "'"+cap.getPassword()+"',\n" +
                                                                                "'"+cap.getGender()+"',\n" +
                                                                                "'"+cap.getBirth_Date()+"',\n" +
                                                                                "'"+cap.getAddress()+"',\n" +
                                                                                "'"+cap.getPhone()+"',\n" +
                                                                                "'"+cap.getRank()+"',\n" +
                                                                                cap.getSalary()+",\n" +
                                                                                cap.getEvaluation()+",\n" +
                                                                                cap.getBonus()+",\n" +
                                                                                "'"+cap.getStatus()+"',\n" +
                                                                                cap.getDepartment_ID()+");";
        
        mystat.executeUpdate(sql);
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public void add_officers(Officers officer)
    { 
        OfficersList.add(officer);
        try
        {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crime_management_system", "root", "141198");
        Statement mystat=con.createStatement();
        String sql="INSERT INTO `crime_management_system`.`police_table`\n" +
                                                                                "(`police_id`,\n" +
                                                                                "`police_name`,\n" +
                                                                                "`police_password`,\n" +
                                                                                "`police_gender`,\n" +
                                                                                "`police_birth_date`,\n" +
                                                                                "`police_address`,\n" +
                                                                                "`police_phone`,\n" +
                                                                                "`police_rank`,\n" +
                                                                                "`police_salary`,\n" +
                                                                                "`police_evaluation`,\n" +
                                                                                "`police_bouns`,\n" +
                                                                                "`police_status`,\n" +
                                                                                "`department_id`)\n" +
                                                                                "VALUES\n" +
                                                                                "("+officer.getID()+",\n" +
                                                                                "'"+officer.getName()+"',\n" +
                                                                                "'"+officer.getPassword()+"',\n" +
                                                                                "'"+officer.getGender()+"',\n" +
                                                                                "'"+officer.getBirth_Date()+"',\n" +
                                                                                "'"+officer.getAddress()+"',\n" +
                                                                                "'"+officer.getPhone()+"',\n" +
                                                                                "'"+officer.getRank()+"',\n" +
                                                                                officer.getSalary()+",\n" +
                                                                                officer.getEvaluation()+",\n" +
                                                                                officer.getBonus()+",\n" +
                                                                                "'"+officer.getStatus()+"',\n" +
                                                                                officer.getDepartment_ID()+");";
                                                                                
        mystat.executeUpdate(sql);
        for (int i=0;i<DepartmentList.size();i++)
            {
                for(int j = 0; j<OfficersList.size(); i++)
                {
                    if (DepartmentList.get(i).getID()==officer.getDepartment_ID())
                {
                    int num_of_off=DepartmentList.get(i).getNum_of_Officies();
                    num_of_off+=1;
                    DepartmentList.get(i).setNum_of_Officies(num_of_off);
                    sql="UPDATE `crime_management_system`.`department_table`\n" +
                                                                                "SET\n" +
                                                                                "`num_of_officers` = "+num_of_off+"\n" +
                                                                                "WHERE `department_id` = "+officer.getDepartment_ID()+";";
                    mystat.executeUpdate(sql);
                }
                }
                
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }                                                                 
    }
    
    public void add_cases(Cases cases)
    {
        CasesList.add(cases);
        try
        {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crime_management_system", "root", "141198");
        Statement mystat=con.createStatement();
        String sql="INSERT INTO `crime_management_system`.`case_table`\n" +
                                                                                "(`case_id`,\n" +
                                                                                "`date_occurance`,\n" +
                                                                                "`case_status`,\n" +
                                                                                "`crime_type`,\n" +
                                                                                "`crime_location`,\n" +
                                                                                "`start_date`,\n" +
                                                                                "`last_update_date`,\n" +
                                                                                "`case_desc`,\n" +
                                                                                "`department_id`,\n" +
                                                                                "`isAssigned`)\n" +
                                                                                "VALUES\n" +
                                                                                "("+cases.getCase_ID()+",\n" +
                                                                                "'"+cases.getDate_Occurance()+"',\n" +
                                                                                "'"+cases.getStatus()+"',\n" +
                                                                                "'"+cases.getType()+"',\n" +
                                                                                "'"+cases.getLocation()+"',\n" +
                                                                                "'"+cases.getStart_date()+"',\n" +
                                                                                "'"+cases.getLast_update_date()+"',\n" +
                                                                                "'"+cases.getDescription()+"',\n" +
                                                                                cases.getDepartment_id()+",\n" +
                                                                                0+");";
                                                                                
        mystat.executeUpdate(sql);
        for (int i=0;i<DepartmentList.size();i++)
            {
                if (DepartmentList.get(i).getID()==cases.getDepartment_id())
                {
                    int num_of_cases=DepartmentList.get(i).getNum_of_Cases();
                    num_of_cases++;
                    DepartmentList.get(i).setNum_of_Officies(num_of_cases);
                    sql="UPDATE `crime_management_system`.`department_table`\n" +
                                                                                "SET\n" +
                                                                                "`num_of_cases` = "+num_of_cases+"\n" +
                                                                                "WHERE `department_id` = "+cases.getDepartment_id()+";";
                    mystat.executeUpdate(sql);
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }                         
        
    }
    
    
    public void update_Captain(int dID, int oldID, int newID)
    {
        try
           {
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crime_management_system", "root", "141198");
               Statement mystat=con.createStatement();
                
               String sql ="Update police_table set police_rank = 'Captain' Where police_id ='"+newID+"' ";
               mystat.executeUpdate(sql);
               
               sql ="Update police_table set police_rank = 'Officer' Where police_id !='"+newID+"' and department_id = '"+dID+"' ";
               mystat.executeUpdate(sql);
            }
            catch (Exception e)
            { 
                JOptionPane.showMessageDialog(null, e,"Erorr",JOptionPane.ERROR_MESSAGE);
            }
        
        for (int i = 0; i<CaptainList.size(); i++)
        {
            if(oldID == CaptainList.get(i).getID())
            {
                ArrayList<Integer>Cases_List = new ArrayList<>();
                Officers newOff = new Officers(CaptainList.get(i).getID(), CaptainList.get(i).getName(), CaptainList.get(i).getPassword(), CaptainList.get(i).getGender(),CaptainList.get(i).getBirth_Date()
                        , CaptainList.get(i).getAddress(), CaptainList.get(i).getPhone(), CaptainList.get(i).getSalary(), CaptainList.get(i).getEvaluation(), CaptainList.get(i).getBonus(), CaptainList.get(i).getStatus(), CaptainList.get(i).getDepartment_ID(), "officer", Cases_List);
                OfficersList.add(newOff);
                CaptainList.remove(CaptainList.get(i));
            }
        }
        for (int i = 0; i<OfficersList.size(); i++)
        {
            if(newID == OfficersList.get(i).getID())
            {
                Captain newCap = new Captain(OfficersList.get(i).getID(), OfficersList.get(i).getName(), OfficersList.get(i).getPassword(), OfficersList.get(i).getGender(),OfficersList.get(i).getBirth_Date()
                        , OfficersList.get(i).getAddress(), OfficersList.get(i).getPhone(), OfficersList.get(i).getSalary(), OfficersList.get(i).getEvaluation(), OfficersList.get(i).getBonus(), OfficersList.get(i).getStatus(), OfficersList.get(i).getDepartment_ID(), "Captain");
                CaptainList.add(newCap);
                OfficersList.remove(OfficersList.get(i));
            }
        }        
    }
    
    public void display_department(ArrayList<Department> Department_List)
    {
        DisDep dep;
        ScroolPanelDep.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        for (int i = 0; i <DepartmentList.size(); i++)
        {
            dep = new DisDep();
            dep.IDTxt.setText(String.valueOf(DepartmentList.get(i).getID()));
            dep.NameTxt.setText(DepartmentList.get(i).getName());
            dep.NumOffTxt.setText(String.valueOf(DepartmentList.get(i).getNum_of_Officies()));
            dep.NumCaseTxt.setText(String.valueOf(DepartmentList.get(i).getNum_of_Cases()));
            for(int j=0;j<CaptainList.size();j++)
            {
                if(CaptainList.get(j).getDepartment_ID() == DepartmentList.get(i).getID())
                {
                    dep.CIDTxt.setText(String.valueOf(CaptainList.get(j).getID()));
                    dep.CNameTxt.setText(CaptainList.get(j).getName());
                    break;
                }
            } 
            ScroolPanelDep.add(dep);
        }
    }
    
    public void display_officers(ArrayList<Officers> Officers_List, ArrayList<Captain> Captain_List)
    {
        DisOfficer off;
        ScroolPanelOff.setLayout(new FlowLayout(FlowLayout.LEFT));
        for (int i = 0; i < CaptainList.size(); i++)
        {
            off = new DisOfficer();
            off.IDTxt.setText(String.valueOf(CaptainList.get(i).getID()));
            off.NameTxt.setText(CaptainList.get(i).getName());
            off.RateTxt.setText(String.valueOf(CaptainList.get(i).getEvaluation()));
            off.RankTxt.setText(CaptainList.get(i).getRank());
            off.StatTxt.setText(CaptainList.get(i).getStatus());
            off.AddressTxt.setText(CaptainList.get(i).getAddress());
            off.GenderTxt.setText(CaptainList.get(i).getGender());

            for(int j=0;j<DepartmentList.size();j++)
            {
                int DepID = DepartmentList.get(j).getID();
                if(CaptainList.get(i).getDepartment_ID() == DepID)
                {
                    off.DepTxt.setText(DepartmentList.get(j).getName());
                    break;
                }
            } 
            ScroolPanelOff.add(off);
        }
        for (int i = 0; i < OfficersList.size(); i++)
        {
            off = new DisOfficer();
            off.IDTxt.setText(String.valueOf(OfficersList.get(i).getID()));
            off.NameTxt.setText(OfficersList.get(i).getName());
            off.RateTxt.setText(String.valueOf(OfficersList.get(i).getEvaluation()));
            off.RankTxt.setText(OfficersList.get(i).getRank());
            off.StatTxt.setText(OfficersList.get(i).getStatus());
            off.AddressTxt.setText(OfficersList.get(i).getAddress());
            off.GenderTxt.setText(OfficersList.get(i).getGender());

            for(int j=0;j<DepartmentList.size();j++)
            {
                int DepID = DepartmentList.get(j).getID();
                if(OfficersList.get(i).getDepartment_ID() == DepID)
                {
                    off.DepTxt.setText(DepartmentList.get(j).getName());
                    break;
                }
            } 
            ScroolPanelOff.add(off);
        }
    }
    
    public void complain_respond(String respond , Officers officer, int comp_id)
    {
        for(int i = 0; i < ComplainList.size(); i++)
        {
            
            if (comp_id == ComplainList.get(i).getCompliain_id())
            {
                ComplainList.get(i).setComplain_bool(false);
            }
        }
        
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crime_management_system", "root", "141198");
            Statement mystat = con.createStatement();
        
            String sql = "UPDATE complain_table set complain_bool = "+ false +" , comp_seen = "+false+" where Officers_id = "+ "\"" + officer.getID() + "\"" +" and complain_id ="+ "\"" + comp_id + "\"" +" ";
            mystat.executeUpdate(sql);
             
             if (respond.equals("Fired"))
             {
                String Anothersql1 = "update `crime_management_system`.`police_table` set `police_status` = "+ "\"" + "Fired" + "\"" +" where `police_id` = "+ "\"" + officer.getID() + "\"" +";";
                mystat.executeUpdate(Anothersql1);
                
                Anothersql1 = "delete from `crime_management_system`.`case_officer_table`  where `officer_id` = "+ "\"" + officer.getID() + "\"" +";";
                mystat.executeUpdate(Anothersql1);
                
                for (int i=0;i<DepartmentList.size();i++)
                {
                    if (DepartmentList.get(i).getID()==officer.getDepartment_ID())
                    {
                        int num_of_off=DepartmentList.get(i).getNum_of_Officies();
                        num_of_off--;
                        DepartmentList.get(i).setNum_of_Officies(num_of_off);
                        sql="UPDATE `crime_management_system`.`department_table`\n" +
                                                                                    "SET\n" +
                                                                                    "`num_of_officers` = "+num_of_off+"\n" +
                                                                                    "WHERE `department_id` = "+officer.getDepartment_ID()+";";
                        mystat.executeUpdate(sql);
                    }
                }
             }
             else if (respond.equals("Warning"))
             {
                String Anothersql1 = "update `crime_management_system`.`police_table` set `police_status` = "+ "\"" + "Warned" + "\"" +" where `police_id` = "+ "\"" + officer.getID() + "\"" +";";
                mystat.executeUpdate(Anothersql1);
             }
             else if (respond.equals("Reject"))
             {
                 String Anothersql1 = "update `crime_management_system`.`police_table` set `police_status` = "+ "\"" + "Available" + "\"" +" where `police_id` = "+ "\"" + officer.getID() + "\"" +";";
                mystat.executeUpdate(Anothersql1);
             }
             
             con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e,"Erorr",JOptionPane.ERROR_MESSAGE);
        }
    }

    //mahmoud
    @Override
    public void display_cases(ArrayList<Cases> Cases_List)
    {
        DisplayCase disCase;
        ScroolPanelCase.setLayout(new FlowLayout(FlowLayout.LEFT));

        for (int i = 0; i < CasesList.size(); i++)
        {
            disCase = new DisplayCase();
            disCase.caseID.setText("ID : "+CasesList.get(i).getCase_ID());
            disCase.caseOcc.setText("Occurence Date : "+CasesList.get(i).getDate_Occurance());
            disCase.caseStatus.setText("Status : "+CasesList.get(i).getStatus());
            disCase.caseCT.setText("Crime Type : "+CasesList.get(i).getType());
            disCase.caseLoc.setText("Crime Location : "+CasesList.get(i).getLocation());
            disCase.caseStart.setText("Start Date : "+CasesList.get(i).getStart_date());
            disCase.caseLastUp.setText("Last Update : "+CasesList.get(i).getLast_update_date());
            for(int j=0;j<DepartmentList.size();j++)
            {
                int DepID = DepartmentList.get(j).getID();
                if(CasesList.get(i).getDepartment_id() == DepID)
                {
                    disCase.caseDepName.setText("Department Name : "+DepartmentList.get(j).getName());
                    break;
                }
            }
            ScroolPanelCase.add(disCase);
        }
    }
}