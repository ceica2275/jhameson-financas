/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;

import ModelBeans.BeansCartao;
import ModelBeans.BeansUsuario;
import ModelConnection.Connection_BD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jhame
 */
public class DaoCartao {
    
    Connection_BD conex = new Connection_BD();
    BeansCartao cart = new BeansCartao();
    
     public void  Salvar(BeansUsuario mod){
        conex.conexao();
        try{
            PreparedStatement pst = conex.con.prepareStatement("insert into infocartao(numero, tipo, bandeira, limite, valor_atual, fechamento ) values (?,?,?,?,?,?)");
            
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEmail());
            pst.setString(3, mod.getUsuario());
            pst.setString(4, mod.getSenha());
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Usuário Cadastrado com Sucesso");
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erros ao cadastrar: "+ex.getMessage());
        }
        conex.desconecta();
    }
    
}
