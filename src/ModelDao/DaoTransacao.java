/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;

import ModelBeans.BeansReceita;
import ModelBeans.BeansTransacao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import ModelConnection.*;

/**
 *
 * @author jhame
 */
public class DaoTransacao {

    Connection_BD conex = new Connection_BD();
    BeansTransacao beans_Transacao = new BeansTransacao();

    public void salvarTransacao(BeansTransacao mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into transacao(id_user, valor, tipo, dia, mes, ano, categoria) values (?,?,?,?,?,?,?)");

            pst.setInt(1, mod.getId_user());
            pst.setDouble(2, mod.getValor());
            pst.setString(3, mod.getTipo());
            pst.setInt(4, mod.getDia());
            pst.setInt(5, mod.getMes());
            pst.setInt(6, mod.getAno());
            pst.setString(7, mod.getCategoria());
            pst.execute();

            JOptionPane.showMessageDialog(null, "Transacao Cadastrado com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erros ao cadastrar transacao: " + ex.getMessage());
        }
        conex.desconecta();
    }

    public int retornaUltima() {
        conex.conexao();

        conex.executaSQL("select * from transacao where id_transacao = (select max(id_transacao) from transacao)");
        try {
            conex.rs.first();
            beans_Transacao.setId(conex.rs.getInt("id_transacao"));
            return beans_Transacao.getId();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao encontrar ID_Transa: " + ex);
        }

        conex.desconecta();
        return beans_Transacao.getId();
    }

    //Salva e atualiza
    public void SalvarAtualizando(BeansTransacao mod, int id) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update transacao set valor = ?, dia = ?, mes = ?, ano = ?, categoria =? where id_transacao = '" + id + "'");

            pst.setDouble(1, mod.getValor());
            pst.setInt(2, mod.getDia());
            pst.setInt(3, mod.getMes());
            pst.setInt(4, mod.getAno());
            pst.setString(5, mod.getCategoria());

            pst.execute();

            JOptionPane.showMessageDialog(null, "transacao Atualizada com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "(dao_user)Erros ao atualizar: " + ex.getMessage());
        }
        conex.desconecta();
    }

    public void apagaInvalidos() {

        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from transacao where ano = -1 and dia = -1 and categoria = '-1'");

            pst.execute();

            JOptionPane.showMessageDialog(null, "Usuário excluido com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "(dao_user)Erros ao excluir: " + ex.getMessage());
        }
        conex.desconecta();

    }

    public BeansTransacao buscarTransacao(BeansTransacao mod) {
        conex.conexao();

        conex.executaSQL("select *from transacao where  "
                + "valor  = '" + mod.getPesquisa() + "' or "
                + "categoria like '%" + mod.getPesquisa() + "%'");
        try {
            conex.rs.first();
            mod.setId(conex.rs.getInt("id_transacao"));
            mod.setTipo(conex.rs.getString("tipo"));
            mod.setValor(conex.rs.getDouble("valor"));
            mod.setDia(conex.rs.getInt("dia"));
            mod.setMes(conex.rs.getInt("mes"));
            mod.setAno(conex.rs.getInt("ano"));
            mod.setCategoria(conex.rs.getString("categoria"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Categoria não encontrada!");
        }

        conex.desconecta();
        return mod;
    }

    public BeansTransacao proximo(BeansTransacao mod) {
        conex.conexao();

        try {
            conex.rs.next();
            mod.setId(conex.rs.getInt("id_transacao"));
            mod.setTipo(conex.rs.getString("tipo"));
            mod.setValor(conex.rs.getDouble("valor"));
            mod.setDia(conex.rs.getInt("dia"));
            mod.setMes(conex.rs.getInt("mes"));
            mod.setAno(conex.rs.getInt("ano"));
            mod.setCategoria(conex.rs.getString("categoria"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Categoria não encontrada!");
        }

        return mod;
    }

    public void excluirTrsancao(int id) {

        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from transacao where id_transacao = '"+id+"'");

            pst.execute();

            JOptionPane.showMessageDialog(null, "Cartao excluido com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erros ao excluir: " + ex.getMessage());
        }
        conex.desconecta();

    }
}
