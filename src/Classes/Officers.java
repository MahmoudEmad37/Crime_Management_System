package Classes;

import static LoginPackage.LoginForm.*;
import static OfficerPackage.AddCriminal.ScroolPanelCrim;
import OfficerPackage.DisCaseOff;
import OfficerPackage.DisCriminal;
import static OfficerPackage.OfficerForm.ScroolPanelCase;
import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Officers extends Police {

    private ArrayList<Integer> Cases_List;
    private int Evaluation;
    private int department_ID;
    private double Bonus;

    public Officers(int id, String name, String password, String gender, String birth_date, String address, String phone, double salary, int Evaluation, double Bouns, String Status, int department_ID, String Rank, ArrayList<Integer> Cases_List) {
        super(id, name, gender, birth_date, address, phone, salary, password, Rank, Status);
        this.Evaluation = Evaluation;
        this.department_ID = department_ID;
        this.Cases_List = Cases_List;
    }

    public ArrayList<Integer> getCases_List() {
        return Cases_List;
    }

    public int getEvaluation() {
        return Evaluation;
    }

    public int getDepartment_ID() {
        return department_ID;
    }

    public void setCases_List(int cID) {
        this.Cases_List.add(cID);
    }

    public double getBonus() {
        return Bonus;
    }

    public void setEvaluation(int Evaluation) {
        this.Evaluation = Evaluation;
    }

    public void setBonus(double Bonus) {
        this.Bonus = Bonus;
    }

    @Override
    public void display_cases(ArrayList<Cases> Cases_List) {
        ScroolPanelCase.removeAll();
        ScroolPanelCase.setLayout(new FlowLayout(FlowLayout.LEFT));
        DisCaseOff casee;
        for (int i = 0; i < CasesList.size(); i++)
        {
            if(CasesList.get(i).getStatus().equals("Investigating"))
            {
                if(CasesList.get(i).getOfficer_list().size()==2)
                {
                 
                    if(CasesList.get(i).getOfficer_list().get(0)==NowOff.getID()||CasesList.get(i).getOfficer_list().get(1)==NowOff.getID())
                    {
                        casee = new DisCaseOff();
                        casee.IDTxt.setText(String.valueOf(CasesList.get(i).getCase_ID()));
                        casee.SDateTxt.setText(CasesList.get(i).getStart_date());
                        casee.UDateTxt.setText(CasesList.get(i).getLast_update_date());
                        casee.CTypeTxt.setText(CasesList.get(i).getType());
                        casee.jTextArea1.setText(CasesList.get(i).getDescription());
                        DefaultListModel off = new DefaultListModel();
                        casee.jList1.setModel(off);
                        for (int j = 0; j<OfficersList.size();j++)
                        {
                            if(CasesList.get(i).getOfficer_list().get(0) == OfficersList.get(j).getID()||CasesList.get(i).getOfficer_list().get(1) == OfficersList.get(j).getID())
                            {  
                                off.addElement(OfficersList.get(j).getName());
                            }
                        }
                        casee.ReBtn.setVisible(false);
                        casee.StatLbl.setVisible(false);
                        casee.StatTxt.setVisible(false);
                        ScroolPanelCase.add(casee);
                    }
                }
                else if (CasesList.get(i).getOfficer_list().size()==1)
                {
                    if(CasesList.get(i).getOfficer_list().get(0)==NowOff.getID())
                    {
                        casee = new DisCaseOff();
                        casee.IDTxt.setText(String.valueOf(CasesList.get(i).getCase_ID()));
                        casee.SDateTxt.setText(CasesList.get(i).getStart_date());
                        casee.UDateTxt.setText(CasesList.get(i).getLast_update_date());
                        casee.CTypeTxt.setText(CasesList.get(i).getType());
                        casee.jTextArea1.setText(CasesList.get(i).getDescription());
                        DefaultListModel off = new DefaultListModel();
                        casee.jList1.setModel(off);
                        for (int j = 0; j<OfficersList.size();j++)
                        {
                            if(CasesList.get(i).getOfficer_list().get(0) == OfficersList.get(j).getID())
                            {  
                                off.addElement(OfficersList.get(j).getName());
                            }
                        }
                        casee.ReBtn.setVisible(false);
                        casee.StatLbl.setVisible(false);
                        casee.StatTxt.setVisible(false);
                        ScroolPanelCase.add(casee);
                    }
                }
                
            }
        }
    }

    public void display_Criminal(ArrayList<Criminal> Criminal_List,int case_id){
        
        ScroolPanelCrim.setLayout(new FlowLayout(FlowLayout.LEFT));
        DisCriminal criminal;
        for (int i = 0; i < CasesList.size(); i++)
        {
            if(CasesList.get(i).getCase_ID()==case_id)
            {
                start:for(int j=0;j<CriminalList.size();j++)
                {
                    for(int k=0;k<CasesList.get(i).getCriminal_List().size();k++)
                    {
                        if(CriminalList.get(j).getID()==CasesList.get(i).getCriminal_List().get(k))
                        {
                            continue start;
                        }
                    }
                    criminal = new DisCriminal(case_id);
                    criminal.IDTxt.setText(String.valueOf(CriminalList.get(j).getID()));
                    criminal.NameTxt.setText(CriminalList.get(j).getName());
                    criminal.LocTxt.setText(CriminalList.get(j).getLocation());
                    criminal.DangTxt.setText(CriminalList.get(j).getDangerous_Level());
                    ScroolPanelCrim.add(criminal);
                }
                break;
            }    
        }
    }

    public void update_case(int id) {
        Date thisdate = new Date();
        SimpleDateFormat dateform = new SimpleDateFormat("dd/MM/yy");
        String date = dateform.format(thisdate);

        for (int i = 0; i < CasesList.size(); i++) {
            if (CasesList.get(i).getCase_ID() == id) {
                CasesList.get(i).setLast_update_date(date);
            }
        }

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crime_management_system", "root", "141198");
            Statement mystat = con.createStatement();

            String Anothersql = "update `crime_management_system`.`case_table` set `last_update_date` = " + "\"" + date + "\"" + " where `case_id` = " + "\"" + id + "\"" + ";";
            mystat.executeUpdate(Anothersql);
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Erorr", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void add_criminal(Criminal criminal, int case_id) {
        CriminalList.add(criminal);
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crime_management_system", "root", "141198");
            Statement mystat = con.createStatement();
            String sql = "INSERT INTO `crime_management_system`.`criminal_table`\n"
                    + "(`criminal_id`,\n"
                    + "`criminal_name`,\n"
                    + "`criminal_gender`,\n"
                    + "`criminal_birth_date`,\n"
                    + "`criminal_address`,\n"
                    + "`criminal_phone`,\n"
                    + "`criminal_location`,\n"
                    + "`criminal_dengerous_level`,\n"
                    + "`criminal_status`)\n"
                    + "VALUES\n"
                    + "(" + criminal.getID() + ",\n"
                    + "'" + criminal.getName() + "',\n"
                    + "'" + criminal.getGender() + "',\n"
                    + "'" + criminal.getBirth_Date() + "',\n"
                    + "'" + criminal.getAddress() + "',\n"
                    + "'" + criminal.getPhone() + "',\n"
                    + "'" + criminal.getLocation() + "',\n"
                    + "'" + criminal.getDangerous_Level() + "',\n"
                    + "'" + criminal.getStatus() + "');";
            mystat.executeUpdate(sql);
            sql = "INSERT INTO `crime_management_system`.`case_criminal_table`\n"
                    + "(`case_id`,\n"
                    + "`criminal_id`)\n"
                    + "VALUES\n"
                    + "(" + case_id + ",\n"
                    + criminal.getID() + ");";
            mystat.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void add_ex_criminal(int criminal_id, int case_id) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crime_management_system", "root", "141198");
            Statement mystat = con.createStatement();
            String sql = "INSERT INTO `crime_management_system`.`case_criminal_table`\n"
                    + "(`case_id`,\n"
                    + "`criminal_id`)\n"
                    + "VALUES\n"
                    + "(" + case_id + ",\n"
                    + criminal_id + ");";
            mystat.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
        CasesList.get(case_id - 1).setCriminal_List(criminal_id);
        CriminalList.get(criminal_id - 1).setCases(case_id);
    }

    public void add_witness(Witnes witnes) {
        WitnessList.add(witnes);
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crime_management_system", "root", "141198");
            Statement mystat = con.createStatement();
            String sql = "INSERT INTO `crime_management_system`.`witness_table`\n"
                    + "(`witness_id`,\n"
                    + "`witness_name`,\n"
                    + "`witness_gender`,\n"
                    + "`witness_birth_date`,\n"
                    + "`witness_address`,\n"
                    + "`witness_phone`,\n"
                    + "`case_id`)\n"
                    + "VALUES\n"
                    + "(" + witnes.getID() + ",\n"
                    + "'" + witnes.getName() + "',\n"
                    + "'" + witnes.getGender() + "',\n"
                    + "'" + witnes.getBirth_Date() + "',\n"
                    + "'" + witnes.getAddress() + "',\n"
                    + "'" + witnes.getPhone() + "',\n"
                    + witnes.getCase_id() + ");";
            mystat.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void calc_eval(int id, int points) {
        double res1, res2;
        Evaluation += points;
        Bonus = Evaluation / 3.0;
        DecimalFormat df = new DecimalFormat("#.##");
        res1 = Double.parseDouble(df.format(Bonus));
        res2 = this.getSalary() * res1;
        this.setSalary(res2);

        for (int i = 0; i < OfficersList.size(); i++) {
            if (OfficersList.get(i).getID() == id) {
                OfficersList.get(i).setSalary(res2);
                OfficersList.get(i).setBonus(res1);
                OfficersList.get(i).setEvaluation(Evaluation);
            }
        }

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crime_management_system", "root", "141198");
            Statement mystat = con.createStatement();

            String Anothersql = "update `crime_management_system`.`police_table` set `police_evaluation` = " + Evaluation + " , `police_bouns` = " + res1 + " , `police_salary` = " + res2 + " where `police_id` = " + "\"" + id + "\"" + ";";
            mystat.executeUpdate(Anothersql);
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Erorr", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void case_status(int case_id, String status) {
        if (status.equals("Closed")) {
            for (Cases CasesList1 : CasesList) {
                if (case_id == CasesList1.getCase_ID()) {
                    CasesList1.setStatus(status);

                    try {
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crime_management_system", "root", "141198");
                        Statement mystat = con.createStatement();
                        String sql = "Update case_table "
                                + "set case_status = 'Closed' "
                                + "Where case_id ='" + case_id + "' ";
                        mystat.executeUpdate(sql);

                        for (int i = 0; i < DepartmentList.size(); i++) {
                            if (DepartmentList.get(i).getID() == CasesList1.getDepartment_id()) {
                                int num_of_cases = DepartmentList.get(i).getNum_of_Cases();
                                num_of_cases--;
                                DepartmentList.get(i).setNum_of_Officies(num_of_cases);
                                sql = "UPDATE `crime_management_system`.`department_table`\n"
                                        + "SET\n"
                                        + "`num_of_cases` = " + num_of_cases + "\n"
                                        + "WHERE `department_id` = " + CasesList1.getDepartment_id() + ";";
                                mystat.executeUpdate(sql);
                            }
                        }

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e, "Erorr", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        } else if (status.equals("Solved")) {
            for (Cases CasesList1 : CasesList) {
                if (case_id == CasesList1.getCase_ID()) {
                    CasesList1.setStatus(status);

                    try {
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crime_management_system", "root", "141198");
                        Statement mystat = con.createStatement();
                        String sql = "Update case_table "
                                + "set case_status = 'Solved' "
                                + "Where case_id ='" + case_id + "' ";
                        mystat.executeUpdate(sql);
                        
                        for (int i = 0; i <CriminalList.size(); i++)
                        {
                            for(int j = 0; j <CriminalList.get(i).getCases().size(); j++)
                            {
                                if (CriminalList.get(i).getCases().get(j) == case_id)
                                {
                                    sql = "UPDATE `criminal_table` set `criminal_status` = "+ "\"" + "Involved in case" + "\"" +" where criminal_id = "+ "\"" + CriminalList.get(i).getID() + "\";" ;
                                    mystat.executeUpdate(sql);
                                }
                            }
                        }
                        

                        for (int i = 0; i < DepartmentList.size(); i++) {
                            if (DepartmentList.get(i).getID() == CasesList1.getDepartment_id()) {
                                int num_of_cases = DepartmentList.get(i).getNum_of_Cases();
                                num_of_cases--;
                                DepartmentList.get(i).setNum_of_Officies(num_of_cases);
                                sql = "UPDATE `crime_management_system`.`department_table`\n"
                                        + "SET\n"
                                        + "`num_of_cases` = " + num_of_cases + "\n"
                                        + "WHERE `department_id` = " + CasesList1.getDepartment_id() + ";";
                                mystat.executeUpdate(sql);
                            }
                        }

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e, "Erorr", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }

        } else if (status.equals("Investigating")) {
            for (Cases CasesList1 : CasesList) {
                if (case_id == CasesList1.getCase_ID()) {
                    CasesList1.setStatus(status);

                    try {
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crime_management_system", "root", "141198");
                        Statement mystat = con.createStatement();
                        String sql = "Update case_table "
                                + "set case_status = 'Investigating' "
                                + "Where case_id ='" + case_id + "' ";
                        mystat.executeUpdate(sql);

                        for (int i = 0; i < DepartmentList.size(); i++) {
                            if (DepartmentList.get(i).getID() == CasesList1.getDepartment_id()) {
                                int num_of_cases = DepartmentList.get(i).getNum_of_Cases();
                                num_of_cases++;
                                DepartmentList.get(i).setNum_of_Officies(num_of_cases);
                                sql = "UPDATE `crime_management_system`.`department_table`\n"
                                        + "SET\n"
                                        + "`num_of_cases` = " + num_of_cases + "\n"
                                        + "WHERE `department_id` = " + CasesList1.getDepartment_id() + ";";
                                mystat.executeUpdate(sql);
                            }
                        }

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e, "Erorr", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
    }

    public void update_criminal_info(Criminal criminal) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crime_management_system", "root", "141198");
            Statement mystat = con.createStatement();
            String sql = "UPDATE `crime_management_system`.`criminal_table`\n"
                    + "SET\n"
                    + "`criminal_address` = '" + criminal.getAddress() + "',\n"
                    + "`criminal_phone` = '" + criminal.getPhone() + "',\n"
                    + "`criminal_status` = '" + criminal.getStatus()+ "',\n"
                    + "`criminal_location` = '" + criminal.getLocation() + "'\n"
                    + "WHERE `criminal_id` = " + criminal.getID() + ";";

            mystat.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
