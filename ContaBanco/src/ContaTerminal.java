import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int conta;
        String nomeCliente;
        String agencia;
        double saldo = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        nomeCliente = scanner.nextLine();
        System.out.println("Digite o número da sua agência:");
        agencia= scanner.nextLine();
        System.out.println("Digite o número da sua conta:");
        conta = scanner.nextInt();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();

    }
}
