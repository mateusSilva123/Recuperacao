/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 */
public class Util {

    public static void habilitar(boolean valor, JComponent... vetcomp) {
        for (int i = 0; i < vetcomp.length; i++) {
            vetcomp[i].setEnabled(valor);
        }
    }

    public static void limparCampos(JComponent... vetComp) {
        for (JComponent componente : vetComp) {
            if (componente instanceof JTextField) {
                JTextField objeto = (JTextField) componente;
                objeto.setText("");
            } else if (componente instanceof JComboBox) {
                JComboBox objeto = (JComboBox) componente;
                objeto.setSelectedItem(-1);
            } else if (componente instanceof JCheckBox) {
                JCheckBox objeto = (JCheckBox) componente;
                objeto.setSelected(false);
            }
        }
    }

    public static void mensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public static boolean pergunta( String pergunta) {
        return JOptionPane.showConfirmDialog(null, pergunta, "Pergunta", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
    }

    public static int strInt(String cad) {
        return Integer.valueOf(cad);
    }

    public static String intStr(int num) {
        return String.valueOf(num);
    }

    public static double strDouble(String cad) {
        return Double.valueOf(cad);
    }

    public static String doubleStr(double num) {
        return String.valueOf(num);
    }

    public static java.util.Date strDate(String car) {
            try {
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                return formato.parse(car);
            } catch (ParseException ex) {
                System.out.println("Houve uma falha em sua conversão de data");
            }
            return null;
    }

    public static String dateStr(java.util.Date cad) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(cad);
    }

}
