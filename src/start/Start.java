/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

import gui.FormGlavna;
import gui_loginform.FormLogin;
import javax.swing.JFrame;

/**
 *
 * @author Milos Dragovic
 */
public class Start {

    public static JFrame formaLogin;
    public static void main(String[] args) {
        Start.formaLogin = new FormLogin();
        formaLogin.setVisible(true);
    }
}
