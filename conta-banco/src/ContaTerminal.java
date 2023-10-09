import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = leitor.nextLine();

        System.out.println("Digite seu nome: ");
        String nomeCliente = leitor.nextLine();

        System.out.println("Agora, digite o número da sua conta! ");
        int numero = leitor.nextInt();

        System.out.println("Digite seu saldo bancario: ");
        double saldo = leitor.nextDouble();

        System.out.println("Olá," + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agencia é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        leitor.close();
    }
}