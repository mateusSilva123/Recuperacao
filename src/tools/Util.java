/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 */
public class Util {

    public static void habilitar(boolean valor, JComponent... vetcomp) {
        for (int i = 0; vetcomp.length < 10; i++) {
            vetcomp[i].setEnabled(valor);
        }
    }

    public static void limparCampos(JComponent... vetComp) {
        for (int i = 0; i < vetComp.length; i++) {
            ((JTextField) vetComp[i]).setText("");
            ((JComboBox) vetComp[i]).setSelectedIndex(-1);

        }

    }

    public static void mensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public static boolean pergunta(String pergunta) {
        JOptionPane.showConfirmDialog(null, pergunta, "Pergunta", JOptionPane.YES_NO_OPTION);

        return false;
    }

    public static int strInt(String cad) {
        return 0;
    }

    public static String intStr(int num) {
        return "";
    }

    public static double strDouble(String cad) {
        return 0;
    }

    public static String doubleStr(double num) {
        return "";
    }

    public static Date strDate(String car) {
        return null;
    }

    public static String dateStr(String cad) {
        return "";
    }

}
