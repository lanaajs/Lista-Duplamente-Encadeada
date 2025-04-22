package Questao02;

public class ListaDuplamenteEncadeada {
    
    private No primeiro;
    private No ultimo;
    private int n = 0;
    
    //inserção à esquerda
    public void inserirListaEsquerda(String valor) {
        No auxiliador = new No();
        auxiliador.dado = valor;
        
        if (n == 0) {
            primeiro = auxiliador;
            ultimo = auxiliador;
            auxiliador.anterior = null;
        } else {
            auxiliador.proximo = primeiro;
            auxiliador.anterior = null;
            primeiro = auxiliador;
        }
        
        n++;
    }

    //verificar se o nome está na lista
    public boolean contem(String valor) {
        No atual = primeiro;
        
        while (atual != null) {
            if (atual.dado.equals(valor)) {
                return true;
            }
            atual = atual.proximo;
        }
        
        return false;
    }

    //obter o primeiro nó da lista
    public No getInicio() {
        return primeiro;
    }

    //imprimir a lista
    public void listarListaImprimir() {
        No auxiliador = primeiro;
        
        if (auxiliador != null) {
            while (auxiliador != null) {
                System.out.print(auxiliador.dado + " ");
                auxiliador = auxiliador.proximo;
            }
        } else {
            System.out.println("Não possui dados na lista!");
        }
        
        System.out.println();
    }

    //inserir na lista L3
    public void inserir(String valor) {
        inserirListaEsquerda(valor);
    }

    //imprimir L3
    public void imprimir() {
        listarListaImprimir();
    }
}
