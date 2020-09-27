/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;

import java.sql.*;

import ModelBeans.BeansUsuario;
import ModelConnection.Connection_BD;
import javax.swing.JOptionPane;

/**
 *
 * @author jhame
 */
public class DaoUser {

    Connection_BD conex = new Connection_BD();
    BeansUsuario mod = new BeansUsuario();

    public void Salvar(BeansUsuario mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into usuario(user_nome, user_email, user_usuario, user_senha) values (?,?,?,?)");

            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEmail());
            pst.setString(3, mod.getUsuario());
            pst.setString(4, mod.getSenha());

            pst.execute();

            JOptionPane.showMessageDialog(null, "Usuário Cadastrado com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erros ao cadastrar: " + ex.getMessage());
        }
        conex.desconecta();
    }
    
    
    //metodo para verificar se o nome do usuario ja existe
    public boolean verificarExiste(String nome){
       
        conex.conexao();
        conex.executaSQL("select user_usuario from usuario where user_usuario = '"+nome+"'");
        try{
            conex.rs.first();
            mod.setUsuario(conex.rs.getString("user_usuario"));
            conex.desconecta();
            return true;
            //JOptionPane.showMessageDialog(null, "OK existe");
            
        }catch(SQLException e){
            //JOptionPane.showMessageDialog(null, "OK");
        }
        conex.desconecta();
        return false;
    }
    
    //metodo para retornar a id
    public int retornaId(String nome){
        
        conex.conexao();
        conex.executaSQL("select user_id from usuario where user_usuario = '"+nome+"'");
        try{
            conex.rs.first();
            mod.setId(conex.rs.getInt("user_id"));
            return mod.getId();
            //JOptionPane.showMessageDialog(null, "OK existe");
            
        }catch(SQLException e){
            //JOptionPane.showMessageDialog(null, "OK");
        }
        return mod.getId();
    }
    
}
