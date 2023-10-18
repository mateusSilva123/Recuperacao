/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controle;
import bean.MslfVendas;
import javax.swing.table.AbstractTableModel;
import java.util.List;
/**
 *
 * @author u04122722490
 */
public class VendasControle extends AbstractTableModel {
private List lista;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 55df74220d96b2f3edc43084e6b27e73990c10cc
    
    public void setList(List lista) {
        this.lista = lista;
    }
    
    public MslfVendas getBean(int linha) {
        return (MslfVendas) lista.get(linha);
    }
    
<<<<<<< HEAD
    @Override
    public int getRowCount() {
    return 4;
=======
=======

public void setList(List lista){
this.lista=lista;
}
public  void setlist(List lista){
this.lista = lista;
}

public MslfVendas getbean(int linha){
return (MslfVendas) lista.get(linha);
}
>>>>>>> a39f6a3e389fc4532bbcda4e8f5d2756cc862b1d
    @Override
    public int getRowCount() {
        return lista.size();
>>>>>>> 55df74220d96b2f3edc43084e6b27e73990c10cc
    }

    @Override
    public int getColumnCount() {
<<<<<<< HEAD
      return 4;
=======
<<<<<<< HEAD
        return 4;
=======
      return 4;
>>>>>>> a39f6a3e389fc4532bbcda4e8f5d2756cc862b1d
>>>>>>> 55df74220d96b2f3edc43084e6b27e73990c10cc
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        MslfVendas vendas = (MslfVendas) lista.get(rowIndex);
<<<<<<< HEAD
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
             return vendas.getMslfValorTotal();
        
        }
<<<<<<< HEAD
       return "";
=======
       return null;
>>>>>>> a39f6a3e389fc4532bbcda4e8f5d2756cc862b1d
>>>>>>> 55df74220d96b2f3edc43084e6b27e73990c10cc
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
