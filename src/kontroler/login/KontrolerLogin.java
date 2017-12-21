/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler.login;

import domen_admin.Admin;
import gui_loginform.FormLogin;
import domen_admin.db.RepozitorijumAdmin;
import java.util.Arrays;
import java.util.List;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Milos Dragovic
 */
public class KontrolerLogin {

    public static KontrolerLogin kontrolerAdmin;
    private final RepozitorijumAdmin repozitorijumAdmin;

    private KontrolerLogin() {
        repozitorijumAdmin = new RepozitorijumAdmin();
    }

    public static KontrolerLogin getInstance() {
        if (kontrolerAdmin == null) return new KontrolerLogin();
        return kontrolerAdmin;
    }

    public boolean proveriPodatke(JTextField jTextUserName, JPasswordField jPasswordField) throws Exception {
        String username = jTextUserName.getText().trim();
        if (username.isEmpty()) {
//            setLabelErrorUserName("Enter value");
            throw new Exception("Empty string");
        } else {
            //            setLabelErrorUserName("");
            
        }
        String password = Arrays.toString(jPasswordField.getPassword());
        if (password.isEmpty()) {
//            setLabelErrorPassword("Enter value");
            throw new Exception("Empty string");
        } else {
//            setLabelErrorPassword("");
        }
        return validirajPodatkeIzBaze(username, password);
    }
//    private void setLabelErrorUserName(String enter_value) {
//         formjlblErrorUsername(enter_value);
//    }
//
//    private void setLabelErrorPassword(String enter_value) {
//        formjlblErrorPassword.setText(enter_value);
//    }
//   }

    private boolean validirajPodatkeIzBaze(String username, String password) {
      return repozitorijumAdmin.proveriUBazi(username, password); 
    }
    
}
