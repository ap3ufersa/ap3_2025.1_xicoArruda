import java.util.Random;

public class TestaAluno {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Um aluno aprovado:");

        // um aluno aprovado com 7
        Aluno xico = new Aluno();
        xico.setNome("Xico Arruda");
        System.out.println(xico);

        // muitos alunos
        System.out.println("Muitos alunos, notas aleatórias:");
        for (int i = 0; i < 99; i++) {
            Aluno umAluno = new Aluno();
            umAluno.setNome("AlunoNumero" + i);
            Random random = new Random();
            umAluno.setNota1(10 * random.nextDouble());
            umAluno.setNota2(10 * random.nextDouble());
            umAluno.setNota3(10 * random.nextDouble());
            System.out.println(umAluno);
        }

    }
}
