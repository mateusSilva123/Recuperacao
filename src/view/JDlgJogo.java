/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import hibernate.MslfJogo;
import dao.JogoDAO;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import tools.Util;


/**
 *
 * @author Usfgfg
 */
public class JDlgJogo extends javax.swing.JDialog {

    boolean incluindo;
    MaskFormatter mascaraData;

    /**
     * Creates new form JDlgCliente
     */
    public JDlgJogo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Jogo");
        setLocationRelativeTo(null);
        Util.habilitar(false, jTxtAvaliacao, jTxtBrinde, jTxtClassificacao, jTxtDesconto, 
                     jTxtEdicao, jTxtEmpresa, jTxtEstoque, jTxtID, jTxtIdioma, jTxtNome, jTxtPreco, jFmtAno,
                     jCboGenero, jBtnCancelar, jBtnConfirmar);
        
        try {
            mascaraData = new MaskFormatter("##/##/####");
            
        } catch (ParseException ex) {
            Logger.getLogger(JDlgJogo.class.getName()).log(Level.SEVERE, null, ex);
        }
        jFmtAno.setFormatterFactory(new DefaultFormatterFactory(mascaraData));
    }
    
    public MslfJogo viewBean() {
        MslfJogo jogo = new MslfJogo(); // criou o bean
        
        jogo.setMslfAno(Util.strDate(jFmtAno.getText()));
        jogo.setMslfAvaliacaoGeral(jTxtAvaliacao.getText());
        jogo.setMslfBrinde(jTxtBrinde.getText());
        jogo.setMslfClassificacao(jTxtClassificacao.getText());
        jogo.setMslfDesconto(jTxtDesconto.getText());
        jogo.setMslfEdicao(jTxtEdicao.getText());
        jogo.setMslfEmpresa(jTxtEmpresa.getText());
        jogo.setMslfEdicao(jTxtEstoque.getText());
        jogo.setMslfGenero((String) jCboGenero.getSelectedItem());
        jogo.setMslfIdJogo(Util.strInt(jTxtID.getText()));
        jogo.setMslfIdioma(jTxtIdioma.getText());
        jogo.setMslfNome(jTxtNome.getText());
        jogo.setMslfPreco(jTxtPreco.getText());

        return jogo;
    };
    
     public void beanView(MslfJogo jogo) {
        jTxtAvaliacao.setText(jogo.getMslfAvaliacaoGeral());
        jTxtBrinde.setText(jogo.getMslfBrinde());
        jTxtClassificacao.setText(jogo.getMslfClassificacao());
        jTxtDesconto.setText(jogo.getMslfDesconto());
        jFmtAno.setText(Util.dateStr(jogo.getMslfAno()));
        jTxtEdicao.setText(jogo.getMslfEdicao());
        jTxtEmpresa.setText(jogo.getMslfEmpresa());
        jTxtEstoque.setText(jogo.getMslfEstoque());
        jTxtID.setText( Util.intStr(jogo.getMslfIdJogo()) );
        jTxtIdioma.setText(jogo.getMslfIdioma());
        jTxtNome.setText(jogo.getMslfNome());
        jTxtPreco.setText(jogo.getMslfPreco());
        jCboGenero.setSelectedItem(jogo.getMslfGenero());
    };
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTxtBrinde = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTxtEstoque = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTxtEdicao = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTxtAvaliacao = new javax.swing.JTextField();
        jTxtID = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTxtDesconto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTxtEmpresa = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jBtnCancelar = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();
        jBtnIncluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExlcuir = new javax.swing.JButton();
        jBtnConfirmar = new javax.swing.JButton();
        jFmtAno = new javax.swing.JFormattedTextField();
        jTxtPreco = new javax.swing.JTextField();
        jCboGenero = new javax.swing.JComboBox<>();
        jTxtIdioma = new javax.swing.JTextField();
        jTxtClassificacao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel8.setText("Preço");

        jLabel9.setText("Brinde");

        jLabel10.setText("Estoque");

        jLabel11.setText("Edicao");

        jLabel14.setText("Gênero");

        jTxtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtIDActionPerformed(evt);
            }
        });

        jLabel13.setText("ID");

        jLabel6.setText("Desconto");

        jLabel7.setText("Classificação");

        jLabel16.setText("Idioma");

        jLabel17.setText("Ano");

        jLabel18.setText("Empresa");

        jLabel19.setText("Nome");

        jTxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNomeActionPerformed(evt);
            }
        });

        jLabel21.setText("Avaliação Geral");

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar.png"))); // NOI18N
        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/incluir.png"))); // NOI18N
        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alterar.png"))); // NOI18N
        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        jBtnExlcuir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excluir.png"))); // NOI18N
        jBtnExlcuir.setText("Excluir");
        jBtnExlcuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExlcuirActionPerformed(evt);
            }
        });

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Confirmado.png"))); // NOI18N
        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jCboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ação", "Terror", "Puzzle", "Infantil", "Estrategia", "RPG", "Corrida", "Simulação", "Esportes" }));
        jCboGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboGeneroActionPerformed(evt);
            }
        });

        jTxtClassificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtClassificacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(37, 37, 37))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel19)
                                                .addComponent(jLabel17))
                                            .addGap(29, 29, 29)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTxtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTxtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jFmtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTxtIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addGap(178, 178, 178))))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTxtEdicao, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                    .addComponent(jTxtEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                    .addComponent(jTxtBrinde, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jTxtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jBtnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTxtID, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addComponent(jBtnExlcuir)
                        .addGap(14, 14, 14)
                        .addComponent(jBtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnPesquisar))
                    .addComponent(jLabel21)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(22, 22, 22)
                        .addComponent(jCboGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTxtAvaliacao))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTxtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(jCboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTxtBrinde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jTxtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jTxtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFmtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTxtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jTxtIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnExlcuir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtIDActionPerformed

    private void jTxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNomeActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
       Util.habilitar(false, jTxtAvaliacao, jTxtBrinde, jTxtClassificacao, jTxtDesconto, 
                     jTxtEdicao, jTxtEmpresa, jTxtEstoque, jTxtID, jTxtIdioma, jTxtNome, jTxtPreco, jFmtAno,
                     jCboGenero, jBtnCancelar, jBtnConfirmar);
        Util.limparCampos(jTxtAvaliacao, jTxtBrinde, jTxtClassificacao, jTxtDesconto, 
                     jTxtEdicao, jTxtEmpresa, jTxtEstoque, jTxtID, jTxtIdioma, jTxtNome, jTxtPreco, jFmtAno,
                     jCboGenero);
        Util.mensagem("Operação Cancelada");
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        // TODO add your handling code here:
        JDlgJogoPesquisar jDlgJogoPesquisar = new JDlgJogoPesquisar(null, true);
        jDlgJogoPesquisar.setTelaAnterior(this);        
        jDlgJogoPesquisar.setVisible(true);
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        // TODO add your handling code here:
       Util.habilitar(true, jTxtAvaliacao, jTxtBrinde, jTxtClassificacao, jTxtDesconto, 
                     jTxtEdicao, jTxtEmpresa, jTxtEstoque, jTxtID, jTxtIdioma, jTxtNome, jTxtPreco, jFmtAno,
                     jCboGenero, jBtnExlcuir, jBtnPesquisar, jBtnIncluir, jBtnAlterar);
         Util.limparCampos(jTxtAvaliacao, jTxtBrinde, jTxtClassificacao, jTxtDesconto, 
                     jTxtEdicao, jTxtEmpresa, jTxtEstoque, jTxtID, jTxtIdioma, jTxtNome, jTxtPreco, jFmtAno,
                     jCboGenero);
        incluindo = true;
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        // TODO add your handling code here:
         Util.habilitar(false, jTxtAvaliacao, jTxtBrinde, jTxtClassificacao, jTxtDesconto, 
                     jTxtEdicao, jTxtEmpresa, jTxtEstoque, jTxtID, jTxtIdioma, jTxtNome, jTxtPreco, jFmtAno,
                     jCboGenero, jBtnCancelar, jBtnConfirmar);
        incluindo = false;
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnExlcuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExlcuirActionPerformed
        // TODO add your handling code here:
        if ((Util.pergunta("Deseja excluir o registro?") == true)){
            MslfJogo jogo = viewBean();
            JogoDAO jogoDAO = new JogoDAO();
            jogoDAO.delete(jogo);
            Util.mensagem("Exclusão realizada com sucesso");
        } else {
            Util.mensagem("Exclusão cancelada com Sucesso");
        }      
        Util.limparCampos(jTxtAvaliacao, jTxtBrinde, jTxtClassificacao, jTxtDesconto, 
                     jTxtEdicao, jTxtEmpresa, jTxtEstoque, jTxtID, jTxtIdioma, jTxtNome, jTxtPreco, jFmtAno,
                     jCboGenero);
    }//GEN-LAST:event_jBtnExlcuirActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
      if (incluindo == true) {
        MslfJogo jogo = viewBean();  
        JogoDAO jogoDAO = new JogoDAO();
        jogoDAO.insert(jogo);
             Util.habilitar(false, jTxtAvaliacao, jTxtBrinde, jTxtClassificacao, jTxtDesconto, 
                     jTxtEdicao, jTxtEmpresa, jTxtEstoque, jTxtID, jTxtIdioma, jTxtNome, jTxtPreco, jFmtAno,
                     jCboGenero, jBtnCancelar, jBtnConfirmar);
        }else{
        MslfJogo jogo = viewBean();  
        JogoDAO jogoDAO = new JogoDAO();
        jogoDAO.update(jogo);
         Util.habilitar(true, jTxtAvaliacao, jTxtBrinde, jTxtClassificacao, jTxtDesconto, 
                     jTxtEdicao, jTxtEmpresa, jTxtEstoque, jTxtID, jTxtIdioma, jTxtNome, jTxtPreco, jFmtAno,
                     jCboGenero, jBtnExlcuir, jBtnPesquisar, jBtnIncluir, jBtnAlterar);
         Util.limparCampos(jTxtAvaliacao, jTxtBrinde, jTxtClassificacao, jTxtDesconto, 
                     jTxtEdicao, jTxtEmpresa, jTxtEstoque, jTxtID, jTxtIdioma, jTxtNome, jTxtPreco, jFmtAno,
                     jCboGenero);
               }
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jCboGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboGeneroActionPerformed

    private void jTxtClassificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtClassificacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtClassificacaoActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgJogo dialog = new JDlgJogo(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExlcuir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JComboBox<String> jCboGenero;
    private javax.swing.JFormattedTextField jFmtAno;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTxtAvaliacao;
    private javax.swing.JTextField jTxtBrinde;
    private javax.swing.JTextField jTxtClassificacao;
    private javax.swing.JTextField jTxtDesconto;
    private javax.swing.JTextField jTxtEdicao;
    private javax.swing.JTextField jTxtEmpresa;
    private javax.swing.JTextField jTxtEstoque;
    private javax.swing.JTextField jTxtID;
    private javax.swing.JTextField jTxtIdioma;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtPreco;
    // End of variables declaration//GEN-END:variables
}
