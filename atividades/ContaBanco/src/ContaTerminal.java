import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criação do objeto Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);

        // Solicitação e leitura dos dados do usuário
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();

        // Limpar o buffer do scanner (pular a nova linha deixada pelo nextInt)
        scanner.nextLine(); 

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();

        // Exibição da mensagem formatada com as informações coletadas
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechamento do scanner
        scanner.close();
    }
}
