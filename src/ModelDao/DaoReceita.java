/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;

import ModelBeans.BeansReceita;

import java.sql.*;

import ModelBeans.BeansUsuario;
import ModelConnection.Connection_BD;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jhame
 */
public class DaoReceita {

    Connection_BD conex = new Connection_BD();
    BeansReceita mod = new BeansReceita();
    DaoUser ddu = new DaoUser();
    BeansUsuario bbu = new BeansUsuario();

    public void Salvar(BeansReceita mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into receita( id_user, valor, categoria, data_transacao) values (?,?,?,?)");

            pst.setInt(1, mod.getId());
            pst.setDouble(2, mod.getValor());
            pst.setString(3, mod.getCategoria());
            pst.setString(4, mod.getData_transacao());
            pst.execute();

            JOptionPane.showMessageDialog(null, "Receita Cadastrado com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erros ao cadastrar: " + ex.getMessage());
        }
        conex.desconecta();
    }

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
    
    
     
}
