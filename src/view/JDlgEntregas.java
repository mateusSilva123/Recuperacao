/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.MslfEntregas;
import dao.EntregasDAO;
<<<<<<< HEAD
import bean.MslfVendedor;
import dao.ClienteDAO;
import dao.VendedorDAO;
import bean.MslfCliente;
=======
import bean.MslfCliente;
import bean.MslfVendedor;
import dao.ClienteDAO;
import dao.VendedorDAO;
>>>>>>> f38b18788bc284862b466ecca84678e102546fb2
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import tools.Util;
import view.pesquisar.JDlgEntregasPesquisar;


/**
 *
 * @author Usuario VCP
 */
public class JDlgEntregas extends javax.swing.JDialog {

    boolean incluindo;
    MaskFormatter mascaraCpf;
    MaskFormatter mascaraData;
    MaskFormatter mascaraNumero;

    /**
     * Creates new form JDlgCliente
     */
    public JDlgEntregas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Entregas");
<<<<<<< HEAD
        
        ClienteDAO clienteDAO = new ClienteDAO();
=======
         ClienteDAO clienteDAO = new ClienteDAO();
>>>>>>> f38b18788bc284862b466ecca84678e102546fb2
        List listaCliente = clienteDAO.listALL();
        for (int i = 0; i < listaCliente.size(); i++) {
            jCboCliente.addItem((MslfCliente) listaCliente.get(i));            
        }
        
        VendedorDAO vendedorDAO = new VendedorDAO();
        List listaVendedor = vendedorDAO.listALL();
        for (int i = 0; i < listaVendedor.size(); i++) {
            jCboVendedor.addItem((MslfVendedor) listaVendedor.get(i));            
        }
        setLocationRelativeTo(null);
        
        Util.habilitar(false, jTxtBairro, jTxtCidade, jTxtEndereco, jTxtEstado, jTxtID, jTxtNumCasa,
                jTxtRG, jFmtCPF, jFmtCep, jFmtData, jFmtTelefone, jCboCliente, 
                jCboVendedor, jBtnCancelar, jBtnConfirmar);
        
<<<<<<< HEAD
        Util.habilitar(true, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
=======
<<<<<<< HEAD
        Util.habilitar(true, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
=======
<<<<<<< HEAD
        Util.habilitar(true, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
=======
        Util.habilitar(true, jBtnAlterar, jBtnExlcuir, jBtnIncluir, jBtnPesquisar);
>>>>>>> a39f6a3e389fc4532bbcda4e8f5d2756cc862b1d
>>>>>>> 55df74220d96b2f3edc43084e6b27e73990c10cc
>>>>>>> f38b18788bc284862b466ecca84678e102546fb2
        
        try {
            mascaraCpf = new MaskFormatter("###.###.###-##");
            mascaraNumero = new MaskFormatter("(##) ### ###-###");
            mascaraData = new MaskFormatter("##/##/####");
            
        } catch (ParseException ex) {
            Logger.getLogger(JDlgEntregas.class.getName()).log(Level.SEVERE, null, ex);
        }
        jFmtCPF.setFormatterFactory(new DefaultFormatterFactory(mascaraCpf));
        jFmtTelefone.setFormatterFactory(new DefaultFormatterFactory(mascaraNumero));
        jFmtData.setFormatterFactory(new DefaultFormatterFactory(mascaraData));
    }
    
    public MslfEntregas viewBean() {
        MslfEntregas entregas = new MslfEntregas(); // criou o bean
        
        entregas.setMslfCliente((MslfCliente) jCboCliente.getSelectedItem());
        entregas.setMslfVendedor((MslfVendedor) jCboVendedor.getSelectedItem());
        entregas.setMslfBairro(jTxtBairro.getText() );
        entregas.setMslfCep(jFmtCep.getText() );
        entregas.setMslfTelefone(jFmtTelefone.getText() );
        entregas.setMslfCpf(jFmtCPF.getText() );
        entregas.setMslfData(Util.strDate(jFmtData.getText()));
        entregas.setMslfCidade(jTxtCidade.getText() );
        entregas.setMslfEndereco(jTxtEndereco.getText() );
        entregas.setMslfEstado(jTxtEstado.getText() );
        entregas.setMslfIdEntregas(Util.strInt(jTxtID.getText()));
        entregas.setMslfNumeroCasa(Util.strInt(jTxtNumCasa.getText()));
        entregas.setMslfRg(jTxtRG.getText() );
        return entregas;
    };
    
     public void beanView(MslfEntregas entregas) {
        jTxtID.setText( Util.intStr(entregas.getMslfIdEntregas()) ); // AQUI
        jCboCliente.setSelectedItem(entregas.getMslfCliente());
        jCboVendedor.setSelectedItem(entregas.getMslfVendedor());
        jTxtBairro.setText(entregas.getMslfBairro());
        jFmtCep.setText( entregas.getMslfCep());
        jFmtTelefone.setText( entregas.getMslfTelefone());
        jFmtCPF.setText( entregas.getMslfCpf());
        jFmtData.setText( Util.dateStr(entregas.getMslfData())); // AQUI
        jTxtCidade.setText( entregas.getMslfCidade());
        jTxtEndereco.setText( entregas.getMslfEndereco());
        jTxtEstado.setText( entregas.getMslfEstado());
        jTxtNumCasa.setText( Util.intStr(entregas.getMslfNumeroCasa()) ); // AQUI
        jTxtRG.setText( entregas.getMslfRg());
           
    };
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTxtEndereco = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTxtBairro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTxtCidade = new javax.swing.JTextField();
        jTxtEstado = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTxtID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTxtRG = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jBtnCancelar = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();
        jBtnIncluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnConfirmar = new javax.swing.JButton();
        jFmtCep = new javax.swing.JFormattedTextField();
        jFmtCPF = new javax.swing.JFormattedTextField();
        jFmtTelefone = new javax.swing.JFormattedTextField();
        jCboVendedor = new javax.swing.JComboBox<MslfVendedor>();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCboCliente = new javax.swing.JComboBox<MslfCliente>();
        jFmtData = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        jTxtNumCasa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel8.setText("CEP");

        jLabel9.setText("Endereço");

        jLabel10.setText("Bairro");

        jLabel11.setText("Cidade");

        jLabel14.setText("Estado");

        jTxtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtIDActionPerformed(evt);
            }
        });

        jLabel5.setText("CPF");

        jLabel13.setText("ID");

        jLabel6.setText("RG");

        jLabel16.setText("Telefone");

        jLabel17.setText("Número da Casa");

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

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excluir.png"))); // NOI18N
        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Confirmado.png"))); // NOI18N
        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jFmtCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtCepActionPerformed(evt);
            }
        });

        jCboVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboVendedorActionPerformed(evt);
            }
        });

        jLabel7.setText("Vendedor");

        jLabel2.setText("Cliente");

        jCboCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboClienteActionPerformed(evt);
            }
        });

        jLabel12.setText("Data da Entrega");

        jTxtNumCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNumCasaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(28, 28, 28)
                                        .addComponent(jTxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(56, 56, 56)
                                            .addComponent(jTxtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(37, 37, 37)
                                                .addComponent(jFmtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(18, 18, 18)
                                        .addComponent(jFmtTelefone))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTxtNumCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(45, 45, 45)
                                        .addComponent(jFmtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(68, 68, 68)
                                        .addComponent(jTxtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(22, 22, 22)
                                        .addComponent(jFmtData, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTxtID, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCboVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jBtnExcluir)
                        .addGap(14, 14, 14)
                        .addComponent(jBtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnPesquisar)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jTxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCboVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jCboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jFmtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jTxtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(jTxtNumCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel16))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jFmtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jFmtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFmtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(101, 101, 101)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtIDActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
      Util.habilitar(false, jTxtBairro, jTxtCidade, jTxtEndereco, jTxtEstado, jTxtID, jTxtNumCasa,
                jTxtRG, jFmtCPF, jFmtCep, jFmtData, jFmtTelefone, jCboCliente, 
                jCboVendedor, jBtnCancelar, jBtnConfirmar);
      
<<<<<<< HEAD
      Util.habilitar(true, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
=======
<<<<<<< HEAD
      Util.habilitar(true, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
=======
<<<<<<< HEAD
      Util.habilitar(true, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
=======
      Util.habilitar(true, jBtnAlterar, jBtnExlcuir, jBtnIncluir, jBtnPesquisar);
>>>>>>> a39f6a3e389fc4532bbcda4e8f5d2756cc862b1d
>>>>>>> 55df74220d96b2f3edc43084e6b27e73990c10cc
>>>>>>> f38b18788bc284862b466ecca84678e102546fb2
      
        Util.limparCampos(jTxtBairro, jTxtCidade, jTxtEndereco, jTxtEstado, jTxtID, jTxtNumCasa,
                jTxtRG, jFmtCPF, jFmtCep, jFmtData, jFmtTelefone, jCboCliente, 
                jCboVendedor);
        Util.mensagem("Operação Cancelada");
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        // TODO add your handling code here:
        JDlgEntregasPesquisar jDlgEntregasPesquisar = new JDlgEntregasPesquisar(null, true);
        jDlgEntregasPesquisar.setTelaAnterior(this);        
        jDlgEntregasPesquisar.setVisible(true);
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        // TODO add your handling code here:
        Util.habilitar(true, jTxtBairro, jTxtCidade, jTxtEndereco, jTxtEstado, jTxtID, jTxtNumCasa,
                jTxtRG, jFmtCPF, jFmtCep, jFmtData, jFmtTelefone, jCboCliente, 
                jCboVendedor, jBtnCancelar, jBtnConfirmar);
        
<<<<<<< HEAD
        Util.habilitar(false, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
=======
<<<<<<< HEAD
        Util.habilitar(false, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
=======
<<<<<<< HEAD
        Util.habilitar(false, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
=======
        Util.habilitar(false, jBtnAlterar, jBtnExlcuir, jBtnIncluir, jBtnPesquisar);
>>>>>>> a39f6a3e389fc4532bbcda4e8f5d2756cc862b1d
>>>>>>> 55df74220d96b2f3edc43084e6b27e73990c10cc
>>>>>>> f38b18788bc284862b466ecca84678e102546fb2
        
        Util.limparCampos(jTxtBairro, jTxtCidade, jTxtEndereco, jTxtEstado, jTxtID, jTxtNumCasa,
                jTxtRG, jFmtCPF, jFmtCep, jFmtData, jFmtTelefone, jCboCliente, 
                jCboVendedor);
        incluindo = true;
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        // TODO add your handling code here:
        Util.habilitar(true, jTxtBairro, jTxtCidade, jTxtEndereco, jTxtEstado, jTxtID, jTxtNumCasa,
                jTxtRG, jFmtCPF, jFmtCep, jFmtData, jFmtTelefone, jCboCliente, 
                jCboVendedor, jBtnCancelar, jBtnConfirmar);
         
<<<<<<< HEAD
         Util.habilitar(false, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
=======
<<<<<<< HEAD
         Util.habilitar(false, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
=======
<<<<<<< HEAD
         Util.habilitar(false, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
=======
         Util.habilitar(false, jBtnAlterar, jBtnExlcuir, jBtnIncluir, jBtnPesquisar);
>>>>>>> a39f6a3e389fc4532bbcda4e8f5d2756cc862b1d
>>>>>>> 55df74220d96b2f3edc43084e6b27e73990c10cc
>>>>>>> f38b18788bc284862b466ecca84678e102546fb2
         
        incluindo = false;
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        // TODO add your handling code here:
        if ((Util.pergunta("Deseja excluir o registro?") == true)){
            MslfEntregas entregas = viewBean();
            EntregasDAO entregasDAO = new EntregasDAO();
            entregasDAO.delete(entregas);
            Util.mensagem("Exclusão realizada com sucesso");
        } else {
            Util.mensagem("Exclusão cancelada com Sucesso");
        }      
        Util.limparCampos(jTxtBairro, jTxtCidade, jTxtEndereco, jTxtEstado, jTxtID, jTxtNumCasa,
                jTxtRG, jFmtCPF, jFmtCep, jFmtData, jFmtTelefone, jCboCliente, 
                jCboVendedor);
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
       if (incluindo == true) {
              MslfEntregas entregas = viewBean();  
        EntregasDAO entregasDAO = new EntregasDAO();
        entregasDAO.insert(entregas);
        }else{
            MslfEntregas entregas = viewBean();  
        EntregasDAO entregasDAO = new EntregasDAO();
        entregasDAO.update(entregas);
       }
        
         Util.habilitar(false, jTxtBairro, jTxtCidade, jTxtEndereco, jTxtEstado, jTxtID, jTxtNumCasa,
                jTxtRG, jFmtCPF, jFmtCep, jFmtData, jFmtTelefone, jCboCliente, 
                jCboVendedor, jBtnCancelar, jBtnConfirmar);
         
<<<<<<< HEAD
         Util.habilitar(true, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
=======
<<<<<<< HEAD
         Util.habilitar(true, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
=======
<<<<<<< HEAD
         Util.habilitar(true, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
=======
         Util.habilitar(true, jBtnAlterar, jBtnExlcuir, jBtnIncluir, jBtnPesquisar);
>>>>>>> a39f6a3e389fc4532bbcda4e8f5d2756cc862b1d
>>>>>>> 55df74220d96b2f3edc43084e6b27e73990c10cc
>>>>>>> f38b18788bc284862b466ecca84678e102546fb2
         
         Util.limparCampos(jTxtBairro, jTxtCidade, jTxtEndereco, jTxtEstado, jTxtID, jTxtNumCasa,
                jTxtRG, jFmtCPF, jFmtCep, jFmtData, jFmtTelefone, jCboCliente, 
                jCboVendedor);
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jFmtCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtCepActionPerformed

    private void jCboVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboVendedorActionPerformed

    private void jCboClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboClienteActionPerformed

    private void jTxtNumCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNumCasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNumCasaActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgEntregas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgEntregas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgEntregas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgEntregas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgEntregas dialog = new JDlgEntregas(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JComboBox<MslfCliente> jCboCliente;
    private javax.swing.JComboBox<MslfVendedor> jCboVendedor;
    private javax.swing.JFormattedTextField jFmtCPF;
    private javax.swing.JFormattedTextField jFmtCep;
    private javax.swing.JFormattedTextField jFmtData;
    private javax.swing.JFormattedTextField jFmtTelefone;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTxtBairro;
    private javax.swing.JTextField jTxtCidade;
    private javax.swing.JTextField jTxtEndereco;
    private javax.swing.JTextField jTxtEstado;
    private javax.swing.JTextField jTxtID;
    private javax.swing.JTextField jTxtNumCasa;
    private javax.swing.JTextField jTxtRG;
    // End of variables declaration//GEN-END:variables
}
