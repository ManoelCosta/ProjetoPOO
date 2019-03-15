public class ProjetoPraia {
    public static void main(String args[]){
        //palavra reservada para atribuir objeto é new
        //Primeiro objeto da classe criança
        Crianca c1 = new Crianca();
        c1.altura = 1.6;
        c1.corCabelo = "Loiro";
        c1.corPele = "Branco";
        c1.idade = 10;
        c1.brincar();
        c1.correr(100);
        System.out.println(c1.sorrir());
        //Segundo objeto da classe criança
        Crianca c2 = new Crianca();
        c2.idade = 12;
        c2.corPele = "Morena";
        c2.corCabelo = "Castanho escuro";
        c2.altura = 1.65;
        c2.brincar();
        c2.nadar(156);
        System.out.println(c2.sorrir());

        Bote b1 = new Bote();
        b1.corBote = "Amarelo";
        b1.qtdBancos = 6;
        b1.tamanho = 8;
        System.out.println("Cor do bote: "+b1.corBote);
        System.out.println("Quantidade de Bancos: "+b1.qtdBancos);
        System.out.println("Tamanho do bote: "+b1.tamanho);
        b1.ocupantes(5);
        b1.atividade("Passeando");

        Bote b2 = new Bote();
        b2.corBote = "Vermelho";
        b2.tamanho = 9;
        b2.qtdBancos = 2;
        System.out.println("Cor do bote: "+b2.corBote);
        System.out.println("Quantidade de Bancos: "+b2.qtdBancos);
        System.out.println("Tamanho do bote: "+b2.tamanho);
        b2.ocupantes(1);
        b2.atividade("Pescando");


    }
}
