package OfficerPackage;

import java.awt.FlowLayout;
import static LoginPackage.LoginForm.*;
import javax.swing.DefaultListModel;

public class SolvedCase extends javax.swing.JPanel {

    DisCaseOff casee;
    
    private void Panels()
    {
        ScroolPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        for (int i = 0; i < CasesList.size(); i++)
        {
            if(!(CasesList.get(i).getStatus().equals("Investigating"))&&CasesList.get(i).getOfficer_list().size()==2)
            {
                if (CasesList.get(i).getOfficer_list().get(0)==NowOff.getID()||CasesList.get(i).getOfficer_list().get(1)==NowOff.getID()) 
                {
                    casee = new DisCaseOff();
                    casee.IDTxt.setText(String.valueOf(CasesList.get(i).getCase_ID()));
                    casee.SDateTxt.setText(CasesList.get(i).getStart_date());
                    casee.UDateTxt.setText(CasesList.get(i).getLast_update_date());
                    casee.CTypeTxt.setText(CasesList.get(i).getType());
                    casee.StatTxt.setText(CasesList.get(i).getStatus());
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
                    casee.ViewBtn.setVisible(false);
                    ScroolPanel.add(casee);
                }
            }
        }
    }
    
    public SolvedCase() {
        initComponents();
        Panels();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ScroolPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(31, 40, 51));

        ScroolPanel.setBackground(new java.awt.Color(11, 12, 16));

        javax.swing.GroupLayout ScroolPanelLayout = new javax.swing.GroupLayout(ScroolPanel);
        ScroolPanel.setLayout(ScroolPanelLayout);
        ScroolPanelLayout.setHorizontalGroup(
            ScroolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1220, Short.MAX_VALUE)
        );
        ScroolPanelLayout.setVerticalGroup(
            ScroolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(ScroolPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ScroolPanel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}