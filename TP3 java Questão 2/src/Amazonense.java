public class Amazonense extends Brasileiro {
    protected String cidade;
    protected String RG;
    
    public Amazonense(String nome,String CPF, String endereço,String dataDeNascimento,String cidade,String RG){
        super(nome,CPF,endereço,dataDeNascimento);
        this.cidade = cidade;
        this.RG = RG;
    }
    
    public String getCidade() {
        return cidade;
    }
    public String getRG() {
        return RG;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setRG(String rG) {
        this.RG = rG;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cidade: " + this.cidade + ", RG: " + this.RG; 
    }
}
