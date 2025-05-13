package aula3;

public class Aluno {

    private String nome = "SemNome";
    private double nota1 = -1;
    private double nota2 = -1;
    private double nota3 = -1;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", média=" + getMedia() + "]";
    }

    public double getMedia() {
        return (nota1+nota2+nota3)/3;
    }

}
