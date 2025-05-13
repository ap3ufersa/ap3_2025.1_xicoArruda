public class Exercicio3_IOF {

    public static void main(String[] args) {
        double valor = 8711.77;
        double valorcomImposto = valor * (6.38 / 100);
       
        formatador = new
        formatador.applyPattern("R$ #,##0.00");

        System.out.println();
        System.out.println();
        System.out.println("Valor com imposto: " + formatador.format(valorcomImposto));
    }
}