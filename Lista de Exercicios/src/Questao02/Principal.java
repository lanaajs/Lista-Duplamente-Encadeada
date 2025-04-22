package Questao02;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ListaDuplamenteEncadeada L1 = new ListaDuplamenteEncadeada();
        ListaDuplamenteEncadeada L2 = new ListaDuplamenteEncadeada();
        ListaDuplamenteEncadeada L3 = new ListaDuplamenteEncadeada();

        //inserindo na lista 1
        System.out.print("\n\n\nQuantos nomes deseja inserir na lista L1? ");
        int qtd1 = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qtd1; i++) {
            System.out.print("Digite o nome " + (i + 1) + " de L1: ");
            String nome = sc.nextLine();
            L1.inserirListaEsquerda(nome);
        }

        //inserindo na lista 2
        System.out.print("Quantos nomes deseja inserir na lista L2? ");
        int qtd2 = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qtd2; i++) {
            System.out.print("Digite o nome " + (i + 1) + " de L2: ");
            String nome = sc.nextLine();
            L2.inserirListaEsquerda(nome);
        }

        //verifica nomes comuns e insere na L3
        No atual = L1.getInicio();
        
        while (atual != null) {
            if (L2.contem(atual.dado) && !L3.contem(atual.dado)) {
                L3.inserir(atual.dado);
            }
            atual = atual.proximo;
        }

        //imprime L3
        System.out.println("\nNomes comuns nas duas listas (L3):");
        L3.imprimir();

        sc.close();
    }
}
