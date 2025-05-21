package exercicio3;

public class Aluno {

    private String nome = "SemNome";
    private double nota1 = -1;
    private double nota2 = -1;
    private double nota3 = -1;

    public double getMedia() {
        return (nota1+nota2+nota3)/3;
    }

}
