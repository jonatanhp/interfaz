package igu.cliente;

import data.ClienteData;
import modelo.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Asullom
 */
public class ClientesTableModel extends AbstractTableModel {

    private List<Cliente> lis = new ArrayList();
    private String[] columns = {"#", "Nombres", "DNI"};
    private Class[] columnsType = {Integer.class, String.class, String.class};

    public ClientesTableModel() {
        lis = ClienteData.list("");
    }

    public ClientesTableModel(String filter) {

        lis = ClienteData.list(filter);
    }

   // public List<Cliente> getRegistros() {
  //      return CienteData.listCmb("");
   // }

    // public List<Cliente> getlist(String filter) {
    //    lis = CienteData.list(filter);
    //    return lis;
    // }
    @Override
    public Object getValueAt(int row, int column) {
        Cliente d = (Cliente) lis.get(row);
        switch (column) {
            case 0:
                return row + 1;
            case 1:
                return d.getNombre();
            case 2:
                return d.getDni();
            default:
                return null;
        }
    }

    /*
    @Override
    public void setValueAt(Object valor, int row, int column) {
        Cliente d = (Cliente) lis.get(row);
        switch (column) {
            
           // case 0:
           //     int id = 0;
           //     try {
            //        if (valor instanceof Number) {
           //             id = Integer.parseInt("" + valor);
           //         }
           //     } catch (NumberFormatException nfe) {
            //        System.err.println("" + nfe);
             //   }
            //    d.setId(id);
             //   break;
             
            case 1:
                d.setNombres("" + valor);
                break;
            case 2:
                d.setInfoadic("" + valor);
                break;

        }
        this.fireTableRowsUpdated(row, row);
        //fireTableCellUpdated(row, row);
    }
     */
    @Override
    public boolean isCellEditable(int row, int column) {
        //Cliente c = (Cliente) lis.get(row);
        if (column >= 0 && column != 0) {
            //return true;
        }
        return false;//bloquear edicion
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public Class getColumnClass(int column) {
        return columnsType[column];
    }

    @Override
    public int getRowCount() {
        return lis.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    public void addRow(Cliente d) { // con db no se usa
        this.lis.add(d);
        //this.fireTableDataChanged();
        this.fireTableRowsInserted(lis.size(), lis.size());
    }

    public void removeRow(int linha) { // con db no se usa
        this.lis.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }

    public Object getRow(int row) { // usado para paintForm
        this.fireTableRowsUpdated(row, row);
        return lis.get(row);
    }

}
