public class garrafasDeCerveja {
    public static void main(String[] args) {
        int numeroGarrafas = 99;
        String palavra = "garrafas";

        while (numeroGarrafas > 0) {

            if (numeroGarrafas == 1) {
                palavra = "garrafa";
            }

            System.out.println(numeroGarrafas + " " + palavra + " de cerveja na parede.");
            System.out.println(numeroGarrafas + " " + palavra + " de cerveja.");
            System.out.println("Derrube uma.");
            System.out.println("Passe por aí.");
            numeroGarrafas--;
        }

        System.out.println("Não há mais cervejas na parede.");

    }
}
