public class TiposVariaveis {

    public static void main(String[] args) throws Exception {
        byte idade = 43;
        short ano = 2023;
        int cep = 21070333; // se valor iniciar com 0(0 a esquerda) utilize String
        long cpf = 98765432109L; // se valor iniciar com 0(0 a esquerda) utilize String
        // float PI = 3.14F;
        double salario = 12345.67;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;// uso do cast para mudar o tipo de variavel
        System.out.println(numeroCurto);
        numeroCurto = 2;
        System.out.println(numeroCurto);

        final double PI = 3.14;

    }
}
