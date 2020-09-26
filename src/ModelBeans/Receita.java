
package ModelBeans;

public class Receita {
    private Data data;
    private int valor;
    private String categoria;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }    
}
