import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();

        int opcao;

        // Método do while para rodar a aplicação enquanto as opções inseridas forem True.
        do {
            System.out.println("\nBem vindo ao Cofrinho POO! ");
            System.out.println("Menu: ");
            System.out.println("1. Adicionar Moeda");
            System.out.println("2. Remover Moeda");
            System.out.println("3. Listar Moedas");
            System.out.println("4. Calcular Total em Reais");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            // Utilizei switch case ao invés do if/else pois acho mais organizado.
            switch (opcao) {
                case 1:
                    adicionarMoeda(scanner, cofrinho);
                    break;
                case 2:
                    removerMoeda(scanner, cofrinho);
                    break;
                case 3:
                    cofrinho.listarMoedas();
                    break;
                case 4:
                    System.out.printf("Total em reais: R$ %.2f\n", cofrinho.calcularTotal());
                    break;
                case 0:
                    System.out.println("Encerrando o programa! ");
                    System.out.println("Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    System.out.println("Nossa opções vão de 0 à 4 =D ");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }

    /* Método de adicionar Moeedas com dois inputs, um para o tipo recebendo o valor como int;
       Pois as opções vão de 0 a 4. e o valor como double para inserir valores decimais;
       Switch case para organizar e realizar a parte condicional.
    */

    private static void adicionarMoeda(Scanner scanner, Cofrinho cofrinho) {
        System.out.println("Tipos de moeda disponíveis: 1=Real, 2=Dólar, 3=Euro");
        int tipo = scanner.nextInt();
        System.out.print("Digite o valor que deseja guardar: ");
        double valor = scanner.nextDouble();

        switch (tipo) {
            case 1 -> cofrinho.adicionarMoeda(new Real(valor));
            case 2 -> cofrinho.adicionarMoeda(new Dolar(valor));
            case 3 -> cofrinho.adicionarMoeda(new Euro(valor));
            default -> System.out.println("Tipo de moeda inválido.");
        }
    }

    /* Método de remover Moeedas, também com dois inputs, um para o tipo recebendo o valor como int;
       Pois as opções vão de 0 a 4. e o valor como double para inserir valores decimais que queira remover;
       Switch case para organizar e realizar a parte condicional.
    */

    private static void removerMoeda(Scanner scanner, Cofrinho cofrinho) {
        System.out.println("Escolha o tipo de moeda que deseja remover: 1. Real | 2. Dólar | 3. Euro");
        int tipo = scanner.nextInt();
        System.out.print("Digite o valor da moeda: ");
        double valor = scanner.nextDouble();

        Moeda moeda = null;
        switch (tipo) {
            case 1 -> moeda = new Real(valor);
            case 2 -> moeda = new Dolar(valor);
            case 3 -> moeda = new Euro(valor);
            default -> System.out.println("Tipo de moeda inválido.");
        }
        // código para verificar se a moeda escolhida tem valor guardado no cofre.
        if (moeda != null) {
            cofrinho.removerMoeda(moeda);
        }
    }
}
