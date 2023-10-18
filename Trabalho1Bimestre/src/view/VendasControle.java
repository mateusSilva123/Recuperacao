/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
<<<<<<< HEAD
package view.controle;
import bean.MslfVendas;
=======
package view;
import hibernate.MslfCliente;
>>>>>>> f38b18788bc284862b466ecca84678e102546fb2
import javax.swing.table.AbstractTableModel;
import java.util.List;
/**
 *
<<<<<<< HEAD
 * @author u04122722490
 */
public class VendasControle extends AbstractTableModel {
private List lista;
    
    public void setList(List lista) {
        this.lista = lista;
    }
    
    public MslfVendas getBean(int linha) {
        return (MslfVendas) lista.get(linha);
    }
    
    @Override
    public int getRowCount() {
    return 4;
=======
 * @author u13766540670
 */
public class ClienteControle extends AbstractTableModel {
private List lista;

public void setList(List lista){
this.lista=lista;
}
public  void setlist(List lista){
this.lista = lista;
}

public MslfCliente getbean(int linha){
return (MslfCliente) lista.get(linha);
}
    @Override
    public int getRowCount() {
        return lista.size();
>>>>>>> f38b18788bc284862b466ecca84678e102546fb2
    }

    @Override
    public int getColumnCount() {
      return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
<<<<<<< HEAD
        MslfVendas vendas = (MslfVendas) lista.get(rowIndex);
       if (columnIndex == 0) {
            return vendas.getMslfIdVendas();
        }
        if (columnIndex == 1) {
            return vendas.getMslfCliente();
        }
        if (columnIndex == 2) {
            return vendas.getMslfVendedor();
        }
        if (columnIndex == 3) {
            return vendas.getMslfVendedor();
        }
       return "";
=======
        MslfCliente cliente = (MslfCliente) lista.get(rowIndex);
      if (columnIndex == 0) {
             return cliente.getMslfIdCliente();
        }
        if (columnIndex == 1) {
             return cliente.getMslfNome();
        }
        if (columnIndex == 2) {
             return cliente.getMslfEmail();
        }
        if (columnIndex == 3) {
             return cliente.getMslfRg();
        
        }
       return null;
>>>>>>> f38b18788bc284862b466ecca84678e102546fb2
    }
    @Override
    public String getColumnName(int columnIndex){
        if (columnIndex == 0) {
             return "ID";
        }
        if (columnIndex == 1) {
<<<<<<< HEAD
             return "Cliente";
        }
        if (columnIndex == 2) {
             return "Vendedor";
        }
        if (columnIndex == 3) {
             return "Valor Total";
=======
             return "Nome";
        }
        if (columnIndex == 2) {
             return "Email";
        }
        if (columnIndex == 3) {
             return "Rg";
>>>>>>> f38b18788bc284862b466ecca84678e102546fb2
        }
       
    return null;
    }
}
