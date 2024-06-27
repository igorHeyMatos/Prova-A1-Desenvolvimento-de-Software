package modelos;

public class Resumo {
    private int qtdAluno;
    private int qtdAprovado;
    private int qtdReprovado;
    private double menorNota;
    private double maiorNota;
    private double mediaGeral;

    public Resumo() {
    }

    public Resumo(int qtdAluno, int qtdAprovado, int qtdReprovado, double menorNota, double maiorNota,
            double mediaGeral) {
        this.qtdAluno = qtdAluno;
        this.qtdAprovado = qtdAprovado;
        this.qtdReprovado = qtdReprovado;
        this.menorNota = menorNota;
        this.maiorNota = maiorNota;
        this.mediaGeral = mediaGeral;
    }

    public int getQtdAluno() {
        return qtdAluno;
    }

    public void setQtdAluno(int qtdAluno) {
        this.qtdAluno = qtdAluno;
    }

    public int getQtdAprovado() {
        return qtdAprovado;
    }

    public void setQtdAprovado(int qtdAprovado) {
        this.qtdAprovado = qtdAprovado;
    }

    public int getQtdReprovado() {
        return qtdReprovado;
    }

    public void setQtdReprovado(int qtdReprovado) {
        this.qtdReprovado = qtdReprovado;
    }

    public double getMenorNota() {
        return menorNota;
    }

    public void setMenorNota(double menorNota) {
        this.menorNota = menorNota;
    }

    public double getMaiorNota() {
        return maiorNota;
    }

    public void setMaiorNota(double maiorNota) {
        this.maiorNota = maiorNota;
    }

    public double getMediaGeral() {
        return mediaGeral;
    }

    public void setMediaGeral(double mediaGeral) {
        this.mediaGeral = mediaGeral;
    }

    public String toCSV(){
        return qtdAluno + ";" + qtdAprovado + ";" + qtdReprovado + ";" + maiorNota + ";" + menorNota + ";" + mediaGeral;
    }
}
