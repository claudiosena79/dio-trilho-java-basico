
import java.util.Scanner;

/**
 * <h1>Calculadora</h1>
 * A Calculadora realiza operações matemáticas entre números inteiros
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classes
 * para desfrutar dos recursos oferecidos pelo autor
 *
 * @author Claudio Sena
 * @version 1.0
 * @since 02/10/2023
 */

public class Calculadora {

    double numero1;
    double numero2;
    double resultado;

    Scanner leitor = new Scanner(System.in);

    /**
     * Este método é utilizado para realizar soma
     * 
     * @param numero1 este é o primeiro parametro do método
     * @param numero2 este é o segundo parametro do método
     * @return o resultado adição
     */

    public Double adicionar() {
        System.out.println("Digite o primeiro número: ");
        numero1 = leitor.nextDouble();

        System.out.println("Digite o segundo número: ");
        numero2 = leitor.nextDouble();

        resultado = numero1 + numero2;
        System.out.println(resultado);
        return resultado;

    }

    /**
     * Este método é utilizado para realizar subtração
     * 
     * @param numero1 este é o primeiro parametro do método
     * @param numero2 este é o segundo parametro do método
     * @return o resultado subtração
     */
    public Double subtrair() {
        System.out.println("Digite o primeiro número: ");
        numero1 = leitor.nextDouble();

        System.out.println("Digite o segundo número: ");
        numero2 = leitor.nextDouble();

        resultado = numero1 - numero2;
        System.out.println(resultado);
        return resultado;

    }

    /**
     * Este método é utilizado para realizar multiplicação
     * 
     * @param numero1 este é o primeiro parametro do método
     * @param numero2 este é o segundo parametro do método
     * @return o resultado multiplicação
     */

    public Double multiplicar() {
        System.out.println("Digite o primeiro número: ");
        numero1 = leitor.nextDouble();

        System.out.println("Digite o segundo número: ");
        numero2 = leitor.nextDouble();

        resultado = numero1 * numero2;
        System.out.println(resultado);
        return resultado;

    }

    /**
     * Este método é utilizado para realizar divisão
     * 
     * @param numero1 este é o primeiro parametro do método - dividendo
     * @param numero2 este é o segundo parametro do método - divisor
     * @return o resultado divisão
     */

    public Double dividir() {
        System.out.println("Digite o dividendo: ");
        numero1 = leitor.nextDouble();

        System.out.println("Digite o divisor: ");
        numero2 = leitor.nextDouble();

        resultado = numero1 / numero2;
        System.out.println(resultado);
        return resultado;

    }

}