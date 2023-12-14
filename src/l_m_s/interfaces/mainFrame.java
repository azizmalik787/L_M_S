/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l_m_s.interfaces;
import l_m_s.classes.Admin;

import java.util.ArrayList;

/**
 *
 * @author azizm
 */
public class mainFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainFrame
     */
   
    public mainFrame() {
        initComponents();
        Admin a = Admin.getinstance();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        admTextField = new javax.swing.JTextField();
        teacherTextField = new javax.swing.JTextField();
        studentTextField = new javax.swing.JTextField();
        adminLoginButton = new javax.swing.JButton();
        teacherLoginButton = new javax.swing.JButton();
        studentLoginButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        adminPassTF = new javax.swing.JPasswordField();
        teacherpassTF = new javax.swing.JPasswordField();
        studentpassTF = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 0, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Learning Management System (LMS)");

        jLabel2.setText("Admin Id");

        jLabel3.setText("Teacher Id");

        jLabel4.setText("Student Roll Number");

        admTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admTextFieldActionPerformed(evt);
            }
        });
        admTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                admTextFieldKeyTyped(evt);
            }
        });

        teacherTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherTextFieldActionPerformed(evt);
            }
        });
        teacherTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                teacherTextFieldKeyTyped(evt);
            }
        });

        studentTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                studentTextFieldKeyTyped(evt);
            }
        });

        adminLoginButton.setText("Login");
        adminLoginButton.setEnabled(false);
        adminLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminLoginButtonActionPerformed(evt);
            }
        });
        adminLoginButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                adminLoginButtonKeyPressed(evt);
            }
        });

        teacherLoginButton.setText("Login");
        teacherLoginButton.setEnabled(false);
        teacherLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherLoginButtonActionPerformed(evt);
            }
        });

        studentLoginButton.setText("Login");
        studentLoginButton.setEnabled(false);
        studentLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentLoginButtonActionPerformed(evt);
            }
        });

        teacherpassTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherpassTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 919, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(studentpassTF, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(teacherpassTF, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(teacherTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                                        .addComponent(studentTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(adminPassTF, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(admTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)))
                                .addGap(145, 145, 145)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(adminLoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(teacherLoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(studentLoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 190, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminLoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(admTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(adminPassTF, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(teacherLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(teacherTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(teacherpassTF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(studentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(studentpassTF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(studentLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84)))
                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void admTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admTextFieldActionPerformed

    private void teacherTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherTextFieldActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_teacherTextFieldActionPerformed

    private void adminLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminLoginButtonActionPerformed
        // TODO add your handling code here:
        Admin a = Admin.getinstance();
        int id = Integer.parseInt(admTextField.getText());
        if(a.isValidAdmin(id,adminPassTF.getText()))
        {
            adminFrame afr = new adminFrame(this);
            afr.setVisible(true);
            admTextField.setText("");
            adminPassTF.setText("");
            this.setVisible(false);
        }
        else
        {
            errorLabel.setText("Invalid Admin ID");
            admTextField.setText("");
        }
        
        
    }//GEN-LAST:event_adminLoginButtonActionPerformed

    private void admTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_admTextFieldKeyTyped
        // TODO add your handling code here:
        
        adminLoginButton.setEnabled(false);
        if (admTextField.getText().equals(""))
            errorLabel.setText(""); 
        try {
            int i= Integer.parseInt(admTextField.getText());
            if(!admTextField.getText().equals(""))
                adminLoginButton.setEnabled(true);
            else
                adminLoginButton.setEnabled(false);
            errorLabel.setText("");
        } 
        catch (NumberFormatException el) {
            errorLabel.setText("Invalid entry");
        }
    }//GEN-LAST:event_admTextFieldKeyTyped

    private void teacherTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teacherTextFieldKeyTyped
        // TODO add your handling code here:
        teacherLoginButton.setEnabled(false);
        if (teacherTextField.getText().equals(""))
            errorLabel.setText(""); 
        try {
            int i= Integer.parseInt(teacherTextField.getText());
            if(!teacherTextField.getText().equals(""))
                teacherLoginButton.setEnabled(true);
            else
                teacherLoginButton.setEnabled(false);
            errorLabel.setText("");
        } 
        catch (NumberFormatException el) {
            errorLabel.setText("Invalid entry");
        }
    }//GEN-LAST:event_teacherTextFieldKeyTyped

    private void studentTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_studentTextFieldKeyTyped
        // TODO add your handling code here:
        studentLoginButton.setEnabled(false);
        if (studentTextField.getText().equals(""))
            errorLabel.setText(""); 
        try {
            int i= Integer.parseInt(studentTextField.getText());
            if(!studentTextField.getText().equals(""))
                studentLoginButton.setEnabled(true);
            else
                studentLoginButton.setEnabled(false);
            errorLabel.setText("");
        }
        catch (NumberFormatException el) {
            errorLabel.setText("Invalid entry");
        }
    }//GEN-LAST:event_studentTextFieldKeyTyped

    private void studentLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentLoginButtonActionPerformed
        // TODO add your handling code here:
       
        Admin a = Admin.getinstance();
        
        int id = Integer.parseInt(studentTextField.getText());
        if(a.isValidStudent(id,studentpassTF.getText()))
        {
            studentFrame s = new studentFrame(this, id);
            s.setVisible(true);
            studentTextField.setText("");
            studentpassTF.setText("");
            this.setVisible(false);
        }
        else
        {
            errorLabel.setText("Invalid Student ID");
            studentTextField.setText("");
        }
    }//GEN-LAST:event_studentLoginButtonActionPerformed

    private void adminLoginButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adminLoginButtonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminLoginButtonKeyPressed

    private void teacherLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherLoginButtonActionPerformed
        // TODO add your handling code here:
        Admin a = Admin.getinstance();
        
        int id = Integer.parseInt(teacherTextField.getText());
        if(a.isValidTeacher(id,teacherpassTF.getText()))
        {
            teacherFrame t = new teacherFrame(this, id);
            t.setVisible(true);
            teacherTextField.setText("");
            teacherpassTF.setText("");
            this.setVisible(false);
        }
        else
        {
            errorLabel.setText("Invalid Teacher ID");
            studentTextField.setText("");
        }
    }//GEN-LAST:event_teacherLoginButtonActionPerformed

    private void teacherpassTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherpassTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teacherpassTFActionPerformed

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
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField admTextField;
    private javax.swing.JButton adminLoginButton;
    private javax.swing.JPasswordField adminPassTF;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton studentLoginButton;
    private javax.swing.JTextField studentTextField;
    private javax.swing.JPasswordField studentpassTF;
    private javax.swing.JButton teacherLoginButton;
    private javax.swing.JTextField teacherTextField;
    private javax.swing.JPasswordField teacherpassTF;
    // End of variables declaration//GEN-END:variables
}
