/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import hibernate.MslfVendas;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u13766540670
 */
public class VendasController extends AbstractTableModel{
    
    List lista;
    
    public void setList(List lista) {
        this.lista = lista;
    }
    
    public MslfVendas getBean(int row) {
        return (MslfVendas) lista.get(row);
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
    public Object getValueAt(int row, int column) {
      MslfVendas vendas = (MslfVendas) lista.get(row);
      if (column == 0) {
          return vendas.getMslfIdVendas();
      } 
      if (column == 1) {
          return vendas.getMslfCliente();
      }
      if (column == 2) {
          return vendas.getMslfVendedor();
      }
      if (column == 3) {
          return vendas.getMslfValorTotal();
      }
        return null;
      
    }
    
    @Override
    public String getColumnName(int columnIndex){
        if (columnIndex == 0) {
             return "ID";
        }
        if (columnIndex == 1) {
             return "Cliente";
        }
        if (columnIndex == 2) {
             return "Vendedor";
        }
        if (columnIndex == 3) {
             return "Valor Total";
        }
       
    return null;
    }
}
