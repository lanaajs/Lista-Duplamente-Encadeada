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
					+ "\n 1 - Adicionar Número Inteiro pela Direita"
					+ "\n 2 - Adicionar Número Inteiro pela Esquerda"
					+ "\n 3 - Listar Números Inteiros"
					+ "\n 4 - Sair");
			
			System.out.print("\nEscolha: ");
			escolha = sc.nextInt();
			
			switch(escolha) {
			case 1:
				System.out.print("\nDigite um número: ");
				valor = sc.nextInt();
				LD.inserirListaEsquerda(valor);
				System.out.println("Número Inteiro Adicionado pela Esquerda!");
				break;
				
			case 2:
				System.out.print("Digite um número: ");
				valor = sc.nextInt();
				LD.inserirListaDireita(valor);
				System.out.println("Número Inteiro Adicionado pela Direita!");
				break;
				
				
			case 3:
				System.out.println("Lista com Números Inteiros:");
				LD.listarListaImprimir();
				break;
			
			case 4:
				System.out.println("Saindo...");
				break;
				
			default:
				System.out.println("Tente de novo!");
			}
			
		}while(escolha!=4);
		
	}

}
