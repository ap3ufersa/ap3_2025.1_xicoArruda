public class TestaAluno {
    public static void main(String[] args) {
        Aluno novoAluno = new Aluno();
        novoAluno.setNome("João da Silva Sauro");

        novoAluno.setNota1(8.0);
        novoAluno.setNota2(7.5);
        novoAluno.setNota3(9.0);

        Endereco endereco = new Endereco();
        endereco.setRua("Rua do aluno, numero zero");
        endereco.setCidade("AngicosCity");

        novoAluno.setEndereco(endereco);

        System.out.println(novoAluno);
    }
}
