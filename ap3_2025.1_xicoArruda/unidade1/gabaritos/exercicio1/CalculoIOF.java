

public class CalculoIOF {

    public static void main(String[] args) {
        double valor = 8711.77;
        double valorcomImposto = valor * (6.38 / 100);
       
        formatador = new ();
        formatador.applyPattern("R$ #,##0.00");

        System.out.println();
        System.out.println();
        System.out.println("valor=" + formatador.format(valor) + ", imposto=" + formatador.format(valorcomImposto));
    }
}