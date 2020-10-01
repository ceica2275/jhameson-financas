/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;
import ModelBeans.BeansCategoria;

import java.sql.*;

import ModelConnection.Connection_BD;

import javax.swing.JOptionPane;
/**
 *
 * @author jhame
 */
public class DaoCategoria {
    
    Connection_BD conex = new Connection_BD();
    
    
    public void Salvar(BeansCategoria mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into categorias(id_user, nome, tipo) values (?,?,?)");

            pst.setInt(1, mod.getId_user());
            pst.setString(2, mod.getNome());
            pst.setString(3, mod.getTipo());
        
            pst.execute();

            JOptionPane.showMessageDialog(null, "categoria cadastrada com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erros ao cadastrar: " + ex.getMessage());
        }
        conex.desconecta();
    }
    
     public BeansCategoria buscarCategoria(BeansCategoria mod) {
        conex.conexao();

        conex.executaSQL("select *from categorias where nome like '%"+mod.getPesquisa() + "%'");
        try {
            conex.rs.first();
           
            mod.setTipo(conex.rs.getString("tipo"));
            mod.setNome(conex.rs.getString("nome"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao encontrar categoria: " + ex);
        }

        conex.desconecta();
        return mod;
    }
     
     public void excluir(BeansCategoria mod) {
       
        
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from categorias where nome = ?");

            pst.setString(1, mod.getNome());
            pst.execute();

            JOptionPane.showMessageDialog(null, "Categoria excluida com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erros ao excluir: " + ex.getMessage());
        }
        conex.desconecta();

    }
}
