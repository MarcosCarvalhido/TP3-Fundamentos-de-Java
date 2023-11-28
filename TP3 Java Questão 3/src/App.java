/*Em uma loja de departamento os seguintes setores devem ser observados em uma análise de projeto de software:
    Calçados, Moda Feminina, Cama e Mesa, Eletrodoméstico, Brinquedo, Moda Infantil, Moda Masculina, Perfumaria, Tecnologia e Acessórios.
Crie uma superclasse abstrata chamada LojaDepartamento com os atributos
    nome e EAN.
Em todas as subclasses que são do tipo final haverá os atributos
    preço, estoque e fornecedor.
Elabore um programa em POO que permita inserir e ler os dados de cada objeto informado neste exercício. */
public class App {
    public static void main(String[] args) throws Exception {
        Calcados havaianas = new Calcados("Havaianas", "11111.1111", 69.90, 30, "China");
        System.out.println(havaianas.toString());
        
        ModaFeminina biquini = new ModaFeminina("Biquini", "22222-2222", 50.0, 60, "Brasil");
        System.out.println(biquini.toString());

        CamaMesa edredom = new CamaMesa("Edredom", "33333-3333", 110.99, 10, "Andorras");
        System.out.println(edredom.toString());

        Eletrodoméstico airfryer = new Eletrodoméstico("Airfryer", "44444-4444", 200.99, 50, "Taiwan");
        System.out.println(airfryer.toString());
        
        Brinquedos barbie = new Brinquedos("Barbie", "55555-5555", 99.99, 25, "china");
        System.out.println(barbie.toString());
        
        ModaInfantil macacão = new ModaInfantil("Macacão", "66666-6666", 60.80, 30, "india");
        System.out.println(macacão.toString());
        
        ModaMasculina boxe = new ModaMasculina("Boxe", "77777-7777", 20.99, 22, "Philipinas");
        System.out.println(boxe.toString());
        
        Perfumaria colonia = new Perfumaria("Colonia", "88888-8888", 99.99, 6, "Brasil");
        System.out.println(colonia.toString());
        
        Tecnologia smartPhone = new Tecnologia("SmartPhone", "44444-4444", 2100.99, 5, "Taiwan");
        System.out.println(smartPhone.toString());

        Acessórios garrafa = new Acessórios("Garrafa", "99999-9999", 10.70, 40, "China");
        System.out.println(garrafa.toString());
    }
}
