/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelBeans;

/**
 *
 * @author jhame
 */
public class BeansCartao {

    /**
     * @return the numero
     */
    //jhameson
     private int numero;
    private String tipo;
    private String bandeira;
    int teste;
    int vida;
    
    ////**
    
    private float limite;
    private int valor_atual;
    private Data fechamento;
    
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the bandeira
     */
    public String getBandeira() {
        return bandeira;
    }

    /**
     * @param bandeira the bandeira to set
     */
    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    /**
     * @return the limite
     */
    public float getLimite() {
        return limite;
    }

    /**
     * @param limite the limite to set
     */
    public void setLimite(float limite) {
        this.limite = limite;
    }

    /**
     * @return the valor_atual
     */
    public int getValor_atual() {
        return valor_atual;
    }

    /**
     * @param valor_atual the valor_atual to set
     */
    public void setValor_atual(int valor_atual) {
        this.valor_atual = valor_atual;
    }

    /**
     * @return the fechamento
     */
    public Data getFechamento() {
        return fechamento;
    }

    /**
     * @param fechamento the fechamento to set
     */
    public void setFechamento(Data fechamento) {
        this.fechamento = fechamento;
    }
   
}
