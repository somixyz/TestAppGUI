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
        if (username.isEmpty())
            throw new Exception("Empty text / insert username");
         
        String password = jPasswordField.getText();
        if (password.isEmpty())
            throw new Exception("Empty text / insert password ");
        return validirajPodatkeIzBaze(username, password);
    }  
    private boolean validirajPodatkeIzBaze(String username, String password) {
      return getInstance().repozitorijumAdmin.proveriUBazi(username, password); 
    }
    
}
