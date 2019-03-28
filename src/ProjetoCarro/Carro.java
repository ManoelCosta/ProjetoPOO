package ProjetoCarro;

public class Carro {
    //Atributos
    String modelo, cor, marca, chassi;
    int ano, numMarchas, marchaAtual, numPortas;
    double velocidadeMax, velocidadeAtual, volCombustivel;
    boolean tetoSolar, cambioAutomatico;
    Proprietario proprietario;

    //Métodos
    void acelera(){
        velocidadeAtual += 1;
    }

    void freia(){
        velocidadeAtual = 0;
    }
    void trocaMarcha(int novaMarcha){
        if(novaMarcha > numMarchas){
            System.err.println("Marcha inexistente");

        }else {
            marchaAtual = novaMarcha;
        }
    }
    void reduzMarcha(){
        marchaAtual -= 1;
    }
}