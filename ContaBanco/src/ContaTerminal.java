import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner tecladoScanner = new Scanner(System.in);
        tecladoScanner.useLocale(Locale.US); // Aceitar ponto como separador decimal

        System.out.println("Por favor, digite o número da conta: ");
        int conta = tecladoScanner.nextInt();
        tecladoScanner.nextLine(); // limpa o buffer

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = tecladoScanner.nextLine();

        System.out.println("Digite o nome do cliente: ");
        String nome = tecladoScanner.nextLine();

        System.out.println("Por favor, digite o saldo bancário: ");
        double saldo = tecladoScanner.nextDouble();


        System.out.println();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco,%n", nome);
        System.out.printf("sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque.%n", agencia, conta, saldo);

        tecladoScanner.close();
    }
}
