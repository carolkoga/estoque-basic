import java.util.Scanner;
public class estoque{
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        int qtd_iten;
        double valor;
        int input_qtd;
        double valor_total;
        String opcao;
        
        qtd_iten = 10;
        valor = 6.87;
        valor_total = qtd_iten*valor;
        //sistema precisa ler a quantidade atual do estoque
        System.out.println("Há " + qtd_iten + " itens no estoque. Cada item vale " + valor + " Total de R$" + valor_total);

        //sistema vai perguntar se eu quero adicionar ou remover itens:
        System.out.println("Você deseja adicionar(digite \"ADD\") ou remover(digite \"REMOVER\") itens?");
        opcao = scanner.nextLine().trim();
        if(opcao.equalsIgnoreCase("ADD")) {
            System.out.println("Digite a quantidade que deseja adicionar: ");
            input_qtd = scanner.nextInt();
            scanner.nextLine();
            qtd_iten = qtd_iten + input_qtd;
            valor_total = qtd_iten * valor;
        } else if(opcao.equalsIgnoreCase("REMOVER")){
            System.out.println("Digite a quantidade que deseja remover: ");
            input_qtd = scanner.nextInt();
            scanner.nextLine();
            qtd_iten = qtd_iten - input_qtd;
            valor_total = qtd_iten * valor;
        } else{
            System.out.println("Opção inválida, tente novamente.");
        }
        System.out.println("A quantidade atualizada de iten é de " + qtd_iten + " e o valor total é de R$ " + valor_total);
    }
}
