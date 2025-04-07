package listaDuplamenteEncadeada;

public class ListaDuplamenteEncadeada {
	
	private No primeiro = null;
    private No ultimo = null;
    private int n = 0;
    
    //metodos de inserção 
    public void inserirListaEsquerda(String valor) {
    	No auxiliador = new No();
    	
    	auxiliador.dado = valor;
    	
    	if(n == 0) {
    		primeiro = auxiliador;
    		ultimo = auxiliador;
    		auxiliador.anterior = null;
    	}else {
    		auxiliador.proximo = primeiro;
    		auxiliador.anterior = null;
    		primeiro = auxiliador;
    	}
    	
    	n++; //n=n+1
    }
    
    public void inserirListaDireita(String nome) {
        No auxiliador = new No();
        auxiliador.dado = nome;

        if (n == 0) {  
            primeiro = auxiliador;
            ultimo = auxiliador;
            auxiliador.proximo = null;
            auxiliador.anterior = null;
        } else {
            auxiliador.anterior = ultimo;
            auxiliador.proximo = null;
            ultimo.proximo = auxiliador;  
            ultimo = auxiliador;  
        }

        n++;  
    }
    
    //metodos para remover
    public String removerListaEsquerda() {
    	No antes;
    	No auxiliador = ultimo;
    	String dado = null;
    	
    	if(n == 0) {
    		
    	}else {
    		dado = auxiliador.dado;
    		n--;
    	}if(n == 0) {
    		primeiro = null;
    		ultimo = null;
    	}else {
    		antes = auxiliador.anterior;
    		ultimo = antes;
    		antes.proximo = null;
    	}
    	
    	return dado;
    }
    
    public String removerListaDireita() {
    	No depois;
    	No auxiliador = primeiro;
    	String dado = null;
    	
    	if(n == 0) {

    	}else {
    		dado = auxiliador.dado;
    		n--;
    	}if(n == 0) {
    		primeiro = null;
    		ultimo = null;
    	}else {
    		depois = auxiliador.anterior;
    		primeiro = depois;
    		depois.proximo = null;
    	}
    	
    	return dado;
    }

    
    //metodo para imprimir lista
    public void listarListaImprimir() {
    	No auxiliador = primeiro;
    	
    	if(auxiliador != null) {
    		while(auxiliador != null) {
    			System.out.print(auxiliador.dado + " ");
    			auxiliador = auxiliador.proximo;
    		}
    		
    	}else {
    		System.out.println("Não possui dados na lista!");
    	}
    	
    	System.out.println();
    }
}
