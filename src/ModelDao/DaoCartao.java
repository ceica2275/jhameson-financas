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

    public void SalvarCartaoDebito(BeansCartao mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into cartao(id_user, numero, tipo, bandeira ) values (?,?,?,?)");

            pst.setInt(1, mod.getId());
            pst.setString(2, mod.getNumero());
            pst.setString(3, mod.getTipo());
            pst.setString(4, mod.getBandeira());

            pst.execute();

            JOptionPane.showMessageDialog(null, "Cartao Cadastrado com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erros ao cadastrar: " + ex.getMessage());
        }
        conex.desconecta();
    }

    public void SalvarCartaoCredito(BeansCartao mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into cartao(id_user, numero, tipo, bandeira, limite, valor_atual, dia_fechamento ) values (?,?,?,?,?,?,?)");

            pst.setInt(1, mod.getId());
            pst.setString(2, mod.getNumero());
            pst.setString(3, mod.getTipo());
            pst.setString(4, mod.getBandeira());
            pst.setDouble(5, mod.getLimite());
            pst.setDouble(6, mod.getValor());
            pst.setInt(7, mod.getDia_fechamento());

            pst.execute();

            JOptionPane.showMessageDialog(null, "Cartao Cadastrado com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erros ao cadastrar: " + ex.getMessage());
        }
        conex.desconecta();
    }

    public void excluirTodosCartoes(BeansUsuario mod) {

        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from cartao where id_user = ?");
            pst.setInt(1, mod.getId());
            pst.execute();

            //JOptionPane.showMessageDialog(null, "Usuário excluido com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "(dao_user)Erros ao excluir: " + ex.getMessage());
        }
        conex.desconecta();

    }

    public void editarCredito(BeansCartao mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update cartao set id_user = ?, numero= ?, tipo= ?, bandeira= ?, limite= ?, valor_atual= ?, dia_fechamento = ?  where user_id = ?");

            pst.setInt(1, mod.getId());
            pst.setString(2, mod.getNumero());
            pst.setString(3, mod.getTipo());
            pst.setString(4, mod.getBandeira());
            pst.setDouble(5, mod.getLimite());
            pst.setDouble(6, mod.getValor());
            pst.setInt(7, mod.getDia_fechamento());

            pst.execute();

            JOptionPane.showMessageDialog(null, "credito att sucess");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erros ao atualizar: " + ex.getMessage());
        }
        conex.desconecta();
    }

    public void editarDebito(BeansCartao mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update cartao set id_user = ?, numero= ?, tipo= ?, bandeira= ?  where user_id = ?");

            pst.setInt(1, mod.getId());
            pst.setString(2, mod.getNumero());
            pst.setString(3, mod.getTipo());
            pst.setString(4, mod.getBandeira());

            pst.execute();

            JOptionPane.showMessageDialog(null, "Debito att sucess");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erros ao atualizar: " + ex.getMessage());
        }
        conex.desconecta();
    }
    
    public BeansCartao buscarCartao(BeansCartao mod) {
        conex.conexao();

        conex.executaSQL("select *from cartao where numero like '%" + mod.getPesquisa() + "%'");
        try {
            conex.rs.first();
            mod.setId(conex.rs.getInt("id_user"));
            mod.setNumero(conex.rs.getString("numero"));
            mod.setBandeira(conex.rs.getString("bandeira"));
            mod.setTipo(conex.rs.getString("tipo"));
            mod.setValor(conex.rs.getDouble("valor_atual"));
            mod.setDia_fechamento(conex.rs.getInt("dia_fechamento"));
            mod.setLimite(conex.rs.getDouble("limite"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao encontrar cartao: " + ex);
        }

        conex.desconecta();
        return mod;
    }

}
