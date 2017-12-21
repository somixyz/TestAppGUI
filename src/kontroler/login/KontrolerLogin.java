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

    public static KontrolerLogin kontrolerAdmin = new KontrolerLogin();
    private final RepozitorijumAdmin repozitorijumAdmin;

    private KontrolerLogin() {
        repozitorijumAdmin = new RepozitorijumAdmin();
    }
//    public static KontrolerLogin getInstance(){
//        if(kontrolerAdmin==null) return new KontrolerLogin();
//        return kontrolerAdmin;
//    }
     public void pokupiPodatke(JTextField jTextUserName, JPasswordField jPasswordField) throws Exception{
        String username = jTextUserName.getText().trim();
        if (username.isEmpty()) {
            setLabelErrorUserName("Enter value");
            throw new Exception("Empty string");
        } else {
            setLabelErrorUserName("");
        }
        String password = jPasswordField.getPassword().toString();
        if (password.isEmpty()) {
            setLabelErrorPassword("Enter value");
            throw new Exception("Empty string");
        } else {
            setLabelErrorPassword("");
    }

    private void setLabelErrorUserName(String enter_value) {
        String a = formjlblErrorUsername.setText(enter_value);
    }

    private void setLabelErrorPassword(String enter_value) {
        formjlblErrorPassword.setText(enter_value);
    }
   
}
