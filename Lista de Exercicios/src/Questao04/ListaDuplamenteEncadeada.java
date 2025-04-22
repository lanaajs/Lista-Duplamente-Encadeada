package Questao04;

public class ListaDuplamenteEncadeada {

    private No primeiro = null;
    private No ultimo = null;
    private int n = 0;

    // Inserir no início
    public void inserirInicio(int valor) {
        if (valor % 2 == 0) {
            System.out.println("Apenas números ímpares são permitidos");
            return;
        }

        No novo = new No(valor);

        if (primeiro == null) {
            primeiro = ultimo = novo;
        } else {
            novo.proximo = primeiro;
            primeiro.anterior = novo;
            primeiro = novo;
        }
        n++;
    }

    // Inserir no fim
    public void inserirFim(int valor) {
        if (valor % 2 == 0) {
            System.out.println("Apenas números ímpares são permitidos");
            return;
        }

        No novo = new No(valor);

        if (ultimo == null) {
            primeiro = ultimo = novo;
        } else {
            ultimo.proximo = novo;
            novo.anterior = ultimo;
            ultimo = novo;
        }
        n++;
    }

    // Remover do início
    public int removerInicio() {
        if (primeiro == null) {
            System.out.println("Lista vazia.");
            return -1;
        }

        int valor = primeiro.dado;
        primeiro = primeiro.proximo;

        if (primeiro != null) {
            primeiro.anterior = null;
        } else {
            ultimo = null;
        }

        n--;
        return valor;
    }

    // Remover do fim
    public int removerFim() {
        if (ultimo == null) {
            System.out.println("Lista vazia.");
            return -1;
        }

        int valor = ultimo.dado;
        ultimo = ultimo.anterior;

        if (ultimo != null) {
            ultimo.proximo = null;
        } else {
            primeiro = null;
        }

        n--;
        return valor;
    }

    // Listar elementos
    public void listarListaImprimir() {
        No atual = primeiro;

        if (atual == null) {
            System.out.println("Não possui dados na lista!");
        } else {
            while (atual != null) {
                System.out.print(atual.dado + " ");
                atual = atual.proximo;
            }
            System.out.println();
        }
    }

    public int tamanho() {
        return n;
    }
}
