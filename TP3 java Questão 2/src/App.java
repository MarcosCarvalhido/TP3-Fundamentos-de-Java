/*Para um projeto de software foi verificado que a superclasse Brasileiro tem os atributos
    nome, CPF, endereço e nascimento
e nas subclasses Fluminense,Catarinense, Sergipano, Amazonense e Goaiano
    os atributos cidade e RG.
Elabore um projeto em Java para esta demanda e teste todos os objetos informados.
Obs: As subclasses são todas do tipo final e a superclasse é abstrata.
 */
public class App {
    public static void main(String[] args) throws Exception {
        Fluminense marcos = new Fluminense("Marcos", "111,111,111-11", "Tijuca", "18/10/1998", "Rio De Janeiro", "1111.1111");
        System.out.println(marcos.toString());
        Catarinense joão = new Catarinense("João", "222,222,222-22", "Praia", "16/10/1997", "Florianopolis", "2222.2222");
        System.out.println(joão.toString());
        Goaiano luis = new Goaiano("Luis", "333,333,333-33", "Rua", "03/11/1988", "Goiais", "3333.3333");
        System.out.println(luis.toString());
        Sergipano pedro = new Sergipano("pedro", "444,444,444-44", "Prefeitura", "9/07/2009", "Aracaju", "4444.4444");
        System.out.println(pedro.toString());
        Amazonense tiago = new Amazonense("tiago", "555,555,555-55", "Largo", "14/11/2002", "Manaus", "5555.5555");
        System.out.println(tiago.toString());
    }
}
