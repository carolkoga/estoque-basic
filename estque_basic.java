import java,util.Scanner;
public class estque_basic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int estoque = 0;
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar produto ao estoque");
            System.out.println("2. Remover produto do estoque");
            System.out.println("3. Verificar estoque atual");
            System.out.println("4. Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a quantidade a adicionar: ");
                    int adicionar = scanner.nextInt();
                    estoque += adicionar;
                    System.out.println("Produto adicionado ao estoque.");
                    break;
                case 2:
                    System.out.print("Digite a quantidade a remover: ");
                    int remover = scanner.nextInt();
                    if (remover > estoque) {
                        System.out.println("Quantidade maior que o estoque atual.");
                    } else {
                        estoque -= remover;
                        System.out.println("Produto removido do estoque.");
                    }
                    break;
                case 3:
                    System.out.println("Estoque atual: " + estoque);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}