import java.util.List;

import controles.GerenciamentoDeAlunos;
import modelos.Aluno;
import modelos.Resumo;

public class App {
    public static void main(String[] args) throws Exception {

        int qtdAluno = 0;
        int qtdAprovado = 0;
        int qtdReprovado = 0;
        double menorNota = 11;
        double maiorNota = 0;
        double somaTotal = 0;
        double mediaGeral;

        GerenciamentoDeAlunos gerenciarAlunos = new GerenciamentoDeAlunos();

        List<Aluno> listaAlunos = gerenciarAlunos.listaDeAlunos();

        for (Aluno aluno : listaAlunos) {
            if (aluno.getNota() >= 6) {
                qtdAprovado++;
            } else {
                qtdReprovado++;
            }

            if (aluno.getNota() > maiorNota) {
                maiorNota = aluno.getNota();
            }

            if (aluno.getNota() < menorNota) {
                menorNota = aluno.getNota();
            }
            somaTotal += aluno.getNota();

            qtdAluno++;
        }

        mediaGeral = somaTotal / qtdAluno;

        System.out.println("\nQuantidade de alunos: " + qtdAluno);
        System.out.println("\nQuantidade de alunos aprovados: " + qtdAprovado);
        System.out.println("\nQuantidade de alunos reprovados: " + qtdReprovado);
        System.out.println("\nMaior nota: " + maiorNota);
        System.out.println("\nMenor nota: " + menorNota);
        System.out.println("\nMedia total: " + mediaGeral);

        Resumo resumo = new Resumo(qtdAluno, qtdAprovado, qtdReprovado, menorNota, maiorNota, mediaGeral);

        gerenciarAlunos.gravar(resumo);
    }
}
