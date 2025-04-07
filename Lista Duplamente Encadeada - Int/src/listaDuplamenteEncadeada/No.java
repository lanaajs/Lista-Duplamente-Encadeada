package listaDuplamenteEncadeada;

public class No {
	
	 public No anterior = null;
	 public No proximo = null;
	 public int dado;
	 
	 //get's e set's
	 public No getAnterior() {
		return anterior;
	 }
	 
	 public int getDado() {
		return dado;
	 }
	 
	 public No getProximo() {
		return proximo;
	 }
	 
	 public void setAnterior(No anterior) {
		this.anterior = anterior;
	 }
	 
	 public void setDado(int dado) {
		this.dado = dado;
	 }
	 
	 public void setProximo(No proximo) {
		this.proximo = proximo;
	 }
}
