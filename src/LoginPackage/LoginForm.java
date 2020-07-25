package LoginPackage;

import java.sql.*;
import CaptainPackage.*;
import ChiefPackage.*;
import OfficerPackage.*;
import java.awt.*;
import java.util.ArrayList;
import Classes.*;
import javax.swing.JOptionPane;

public class LoginForm extends javax.swing.JFrame {

    public static ArrayList<Department> DepartmentList = new ArrayList<Department>();
    public static ArrayList<Captain> CaptainList = new ArrayList<Captain>();
    public static ArrayList<Officers> OfficersList = new ArrayList<Officers>();
    public static ArrayList<Cases> CasesList = new ArrayList<Cases>();
    public static ArrayList<Criminal> CriminalList = new ArrayList<Criminal>();
    public static ArrayList<Witnes>WitnessList=new ArrayList<Witnes>();
    public static ArrayList<Complain>ComplainList=new ArrayList<Complain>();
    public static Cheif chief=new Cheif(1, "admin", "admin", "Male", "14/11/1989", "New Cairo", "012345678", 150000, "Chief", "Available");
    public static Captain NowCap;
    public static Officers NowOff;

    public LoginForm() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        Badge.requestFocus();
        idPanel.setBackground(LoginBG.getBackground());
        passPanel.setBackground(LoginBG.getBackground());
        load();
    }

    public static void load()
    {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crime_management_system", "root", "141198");
            Statement mystat = con.createStatement();
            ResultSet res = mystat.executeQuery("SELECT * FROM crime_management_system.department_table");
           
            while (res.next())
            {
                Department dep = new Department(res.getInt(1), res.getString(2), Integer.parseInt(res.getString(3)), Integer.parseInt(res.getString(4)), res.getString(5));
                DepartmentList.add(dep);
            }
            res = mystat.executeQuery("SELECT * FROM crime_management_system.police_table");
            while (res.next()) 
            {
                if (res.getString(8).equals("Captain")) {
                    Captain cap = new Captain(res.getInt(1), res.getString(2), res.getString(3),
                            res.getString(4), res.getString(5), res.getString(6), res.getString(7),
                            Double.parseDouble(res.getString(9)), Integer.parseInt(res.getString(10)),
                            Double.parseDouble(res.getString(11)), res.getString(12), res.getInt(13),
                            res.getString(8));
                    CaptainList.add(cap);
                }
                else if (res.getString(8).equals("Officer"))
                {    
                    Statement stat = con.createStatement();
                    ResultSet ress = stat.executeQuery("SELECT * FROM crime_management_system.case_officer_table");
                    
                    ArrayList<Integer> Cases_list = new ArrayList<Integer>();
                    int offID = res.getInt(1);
                    while (ress.next()) {
                            if (offID == ress.getInt(3)) {
                                Cases_list.add(ress.getInt(2));
                            }
                    }
                        Officers off = new Officers(res.getInt(1), res.getString(2), res.getString(3),
                                res.getString(4), res.getString(5), res.getString(6), res.getString(7),
                                Double.parseDouble(res.getString(9)), Integer.parseInt(res.getString(10)),
                                Double.parseDouble(res.getString(11)), res.getString(12), res.getInt(13),
                                res.getString(8), Cases_list);
                        OfficersList.add(off);
                    
                }
            }
            res = mystat.executeQuery("SELECT * FROM crime_management_system.case_table");
            while (res.next()) 
            {
                ArrayList<Integer> Officers_list = new ArrayList<Integer>();
                ArrayList<Integer> Criminal_list = new ArrayList<Integer>();
                Statement stat = con.createStatement();
                    ResultSet ress = stat.executeQuery("SELECT * FROM crime_management_system.case_officer_table");
                    int casID = res.getInt(1);
                    while (ress.next()) {
                            if (casID == ress.getInt(2)) {
                                Officers_list.add(ress.getInt(3));
                            }
                    }
                    
                    ress = stat.executeQuery("SELECT * FROM crime_management_system.case_criminal_table");
                    while (ress.next()) {
                            if (casID == ress.getInt(2)) {
                                Criminal_list.add(ress.getInt(3));
                            }
                    }
                    
                Cases cas = new Cases(res.getInt(1), res.getString(2), res.getString(3), res.getString(4),
                        res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getInt(9) ,
                        Criminal_list,Officers_list, res.getBoolean(10));
                CasesList.add(cas);
                
            }
            res = mystat.executeQuery("SELECT * FROM crime_management_system.criminal_table");
           
            while (res.next())
            {
                Statement stat = con.createStatement();
                ResultSet ress = stat.executeQuery("SELECT * FROM crime_management_system.case_criminal_table");
                    
                ArrayList<Integer> Cases_list = new ArrayList<Integer>();
                int crimID = res.getInt(1);
                    while (ress.next()) {
                            if (crimID == ress.getInt(3)) {
                                Cases_list.add(ress.getInt(2));
                            }
                    }
                Criminal criminal=new Criminal(res.getInt(1),res.getString(2),res.getString(3),res.getString(4),
                res.getString(5),res.getString(6),res.getString(7),res.getString(8),res.getString(9),Cases_list);
                CriminalList.add(criminal);
            }
            
            res = mystat.executeQuery("SELECT * FROM crime_management_system.witness_table");
           
            while (res.next())
            {
                Witnes witnes =new Witnes(res.getInt(1),res.getString(2),res.getString(3),res.getString(4),
                res.getString(5),res.getString(6),res.getInt(7));
                WitnessList.add(witnes);
            }
            
            res = mystat.executeQuery("SELECT * FROM crime_management_system.complain_table");
           
            while (res.next())
            {
                Complain complain=new Complain(res.getInt(1),res.getString(2),res.getString(3),res.getBoolean(4), res.getBoolean(5),
                        res.getInt(6));
                ComplainList.add(complain);
            }
            
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(this, e, "Erorr", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginBG = new javax.swing.JPanel();
        LoginBtn = new javax.swing.JButton();
        idText = new javax.swing.JTextField();
        passText = new javax.swing.JTextField();
        idPanel = new javax.swing.JPanel();
        passPanel = new javax.swing.JPanel();
        Badge = new javax.swing.JLabel();
        split = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LoginBG.setBackground(new java.awt.Color(69, 162, 158));

        LoginBtn.setBackground(new java.awt.Color(204, 204, 204));
        LoginBtn.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        LoginBtn.setForeground(new java.awt.Color(69, 162, 158));
        LoginBtn.setText("LOGIN");
        LoginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginBtnMouseClicked(evt);
            }
        });
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });

        idText.setBackground(new java.awt.Color(69, 162, 158));
        idText.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 18)); // NOI18N
        idText.setForeground(new java.awt.Color(255, 255, 255));
        idText.setText("USER ID");
        idText.setBorder(null);
        idText.setPreferredSize(new java.awt.Dimension(59, 25));
        idText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idTextFocusLost(evt);
            }
        });
        idText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idTextMouseClicked(evt);
            }
        });

        passText.setBackground(new java.awt.Color(69, 162, 158));
        passText.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 18)); // NOI18N
        passText.setForeground(new java.awt.Color(255, 255, 255));
        passText.setText("PASSWORD");
        passText.setBorder(null);
        passText.setPreferredSize(new java.awt.Dimension(59, 25));
        passText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passTextFocusLost(evt);
            }
        });
        passText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTextActionPerformed(evt);
            }
        });

        idPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout idPanelLayout = new javax.swing.GroupLayout(idPanel);
        idPanel.setLayout(idPanelLayout);
        idPanelLayout.setHorizontalGroup(
            idPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        idPanelLayout.setVerticalGroup(
            idPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        passPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout passPanelLayout = new javax.swing.GroupLayout(passPanel);
        passPanel.setLayout(passPanelLayout);
        passPanelLayout.setHorizontalGroup(
            passPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        passPanelLayout.setVerticalGroup(
            passPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        Badge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Police-Badge-128copy.png"))); // NOI18N

        split.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout splitLayout = new javax.swing.GroupLayout(split);
        split.setLayout(splitLayout);
        splitLayout.setHorizontalGroup(
            splitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        splitLayout.setVerticalGroup(
            splitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("*If You Are New Officer Just Enter Your ID*");

        javax.swing.GroupLayout LoginBGLayout = new javax.swing.GroupLayout(LoginBG);
        LoginBG.setLayout(LoginBGLayout);
        LoginBGLayout.setHorizontalGroup(
            LoginBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginBGLayout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(LoginBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginBGLayout.createSequentialGroup()
                        .addComponent(Badge)
                        .addGap(200, 200, 200))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginBGLayout.createSequentialGroup()
                        .addGroup(LoginBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LoginBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(LoginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(LoginBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(passText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(idText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(idPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(passPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(split, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(78, 78, 78))))
        );
        LoginBGLayout.setVerticalGroup(
            LoginBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginBGLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Badge)
                .addGap(33, 33, 33)
                .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(idPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(split, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(passPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(LoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idTextMouseClicked

    }//GEN-LAST:event_idTextMouseClicked

    private void idTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idTextFocusGained
        if ("USER ID".equals(idText.getText())) {
            idText.setText("");
        }
        idPanel.setBackground(Color.white);
    }//GEN-LAST:event_idTextFocusGained

    private void idTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idTextFocusLost
        if ("".equals(idText.getText().trim())) {
            idText.setText("USER ID");
        }
        idPanel.setBackground(LoginBG.getBackground());
    }//GEN-LAST:event_idTextFocusLost

    private void passTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passTextFocusGained
        if ("PASSWORD".equals(passText.getText())) {
            passText.setText("");
        }
        passPanel.setBackground(Color.white);
    }//GEN-LAST:event_passTextFocusGained

    private void passTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passTextFocusLost
        if ("".equals(passText.getText().trim())) {
            passText.setText("PASSWORD");
        }
        passPanel.setBackground(LoginBG.getBackground());
    }//GEN-LAST:event_passTextFocusLost

    //Login Button
    private void LoginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginBtnMouseClicked

        String IDVal = idText.getText().trim();
        String pass = passText.getText().trim();

        if ("USER ID".equals(IDVal)) {
            JOptionPane.showMessageDialog(null, "Please Enter Your ID", "Error", JOptionPane.ERROR_MESSAGE);
        }

        if ("admin".equals(IDVal) && "admin".equals(pass)) {
            new ChiefForm().setVisible(true);
            this.dispose();

        }
        else {
            int id = Integer.valueOf(IDVal);
            for (int i = 0; i < CaptainList.size(); i++) {
                if (id == CaptainList.get(i).getID()) {
                    if ("PASSWORD".equals(pass) && "0".equals(CaptainList.get(i).getPassword())) {
                        String password = JOptionPane.showInputDialog("Enter Your Password");
                        CaptainList.get(i).setPassword(password);
                        try {
                            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crime_management_system", "root", "141198");
                            Statement mystat = con.createStatement();

                            String sql = "UPDATE police_table set police_password = " + password + " where police_id = " + id + " ";
                            mystat.executeUpdate(sql);
                            con.close();
                            NowCap = CaptainList.get(i);
                            new capJFrame().setVisible(true);
                            this.dispose();
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e, "Erorr", JOptionPane.ERROR_MESSAGE);
                        }
                    } 
                    else if (pass.equals(CaptainList.get(i).getPassword())) 
                    {
                        NowCap = CaptainList.get(i);
                        new capJFrame().setVisible(true);
                        this.dispose();
                    } else if (!pass.equals(CaptainList.get(i).getPassword())) {
                        JOptionPane.showMessageDialog(null, "Wrong ID Or Password", "Error", JOptionPane.ERROR_MESSAGE);
                        idText.setText("USER ID");
                        passText.setText("PASSWORD");
                    }
                }
            }

            for (int i = 0; i < OfficersList.size(); i++) {
                if (id == OfficersList.get(i).getID()) {
                    if ("PASSWORD".equals(pass) && "0".equals(OfficersList.get(i).getPassword())) {
                        String password = JOptionPane.showInputDialog("Enter Your Password");
                        OfficersList.get(i).setPassword(password);
                        try {
                            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crime_management_system", "root", "141198");
                            Statement mystat = con.createStatement();

                            String sql = "UPDATE police_table set police_password = " + password + " where police_id = " + id + " ";
                            mystat.executeUpdate(sql);
                            con.close();
                            NowOff = OfficersList.get(i);
                            new OfficerForm().setVisible(true);
                            this.dispose();
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e, "Erorr", JOptionPane.ERROR_MESSAGE);
                        }
                    } 
                    else if (pass.equals(OfficersList.get(i).getPassword())) {
                        if(OfficersList.get(i).getStatus().equals("Fired"))
                        {
                            JOptionPane.showMessageDialog(null, "You Are Fired Danta hytla3 talata **** ahlak", "Error", JOptionPane.ERROR_MESSAGE);
                            idText.setText("USER ID");
                            passText.setText("PASSWORD");
                        }
                        else
                        {
                            NowOff = OfficersList.get(i);
                            for(int j = 0; j<ComplainList.size(); j++)
                            {
                                if(NowOff.getID() == ComplainList.get(j).getOfficer_id() && ComplainList.get(j).IsSeen() == false)
                                {
                                    if("Warned".equals(OfficersList.get(i).getStatus()))
                                    {
                                       JOptionPane.showMessageDialog(null, "You've got warning from your chief", "Warning", JOptionPane.WARNING_MESSAGE);
                                    }
                                    else if ("Available".equals(OfficersList.get(i).getStatus()))
                                    {
                                        JOptionPane.showMessageDialog(null, "Your complain had been rejected", "Warning", JOptionPane.WARNING_MESSAGE);
                                    }
                                    try 
                                    {
                                            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crime_management_system", "root", "141198");
                                            Statement mystat = con.createStatement();

                                            String sql = "UPDATE complain_table set comp_seen = " + true + " where complain_id = " + ComplainList.get(j).getCompliain_id() + " ";
                                            mystat.executeUpdate(sql);
                                            con.close();
                                    } 
                                    catch (Exception e) 
                                    {
                                            JOptionPane.showMessageDialog(null, e, "Erorr", JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                            }
                           
                            new OfficerForm().setVisible(true);
                            this.dispose();
                        }
                    } 
                    else if (!pass.equals(OfficersList.get(i).getPassword())) {
                        JOptionPane.showMessageDialog(null, "Wrong ID Or Password", "Error", JOptionPane.ERROR_MESSAGE);
                        idText.setText("USER ID");
                        passText.setText("PASSWORD");
                    }
                }
            }
        }

    }//GEN-LAST:event_LoginBtnMouseClicked

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed


    }//GEN-LAST:event_LoginBtnActionPerformed

    private void passTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passTextActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Badge;
    private javax.swing.JPanel LoginBG;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JPanel idPanel;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel passPanel;
    private javax.swing.JTextField passText;
    private javax.swing.JPanel split;
    // End of variables declaration//GEN-END:variables
}
