/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import bean.MslfVendedor;
import dao.VendedorDAO;
import java.util.List;
<<<<<<< HEAD
<<<<<<<< HEAD:src/view/JDlgVendedorNovo.java
import view.IA.JDlgVendedorNovoIA;
import view.controle.VendedorControle;
========
import view.JDlgUsuariosNovoIA;
import view.UsuariosController;
>>>>>>>> f38b18788bc284862b466ecca84678e102546fb2:Trabalho1Bimestre/src/view/JDlgUsuariosNovo.java
=======
import view.IA.JDlgVendedorNovoIA;
import view.controle.VendedorControle;
>>>>>>> f38b18788bc284862b466ecca84678e102546fb2
import tools.Util;
/**
 *
 * @author eu
 */
public class JDlgVendedorNovo extends javax.swing.JDialog {

    /**
     * Creates new form koko
     */
   // Declaração de atributo
<<<<<<< HEAD
<<<<<<<< HEAD:src/view/JDlgVendedorNovo.java
=======
>>>>>>> f38b18788bc284862b466ecca84678e102546fb2
    VendedorDAO vendedorDAO;
    MslfVendedor vendedor;
    VendedorControle vendedorControle;
    
    JDlgVendedorNovoIA jDlgVendedorNovoIA;
<<<<<<< HEAD
========
    UsuariosDAO usuariosDAO;
    MslfUsuarios usuarios;
    UsuariosController usuariosController;
    
    JDlgUsuariosNovoIA jDlgUsuariosNovoIA;
>>>>>>>> f38b18788bc284862b466ecca84678e102546fb2:Trabalho1Bimestre/src/view/JDlgUsuariosNovo.java
=======
>>>>>>> f38b18788bc284862b466ecca84678e102546fb2
   
    public JDlgVendedorNovo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
<<<<<<< HEAD
<<<<<<<< HEAD:src/view/JDlgVendedorNovo.java
=======
>>>>>>> f38b18788bc284862b466ecca84678e102546fb2
        setLocationRelativeTo(null);
        setTitle("Vendedor");
        
        jDlgVendedorNovoIA = new JDlgVendedorNovoIA(null, true);
        vendedorDAO = new VendedorDAO();
        List lista = vendedorDAO.listALL();
        vendedorControle = new VendedorControle();
        vendedorControle.setList(lista);
<<<<<<< HEAD
        jTable1.setModel(vendedorControle);
========
        setTitle("Usuarios");
        
        jDlgUsuariosNovoIA = new JDlgUsuariosNovoIA(null, true);
        usuariosDAO = new UsuariosDAO();
        List lista = usuariosDAO.listALL();
        usuariosController = new UsuariosController();
        usuariosController.setList(lista);
>>>>>>>> f38b18788bc284862b466ecca84678e102546fb2:Trabalho1Bimestre/src/view/JDlgUsuariosNovo.java
=======
<<<<<<< HEAD
        jTable1.setModel(vendedorControle);
=======
>>>>>>> 55df74220d96b2f3edc43084e6b27e73990c10cc
>>>>>>> f38b18788bc284862b466ecca84678e102546fb2
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jBtnIncluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

<<<<<<< HEAD
=======
        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/incluir.png"))); // NOI18N
>>>>>>> f38b18788bc284862b466ecca84678e102546fb2
        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnIncluir);

<<<<<<< HEAD
=======
        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alterar.png"))); // NOI18N
>>>>>>> f38b18788bc284862b466ecca84678e102546fb2
        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnAlterar);

<<<<<<< HEAD
=======
        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excluir.png"))); // NOI18N
>>>>>>> f38b18788bc284862b466ecca84678e102546fb2
        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnExcluir);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        jDlgVendedorNovoIA.setTitle("Inclusão");
        jDlgVendedorNovoIA.setVisible(true);
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
<<<<<<< HEAD
<<<<<<<< HEAD:src/view/JDlgVendedorNovo.java
=======
>>>>>>> f38b18788bc284862b466ecca84678e102546fb2
        if( Util.pergunta("Você deseja alterar?")== true){
        this.dispose();
       jDlgVendedorNovoIA.setVisible(true);
       jDlgVendedorNovoIA.setTitle("Alteração");
        }
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
       if ((Util.pergunta("Excluir?")) == true) {
            int sel = jTable1.getSelectedRow();
            vendedor = vendedorControle.getbean(sel);
            vendedorDAO.delete(vendedor);
            // Altera os registro da jtable
            List lista = vendedorDAO.listALL();
            vendedorControle.setList(lista);
<<<<<<< HEAD
========
        // TODO add your handling code here:
        jDlgUsuariosNovoIA.setTitle("Alteração");
        jDlgUsuariosNovoIA.setVisible(true);
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        // TODO add your handling code here:
        //Util.perguntar("deseja escluir?");
        if ((Util.pergunta("excluir?")) == true) {
            int sel = jTable1.getSelectedRow();
            usuarios = usuariosController.getBean(sel);
            usuariosDAO.delete(usuarios);
            // Altera os registro da jtable
            List lista = usuariosDAO.listALL();
            usuariosController.setList(lista);
>>>>>>>> f38b18788bc284862b466ecca84678e102546fb2:Trabalho1Bimestre/src/view/JDlgUsuariosNovo.java
        } else
        {
           // Util.mensagem("Exclusão cancelada");
=======
        } else
        {
           Util.mensagem("Exclusão cancelada");
>>>>>>> f38b18788bc284862b466ecca84678e102546fb2
        
        }
    }//GEN-LAST:event_jBtnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgVendedorNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgVendedorNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgVendedorNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgVendedorNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgVendedorNovo dialog = new JDlgVendedorNovo(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}