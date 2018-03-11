/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lili
 */
public class CarteDeTelefon extends AbstractTableModel {

    private List<Abonat> abonati = new ArrayList<Abonat>();
    private String[] coloane = {"Nr. ", "Nume", "Prenume", "CNP", "Nr. de telefon"};

    public List<Abonat> getAbonati() {
        return abonati;
    }

    public void seteazaAbonati(List<Abonat> abonati) {
        this.abonati = abonati;
        fireTableDataChanged();
    }

    public void adaugaAbonat(Abonat a) {
        abonati.add(a);

        int lastRowIndex = abonati.size() - 1;
        fireTableRowsInserted(lastRowIndex, lastRowIndex);
    }

    public void removeAbonat(int index) {
        abonati.remove(index);
        fireTableRowsDeleted(index, index);
    }

    @Override
    public int getColumnCount() {
        return coloane.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return coloane[columnIndex];
    }

    @Override
    public int getRowCount() {
        return abonati.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String fieldValue = "";
        if (rowIndex < abonati.size()) {
            Abonat abonat = abonati.get(rowIndex);
            switch (columnIndex) {
                case 0: // Nr
                    fieldValue = String.valueOf(rowIndex + 1);
                    break;
                case 1: // Nume
                    fieldValue = abonat.getNume();
                    break;
                case 2: // Prenume
                    fieldValue = abonat.getPrenume();
                    break;
                case 3: // CNP
                    fieldValue = abonat.getCnp();
                    break;
                case 4: // Nr de telefon
                    fieldValue = abonat.getTelefon();
                    break;
            }
        }
        return fieldValue;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0: // Nr
                return false;
            default:
                return true;
        }
    }

    @Override
    public void setValueAt(Object editare, int rowIndex, int columnIndex) {
        try
        {
            Abonat abonat = abonati.get(rowIndex);
            switch (columnIndex) {
                case 0: // Nr
                    //
                    break;
                case 1: // Nume
                    abonat.setNume((String) editare);
                    break;
                case 2: // Prenume
                    abonat.setPrenume((String) editare);
                    break;
                case 3: // CNP
                    abonat.setCNP((String) editare);
                    break;
                case 4: // Nr de telefon                
                    abonat.setTelefon((String) editare);
                    break;
            }
            fireTableCellUpdated(rowIndex, columnIndex);
        }
        catch(Exception e)
        {
            InterfataGrafica.ShowAbonatEditErrorMessage(e);
        }
    }

    /*
    public void fireTableCellUpdated(int row, int column) {
        fireTableChanged(new TableModelEvent(this, row, row, column));
    }
     */
}
