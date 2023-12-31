package view.IA;

import dao.VendedorDAO;
import bean.MslfVendedor;

import java.text.ParseException;
import java.util.logging.Level;
import bean.MslfUsuarios;
import dao.UsuariosDAO;
import java.util.List;
import java.util.logging.Logger;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import tools.Util;
import view.JDlgVendedorNovo;
import view.controle.VendedorControle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dfgh
 */
public class JDlgVendedorNovoIA extends javax.swing.JDialog {

    MaskFormatter mascaraCpf;
    MaskFormatter mascaraData;
    MaskFormatter mascaraNumero;
    
    JDlgVendedorNovo jdlgVendedorNovo;
    JDlgVendedorNovoIA jDlgVendedorNovoIA;
    VendedorControle vendedorControle;
    
    public JDlgVendedorNovoIA(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Incluir Vendedor");
        
        UsuariosDAO usuariosDAO = new UsuariosDAO();
        List listaUsuarios = usuariosDAO.listALL();
        for (int i = 0; i < listaUsuarios.size(); i++) {
            jCboUsuarios.addItem((MslfUsuarios) listaUsuarios.get(i));            
        }
        
        try {
            mascaraCpf = new MaskFormatter("###.###.###-##");
            mascaraNumero = new MaskFormatter("(##) ### ###-###");
            mascaraData = new MaskFormatter("##/##/####");
            
        } catch (ParseException ex) {
            Logger.getLogger(JDlgVendedorNovoIA.class.getName()).log(Level.SEVERE, null, ex);
        }
        jFmtCpf.setFormatterFactory(new DefaultFormatterFactory(mascaraCpf));
        jFmtTelefone.setFormatterFactory(new DefaultFormatterFactory(mascaraNumero));
        jFmtData.setFormatterFactory(new DefaultFormatterFactory(mascaraData));
    }
  public MslfVendedor viewBean() {
        // TODO add your handling code here:
        MslfVendedor vendedor = new MslfVendedor(); // criou o bean
        vendedor.setMslfIdVendedor(Util.strInt(jTxtID.getText()));
        vendedor.setMslfCpf(jFmtCpf.getText());
        vendedor.setMslfDataNasc(Util.strDate(jFmtData.getText()));
        vendedor.setMslfEmail(jTxtEmail.getText());
        vendedor.setMslfNome(jTxtNome.getText());
        vendedor.setMslfRg(jTxtRG.getText());
        vendedor.setMslfSalario(jFmtSalario.getText());
        vendedor.setMslfSexo((String) jCboSexo.getSelectedItem());
        vendedor.setMslfTelefone(jFmtTelefone.getText());
        vendedor.setMslfUsuarios((MslfUsuarios) jCboUsuarios.getSelectedItem());
       
        return vendedor;
    }
   
    public void beanView(MslfVendedor vendedor) {
        
        jTxtID.setText(Util.intStr(vendedor.getMslfIdVendedor()));
        jFmtCpf.setText(vendedor.getMslfCpf());
        jTxtEmail.setText(vendedor.getMslfEmail());
        jTxtNome.setText(vendedor.getMslfNome());
        jTxtRG.setText(vendedor.getMslfRg());
        jFmtSalario.setText(vendedor.getMslfSalario());
        jCboSexo.setSelectedItem(vendedor.getMslfSexo());
        jFmtTelefone.setText(vendedor.getMslfTelefone());
        jFmtData.setText(Util.dateStr(vendedor.getMslfDataNasc()));
        jCboUsuarios.setSelectedItem(vendedor.getMslfUsuarios());
    };
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBtnOk = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jTxtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jFmtData = new javax.swing.JFormattedTextField();
        jFmtSalario = new javax.swing.JFormattedTextField();
        jLabel22 = new javax.swing.JLabel();
        jFmtTelefone = new javax.swing.JFormattedTextField();
        jCboUsuarios = new javax.swing.JComboBox<MslfUsuarios>();
        jLabel7 = new javax.swing.JLabel();
        jTxtEmail = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTxtRG = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jCboSexo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jFmtCpf = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        jLabel2.setText("Salario");

        jTxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNomeActionPerformed(evt);
            }
        });

        jLabel19.setText("Nome");

        jLabel22.setText("Usuario");

        jCboUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboUsuariosActionPerformed(evt);
            }
        });

        jLabel7.setText("ID");

        jLabel21.setText("Email");

        jLabel5.setText("CPF");

        jLabel6.setText("RG");

        jCboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino", "Outro" }));

        jLabel8.setText("Sexo");

        jLabel16.setText("Telefone");

        jLabel17.setText("Data de Nascimento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtNome))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jFmtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jTxtID, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(jCboUsuarios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFmtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jTxtRG))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jFmtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFmtData, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(30, 30, 30)
                                .addComponent(jCboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTxtEmail)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(jFmtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCboUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22)))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jFmtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jFmtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21))))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jTxtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16)
                                .addComponent(jFmtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        this.dispose();
        Util.limparCampos(jTxtEmail, jTxtID, jTxtNome, jTxtRG, jFmtCpf, jFmtData, jFmtSalario,
                jFmtTelefone, jCboSexo, jCboUsuarios);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOkActionPerformed
         if (getTitle() == "Inclusão")
        {
            MslfVendedor vendedor = viewBean();
            VendedorDAO vendedorDAO = new VendedorDAO();
            vendedorDAO.insert(vendedor);
            
            List lista = vendedorDAO.listALL();
            vendedorControle.setList(lista); 
            
            setVisible(false);
            this.dispose();
        }
        else if (getTitle() == "Alteração")
        {
            MslfVendedor vendedor = viewBean();
            VendedorDAO vendedorDAO = new VendedorDAO();
            vendedorDAO.update(vendedor);
             
            List lista = vendedorDAO.listALL();
            vendedorControle.setList(lista); 
            
            setVisible(false);
            this.dispose();
        }
        
            Util.limparCampos(jTxtEmail, jTxtID, jTxtNome, jTxtRG, jFmtCpf, jFmtData, jFmtSalario,
                jFmtTelefone, jCboSexo, jCboUsuarios);

    }//GEN-LAST:event_jBtnOkActionPerformed

    private void jTxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNomeActionPerformed

    private void jCboUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboUsuariosActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgVendedorNovoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgVendedorNovoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgVendedorNovoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgVendedorNovoIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
       

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgVendedorNovoIA dialog = new JDlgVendedorNovoIA(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> jCboSexo;
    private javax.swing.JComboBox<MslfUsuarios> jCboUsuarios;
    private javax.swing.JFormattedTextField jFmtCpf;
    private javax.swing.JFormattedTextField jFmtData;
    private javax.swing.JFormattedTextField jFmtSalario;
    private javax.swing.JFormattedTextField jFmtTelefone;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtID;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtRG;
    // End of variables declaration//GEN-END:variables
}
