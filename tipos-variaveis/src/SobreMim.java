import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.InputMismatchException;
import java.util.Locale;

public class SobreMim {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Digite seu nome: ");
            String nome = leitor.nextLine();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = leitor.nextLine();

            System.out.println("Digite sua idade: ");
            int idade = leitor.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = leitor.nextDouble();

            System.out.println("Digite su peso: ");
            double peso = leitor.nextDouble();

            System.out.println("O meu nome é " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + "anos de idade");
            System.out.println("Tenho " + altura + " cm de altura");
            System.out.println("E peso " + peso + " quilos.");

        } catch (InputMismatchException e) {
            System.out.println("Os campos IDADE e ALTURA devem ser numéricos com as casas decimais separadas por ponto");
        

        leitor.close();

    }

}