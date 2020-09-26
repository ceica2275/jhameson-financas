
package ModelBeans;

public class CCredito extends Cartao {
    private Data dia_fechamento;
    private int qtd_parcelas;
    private int limite;

    public Data getDia_fechamento() {
        return dia_fechamento;
    }

    public void setDia_fechamento(Data dia_fechamento) {
        this.dia_fechamento = dia_fechamento;
    }

    public int getQtd_parcelas() {
        return qtd_parcelas;
    }

    public void setQtd_parcelas(int qtd_parcelas) {
        this.qtd_parcelas = qtd_parcelas;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;

    }
}
