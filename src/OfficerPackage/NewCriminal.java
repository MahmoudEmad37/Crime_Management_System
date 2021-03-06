package OfficerPackage;


import Classes.Criminal;
import static LoginPackage.LoginForm.*;
import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class NewCriminal extends javax.swing.JPanel {

    AddCase casee;
    DisFullCase caseFull;
    AddCriminal addCr;
    BorderLayout b;
    DisFullCase Fcase;
    
    int case_id;
    int criminal_id;
    public NewCriminal() {
        initComponents();
        criminal_id=CriminalList.size()+1;
        IDTxt.setText(String.valueOf(criminal_id));
        casee = new AddCase();
        b = new BorderLayout();
        
        
    }
    public NewCriminal(int case_id) {
        initComponents();
        criminal_id=CriminalList.size()+1;
        IDTxt.setText(String.valueOf(criminal_id));
        this.case_id=case_id;
        casee = new AddCase();
        b = new BorderLayout();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        IDLbl = new javax.swing.JLabel();
        IDTxt = new javax.swing.JTextField();
        NameLbl = new javax.swing.JLabel();
        NameTxt = new javax.swing.JTextField();
        BDateLbl = new javax.swing.JLabel();
        GenderLbl = new javax.swing.JLabel();
        MaleRBtn = new javax.swing.JRadioButton();
        FemaleRBtn = new javax.swing.JRadioButton();
        AddressLbl = new javax.swing.JLabel();
        AddressTxt = new javax.swing.JTextField();
        DangLbl = new javax.swing.JLabel();
        DangCBox = new javax.swing.JComboBox();
        LocLbl = new javax.swing.JLabel();
        LocTxt = new javax.swing.JTextField();
        AddCaseBtn = new javax.swing.JButton();
        CloseBtn = new javax.swing.JButton();
        BDateTxt = new com.toedter.calendar.JDateChooser();
        AddressLbl1 = new javax.swing.JLabel();
        phoneTxt1 = new javax.swing.JTextField();
        DangLbl1 = new javax.swing.JLabel();
        StatCBox = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(31, 40, 51));
        setLayout(new java.awt.GridBagLayout());

        IDLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        IDLbl.setForeground(new java.awt.Color(255, 255, 255));
        IDLbl.setText("ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(64, 64, 0, 0);
        add(IDLbl, gridBagConstraints);

        IDTxt.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        IDTxt.setMaximumSize(new java.awt.Dimension(200, 29));
        IDTxt.setMinimumSize(new java.awt.Dimension(200, 29));
        IDTxt.setPreferredSize(new java.awt.Dimension(200, 29));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(63, 15, 0, 0);
        add(IDTxt, gridBagConstraints);

        NameLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        NameLbl.setForeground(new java.awt.Color(255, 255, 255));
        NameLbl.setText("Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(64, 44, 0, 0);
        add(NameLbl, gridBagConstraints);

        NameTxt.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        NameTxt.setMaximumSize(new java.awt.Dimension(200, 29));
        NameTxt.setMinimumSize(new java.awt.Dimension(200, 29));
        NameTxt.setPreferredSize(new java.awt.Dimension(200, 29));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 19;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(63, 16, 0, 0);
        add(NameTxt, gridBagConstraints);

        BDateLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BDateLbl.setForeground(new java.awt.Color(255, 255, 255));
        BDateLbl.setText("Birth date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 67, 0, 0);
        add(BDateLbl, gridBagConstraints);

        GenderLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        GenderLbl.setForeground(new java.awt.Color(255, 255, 255));
        GenderLbl.setText("Gender");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 64, 0, 0);
        add(GenderLbl, gridBagConstraints);

        MaleRBtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        MaleRBtn.setForeground(new java.awt.Color(255, 255, 255));
        MaleRBtn.setText("Male");
        MaleRBtn.setContentAreaFilled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 15, 0, 0);
        add(MaleRBtn, gridBagConstraints);

        FemaleRBtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        FemaleRBtn.setForeground(new java.awt.Color(255, 255, 255));
        FemaleRBtn.setText("Female");
        FemaleRBtn.setContentAreaFilled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 60, 0, 0);
        add(FemaleRBtn, gridBagConstraints);

        AddressLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        AddressLbl.setForeground(new java.awt.Color(255, 255, 255));
        AddressLbl.setText("Address");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 67, 0, 0);
        add(AddressLbl, gridBagConstraints);

        AddressTxt.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        AddressTxt.setMaximumSize(new java.awt.Dimension(200, 29));
        AddressTxt.setMinimumSize(new java.awt.Dimension(200, 29));
        AddressTxt.setPreferredSize(new java.awt.Dimension(200, 29));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 15, 0, 0);
        add(AddressTxt, gridBagConstraints);

        DangLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        DangLbl.setForeground(new java.awt.Color(255, 255, 255));
        DangLbl.setText("Dangerous level");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 50, 0, 0);
        add(DangLbl, gridBagConstraints);

        DangCBox.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        DangCBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Low", "Moderate", "High", "Very High" }));
        DangCBox.setMaximumSize(new java.awt.Dimension(200, 29));
        DangCBox.setMinimumSize(new java.awt.Dimension(200, 29));
        DangCBox.setPreferredSize(new java.awt.Dimension(200, 29));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 19;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 22, 0, 65);
        add(DangCBox, gridBagConstraints);

        LocLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        LocLbl.setForeground(new java.awt.Color(255, 255, 255));
        LocLbl.setText("Current Location");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 44, 0, 0);
        add(LocLbl, gridBagConstraints);

        LocTxt.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        LocTxt.setMaximumSize(new java.awt.Dimension(200, 29));
        LocTxt.setMinimumSize(new java.awt.Dimension(200, 29));
        LocTxt.setPreferredSize(new java.awt.Dimension(200, 29));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 19;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 16, 0, 0);
        add(LocTxt, gridBagConstraints);

        AddCaseBtn.setBackground(new java.awt.Color(102, 252, 241));
        AddCaseBtn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        AddCaseBtn.setText("Add to case");
        AddCaseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCaseBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 49;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(63, 97, 0, 0);
        add(AddCaseBtn, gridBagConstraints);

        CloseBtn.setBackground(new java.awt.Color(102, 252, 241));
        CloseBtn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        CloseBtn.setText("Close");
        CloseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 113;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 97, 13, 0);
        add(CloseBtn, gridBagConstraints);

        BDateTxt.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        BDateTxt.setMinimumSize(new java.awt.Dimension(200, 29));
        BDateTxt.setPreferredSize(new java.awt.Dimension(200, 29));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 18, 0, 0);
        add(BDateTxt, gridBagConstraints);

        AddressLbl1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        AddressLbl1.setForeground(new java.awt.Color(255, 255, 255));
        AddressLbl1.setText("Phone Number");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 50, 0, 0);
        add(AddressLbl1, gridBagConstraints);

        phoneTxt1.setColumns(10);
        phoneTxt1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        phoneTxt1.setMaximumSize(new java.awt.Dimension(200, 29));
        phoneTxt1.setMinimumSize(new java.awt.Dimension(200, 29));
        phoneTxt1.setPreferredSize(new java.awt.Dimension(200, 29));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 19;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 22, 0, 0);
        add(phoneTxt1, gridBagConstraints);

        DangLbl1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        DangLbl1.setForeground(new java.awt.Color(255, 255, 255));
        DangLbl1.setText("Status");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(36, 64, 0, 0);
        add(DangLbl1, gridBagConstraints);

        StatCBox.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        StatCBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Arrested", "Not Arrested" }));
        StatCBox.setMaximumSize(new java.awt.Dimension(200, 29));
        StatCBox.setMinimumSize(new java.awt.Dimension(200, 29));
        StatCBox.setPreferredSize(new java.awt.Dimension(200, 29));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 15, 0, 0);
        add(StatCBox, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void AddCaseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCaseBtnActionPerformed
        String criminal_name=NameTxt.getText();
        String gender="";
        if (FemaleRBtn.isSelected())
        {
           gender=FemaleRBtn.getText();
        }  
        if (MaleRBtn.isSelected())
        {
            gender=MaleRBtn.getText();
        }
        Date date=date=BDateTxt.getDate();
        SimpleDateFormat d_f=new SimpleDateFormat("dd/MM/Y");
        String b_date=d_f.format(date);
        String current_location=LocTxt.getText();
        String address=AddressTxt.getText();
        String dangerous_level=DangCBox.getSelectedItem().toString();
        String phone=phoneTxt1.getText();
        String status = StatCBox.getSelectedItem().toString();
        ArrayList<Integer>cases=new ArrayList<>();
        Criminal criminal=new Criminal(Integer.valueOf(criminal_id),criminal_name,gender,b_date,address,phone,current_location,dangerous_level,status,cases);
        NowOff.add_criminal(criminal,case_id);
        CasesList.get(case_id-1).setCriminal_List(criminal_id);
        CriminalList.get(criminal_id-1).setCases(case_id);
        //addCr = new AddCriminal();
        Fcase = new DisFullCase(case_id);
        JFrame f=new JFrame();  
        JOptionPane.showMessageDialog(f,"Criminal is added to the case");
        this.setVisible(false);
        this.getParent().setLayout(b);
        this.getParent().add(Fcase);
        OfficerForm.HomeBtn.setVisible(true);
        Fcase.setVisible(true);
    }//GEN-LAST:event_AddCaseBtnActionPerformed

    private void CloseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseBtnActionPerformed
        addCr = new AddCriminal(case_id);
        this.setVisible(false);
        this.getParent().setLayout(b);
        this.getParent().add(addCr);
        addCr.setVisible(true);
    }//GEN-LAST:event_CloseBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton AddCaseBtn;
    private javax.swing.JLabel AddressLbl;
    private javax.swing.JLabel AddressLbl1;
    private javax.swing.JTextField AddressTxt;
    private javax.swing.JLabel BDateLbl;
    private com.toedter.calendar.JDateChooser BDateTxt;
    protected javax.swing.JButton CloseBtn;
    private javax.swing.JComboBox DangCBox;
    private javax.swing.JLabel DangLbl;
    private javax.swing.JLabel DangLbl1;
    private javax.swing.JRadioButton FemaleRBtn;
    private javax.swing.JLabel GenderLbl;
    private javax.swing.JLabel IDLbl;
    private javax.swing.JTextField IDTxt;
    private javax.swing.JLabel LocLbl;
    private javax.swing.JTextField LocTxt;
    private javax.swing.JRadioButton MaleRBtn;
    private javax.swing.JLabel NameLbl;
    private javax.swing.JTextField NameTxt;
    private javax.swing.JComboBox StatCBox;
    private javax.swing.JTextField phoneTxt1;
    // End of variables declaration//GEN-END:variables
}
