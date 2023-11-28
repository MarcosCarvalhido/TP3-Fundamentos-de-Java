import java.text.MessageFormat;

public abstract class valorDosProdutos {
    public String nomeMercado;
    public String ean;

    public valorDosProdutos(String nome,String ean){
        this.nomeMercado = nome;
        this.ean = ean;
    }

    public String getNomeMercado() {
        return nomeMercado;
    }
    public String getEan() {
        return ean;
    }

    public void setNomeMercado(String nome) {
        this.nomeMercado = nome;
    }
    public void setEan(String ean) {
        this.ean = ean;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Nome do Mercado: {0}, Codigo EAN: {1}"
        ,this.nomeMercado,this.ean);
    }
}
