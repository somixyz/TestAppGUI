/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui.tabel_model;

import domen.Osoba;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Milos Dragovic
 */
public class TableModelOsoba extends AbstractTableModel {
    private List<Osoba> osobe;
    private String[] columnName = new String[] {"Ime", "Prezime", "DatumRodjenja", "pol"};
    public TableModelOsoba(List<Osoba> osobe){
        this.osobe = osobe;
    }
    @Override
    public int getRowCount() {
        
        return (osobe == null)?  0 : osobe.size();
    }

    @Override
    public String getColumnName(int column) {
        return columnName[column];
    }
    
    @Override
    public int getColumnCount() {
        return columnName.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Osoba osoba =osobe.get(rowIndex);
        switch(columnIndex){
            case 0: return osoba.getIme();
            case 1: return osoba.getPrezime();
            case 2: return osoba.getDatumRodjenja();
            case 3: return osoba.getPol();
            default: return null;
        
    }
    }
}
