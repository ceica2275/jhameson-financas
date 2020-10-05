/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import ModelBeans.BeansUsuario;
import ModelConnection.Connection_BD;
import ModelDao.DaoUser;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

/**
 *
 * @author jhame
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    Connection_BD conecta = new Connection_BD();
    DaoUser dao_user = new DaoUser();
    BeansUsuario mod = new BeansUsuario();

    public Login() {
        initComponents();
        conecta.conexao();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelSenha = new javax.swing.JLabel();
        jButtonEntrar = new javax.swing.JButton();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieSenha = new javax.swing.JPasswordField();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabelFundo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(null);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabelSenha.setFont(new java.awt.Font("Linux Libertine G", 1, 48)); // NOI18N
        jLabelSenha.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSenha.setText("Credenciais");
        getContentPane().add(jLabelSenha);
        jLabelSenha.setBounds(40, 10, 270, 55);

        jButtonEntrar.setBackground(new java.awt.Color(17, 216, 61));
        jButtonEntrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonEntrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEntrar.setText("Entrar");
        jButtonEntrar.setBorderPainted(false);
        jButtonEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEntrar.setFocusPainted(false);
        jButtonEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEntrarMouseExited(evt);
            }
        });
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEntrar);
        jButtonEntrar.setBounds(20, 200, 300, 30);

        jTextFieldUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(20, 90, 300, 40);

        jPasswordFieSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPasswordFieSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordFieSenha);
        jPasswordFieSenha.setBounds(20, 150, 300, 40);

        jButtonCadastrar.setBackground(new java.awt.Color(51, 51, 255));
        jButtonCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.setBorderPainted(false);
        jButtonCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadastrar.setFocusPainted(false);
        jButtonCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonCadastrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCadastrarMouseExited(evt);
            }
        });
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrar);
        jButtonCadastrar.setBounds(20, 320, 300, 30);

        jButtonSair.setBackground(new java.awt.Color(204, 0, 51));
        jButtonSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonSair.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSair.setText("Sair");
        jButtonSair.setBorderPainted(false);
        jButtonSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSair.setFocusPainted(false);
        jButtonSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonSairMouseExited(evt);
            }
        });
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(20, 240, 300, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Senha:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 130, 80, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Usuário:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 70, 80, 17);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Cadastrar Novo Usuário");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 290, 170, 17);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Logo200.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(550, 10, 200, 200);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton3.setText("Administrador");
        jButton3.setBorderPainted(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(630, 370, 110, 22);

        jLabelFundo.setBackground(new java.awt.Color(204, 204, 204));
        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imgFUNDO.jpeg"))); // NOI18N
        getContentPane().add(jLabelFundo);
        jLabelFundo.setBounds(-140, -150, 1024, 768);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Usuário");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 70, 80, 17);

        setSize(new java.awt.Dimension(759, 400));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        entrar();

    }//GEN-LAST:event_jButtonEntrarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        CadastroUsuario c_user = new CadastroUsuario();
        c_user.setVisible(true);
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        jPasswordFieSenha.requestFocus();

    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jPasswordFieSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieSenhaActionPerformed
        entrar();
    }//GEN-LAST:event_jPasswordFieSenhaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEntrarMouseEntered
        
        jButtonEntrar.setBackground(new Color(51,204,0));
        jButtonEntrar.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButtonEntrarMouseEntered

    private void jButtonSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSairMouseEntered
        
        jButtonSair.setBackground(new Color(255,0,0));
        jButtonSair.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButtonSairMouseEntered

    private void jButtonEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEntrarMouseExited
        jButtonEntrar.setBackground(new Color(17,216,61));
        jButtonEntrar.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jButtonEntrarMouseExited

    private void jButtonSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSairMouseExited
       jButtonSair.setBackground(new Color(204, 0, 51));
        jButtonSair.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButtonSairMouseExited

    private void jButtonCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCadastrarMouseEntered
        
        jButtonCadastrar.setBackground(new Color(102,204,255));
        jButtonCadastrar.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButtonCadastrarMouseEntered

    private void jButtonCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCadastrarMouseExited
        jButtonCadastrar.setBackground(new Color(51,51,255));
        jButtonCadastrar.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButtonCadastrarMouseExited

    private void entrar() {

        try {

            conecta.executaSQL("select *from usuario where user_usuario = '" + jTextFieldUsuario.getText() + ""
                    + "' and user_senha = '" + jPasswordFieSenha.getText() + "'");
            conecta.rs.first();
            
            if (conecta.rs.getString("user_senha").equals(jPasswordFieSenha.getText())) {
                
                int id = dao_user.retornaId(jTextFieldUsuario.getText());
                
                TelaInicial tl = new TelaInicial(id);
                
                tl.setVisible(true);
                dispose();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Corrija seu Usuário ou Senha\nOU\nCadastre um Novo Usuário!");
        }
    }

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JPasswordField jPasswordFieSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
