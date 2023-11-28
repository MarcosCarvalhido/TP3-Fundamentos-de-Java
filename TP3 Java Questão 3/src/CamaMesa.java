import java.text.MessageFormat;

public final class CamaMesa extends LojaDepartamento {
    public double preço;
    public long estoque;
    public String fornecedor;

    public CamaMesa(String nome,String ean,double preço, long estoque,String fornecedor){
        super(nome,ean);
        this.preço = preço;
        this.estoque = estoque;
        this.fornecedor = fornecedor;
    }

    public double getPreço() {
        return preço;
    }
    public long getEstoque() {
        return estoque;
    }
    public String getFornecedor() {
        return fornecedor;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }
    public void setEstoque(long estoque) {
        this.estoque = estoque;
    }
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}, Preço por unidade: {1}, Quantidade em Estoque: {2}, Fornecedor Atual: {3}."
        ,super.toString(),this.preço,this.estoque,this.fornecedor);
    }
}
