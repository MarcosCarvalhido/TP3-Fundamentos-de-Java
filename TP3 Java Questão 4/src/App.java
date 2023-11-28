/* Uma empresa de pesquisa espera elaborar um programa para apurar o valor de Produtos (superclasse abstrata) no supermercado, no qual possui como atributos
    nomeMercado e EAN.
As seções apuradas são:
    Açougue, Frios, Laticínios, Adega, Bebidas, Higiene, Hortifruti, Mercearia, Padaria, Enlatados e Cereais,
sendo que cada subclasse final possui os atributos
    nomeproduto e preço.
    
Sabendo-se que a pesquisa será apenas com itens de Açougue e realizada em 10 mercados,
elabore um programa que colete somente o preço da Alcatra nos 10 mercados.
Em seguida, imprima o preço médio, o preço máximo e preço mínimo e informe qual o supermercado indicado para a compra.*/

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static Scanner userInput = new Scanner(System.in,"UTF-16");
    public static void main(String[] args) throws Exception {
        //    Açougue alcatra = new Açougue("Mundial", "11111-1111", "Alcatra", 35.99);
        //    System.out.println(alcatra.toString());
        
        final String SEÇÃO_PESQUISADA = "Açougue";
        final String PRODUTO_PESQUISADO = "Alcatra";
        final int QUANT_MAXIMA = 10;

        ArrayList<valorDosProdutos> listaDeprodutos = new ArrayList<valorDosProdutos>();
        String seção;
        String nome;
        String superMercado;
        String ean;
        double preço;
        
        double preçoMedio;
        double preçoMaximo;
        double preçoMinimo;
        int quant = 0;

        System.out.println("PESQUISA DE PRODUTOS 2023"); 
        System.out.println("Insira as informações de cada produto ou digite FIM para criar um resumo."); 
        do {
            seção = PerguntarSeção();
            if(seção.equals(SEÇÃO_PESQUISADA.toLowerCase())){
                nome = PerguntarNome(quant);
                if(nome.equals(PRODUTO_PESQUISADO.toLowerCase())){
                    superMercado = PerguntarSupermercado();
                    preço = PerguntarPreço();
                    ean = PerguntarEan();
                    GuardarDados(nome,superMercado,preço,ean,listaDeprodutos,SEÇÃO_PESQUISADA);
                    quant++;
                }
                else{
                    ErroDeProduto(PRODUTO_PESQUISADO);
                }
            }
            else{
                ErroDeSeção(SEÇÃO_PESQUISADA);
            }
        } while (VerificarFim(quant,QUANT_MAXIMA));

        preçoMedio = CalculaPreçoMedio(listaDeprodutos);
        preçoMaximo = CalcularPreçoMaximo(listaDeprodutos);
        preçoMinimo = CalcularpPreçoMinimo(listaDeprodutos);

        MostrarResumoFinal(preçoMedio,preçoMaximo,preçoMinimo,PRODUTO_PESQUISADO,SEÇÃO_PESQUISADA);
    }

    public static String PerguntarSeção(){
        userInput = new Scanner(System.in);
        System.out.println("Qual a seção do produto?"); 
        String entrada = (userInput.nextLine()).toLowerCase();
        if (entrada.equals("a‡ougue")) {
            return "açougue";
        }
        else{
            return entrada;
        }
    }
    public static String PerguntarSupermercado(){
        userInput = new Scanner(System.in);
        System.out.println("Qual foi o supermercado do produto analisado?"); 
        return  userInput.nextLine();
    }
    public static String PerguntarEan(){
        userInput = new Scanner(System.in);
        System.out.println("Qual foi o codigo de barras do produto analisado?"); 
        return  userInput.nextLine();
    }
    public static String PerguntarNome(int quant){
        userInput = new Scanner(System.in);
        System.out.println("PRODUTO " + (quant + 1)); 
        System.out.println("Qual foi o nome do produto analisado?"); 
        return  userInput.nextLine();
    }
    public static Double PerguntarPreço(){
        userInput = new Scanner(System.in);
        System.out.println("Qual foi o preço do produto analisado?"); 
        return  Double.parseDouble(userInput.nextLine());
    }
    public static String PerguntarFIM(){
        userInput = new Scanner(System.in);
        System.out.println("Deseja adcionar outro produto? [S] ou [N]"); 
        return userInput.nextLine().toUpperCase(); 
    }

    public static boolean VerificarFim(int quant,int QUANT_MAXIMA){
        if(quant > QUANT_MAXIMA || PerguntarFIM().equals("N")){
            return false;
        }
        else{
            return true;
        }
    }
    public static void GuardarDados(String nome, String superMercado, double preço, String ean,ArrayList<valorDosProdutos> listaDeprodutos, String SEÇÃO_PESQUISADA){
        valorDosProdutos produto = null;
        switch (SEÇÃO_PESQUISADA) {
            case "Açougue":
                produto = new Açougue(superMercado,ean,nome,preço);
            break;
            
            default:
            {
                System.out.println("ERRO DO SWITCH"); 
            }
            break;
        }
        listaDeprodutos.add(produto);
    }
    public static double CalculaPreçoMedio(ArrayList<valorDosProdutos> listaDeprodutos){
        double soma = 0;
        for (valorDosProdutos produto : listaDeprodutos) {
            soma += produto.preço;
        }
        return soma;
    }
    public static double CalcularPreçoMaximo(ArrayList<valorDosProdutos> listaDeprodutos){
        double maiorPreço = 0;
        for (valorDosProdutos produto : listaDeprodutos) {
            if (produto.preço > maiorPreço) {
                maiorPreço = produto.preço;
            }
        }
        return maiorPreço;
    }
    public static double CalcularpPreçoMinimo(ArrayList<valorDosProdutos> listaDeprodutos){
        double menorPreço = 0;
        for (valorDosProdutos produto : listaDeprodutos) {
            if (produto.preço < menorPreço) {
                menorPreço = produto.preço;
            }
        }
        return menorPreço;
    }
    public static void MostrarResumoFinal(double preçoMedio, double preçoMaximo, double preçoMinimo, String PRODUTO_PESQUISADO, String SEÇÃO_PESQUISADA){
        System.out.println(" ");
        System.out.println("RESULTADO FINAL DA PESQUISA DO SETOR DE " + SEÇÃO_PESQUISADA.toUpperCase() );
        System.out.println("Preço Medio da " + PRODUTO_PESQUISADO + " nos supermercados: " + preçoMaximo);
        System.out.println("Preço Minimo da " + PRODUTO_PESQUISADO + " nos supermercados: " + preçoMinimo);
        System.out.println("Preço Maximo da " + PRODUTO_PESQUISADO + " nos supermercados: " + preçoMaximo);
    }

    public static void ErroDeSeção(String seçãoPesquisada){
        System.out.println("ERRO! Esta pesquisa esta aceitando apenas itens da seção de: " + seçãoPesquisada); 
    }
    public static void ErroDeProduto( String produtoPesquisado){
        System.out.println("ERRO! Esta pesquisa esta aceitando apenas itens de nome: " + produtoPesquisado); 
    }

}
