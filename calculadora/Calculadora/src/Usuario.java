
import java.util.Scanner;

public class Usuario {

    public static void main(String[] args) throws Exception {

        String operacao = "a";
        String continuar = "s";

        Scanner leitor = new Scanner(System.in);

        Calculadora calculadora = new Calculadora();

        System.out.println("---------CALCULADORA-----------");

        while (!continuar.equalsIgnoreCase("n")) {

            System.out.println("DIGITE A OPERAÇÃO DESEJADA: ");
            System.out.println("A - Adição\nS - Subtraçao\nM - Multipliação\nD - Divisão");

            operacao = leitor.nextLine();

            if (operacao.equalsIgnoreCase("a")) {

                calculadora.adicionar();

            } else if (operacao.equalsIgnoreCase("s")) {

                calculadora.subtrair();

            } else if (operacao.equalsIgnoreCase("m")) {

                calculadora.multiplicar();

            } else if (operacao.equalsIgnoreCase("d")) {

                calculadora.dividir();

            } else {

                System.out.println("OPERAÇÃO INVÁLIDA");

            }

            System.out.println("Deseja efetuar nova operação? (S/N)");
            continuar = leitor.next();
            leitor.nextLine();

        }
        System.out.println("CALCULADORA ENCERRADA");
        leitor.close();

    }
}
