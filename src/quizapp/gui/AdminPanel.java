/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.gui;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import quizapp.pojo.User;
import quizapp.pojo.UserProfile;

/**
 *
 * @author jp
 */
public class AdminPanel extends javax.swing.JFrame {
    
    public AdminPanel() {
        initComponents();
       
        txtHelloMsg.setText("Hello "+UserProfile.getUsername());
        super.setLocationRelativeTo(null);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jrbSetPaper = new javax.swing.JRadioButton();
        jrbEditPaper = new javax.swing.JRadioButton();
        jrbRegisterStudent = new javax.swing.JRadioButton();
        jrbViewScore = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        btntxtLogout = new javax.swing.JLabel();
        txtHelloMsg = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(52, 137, 223));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Administration Panel");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Make a Choice");

        jrbSetPaper.setBackground(new java.awt.Color(52, 137, 223));
        buttonGroup1.add(jrbSetPaper);
        jrbSetPaper.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbSetPaper.setForeground(new java.awt.Color(255, 255, 255));
        jrbSetPaper.setText("Set a Paper");
        jrbSetPaper.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jrbEditPaper.setBackground(new java.awt.Color(52, 137, 223));
        buttonGroup1.add(jrbEditPaper);
        jrbEditPaper.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbEditPaper.setForeground(new java.awt.Color(255, 255, 255));
        jrbEditPaper.setText("Edit Paper");
        jrbEditPaper.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jrbEditPaper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbEditPaperActionPerformed(evt);
            }
        });

        jrbRegisterStudent.setBackground(new java.awt.Color(52, 137, 223));
        buttonGroup1.add(jrbRegisterStudent);
        jrbRegisterStudent.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbRegisterStudent.setForeground(new java.awt.Color(255, 255, 255));
        jrbRegisterStudent.setText("Register Student");
        jrbRegisterStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jrbViewScore.setBackground(new java.awt.Color(52, 137, 223));
        buttonGroup1.add(jrbViewScore);
        jrbViewScore.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbViewScore.setForeground(new java.awt.Color(255, 255, 255));
        jrbViewScore.setText("View Score");
        jrbViewScore.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 102));
        jButton1.setText("Do Task");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btntxtLogout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btntxtLogout.setForeground(new java.awt.Color(255, 255, 255));
        btntxtLogout.setText("LogOut");
        btntxtLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btntxtLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btntxtLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btntxtLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btntxtLogoutMouseExited(evt);
            }
        });

        txtHelloMsg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtHelloMsg.setForeground(new java.awt.Color(255, 255, 255));
        txtHelloMsg.setText("Hello ");
        txtHelloMsg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtHelloMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btntxtLogout))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbSetPaper)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrbEditPaper)
                                    .addComponent(jrbRegisterStudent)
                                    .addComponent(jrbViewScore)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 122, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntxtLogout)
                    .addComponent(txtHelloMsg))
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jrbSetPaper)
                .addGap(32, 32, 32)
                .addComponent(jrbEditPaper)
                .addGap(32, 32, 32)
                .addComponent(jrbRegisterStudent)
                .addGap(32, 32, 32)
                .addComponent(jrbViewScore)
                .addGap(45, 45, 45)
                .addComponent(jButton1)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String task=getOption();
    if(task==null){
        JOptionPane.showMessageDialog(null,"please select a option","Error",JOptionPane.ERROR_MESSAGE);
    }
    else{
        JFrame jf=null;
        if(task==jrbSetPaper.getText())
            jf=new SetPaperFrame();
        else if(task==jrbEditPaper.getText())
            jf= new EditPaperFrame();
        else if(task==jrbRegisterStudent.getText())
            jf= new RegisterStudentFrame();
        else //if(task==jrbViewScore.getText())
            jf= new ViewScoresFrame();
      /*  else
            jf=new StudentResultAnalysis();*/
        jf.setVisible(true);
        this.dispose();
        
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btntxtLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntxtLogoutMouseClicked
    UserLoginFrame userlogin=new UserLoginFrame();
    userlogin.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btntxtLogoutMouseClicked

    private void btntxtLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntxtLogoutMouseEntered
       Font f=new Font("Tahoma",Font.ITALIC,12);
       btntxtLogout.setFont(f);
    }//GEN-LAST:event_btntxtLogoutMouseEntered

    private void btntxtLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntxtLogoutMouseExited
        Font f=new Font("Tahoma",Font.BOLD,12);
       btntxtLogout.setFont(f);
    }//GEN-LAST:event_btntxtLogoutMouseExited

    private void jrbEditPaperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbEditPaperActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbEditPaperActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btntxtLogout;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton jrbEditPaper;
    private javax.swing.JRadioButton jrbRegisterStudent;
    private javax.swing.JRadioButton jrbSetPaper;
    private javax.swing.JRadioButton jrbViewScore;
    private javax.swing.JLabel txtHelloMsg;
    // End of variables declaration//GEN-END:variables

    private String getOption() {
        if(jrbSetPaper.isSelected())
            return jrbSetPaper.getText();
        else if(jrbEditPaper.isSelected())
            return jrbEditPaper.getText();
        else if(jrbRegisterStudent.isSelected())
            return jrbRegisterStudent.getText();
        else if(jrbViewScore.isSelected())
            return jrbViewScore.getText();
        
            return null;
    }
}
