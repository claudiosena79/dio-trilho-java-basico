public class TiposVariaveis {

    public static void main(String[] args) throws Exception {
        byte idade = 43;
        System.out.println(idade);

        short ano = 2023;
        System.out.println(ano);

        int cep = 21070333; // se valor iniciar com 0(0 a esquerda) utilize String
        System.out.println(cep);

        long cpf = 98765432109L; // se valor iniciar com 0(0 a esquerda) utilize String
        System.out.println(cpf);

        double salario = 12345.67;
        System.out.println(salario);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;// uso do cast para mudar o tipo de variavel
        System.out.println(numeroCurto2);
        System.out.println(numeroCurto);
        numeroCurto = 2;
        System.out.println(numeroCurto);

        final double PI = 3.14;
        System.out.println(PI);

    }
}
