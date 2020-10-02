/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelBeans;

import java.util.Date;

/**
 *
 * @author jhame
 */
public class BeansReceita extends BeansTransacao{
    
    private int id_transacao;
    
    private String categoria;

    public int getId_transacao() {
        return id_transacao;
    }

    public void setId_transacao(int id_transacao) {
        this.id_transacao = id_transacao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
   
    
   

}
