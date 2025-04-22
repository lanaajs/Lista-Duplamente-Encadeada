package Questao03;

public class ListaDuplamenteEncadeada {
	
	private No primeiro = null;
    private No ultimo = null;
    private int n = 0;
    
    public void inserirListaEsquerda(Estudante estudante) {
    	No novo = new No();
    	novo.dado = estudante;

    	if (n == 0) {
    		primeiro = novo;
    		ultimo = novo;
    	} else {
    		novo.proximo = primeiro;
    		primeiro.anterior = novo;
    		primeiro = novo;
    	}
    	n++;
    }

    public void inserirListaDireita(Estudante estudante) {
        No novo = new No();
        novo.dado = estudante;

        if (n == 0) {
            primeiro = novo;
            ultimo = novo;
        } else {
            novo.anterior = ultimo;
            ultimo.proximo = novo;
            ultimo = novo;
        }

        n++;
    }

    public void listarListaImprimir() {
    	No atual = primeiro;
    	
    	if (atual != null) {
    		while (atual != null) {
    			System.out.println(atual.dado);
    			atual = atual.proximo;
    		}
    	} else {
    		System.out.println("Não possui dados na lista!");
    	}
    }
}
