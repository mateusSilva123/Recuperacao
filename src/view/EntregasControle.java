/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import hibernate.MslfEntregas;
import javax.swing.table.AbstractTableModel;
import java.util.List;
/**
 *
 * @author dfdfdfdfd
 */
public class EntregasControle extends AbstractTableModel {
private List lista;

public void setList(List lista){
this.lista=lista;
}
public  void setlist(List lista){
this.lista = lista;
}

public MslfEntregas getbean(int linha){
return (MslfEntregas) lista.get(linha);
}
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
      return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        MslfEntregas entregas = (MslfEntregas) lista.get(rowIndex);
      if (columnIndex == 0) {
             return entregas.getMslfIdEntregas();
        }
        if (columnIndex == 1) {
             return entregas.getMslfEndereco();
        }
        if (columnIndex == 2) {
             return entregas.getMslfVendedor();
        }
        if (columnIndex == 3) {
             return entregas.getMslfCliente();
        
        }
       return null;
    }
    @Override
    public String getColumnName(int columnIndex){
        if (columnIndex == 0) {
             return "ID";
        }
        if (columnIndex == 1) {
             return "Endereço";
        }
        if (columnIndex == 2) {
             return "Vendedor";
        }
        if (columnIndex == 3) {
             return "Cliente";
        }
       
    return null;
    }
}
