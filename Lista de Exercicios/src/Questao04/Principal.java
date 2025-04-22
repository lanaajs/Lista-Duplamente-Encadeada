package Questao04;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Inserir número ímpar no início");
            System.out.println("2 - Inserir número ímpar no fim");
            System.out.println("3 - Remover do início");
            System.out.println("4 - Remover do fim");
            System.out.println("5 - Listar números");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    if (lista.tamanho() >= 15) {
                        System.out.println("A lista já tem 15 elementos!");
                        break;
                    }
                    System.out.print("Digite um número ímpar: ");
                    int num1 = sc.nextInt();
                    lista.inserirInicio(num1);
                    break;

                case 2:
                    if (lista.tamanho() >= 15) {
                        System.out.println("A lista já tem 15 elementos!");
                        break;
                    }
                    System.out.print("Digite um número ímpar: ");
                    int num2 = sc.nextInt();
                    lista.inserirFim(num2);
                    break;

                case 3:
                    lista.removerInicio();
                    break;

                case 4:
                    lista.removerFim();
                    break;

                case 5:
                    lista.listarListaImprimir();
                    break;

                case 6:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 6);

        sc.close();
    }
}
