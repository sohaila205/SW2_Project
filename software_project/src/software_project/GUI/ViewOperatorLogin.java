/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package software_project.GUI;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import software_project.Controller.LoginAdmin;

/**
 *
 * @author ALMASA
 */
public class ViewOperatorLogin extends javax.swing.JFrame {

    /**
     * Creates new form OperatorLogin
     */
    public ViewOperatorLogin() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        PasswordOperator = new javax.swing.JPasswordField();
        CheckShowPasswordOperator = new javax.swing.JCheckBox();
        LoginOperator = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Operator Login");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("User Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Password");

        UserName.setBackground(new java.awt.Color(153, 153, 153));
        UserName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        UserName.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        UserName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        UserName.setSelectionColor(new java.awt.Color(255, 255, 255));

        PasswordOperator.setBackground(new java.awt.Color(153, 153, 153));
        PasswordOperator.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        PasswordOperator.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        PasswordOperator.setMargin(new java.awt.Insets(2, 1, 2, 1));
        PasswordOperator.setSelectionColor(new java.awt.Color(255, 255, 255));
        PasswordOperator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordOperatorActionPerformed(evt);
            }
        });

        CheckShowPasswordOperator.setBackground(new java.awt.Color(153, 153, 153));
        CheckShowPasswordOperator.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        CheckShowPasswordOperator.setForeground(new java.awt.Color(0, 102, 102));
        CheckShowPasswordOperator.setText("Show Password");
        CheckShowPasswordOperator.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        CheckShowPasswordOperator.setDisplayedMnemonicIndex(1);
        CheckShowPasswordOperator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckShowPasswordOperatorActionPerformed(evt);
            }
        });

        LoginOperator.setBackground(new java.awt.Color(0, 102, 102));
        LoginOperator.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        LoginOperator.setForeground(new java.awt.Color(255, 255, 255));
        LoginOperator.setText("Login");
        LoginOperator.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LoginOperator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginOperatorActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(0, 102, 102));
        back.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CheckShowPasswordOperator)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PasswordOperator, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(LoginOperator, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PasswordOperator, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(28, 28, 28)
                        .addComponent(CheckShowPasswordOperator)
                        .addGap(27, 27, 27)
                        .addComponent(LoginOperator, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 26, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PasswordOperatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordOperatorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordOperatorActionPerformed

    private void CheckShowPasswordOperatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckShowPasswordOperatorActionPerformed
        // TODO add your handling code here:
        if(CheckShowPasswordOperator.isSelected()){
            PasswordOperator.setEchoChar((char)0);
        }
        else
        PasswordOperator.setEchoChar('*');
    }//GEN-LAST:event_CheckShowPasswordOperatorActionPerformed

    private void LoginOperatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginOperatorActionPerformed
        // TODO add your handling code here:
        String UserNameOperator = UserName.getText();
        String passwordOperator = PasswordOperator.getText();
        
        LoginAdmin OperatorLogined = new LoginAdmin();
        //String UserOperator = "operator";
       
        boolean CheckOperator = false;
        CheckOperator = OperatorLogined.login(UserNameOperator, passwordOperator);
        
        if (CheckOperator) {
            JOptionPane.showMessageDialog(null ,  "Welcome " + UserName.getText(), "Successful Login",JOptionPane.PLAIN_MESSAGE );
            ViewOperatorLogin Operator = new ViewOperatorLogin();
            Operator.setLocation(400, 200);
            Operator.setVisible(true);
            this.dispose();
            new Operator_functions().setVisible(true);
        } else
            JOptionPane.showMessageDialog(null, "Invalid User Name or Invalid Password", "Login Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_LoginOperatorActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        MainLogin elc = new MainLogin();
        elc.setLocation(400, 200);
        elc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(ViewOperatorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewOperatorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewOperatorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewOperatorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewOperatorLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckShowPasswordOperator;
    private javax.swing.JButton LoginOperator;
    private javax.swing.JPasswordField PasswordOperator;
    private javax.swing.JTextField UserName;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
