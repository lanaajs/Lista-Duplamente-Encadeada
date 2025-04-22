package Questao03;

public class Principal {
    public static void main(String[] args) {
        
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        lista.inserirListaDireita(new Estudante("Ana", 20));
        lista.inserirListaDireita(new Estudante("Bruno", 22));
        lista.inserirListaDireita(new Estudante("Carla", 19));
        lista.inserirListaDireita(new Estudante("Diego", 21));
        lista.inserirListaDireita(new Estudante("Eduarda", 23));

        lista.inserirListaEsquerda(new Estudante("Fernanda", 24));

        lista.inserirListaDireita(new Estudante("Gustavo", 20));

        System.out.println("Alunos cadastrados:");
        lista.listarListaImprimir();
    }
}
