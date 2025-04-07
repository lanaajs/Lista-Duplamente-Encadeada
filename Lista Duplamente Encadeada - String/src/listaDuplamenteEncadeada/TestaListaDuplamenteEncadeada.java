package listaDuplamenteEncadeada;

import java.util.Scanner;

public class TestaListaDuplamenteEncadeada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		ListaDuplamenteEncadeada LD = new ListaDuplamenteEncadeada();
		
		int escolha;
		String nome;
		
		do {
			System.out.println("\nSelecione uma opção abaixo: "
					+ "\n 1 - Adicionar estudante pela Direita"
					+ "\n 2 - Adicionar estudante pela Esquerda"
					+ "\n 3 - Listar dados"
					+ "\n 4 - Sair");
			
			System.out.print("\nEscolha: ");
			escolha = sc.nextInt();
			sc.nextLine();
			
			switch(escolha) {
			case 1:
				System.out.print("\nDigite um nome: ");
				nome = sc.nextLine();
				LD.inserirListaDireita(nome);
				System.out.println("Adicionado pela Direita!");
				break;
				
			case 2:
			System.out.print("\nDigite um nome: ");
			nome = sc.nextLine();
			LD.inserirListaEsquerda(nome);
			System.out.println("Adicionado pela Esquerda!");
				break;
				
			case 3:
				System.out.println("Lista com Dados:");
				LD.listarListaImprimir();
				break;
			
			case 4:
				System.out.println("Saindo...");
				
				break;
				
			default:
				System.out.println("Tente de novo!");
			}
			
		}while(escolha!=4);

		sc.close();
		
	}

}
