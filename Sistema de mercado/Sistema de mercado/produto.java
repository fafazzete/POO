public class produto {
 private   String nome;
  private double precoVenda;
  private  int quantidadeEstoque;
  private double precoCusto;
  private  String codigo;
  private  String descricao;

  //Construtor

  // Construtor para inicializar o objeto
    public produto(String nome, double precoVenda, int quantidadeEstoque, double precoCusto, String codigo, String descricao) {
        this.nome = nome;
        this.precoVenda = precoVenda;
        this.quantidadeEstoque = quantidadeEstoque;
        this.precoCusto = precoCusto;
        this.codigo = codigo;
        this.descricao = descricao;
    }
    
    // Método que calcula o lucro
    public double calcularLucro() {
        return precoVenda - precoCusto;
    }

        public void mostrarDetalhes() {
    System.out.println("Nome do produto: " + nome);
    System.out.println("Preço de custo: " + precoCusto);
    System.out.println("Preço de venda: " + precoVenda);
    System.out.println("Quantidade em estoque: " + quantidadeEstoque);
    System.out.println("Código do produto: " + codigo);
    System.out.println("Descrição: " + descricao);
}
}