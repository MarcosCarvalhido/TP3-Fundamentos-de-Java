import java.text.MessageFormat;

public final class Laticínios extends valorDosProdutos {
    public String nomeproduto;
    public double preço;


    public Laticínios(String nomeMercado,String ean,String nomeproduto,double preço){
        super(nomeMercado,ean);
        this.nomeproduto = nomeproduto;
        this.preço = preço;
    }

    public String getNomeproduto() {
        return nomeproduto;
    }
    public double getPreço() {
        return preço;
    }

    public void setNomeproduto(String fornecedor) {
        this.nomeproduto = fornecedor;
    }
    public void setPreço(double preço) {
        this.preço = preço;
    }


    @Override
    public String toString() {
        return MessageFormat.format("{0}, Nome do Produto: {1}, Preço por unidade: {2}."
        ,super.toString(),this.nomeproduto,this.preço);
    }
}
