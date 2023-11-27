/*No censo de 2022 um fiscal do IBGE precisa obter as seguintes informações:
nome, endereço, renda, profissão, estado civil, CPF e educação.
Elabore uma classe que atenda esta demanda e faça um teste para comprovar que ela está funcionando.
Obs: A única forma de acessar os atributos é por métodos de acesso get e set
 */
public class App {
    public static void main(String[] args) throws Exception {
        Entrevistado entrevistado1 = new Entrevistado("Marcos", "Rio de janeiro,Tijuca", 1300.60, "Estagiario", "Solteiro", "111.111.111-11", "ADS");
        System.out.println(entrevistado1.toString());
    }
}
