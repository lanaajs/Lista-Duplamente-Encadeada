package listaDuplamenteEncadeada;

import java.util.Scanner;

public class TestaListaDuplamenteEncadeada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		ListaDuplamenteEncadeada LD = new ListaDuplamenteEncadeada();
		
		int escolha;
		int valor;
		
		do {
			System.out.println("\nSelecione uma opção abaixo: "
					+ "\n 1 - Adicionar dado pela Direita"
					+ "\n 2 - Adicionar dado pela Esquerda"
					+ "\n 3- Remover dado pela Direita"
					+ "\n 4 - Remover dado pela Esquerda"
					+ "\n 5 - Listar dados"
					+ "\n 6 - Sair");
			
			System.out.print("\nEscolha: ");
			escolha = sc.nextInt();
			
			switch(escolha) {
			case 1:
				System.out.print("\nDigite um número: ");
				valor = sc.nextInt();
				LD.inserirListaEsquerda(valor);
				System.out.println("Adicionado pela Esquerda!");
				break;
				
			case 2:
				System.out.print("Digite um número: ");
				valor = sc.nextInt();
				LD.inserirListaDireita(valor);
				System.out.println("Adicionado pela Direita!");
				break;
				
			case 3:
				System.out.println("Removido pela Direita" + LD.removerListaDireita());
				break;
				
			case 4:
				System.out.println("Removido pela Esquerda" + LD.removerListaEsquerda());
				break;
				
			case 5:
				System.out.println("Lista com Dados:");
				LD.listarListaImprimir();
				break;
			
			case 6:
				System.out.println("Saindo...");
				break;
				
			default:
				System.out.println("Tente de novo!");
			}
			
		}while(escolha!=6);
		
	}

}
