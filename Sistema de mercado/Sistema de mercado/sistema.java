public class sistema {
    public static void main(String[] args) {
        // Criar um objeto Produto usando o construtor
        produto arroz = new produto("Arroz", 5.99, 100, 3.50, "A011" ,"Arroz branco 5kg");

        // Mostrar os detalhes do produto
        arroz.mostrarDetalhes();

        // Calcular e mostrar o lucro do produto
        double lucro = arroz.calcularLucro();
        System.out.println("Lucro do produto: " + lucro);
    }
}
