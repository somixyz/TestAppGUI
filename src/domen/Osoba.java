/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.util.Date;

/**
 *
 * @author Milos Dragovic
 */
public class Osoba {

    private String ime;
    private String prezime;
    private Date datumRodjenja;
    private EnumPol pol;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Date getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(Date datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public EnumPol getPol() {
        return pol;
    }

    public void setPol(EnumPol pol) {
        this.pol = pol;
    }

    @Override
    public String toString() {
        return String.format("%20s %20s", getIme(), getPrezime());
    }

}
