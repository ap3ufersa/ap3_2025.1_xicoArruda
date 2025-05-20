public class Aluno {
    private long matricula = -1;
    protected String nomeCompleto = "";
    private String nomeDaMae = "";
    private int idade = -1;

    public Aluno() {
    }

    public Aluno(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Aluno(String nomeCompleto, int idade) {
        this.nomeCompleto = nomeCompleto;
        this.idade = idade;
    }

}