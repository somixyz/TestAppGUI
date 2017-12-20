/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler;

import domen.Osoba;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import repozitorijum.RepozitorijumOsoba;

/**
 *
 * @author Milos Dragovic
 */
public class Kontroler {

    private static Kontroler kontroler;
    private final RepozitorijumOsoba repozitorijumOsoba;
    private List<JDialog> forme;

    private Kontroler() {
        repozitorijumOsoba = new RepozitorijumOsoba();
        forme = new ArrayList<>();
    }
    public static Kontroler getInstance(){
    if(kontroler==null) kontroler=new Kontroler();
    return kontroler;
    }
    public void dodajOsobu(Osoba osoba){
        repozitorijumOsoba.dodajOsobu(osoba);
        //
    }
    public List<Osoba> vratiOsobe(){
        return repozitorijumOsoba.vratiOsobe();
    }

}
