import java.util.Scanner;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        int numero1, numero2;
        String nome1, nome2;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        numero1 = leitor.nextInt();

        System.out.println("Digite o segundo numero: ");
        numero2 = leitor.nextInt();

        boolean simNao = numero1 == numero2;
        System.err.println("O primeiro numero é igual ao segundo? " + simNao);

        simNao = numero1 != numero2;
        System.err.println("O primeiro numero é diferente do segundo? " + simNao);

        simNao = numero1 > numero2;
        System.err.println("O primeiro numero é maior que o segundo? " + simNao);

        simNao = numero1 < numero2;
        System.err.println("O primeiro numero é menor que o segundo? " + simNao);

        System.out.println("Digite o primeiro nome: ");
        nome1 = leitor.nextLine();

        System.out.println("Digite o segundo nome: ");
        nome2 = leitor.nextLine();

        System.out.println(nome1.equals(nome2));// System.out.println(nome1==nome2);

    }
}
