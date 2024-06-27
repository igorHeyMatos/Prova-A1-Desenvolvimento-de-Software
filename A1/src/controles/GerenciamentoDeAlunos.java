package controles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import modelos.Aluno;
import modelos.Resumo;

public class GerenciamentoDeAlunos {

    File arquivoAlunos = new File("src\\alunos.csv");

    String arquivoResumo = "src\\resumo.csv";

    BufferedReader reader = null;

    String line = "";

    String header = "";

    List<Aluno> listaAlunos = new ArrayList<>();

    public List<Aluno> listaDeAlunos() throws IOException {

        try {

            reader = new BufferedReader(new FileReader(arquivoAlunos));

            header = reader.readLine();

            while ((line = reader.readLine()) != null) {

                String[] row = line.split(";");

                String matricula = row[0];
                String nome = row[1];
                String notaStr = row[2].replace(",", ".");
                double nota = Double.valueOf(notaStr);

                Aluno aluno = new Aluno(matricula, nome, nota);

                listaAlunos.add(aluno);

                for (String index : row) {
                    System.out.printf("%-30s |", index);
                }

                System.out.println();

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (reader != null) {
                reader.close();
            }
        }

        return listaAlunos;

    }

    public void gravar(Resumo resumo) {

        try {

            boolean arquivoExiste = new File(arquivoResumo).exists();

            FileWriter arquivoGravar = new FileWriter(arquivoResumo);
            PrintWriter gravador = new PrintWriter(arquivoGravar);

            if (!arquivoExiste) {
                gravador.println("qtdAluno;qtdAprovado;qtdReprovado;menorNota;maiorNota;mediaGeral");
            }
            gravador.println(resumo.toCSV());

            gravador.close();

        } catch (IOException e) {
            System.out.println("Não foi possível gravar o arquivo!");
        }

    }

}
