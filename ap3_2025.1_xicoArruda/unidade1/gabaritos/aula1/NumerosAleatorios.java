import java.util.Random;

public class NumerosAleatorios {

    public static void main(String[] args) {

        Random geradorAleatorio = new Random();

        int limite = 1000;

        for (int i = 0; i < 50; i++) {
            System.out.println("i=" + i + ", valor=" + geradorAleatorio.nextInt(limite));
        }
    }
}