package view.IA;

<<<<<<< HEAD
import dao.VendasDAO;
=======
<<<<<<< HEAD
import dao.VendasDAO;
=======
>>>>>>> f31753cd976381c3662ca990e4a48c3fbe0121bc
>>>>>>> 97622e9b37f848c8ffcccb3958c22a672fd33ff9
import hibernate.MslfCliente;
import hibernate.MslfVendas;
import hibernate.MslfVendedor;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import tools.Util;
import view.JDlgVendasNovo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
<<<<<<< HEAD
 * @author dfgh
=======
 * @author u13766540670
>>>>>>> 97622e9b37f848c8ffcccb3958c22a672fd33ff9
 */
public class JDlgVendasNovoIA extends javax.swing.JDialog {

    JDlgVendasNovo jdlgVendasNovo;
    MaskFormatter mascaraData;
<<<<<<< HEAD
    
    
=======
    /**
     * Creates new form JDlgusuarioNovoIAa
     */
>>>>>>> 97622e9b37f848c8ffcccb3958c22a672fd33ff9
    public JDlgVendasNovoIA(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Incluir Vendas");
        try {
            mascaraData = new MaskFormatter("##/##/####");
            
        } catch (ParseException ex) {
            Logger.getLogger(JDlgVendasNovoIA.class.getName()).log(Level.SEVERE, null, ex);
        }
        jFmtData.setFormatterFactory(new DefaultFormatterFactory(mascaraData));
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 97622e9b37f848c8ffcccb3958c22a672fd33ff9
public MslfVendas viewBean(){
        MslfVendas vendas = new MslfVendas();
        vendas.setMslfCliente((MslfCliente) jCboCliente.getSelectedItem());
        vendas.setMslfVendedor((MslfVendedor) jCboVendedor.getSelectedItem());
        vendas.setMslfDataEHora(Util.strDate(jFmtData.getText()));
        vendas.setMslfIdVendas(Util.strInt(jTxtID.getText()));
        vendas.setMslfObservacao(jTxtObservacao.getText());
        vendas.setMslfQuantidade(Util.strInt(jTxtQuantidade.getText()));
<<<<<<< HEAD
=======
=======
public MslfVendas viewbean(){
        MslfVendas vendas = new MslfVendas();
        vendas.setMslfCliente((MslfCliente) jCboCliente.getSelectedItem());
        vendas.setMslfVendedor((MslfVendedor) jCboVendedor.getSelectedItem());
        //vendas.setMslfDataEHora((MslfVendedor) jCboVendedor.getSelectedItem());
        //vendas.setMslfIdVendas(Util.intStr(jTxtID));
        vendas.setMslfObservacao(jTxtObservacao.getText());
        //vendas.setMslfQuantidade(Util.intStr(jTxtID));
>>>>>>> f31753cd976381c3662ca990e4a48c3fbe0121bc
>>>>>>> 97622e9b37f848c8ffcccb3958c22a672fd33ff9
        vendas.setMslfValorTotal(jTxtValorTotal.getText());
        
return vendas;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTxtID = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jBtnOk = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTxtQuantidade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTxtObservacao = new javax.swing.JTextField();
        jFmtData = new javax.swing.JFormattedTextField();
        jCboCliente = new javax.swing.JComboBox<MslfCliente>();
        jCboVendedor = new javax.swing.JComboBox<MslfVendedor>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTxtValorTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Cliente");

        jLabel3.setText("Data e Hora");

        jLabel1.setText("Número da Venda");

        jTxtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtIDActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING);
        flowLayout1.setAlignOnBaseline(true);
        jPanel1.setLayout(flowLayout1);

        jBtnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Confirmado.png"))); // NOI18N
        jBtnOk.setText("Confirmar");
        jBtnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOkActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnOk);

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnCancelar);

        jLabel4.setText("Quantidade");

        jTxtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtQuantidadeActionPerformed(evt);
            }
        });

        jLabel5.setText("Observação");

        jTxtObservacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtObservacaoActionPerformed(evt);
            }
        });

        jCboCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboClienteActionPerformed(evt);
            }
        });

        jCboVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboVendedorActionPerformed(evt);
            }
        });

        jLabel6.setText("Vendedor");

        jLabel7.setText("Valor Total");

        jTxtValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtValorTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTxtObservacao, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTxtID)
                                    .addComponent(jTxtQuantidade))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jCboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCboVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jFmtData, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(jLabel7)
                            .addComponent(jTxtValorTotal))))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFmtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTxtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCboVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(26, 26, 26))))
                    .addComponent(jTxtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(26, 26, 26)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTxtObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 97622e9b37f848c8ffcccb3958c22a672fd33ff9
        this.dispose();
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOkActionPerformed
        MslfVendas vendas = viewBean();
        VendasDAO vendasDAO = new VendasDAO();
        vendasDAO.insert(vendas);
        setVisible(false);
        this.dispose();
        //MslfVendas vendas = viewBean();
        //jdlgVendasNovo.vendasDAO.insert(vendas);
<<<<<<< HEAD
=======
=======
        setVisible(false);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOkActionPerformed
        MslfVendas vendas = viewbean();
        jdlgVendasNovo.vendasDAO.insert(vendas);
>>>>>>> f31753cd976381c3662ca990e4a48c3fbe0121bc
>>>>>>> 97622e9b37f848c8ffcccb3958c22a672fd33ff9
    }//GEN-LAST:event_jBtnOkActionPerformed

    private void jTxtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtIDActionPerformed

    private void jTxtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtQuantidadeActionPerformed

    private void jTxtObservacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtObservacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtObservacaoActionPerformed

    private void jCboClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboClienteActionPerformed

    private void jCboVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboVendedorActionPerformed

    private void jTxtValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtValorTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtValorTotalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JDlgVendasNovoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgVendasNovoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgVendasNovoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgVendasNovoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgVendasNovoIA dialog = new JDlgVendasNovoIA(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnOk;
    private javax.swing.JComboBox<MslfCliente> jCboCliente;
    private javax.swing.JComboBox<MslfVendedor> jCboVendedor;
    private javax.swing.JFormattedTextField jFmtData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTxtID;
    private javax.swing.JTextField jTxtObservacao;
    private javax.swing.JTextField jTxtQuantidade;
    private javax.swing.JTextField jTxtValorTotal;
    // End of variables declaration//GEN-END:variables
}