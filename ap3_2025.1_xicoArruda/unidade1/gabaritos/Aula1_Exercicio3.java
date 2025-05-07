

public class Aula1_Exercicio3 {

    public static void main(String[] args) {
        double valor = 8711.77;
        double valorcomImposto = valor * (6.38 / 100);
        double erro = 0.1 + 0.7;
        
         formatador = new
        formatador.applyPattern("R$ #,##0.00");

        System.out.println();
        System.out.println();
        System.out.println("Valor com imposto: " + formatador.format(valorcomImposto));
    }
}