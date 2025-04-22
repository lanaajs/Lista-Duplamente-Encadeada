package Questao03;

public class Estudante {

    String nomeAluno;
    int idadeAluno;

    public Estudante(String nome, int idade) {
        this.nomeAluno = nome;
        this.idadeAluno = idade;
    }    

    public String getNomeAluno() {
        return nomeAluno;
    }
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
    public int getIdadeAluno() {
        return idadeAluno;
    }
    public void setIdadeAluno(int idadeAluno) {
        this.idadeAluno = idadeAluno;
    }

    @Override
    public String toString() {
        return nomeAluno + " - " + idadeAluno + " anos";
    }

}
