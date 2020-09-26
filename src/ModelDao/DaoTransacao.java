/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;


import ModelBeans.BeansTransacao;

import ModelConnection.Connection_BD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jhame
 */
public class DaoTransacao {
    Connection_BD conex = new Connection_BD();
    
    BeansTransacao mod = new BeansTransacao();
    
    //DaoUser ddu = new DaoUser();
    
    BeansTransacao beans_transacao = new BeansTransacao();

    public void Salvar(BeansTransacao mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into transacao(id_user, id_transacao, tipo_transacao) values (?,?,?)");

            pst.setInt(1, mod.getId_user());
            pst.setInt(2, mod.getId_transacao());
            pst.setString(3, mod.getTipo());
            pst.execute();

            JOptionPane.showMessageDialog(null, "Usuário Cadastrado com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erros ao cadastrar: " + ex.getMessage());
        }
        conex.desconecta();
    }
/*
    public BeansTransacao buscaReceita(BeansTransacao br) {
        conex.conexao();
        conex.executaSQL("select *from transacao where categoria like'%" + br.getPesquisa() + "%'");
        try {
            conex.rs.first();
            
          //  br.setId(conex.rs.getInt("id_user"));
            br.setValor(conex.rs.getDouble("valor"));
            br.setCategoria(conex.rs.getString("categoria"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na busca: " + ex.getMessage());
        }

        conex.desconecta();
        return br;
    }*/
}
