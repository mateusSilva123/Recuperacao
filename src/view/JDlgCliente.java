/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.pesquisar.JDlgClientePesquisar;
import bean.MslfCliente;
import dao.ClienteDAO;
import bean.MslfUsuarios;
import dao.UsuariosDAO;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import tools.Util;


/**
 *
 * @author Usuario VCP
 */
public class JDlgCliente extends javax.swing.JDialog {

    boolean incluindo;
    MaskFormatter mascaraCpf;
    MaskFormatter mascaraData;
    MaskFormatter mascaraNumero;

    /**
     * Creates new form JDlgCliente
     */
    public JDlgCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Cliente");
        
        UsuariosDAO usuariosDAO = new UsuariosDAO();
        List listaUsuarios = usuariosDAO.listALL();
        for (int i = 0; i < listaUsuarios.size(); i++) {
            jCboUsuarios.addItem((MslfUsuarios) listaUsuarios.get(i));            
        }
        
        setLocationRelativeTo(null);
        Util.habilitar(false, jTxtApelido, jTxtBairro, jTxtCidade, jTxtEmail, jTxtEndereco,
                jTxtEstado, jTxtID, jTxtNome, jTxtRG, jPwfSenha, jFmtCPF, jFmtCep, jFmtData,
                jFmtTelefone, jCboSexo, jCboUsuarios, jBtnCancelar, jBtnConfirmar);
        
<<<<<<< HEAD
        Util.habilitar(true, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
=======
<<<<<<< HEAD
        Util.habilitar(true, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
=======
        Util.habilitar(true, jBtnAlterar, jBtnExlcuir, jBtnIncluir, jBtnPesquisar);
>>>>>>> a39f6a3e389fc4532bbcda4e8f5d2756cc862b1d
>>>>>>> 55df74220d96b2f3edc43084e6b27e73990c10cc
        
        try {
            mascaraCpf = new MaskFormatter("###.###.###-##");
            mascaraNumero = new MaskFormatter("(##) ### ###-###");
            mascaraData = new MaskFormatter("##/##/####");
            
        } catch (ParseException ex) {
            Logger.getLogger(JDlgCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        jFmtCPF.setFormatterFactory(new DefaultFormatterFactory(mascaraCpf));
        jFmtTelefone.setFormatterFactory(new DefaultFormatterFactory(mascaraNumero));
        jFmtData.setFormatterFactory(new DefaultFormatterFactory(mascaraData));
    }
    
    public MslfCliente viewBean() {
        MslfCliente cliente = new MslfCliente(); // criou o bean
        
        cliente.setMslfUsuarios((MslfUsuarios) jCboUsuarios.getSelectedItem());
        cliente.setMslfIdCliente(Util.strInt(jTxtID.getText()));
        cliente.setMslfNome(jTxtNome.getText() );
        cliente.setMslfApelido(jTxtApelido.getText() );
        cliente.setMslfBairro(jTxtBairro.getText() );
        cliente.setMslfCidade(jTxtCidade.getText() );
        cliente.setMslfCep(jFmtCep.getText() );
        cliente.setMslfCpf(jFmtCPF.getText() );
        cliente.setMslfTelefone(jFmtTelefone.getText() );
        cliente.setMslfEmail(jTxtEmail.getText() );
        cliente.setMslfEndereco(jTxtEndereco.getText() );
        cliente.setMslfEstado(jTxtEstado.getText() );
        cliente.setMslfNome(jTxtNome.getText() );
        cliente.setMslfRg(jTxtRG.getText() );
        cliente.setMslfSenha(jPwfSenha.getText() );
        cliente.setMslfSexo((String) jCboSexo.getSelectedItem());
        cliente.setMslfDataNasc(Util.strDate(jFmtData.getText()));
        
        return cliente;
    };
    
     public void beanView(MslfCliente cliente) {
        jTxtID.setText( Util.intStr(cliente.getMslfIdCliente()) ); // AQUI
        jCboUsuarios.setSelectedItem(cliente.getMslfUsuarios());
        
        jTxtNome.setText( cliente.getMslfNome() );
        jTxtApelido.setText( cliente.getMslfApelido() );
        jTxtBairro.setText(cliente.getMslfBairro());
        jTxtCidade.setText( cliente.getMslfCidade());
        jFmtCep.setText( cliente.getMslfCep());
        jFmtCPF.setText( cliente.getMslfCpf());
        jFmtTelefone.setText( cliente.getMslfTelefone());
        jTxtEmail.setText( cliente.getMslfEmail());
        jTxtEndereco.setText( cliente.getMslfEndereco());
        jTxtEstado.setText( cliente.getMslfEstado());
        jTxtNome.setText( cliente.getMslfNome());
        jTxtRG.setText( cliente.getMslfRg());
        jCboSexo.setSelectedItem(cliente.getMslfSexo());
        jPwfSenha.setText( cliente.getMslfSenha());
        jFmtData.setText(Util.dateStr(cliente.getMslfDataNasc())); // AQUI
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
        jPwfSenha = new javax.swing.JPasswordField();
        jTxtEmail = new javax.swing.JTextField();
        jTxtID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTxtRG = new javax.swing.JTextField();
        jCboSexo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTxtApelido = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jBtnCancelar = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();
        jBtnIncluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnConfirmar = new javax.swing.JButton();
        jFmtCep = new javax.swing.JFormattedTextField();
        jFmtCPF = new javax.swing.JFormattedTextField();
        jFmtData = new javax.swing.JFormattedTextField();
        jFmtTelefone = new javax.swing.JFormattedTextField();
        jLabel22 = new javax.swing.JLabel();
        jCboUsuarios = new javax.swing.JComboBox<MslfUsuarios>();

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

        jCboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino", "Outro" }));
        jCboSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboSexoActionPerformed(evt);
            }
        });

        jLabel7.setText("Sexo");

        jLabel16.setText("Telefone");

        jLabel17.setText("Data de Nascimento");

        jLabel18.setText("Apelido");

        jLabel19.setText("Nome");

        jLabel20.setText("Senha");

        jTxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNomeActionPerformed(evt);
            }
        });

        jLabel21.setText("Email");

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

        jLabel22.setText("Usuario");

        jCboUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboUsuariosActionPerformed(evt);
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
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel8))
                                            .addGap(37, 37, 37))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel19)
                                            .addGap(29, 29, 29)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTxtApelido, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jFmtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jFmtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jFmtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addGap(178, 178, 178))))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel11))
                                        .addGap(22, 22, 22))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtEndereco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtEstado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jTxtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6)))
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
                        .addComponent(jBtnExcluir)
                        .addGap(14, 14, 14)
                        .addComponent(jBtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnPesquisar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFmtData, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCboUsuarios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(31, 31, 31)
                        .addComponent(jCboSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPwfSenha))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtEmail)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22)
                        .addComponent(jCboUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(jTxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jFmtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPwfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jCboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jTxtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jTxtApelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFmtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jFmtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jFmtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
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
       Util.habilitar(false, jTxtApelido, jTxtBairro, jTxtCidade, jTxtEmail, jTxtEndereco,
                jTxtEstado, jTxtID, jTxtNome, jTxtRG, jPwfSenha, jFmtCPF, jFmtCep, jFmtData,
                jFmtTelefone, jCboSexo, jCboUsuarios, jBtnCancelar, jBtnConfirmar);
       
<<<<<<< HEAD
       Util.habilitar(true, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
=======
<<<<<<< HEAD
       Util.habilitar(true, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
=======
       Util.habilitar(true, jBtnAlterar, jBtnExlcuir, jBtnIncluir, jBtnPesquisar);
>>>>>>> a39f6a3e389fc4532bbcda4e8f5d2756cc862b1d
>>>>>>> 55df74220d96b2f3edc43084e6b27e73990c10cc
       
        Util.limparCampos(jTxtApelido, jTxtBairro, jTxtCidade, jTxtEmail, jTxtEndereco,
                jTxtEstado, jTxtID, jTxtNome, jTxtRG, jPwfSenha, jFmtCPF, jFmtCep, jFmtData,
                jFmtTelefone, jCboSexo, jCboUsuarios);
        Util.mensagem("Operação Cancelada");
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        // TODO add your handling code here:
        JDlgClientePesquisar jDlgClientePesquisar = new JDlgClientePesquisar(null, true);
        jDlgClientePesquisar.setTelaAnterior(this);        
        jDlgClientePesquisar.setVisible(true);
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        // TODO add your handling code here:
        Util.habilitar(true, jTxtApelido, jTxtBairro, jTxtCidade, jTxtEmail, jTxtEndereco,
                jTxtEstado, jTxtID, jTxtNome, jTxtRG, jPwfSenha, jFmtCPF, jFmtCep, jFmtData,
                jFmtTelefone, jCboSexo, jCboUsuarios, jBtnCancelar, jBtnConfirmar);
        
<<<<<<< HEAD
        Util.habilitar(false, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
=======
<<<<<<< HEAD
        Util.habilitar(false, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
=======
        Util.habilitar(false, jBtnAlterar, jBtnExlcuir, jBtnIncluir, jBtnPesquisar);
>>>>>>> a39f6a3e389fc4532bbcda4e8f5d2756cc862b1d
>>>>>>> 55df74220d96b2f3edc43084e6b27e73990c10cc
        
        Util.limparCampos(jTxtApelido, jTxtBairro, jTxtCidade, jTxtEmail, jTxtEndereco,
                jTxtEstado, jTxtID, jTxtNome, jTxtRG, jPwfSenha, jFmtCPF, jFmtCep, jFmtData,
                jFmtTelefone, jCboSexo, jCboUsuarios);
        incluindo = true;
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        // TODO add your handling code here:
         Util.habilitar(true, jTxtApelido, jTxtBairro, jTxtCidade, jTxtEmail, jTxtEndereco,
                jTxtEstado, jTxtID, jTxtNome, jTxtRG, jPwfSenha, jFmtCPF, jFmtCep, jFmtData,
                jFmtTelefone, jCboSexo, jCboUsuarios, jBtnCancelar, jBtnConfirmar);
         
<<<<<<< HEAD
         Util.habilitar(false, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
=======
<<<<<<< HEAD
         Util.habilitar(false, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
=======
         Util.habilitar(false, jBtnAlterar, jBtnExlcuir, jBtnIncluir, jBtnPesquisar);
>>>>>>> a39f6a3e389fc4532bbcda4e8f5d2756cc862b1d
>>>>>>> 55df74220d96b2f3edc43084e6b27e73990c10cc
         
        incluindo = false;
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        if ((Util.pergunta("Deseja excluir o registro?") == true)){
            MslfCliente cliente = viewBean();
            ClienteDAO clienteDAO = new ClienteDAO();
            clienteDAO.delete(cliente);
            Util.mensagem("Exclusão realizada com sucesso");
        } else {
            Util.mensagem("Exclusão cancelada com sucesso");
        }      
        Util.limparCampos(jTxtApelido, jTxtBairro, jTxtCidade, jTxtEmail, jTxtEndereco,
                jTxtEstado, jTxtID, jTxtNome, jTxtRG, jPwfSenha, jFmtCPF, jFmtCep, jFmtData,
                jFmtTelefone, jCboSexo, jCboUsuarios);
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        if (incluindo == true) {
<<<<<<< HEAD
            MslfCliente cliente = viewBean();  
            ClienteDAO clienteDAO = new ClienteDAO();
            clienteDAO.insert(cliente);
        }else{
            MslfCliente cliente = viewBean();  
            ClienteDAO clienteDAO = new ClienteDAO();
            clienteDAO.update(cliente);
=======
<<<<<<< HEAD
            MslfCliente cliente = viewBean();  
            ClienteDAO clienteDAO = new ClienteDAO();
            clienteDAO.insert(cliente);
        }else{
            MslfCliente cliente = viewBean();  
            ClienteDAO clienteDAO = new ClienteDAO();
            clienteDAO.update(cliente);
=======
              MslfCliente cliente = viewBean();  
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.insert(cliente);
        }else{
            MslfCliente cliente = viewBean();  
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.update(cliente);
>>>>>>> a39f6a3e389fc4532bbcda4e8f5d2756cc862b1d
>>>>>>> 55df74220d96b2f3edc43084e6b27e73990c10cc
        }
        
         Util.habilitar(false, jTxtApelido, jTxtBairro, jTxtCidade, jTxtEmail, jTxtEndereco,
                jTxtEstado, jTxtID, jTxtNome, jTxtRG, jPwfSenha, jFmtCPF, jFmtCep, jFmtData,
                jFmtTelefone, jCboSexo, jCboUsuarios, jBtnCancelar, jBtnConfirmar);
             
<<<<<<< HEAD
         Util.habilitar(true, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
=======
<<<<<<< HEAD
         Util.habilitar(true, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
=======
         Util.habilitar(true, jBtnAlterar, jBtnExlcuir, jBtnIncluir, jBtnPesquisar);
>>>>>>> a39f6a3e389fc4532bbcda4e8f5d2756cc862b1d
>>>>>>> 55df74220d96b2f3edc43084e6b27e73990c10cc
         
         Util.limparCampos(jTxtApelido, jTxtBairro, jTxtCidade, jTxtEmail, jTxtEndereco,
                jTxtEstado, jTxtID, jTxtNome, jTxtRG, jPwfSenha, jFmtCPF, jFmtCep, jFmtData,
                jFmtTelefone, jCboSexo, jCboUsuarios);
                                    
        
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jFmtCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtCepActionPerformed

    private void jCboSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboSexoActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgCliente dialog = new JDlgCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> jCboSexo;
    private javax.swing.JComboBox<MslfUsuarios> jCboUsuarios;
    private javax.swing.JFormattedTextField jFmtCPF;
    private javax.swing.JFormattedTextField jFmtCep;
    private javax.swing.JFormattedTextField jFmtData;
    private javax.swing.JFormattedTextField jFmtTelefone;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPwfSenha;
    private javax.swing.JTextField jTxtApelido;
    private javax.swing.JTextField jTxtBairro;
    private javax.swing.JTextField jTxtCidade;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtEndereco;
    private javax.swing.JTextField jTxtEstado;
    private javax.swing.JTextField jTxtID;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtRG;
    // End of variables declaration//GEN-END:variables
}
