/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repozitorijum;

import domen.Osoba;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Milos Dragovic
 */
public class RepozitorijumOsoba {

    List<Osoba> osobe; 
    public RepozitorijumOsoba() {
        osobe = new ArrayList<>();
    } 
    public void dodajOsobu(Osoba osoba) {
        osobe.add(osoba);
    }
    public List<Osoba> vratiOsobe(){
        return osobe;
    } 
}
