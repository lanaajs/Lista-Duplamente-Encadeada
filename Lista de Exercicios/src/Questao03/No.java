package Questao03;

public class No {
	
	 public No anterior = null;
	 public No proximo = null;
	 public Estudante dado;
	 
	 //get's e set's
	 public No getAnterior() {
		return anterior;
	 }
	 
	 public Estudante getDado() {
		return dado;
	 }
	 
	 public No getProximo() {
		return proximo;
	 }
	 
	 public void setAnterior(No anterior) {
		this.anterior = anterior;
	 }
	 
	 public void setDado(Estudante dado) {
		this.dado = dado;
	 }
	 
	 public void setProximo(No proximo) {
		this.proximo = proximo;
	 }
}
