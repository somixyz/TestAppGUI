/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domen_admin;

/**
 *
 * @author Milos Dragovic
 */
public class Admin {

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    private String userName;
    private String password;
    
    public Admin(String username, String password){
        this.userName = username;
        this.password = password;
    }
}
