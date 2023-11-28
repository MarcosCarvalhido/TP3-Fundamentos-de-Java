public abstract class Brasileiro {
    protected String nome;
    protected String CPF;
    protected String endereço;
    protected String dataDeNascimento;

    public Brasileiro(String nome,String CPF, String endereço,String dataDeNascimento){
        this.nome = nome;
        this.CPF = CPF;
        this.endereço = endereço;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }
    public String getCPF() {
        return CPF;
    }
    public String getEndereço() {
        return endereço;
    }
    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCPF(String cPF) {
        this.CPF = cPF;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
          return "Nome: " + this.nome + ", CPF: " + this.CPF + ", Endereço: " + this.endereço + ", Data de Nascimento: " + this.dataDeNascimento;
    }
}
