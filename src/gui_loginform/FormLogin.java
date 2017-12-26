/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_loginform;

import gui.FormGlavna;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import kontroler.login.KontrolerLogin;
import start.Start;

/**
 *
 * @author acer e1
 */
public class FormLogin extends javax.swing.JFrame {

    /**
     * Creates new form FormLogin
     */
    public FormLogin() {
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

        jTextUserName = new javax.swing.JTextField();
        jLabelUserName = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jlblErrorUsername = new javax.swing.JLabel();
        jlblErrorPassword = new javax.swing.JLabel();
        jbtnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login forma");
        setBackground(new java.awt.Color(255, 0, 0));
        setForeground(new java.awt.Color(255, 0, 0));
        setPreferredSize(new java.awt.Dimension(450, 350));
        setResizable(false);

        jLabelUserName.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        jLabelUserName.setText("Username :");

        jLabelPassword.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        jLabelPassword.setText("Password :");

        jButtonLogin.setFont(new java.awt.Font("Simplified Arabic", 1, 18)); // NOI18N
        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        jlblErrorUsername.setText(" ");

        jlblErrorPassword.setText(" ");

        jbtnExit.setFont(new java.awt.Font("Simplified Arabic", 1, 18)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelUserName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelPassword)
                                .addGap(2, 2, 2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jlblErrorUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                .addComponent(jlblErrorPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jTextUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(jPasswordField))
                        .addGap(10, 10, 10)))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblErrorUsername)
                        .addGap(10, 10, 10)
                        .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelUserName)
                        .addGap(30, 30, 30)
                        .addComponent(jLabelPassword)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlblErrorPassword)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        //ovako sa unesenim vrednostima se pokrece
//        String username = jTextUserName.getText();
//        String pass = jPasswordField.getText();
//        if (username.equals("Milos") && pass.equals("123")) {
//            
//            Thread trd = new Thread() {
//                @Override
//                public void run() {
//                    JFrame forma = new FormGlavna();
//                    forma.setVisible(true);
//                }
//            };
//            trd.run();
//        } else {
//            jTextUserName.setText(null);
//            jPasswordField.setText(null);
//            JOptionPane.showMessageDialog(null, "Invalid login message", "Login Error", JOptionPane.ERROR_MESSAGE, new ImageIcon("C:\\Users\\acer e1\\Documents\\NetBeansProjects\\GUIApp\\src\\image\\Error.png"));
//        }
        
        try {
            if (KontrolerLogin.getInstance().proveriPodatke(jTextUserName, jPasswordField)) {
                new Thread() {
                @Override
                public void run() {
                    JOptionPane.showConfirmDialog(null, "Login succesfully", "Login", JOptionPane.DEFAULT_OPTION);
                    Start.formaLogin.setVisible(false);
                    new FormGlavna().setVisible(true); 
                } }.start();  
            }else {JOptionPane.showMessageDialog(null, "Invalid login data (username/password)", "Login Error", JOptionPane.ERROR_MESSAGE, 
                   //PROMELJIVA RUTA !!!!!
                    new ImageIcon("C:\\Users\\acer e1\\Documents\\NetBeansProjects\\GUIApp\\src\\image\\Error.png"));}
        } catch (Exception ex) {
            ex.getMessage(); 
            if(ex.getMessage().contains("password")) { formjlblErrorPassword(ex.getMessage());}  else { formjlblErrorUsername(ex.getMessage());} 
        }

    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbtnExitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextUserName;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JLabel jlblErrorPassword;
    private javax.swing.JLabel jlblErrorUsername;
    // End of variables declaration//GEN-END:variables

    private void formjlblErrorUsername(String enter_value) {
        jlblErrorUsername.setText(enter_value);
    }
    private void formjlblErrorPassword(String enter_value) {
        jlblErrorPassword.setText(enter_value);
    }
}
