/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;
import ModelBeans.BeansDespesas;
import ModelBeans.BeansUsuario;
import ModelConnection.Connection_BD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jhame
 */
public class DaoDespesa {
    
    Connection_BD conex = new Connection_BD();
    BeansDespesas mod_despesa = new BeansDespesas();
   

    public void Salvar(BeansDespesas mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into despesa(id_user, valor, categoria, data, descricao, forma_pagamento, status) values (?,?,?,?,?,?,?)");

            pst.setInt(1, mod.getId());
            pst.setDouble(2, mod.getValor());
            pst.setString(3, mod.getCategoria());
            pst.setString(4, mod.getData());
            pst.setString(5, mod.getDescricao());
            pst.setString(6, mod.getForma_pagamento());
            pst.setString(7, mod.getStatus());
           
            pst.execute();

            JOptionPane.showMessageDialog(null, "Despesa Cadastrado com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erros ao cadastrar: " + ex.getMessage());
}
        conex.desconecta();
    }
    
    //metodo para somar o valor em receitas
    public int somarDespesas(int id) {
        conex.conexao();
        conex.executaSQL("select sum(valor) as soma from despesa where id_user = '" + id + "'");

        try {
            conex.rs.first();
            
            
            return conex.rs.getInt("soma");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "deu merda");
        }
        return 0;
    }
    /*
    public BeansReceita buscaReceita(BeansReceita br) {
        conex.conexao();
        conex.executaSQL("select *from receita where categoria like'%" + br.getPesquisa() + "%'");
        try {
            conex.rs.first();

            // br.setId(conex.rs.getInt("id_user"));
            br.setValor(conex.rs.getDouble("valor"));
            br.setCategoria(conex.rs.getString("categoria"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na busca: " + ex.getMessage());
        }

        conex.desconecta();
        return br;
    }

    //metodo para somar o valor em receitas
    public int somarReceitas(int id) {
        conex.conexao();
        conex.executaSQL("select sum(valor) as soma from receita where id_user = '" + id + "'");

        try {
            conex.rs.first();
            
            
            return conex.rs.getInt("soma");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "deu merda");
        }
        return 0;
    }
    
    */
     public void excluirTodasDespesas(BeansUsuario mod) {
        
        
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from despesa where id_user = ?");

            pst.setInt(1, mod.getId());
            pst.execute();

            //JOptionPane.showMessageDialog(null, "Usuário excluido com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "(dao_user)Erros ao excluir: " + ex.getMessage());
        }
        conex.desconecta();

    }
}
