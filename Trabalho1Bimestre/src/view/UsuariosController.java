/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import hibernate.MslfUsuarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u13766540670
 */
public class UsuariosController extends AbstractTableModel{
    
    List lista;
    
    public void setList(List lista) {
        this.lista = lista;
    }
    
    public MslfUsuarios getBean(int row) {
        return (MslfUsuarios) lista.get(row);
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
      MslfUsuarios usuarios = (MslfUsuarios) lista.get(row);
      if (column == 0) {
          return usuarios.getMslfIdUsuarios();
      } 
      if (column == 1) {
          return usuarios.getMslfNome();
      }
      if (column == 2) {
          return usuarios.getMslfApelido();
      }
      if (column == 3) {
          return usuarios.getMslfCpf();
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
