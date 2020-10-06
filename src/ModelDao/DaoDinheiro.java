/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;

import ModelBeans.BeansDinheiro;
import ModelBeans.BeansUsuario;
import ModelConnection.Connection_BD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jhame
 */
public class DaoDinheiro {

    BeansUsuario beans_user = new BeansUsuario();
    BeansDinheiro beans_dinheiro = new BeansDinheiro();
    Connection_BD conex = new Connection_BD();

    public void quantiaInicial(int id) {
        conex.conexao();
        try {
            JOptionPane.showMessageDialog(null,"Erro na quantia inicial: "+id);
            PreparedStatement pst = conex.con.prepareStatement("insert into dinheiro (id_user, quantia) values ('"+id+"','"+0+"')");
           
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro na quantia inicial: " +ex);
        }

        conex.desconecta();
    }

}
