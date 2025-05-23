package guialuno;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MainAlunoSwing {

    private List<Aluno> alunos = new ArrayList<>();
    private JFrame mainFrame;
    private ExibeAlunosSwing exibicaoAlunosGUI;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainAlunoSwing().createAndShowGUI());
    }

    private void createAndShowGUI() {
        mainFrame = new JFrame("Cadastro de Alunos");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(300, 300);
        mainFrame.setLayout(new FlowLayout());

        JButton btnCadastrarAluno = new JButton("Cadastrar Aluno");
        btnCadastrarAluno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CadastraAlunoSwing(mainFrame, alunos, exibicaoAlunosGUI);
            }
        });
        mainFrame.add(btnCadastrarAluno);

        JButton btnExibirAlunos = new JButton("Exibir Alunos");
        btnExibirAlunos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exibicaoAlunosGUI = new ExibeAlunosSwing(mainFrame, alunos);
            }
        });
        mainFrame.add(btnExibirAlunos);

        mainFrame.setVisible(true);
    }
}
