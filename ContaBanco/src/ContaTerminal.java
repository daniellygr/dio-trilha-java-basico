import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int numeroConta;
        String numeroAgencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o seu nome");
        nomeCliente = leitor.next();
        System.out.println("Por favor, digite o número da agência");
        numeroAgencia = leitor.next();
        System.out.println("Por favor, digite o número da conta");
        numeroConta = leitor.nextInt();
        System.out.println("Por favor, digite o saldo para saque");
        saldo = leitor.nextDouble();

        System.out.println("Olá, " + nomeCliente + ". Obrigado por criar uma conta em nosso banco, sua agência é "
                    + numeroAgencia + ", conta " + numeroConta + " e seu saldo de R$ " + saldo + " já está " +
                        "disponível para saque.");

    }
}