/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controle;
import bean.MslfUsuarios;
import javax.swing.table.AbstractTableModel;
import java.util.List;
/**
 *
 * @author u04127224290
 */
public class UsuariosControle extends AbstractTableModel {
private List lista;

public void setList(List lista){
this.lista=lista;
}

public MslfUsuarios getbean(int linha){
return (MslfUsuarios) lista.get(linha);
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
        MslfUsuarios usuarios = (MslfUsuarios) lista.get(rowIndex);
      if (columnIndex == 0) {
             return usuarios.getMslfIdUsuarios();
        }
        if (columnIndex == 1) {
             return usuarios.getMslfNome();
        }
        if (columnIndex == 2) {
             return usuarios.getMslfApelido();
        }
        if (columnIndex == 3) {
             return usuarios.getMslfCpf();
        
        }
       return "";
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
       
    return "";
    }
}
