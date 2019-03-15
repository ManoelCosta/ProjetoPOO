//Classe criança
public class Crianca {
    //Atributos
    String corCabelo;
    String corPele;
    double altura;
    int idade;
    //métodos/funções
    void brincar() {
        System.out.println("Eba! Estou brincando...");
    }
    void correr(double metros) {
        System.out.println("Correndo "+metros+" metros");
    }
    void nadar(double metros) {
        System.out.println("Nadando "+metros+" metros");
    }
    String sorrir(){
        return ":)";
    }
}