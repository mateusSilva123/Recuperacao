/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import hibernate.MslfCliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u13766540670
 */
public class ClienteController extends AbstractTableModel{
    
    List lista;
    
    public void setList(List lista) {
        this.lista = lista;
    }
    
    public MslfCliente getBean(int row) {
        return (MslfCliente) lista.get(row);
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
      MslfCliente cliente = (MslfCliente) lista.get(row);
      if (column == 0) {
          return cliente.getMslfIdCliente();
      } 
      if (column == 1) {
          return cliente.getMslfNome();
      }
      if (column == 2) {
          return cliente.getMslfApelido();
      }
      if (column == 3) {
          return cliente.getMslfCpf();
      }
        return null;
      
    }
    
    @Override
    public String getColumnName(int columnIndex){
        if (columnIndex == 0) {
             return "ID";
        }
        if (columnIndex == 1) {
             return "Nome";
        }
        if (columnIndex == 2) {
             return "Apelido";
        }
        if (columnIndex == 3) {
             return "CPF";
        }
       
    return null;
    }
}
