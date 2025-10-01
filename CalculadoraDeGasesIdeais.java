import java.util.Scanner;

public class CalculadoraDeGasesIdeais {

  
    public static final double R = 0.0821; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Gases Ideais");
        System.out.println("Selecione a variável que deseja calcular:");
        System.out.println("1. Pressão (P)");
        System.out.println("2. Volume (V)");
        System.out.println("3. Número de mols (n)");
        System.out.println("4. Temperatura (T)");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                
                System.out.print("Digite o Volume (em L): ");
                double volume = scanner.nextDouble();
                System.out.print("Digite o número de mols (n): ");
                double mols = scanner.nextDouble();
                System.out.print("Digite a Temperatura (em K): ");
                double temperatura = scanner.nextDouble();

                double pressao = calcularPressao(volume, mols, temperatura);
                System.out.println("A pressão (P) é: " + pressao + " atm");
                break;

            case 2:
              
                System.out.print("Digite a Pressão (em atm): ");
                double pressaoV = scanner.nextDouble();
                System.out.print("Digite o número de mols (n): ");
                double molsV = scanner.nextDouble();
                System.out.print("Digite a Temperatura (em K): ");
                double temperaturaV = scanner.nextDouble();

                double volumeV = calcularVolume(pressaoV, molsV, temperaturaV);
                System.out.println("O volume (V) é: " + volumeV + " L");
                break;

            case 3:
               
                System.out.print("Digite a Pressão (em atm): ");
                double pressaoN = scanner.nextDouble();
                System.out.print("Digite o Volume (em L): ");
                double volumeN = scanner.nextDouble();
                System.out.print("Digite a Temperatura (em K): ");
                double temperaturaN = scanner.nextDouble();

                double molsN = calcularMols(pressaoN, volumeN, temperaturaN);
                System.out.println("O número de mols (n) é: " + molsN);
                break;

            case 4:

                System.out.print("Digite a Pressão (em atm): ");
                double pressaoT = scanner.nextDouble();
                System.out.print("Digite o Volume (em L): ");
                double volumeT = scanner.nextDouble();
                System.out.print("Digite o número de mols (n): ");
                double molsT = scanner.nextDouble();

                double temperaturaT = calcularTemperatura(pressaoT, volumeT, molsT);
                System.out.println("A temperatura (T) é: " + temperaturaT + " K");
                break;

            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }

    public static double calcularPressao(double volume, double mols, double temperatura) {
        return (mols * R * temperatura) / volume;
    }

    public static double calcularVolume(double pressao, double mols, double temperatura) {
        return (mols * R * temperatura) / pressao;
    }

    public static double calcularMols(double pressao, double volume, double temperatura) {
        return (pressao * volume) / (R * temperatura);
    }

    public static double calcularTemperatura(double pressao, double volume, double mols) {
        return (pressao * volume) / (mols * R);
    }
}
