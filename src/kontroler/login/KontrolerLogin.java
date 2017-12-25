/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler.login;

import domen_admin.db.RepozitorijumAdmin;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Milos Dragovic
 */
public class KontrolerLogin {

    private static KontrolerLogin kontrolerAdmin;
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
            throw new Exception("Empty string / username");
        } else {
            //            setLabelErrorUserName("");
            
        }
        String password = jPasswordField.getText();
        if (password.isEmpty()) { 
//            setLabelErrorPassword("Enter value");
            throw new Exception("Empty string / password ");
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
      return getInstance().repozitorijumAdmin.proveriUBazi(username, password); 
    }
    
}
