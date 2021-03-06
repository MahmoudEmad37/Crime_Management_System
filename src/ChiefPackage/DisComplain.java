package ChiefPackage;

import Classes.Cheif;
import static LoginPackage.LoginForm.ComplainList;
import static LoginPackage.LoginForm.OfficersList;
import static LoginPackage.LoginForm.chief;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DisComplain extends javax.swing.JPanel {
    
    
    public DisComplain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NumCasLbl = new javax.swing.JLabel();
        IDLbl = new javax.swing.JLabel();
        IDTxt = new javax.swing.JTextField();
        DepLbl = new javax.swing.JLabel();
        NameLbl = new javax.swing.JLabel();
        DepTxt = new javax.swing.JTextField();
        NameTxt = new javax.swing.JTextField();
        RateLbl = new javax.swing.JLabel();
        RateTxt = new javax.swing.JTextField();
        StatLbl = new javax.swing.JLabel();
        StatTxt = new javax.swing.JTextField();
        FireBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        RejBtn = new javax.swing.JButton();
        WarningBtn = new javax.swing.JButton();
        DateLbl = new javax.swing.JLabel();
        DateTxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(31, 40, 51));

        NumCasLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        NumCasLbl.setForeground(new java.awt.Color(255, 255, 255));
        NumCasLbl.setText("Reason of complain");

        IDLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        IDLbl.setForeground(new java.awt.Color(255, 255, 255));
        IDLbl.setText("Complain ID");

        IDTxt.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        IDTxt.setForeground(new java.awt.Color(51, 0, 51));
        IDTxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        IDTxt.setEnabled(false);

        DepLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        DepLbl.setForeground(new java.awt.Color(255, 255, 255));
        DepLbl.setText("Department");

        NameLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        NameLbl.setForeground(new java.awt.Color(255, 255, 255));
        NameLbl.setText("Name");

        DepTxt.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        DepTxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        DepTxt.setEnabled(false);

        NameTxt.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        NameTxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        NameTxt.setEnabled(false);

        RateLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        RateLbl.setForeground(new java.awt.Color(255, 255, 255));
        RateLbl.setText("Evaluation");

        RateTxt.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        RateTxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        RateTxt.setEnabled(false);

        StatLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        StatLbl.setForeground(new java.awt.Color(255, 255, 255));
        StatLbl.setText("Officer ID");

        StatTxt.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        StatTxt.setForeground(new java.awt.Color(51, 0, 51));
        StatTxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        StatTxt.setEnabled(false);

        FireBtn.setBackground(new java.awt.Color(255, 51, 51));
        FireBtn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        FireBtn.setText("Fire");
        FireBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FireBtnActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        RejBtn.setBackground(new java.awt.Color(102, 252, 241));
        RejBtn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        RejBtn.setText("Reject");
        RejBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        RejBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RejBtnActionPerformed(evt);
            }
        });

        WarningBtn.setBackground(new java.awt.Color(255, 255, 102));
        WarningBtn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        WarningBtn.setText("Warning");
        WarningBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        WarningBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WarningBtnActionPerformed(evt);
            }
        });

        DateLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        DateLbl.setForeground(new java.awt.Color(255, 255, 255));
        DateLbl.setText("Complain Date");

        DateTxt.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        DateTxt.setForeground(new java.awt.Color(51, 0, 51));
        DateTxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        DateTxt.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RateLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NameLbl)
                            .addComponent(IDLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DepLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DepTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(StatLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(StatTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NumCasLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(RejBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(WarningBtn)
                        .addGap(65, 65, 65)
                        .addComponent(FireBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(DateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IDLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(StatTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StatLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DepLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DepTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumCasLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FireBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RejBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WarningBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        NumCasLbl.getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    //Pass Button
    private void RejBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RejBtnActionPerformed
        // TODO add your handling code here:
        JFrame f = new JFrame();  
         int a = JOptionPane.showConfirmDialog(f, "Are you sure ?","Select an option",JOptionPane.YES_NO_OPTION); 
         if(a == JOptionPane.YES_OPTION)
         {  
            for (int i=0; i<OfficersList.size(); i++)
            {
                int isID = Integer.valueOf(StatTxt.getText());
                if (isID == OfficersList.get(i).getID())
                {
                    int CompID = Integer.valueOf(IDTxt.getText());
                    chief.complain_respond("Reject", OfficersList.get(i), CompID);
                    OfficersList.get(i).calc_eval(isID, -1);
                }
            }
            
            this.setVisible(false);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         }
         else
         {
              f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         }
    }//GEN-LAST:event_RejBtnActionPerformed

    //Warning Button
    private void WarningBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WarningBtnActionPerformed
        // TODO add your handling code here:
        JFrame f = new JFrame();  
         int a = JOptionPane.showConfirmDialog(f, "Are you sure ?","Select an option",JOptionPane.YES_NO_OPTION); 
         if(a == JOptionPane.YES_OPTION)
         {  for (int i=0; i<OfficersList.size(); i++)
            {
                int isID = Integer.valueOf(StatTxt.getText());
                if (isID == OfficersList.get(i).getID())
                {
                    int CompID = Integer.valueOf(IDTxt.getText());
                    OfficersList.get(i).setStatus("Warned");
                    chief.complain_respond("Warning", OfficersList.get(i), CompID);
                    OfficersList.get(i).calc_eval(isID, -3);
                }
            }
            this.setVisible(false);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
         }
         else
         {
             f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
         }
    }//GEN-LAST:event_WarningBtnActionPerformed

    //Fire Button
    private void FireBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FireBtnActionPerformed
        // TODO add your handling code here:
        JFrame f = new JFrame();  
         int a = JOptionPane.showConfirmDialog(f, "Are you sure ?","Select an option",JOptionPane.YES_NO_OPTION); 
         if(a == JOptionPane.YES_OPTION)
         {  
             for (int i=0; i<OfficersList.size(); i++)
            {
                int isID = Integer.valueOf(StatTxt.getText());
                if (isID == OfficersList.get(i).getID())
                {
                    int CompID = Integer.valueOf(IDTxt.getText());
                    OfficersList.get(i).setStatus("Fired");
                    chief.complain_respond("Fired", OfficersList.get(i), CompID);
                }
            }
             this.setVisible(false);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
         }
         else
         {
             f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
         }
    }//GEN-LAST:event_FireBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DateLbl;
    protected javax.swing.JTextField DateTxt;
    private javax.swing.JLabel DepLbl;
    protected javax.swing.JTextField DepTxt;
    private javax.swing.JButton FireBtn;
    private javax.swing.JLabel IDLbl;
    protected javax.swing.JTextField IDTxt;
    private javax.swing.JLabel NameLbl;
    protected javax.swing.JTextField NameTxt;
    private javax.swing.JLabel NumCasLbl;
    private javax.swing.JLabel RateLbl;
    protected javax.swing.JTextField RateTxt;
    private javax.swing.JButton RejBtn;
    private javax.swing.JLabel StatLbl;
    protected javax.swing.JTextField StatTxt;
    private javax.swing.JButton WarningBtn;
    private javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
