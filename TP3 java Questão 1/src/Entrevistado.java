public class Entrevistado {
    protected String nome;
    protected String endereço;
    protected double renda;
    protected String profissão;
    protected String estadoCivil;
    protected String CPF;
    protected String educação;

    public Entrevistado(String nome,String endereço,double renda,String profissão,String estadoCivil,String CPF,String educação){
        this.nome = nome;
        this.endereço = endereço;
        this.renda = renda;
        this.profissão = profissão;
        this.estadoCivil = estadoCivil;
        this.CPF = CPF;
        this.educação = educação;
    }
    public String getNome() {
        return nome;
    }
    public String getEndereço() {
        return endereço;
    }
    public double getRenda() {
        return renda;
    }
    public String getProfissão() {
        return profissão;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    public String getCPF() {
        return CPF;
    }
    public String getEducação() {
        return educação;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public void setRenda(double renda) {
        this.renda = renda;
    }
    public void setProfissão(String profissão) {
        this.profissão = profissão;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    public void setEducação(String educação) {
        this.educação = educação;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + ", Endereço: " + this.endereço + " , Renda: " + this.renda + ", Profissão: " + this.profissão + ", Estado Civil: " + this.estadoCivil + ", CPF: " + this.CPF + ", Educação: " + this.educação ;
    }
}   

