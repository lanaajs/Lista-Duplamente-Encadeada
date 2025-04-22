package Questao04;

public class No {

    public No anterior = null;
    public No proximo = null;
    public int dado;

    public No(int valor) {
        this.dado = valor;
    }

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
