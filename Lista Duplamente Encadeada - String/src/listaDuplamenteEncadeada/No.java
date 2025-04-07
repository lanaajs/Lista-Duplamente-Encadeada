package listaDuplamenteEncadeada;

public class No {
	
	 public No anterior = null;
	 public No proximo = null;
	 public String dado;
	 
	 //get's e set's
	 public No getAnterior() {
		return anterior;
	 }
	 
	 public String getDado() {
		return dado;
	 }
	 
	 public No getProximo() {
		return proximo;
	 }
	 
	 public void setAnterior(No anterior) {
		this.anterior = anterior;
	 }
	 
	 public void setDado(String dado) {
		this.dado = dado;
	 }
	 
	 public void setProximo(No proximo) {
		this.proximo = proximo;
	 }
}
