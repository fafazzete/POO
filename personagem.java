public class personagem {

    //atributos
    private String nome;
    private int pontosDeVida;
    private int forca;
    private int defesa;;

//Métodos
    public void apresentar(){
        System.out.println("Meu nome é " + this.nome);
        System.out.println("Meus pontos de vida são: " + this.pontosDeVida);
        System.out.println("Minha força é:" + this.forca);
        System.out.println("Minha defesa é:" + this.defesa);
    }

//método novo: convidar alguem para o time
        public void convidar(){
            System.out.println("Nosso mundo corre grande perigo!!! ");
            System.out.println("Junte-se a mim para salva-lo!!");
            System.out.println("Qual seu nome companheiro(a)?");
        }

        //Agora só consigo alterar o nome através deste método
        //nome
        public void setNome(String novoNome){
            this.nome = novoNome;
        }
        public String getNome() {
            return this.nome;
        }
        
        //pontos de vida
        public void setpontosDeVida(int pontosDeVida){
            this.pontosDeVida = pontosDeVida;
        }
        public int getpontosDeVida() {
            return this.pontosDeVida;
        }

        //força
        public void setforca(int forca){
            this.forca = forca;
        }
        public int getforca() {
            return this.forca;
        }
        
        //defesa
        public void setdefesa(int defesa){
            this.defesa = defesa;
        }
        public int getdefesa(){
            return this.defesa;
        }
}