/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen_admin.db;

import domen_admin.Admin;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Milos Dragovic
 */
public class RepozitorijumAdmin {

    private List<Admin> admini;

    public RepozitorijumAdmin() {
        admini = new LinkedList<>();
        admini.add(new Admin("Milos", "123"));
        admini.add(new Admin("Pera", "123"));
        admini.add(new Admin("Mika", "123"));
    }

    public List<Admin> vratiAdmine() {
        return admini;
    }

}
