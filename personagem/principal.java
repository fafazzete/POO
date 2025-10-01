public class principal {
    public static void main(String[] args) {
        System.out.println("Olá, mundo");

         personagem p1 = new personagem();

    p1.nome = "Asterix";
    p1.pontosDeVida = 100;
    p1.forca = 20;
    p1.defesa = 20;
    p1.apresentar();
    p1.funcao = "Guerreiro";

    System.out.println("Meu nome é:" + p1.nome);

    personagem p2 = new personagem();

    p2.nome  = "Atas";
    p2.pontosDeVida = 120;
    p2.forca = 40;
    p2.defesa = 30;
    p2.apresentar();
    p2.funcao = "Escudeiro";
    }
}
