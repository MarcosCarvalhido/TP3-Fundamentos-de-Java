import java.text.MessageFormat;

public abstract class LojaDepartamento {
    protected String nome;
    protected String ean;

    public LojaDepartamento(String nome,String ean){
        this.nome = nome;
        this.ean = ean;
    }

    public String getNome() {
        return nome;
    }
    public String getEan() {
        return ean;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEan(String ean) {
        this.ean = ean;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Nome do Produto: {0}, Codigo EAN: {1}"
        ,this.nome,this.ean);
    }
}
