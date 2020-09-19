package com.estruturadados.vetor.labs;

import java.util.ArrayList;
import java.util.Scanner;

import com.estruturadados.vetor.teste.Contato;

public class Ex07 extends Ex06{

	public static void main(String[] args) {

		//Criação das variáveis
		Scanner scan = new Scanner(System.in);

		//Criar um vetor com capacidade 20
		ArrayList<Contato> lista = new ArrayList<Contato>(20);

		//Criar e adicionar 30 contatos
		criarContatosDinamicamente(30, lista);

		//Criar menu para usuário escolher opção
		int opcao = 1;

		while(opcao!=0) {
			opcao = obterOpcaoMenu(scan);

			switch(opcao) {
			case 1:
				adicionarContatoFinal(scan, lista);
				break;
			case 2:
				adicionarContatoPosicao(scan, lista);
				break;
			case 3:
				obterContatoPosicao(scan, lista);
				break;
			case 4:
				obterContato(scan, lista);
				break;
			case 5:
				pesquisarUltimoIndice(scan, lista);
				break;
			case 6:
				pesquisarContatoExiste(scan, lista);
				break;
			case 7:
				excluirPorPosicao(scan, lista);
				break;
			case 8:
				excluirContato(scan, lista);
				break;
			case 9:
				imprimeTamanhoVetor(lista);
				break;
			case 10:
				limparVetor(lista);
				break;
			case 11:
				imprimirVetor(lista);
				break;
			}
		}
		System.out.println("Usuário digitou 0, programa terminado");

	}


	private static void imprimirVetor(ArrayList<Contato> lista) {
		System.out.println(lista);
		System.out.println();
	}

	private static void limparVetor(ArrayList<Contato> lista) {
		lista.clear();
		System.out.println("Todos os contatos ddo vetor foram excluídos.");
		System.out.println();
	}

	private static void imprimeTamanhoVetor(ArrayList<Contato> lista) {
		System.out.println("Tamanho do vetor é de: " + lista.size());
		System.out.println();
	}

	private static void excluirPorPosicao(Scanner scan, ArrayList<Contato> lista) {
		int pos = lerInformacaoInt("Informe a posição a ser removida", scan);

		try {
			lista.remove(pos);
			System.out.println("Contato excluído");
		}catch(Exception e) {
			System.out.println("Posição inválida!");
		}
		System.out.println();
	}

	private static void excluirContato(Scanner scan, ArrayList<Contato> lista) {
		int pos = lerInformacaoInt("Informe a posição a ser removida", scan);

		try {
			Contato contato = lista.get(pos);

			lista.remove(contato);
			System.out.println("Contato excluído");
		}catch(Exception e) {
			System.out.println("Posição inválida!");
		}
		System.out.println();
	}

	private static void pesquisarContatoExiste(Scanner scan, ArrayList<Contato> lista) {
		int pos = lerInformacaoInt("Informe a posição a ser presquisada", scan);

		try {
			Contato contato = lista.get(pos);
			boolean existe = lista.contains(contato);

			if(existe) {
				System.out.println("Contato existente, dados abaixo:");
				System.out.println(contato);
			}else {
				System.out.println("Contato não existe");
			}
		}catch(Exception e) {
			System.out.println("Posição inválida!");
		}
		System.out.println();
	}

	private static void pesquisarUltimoIndice(Scanner scan, ArrayList<Contato> lista) {
		int pos = lerInformacaoInt("Informe a posição a ser presquisada", scan);

		try {
			Contato contato = lista.get(pos);

			System.out.println("Contato existente, dados abaixo:");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do último índice do contato encontrado:");
			pos = lista.lastIndexOf(contato);
			System.out.println("Contato encontrado na posição " + pos);
		}catch(Exception e) {
			System.out.println("Posição inválida!");
		}
		System.out.println();
	}

	private static void obterContato(Scanner scan, ArrayList<Contato> lista) {
		int pos = lerInformacaoInt("Informe a posição a ser presquisada", scan);

		try {
			Contato contato = lista.get(pos);

			System.out.println("Contato existente, dados abaixo:");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do contato encontrado:");
			pos = lista.indexOf(contato);
			System.out.println("Contato encontrado na posição " + pos);
		}catch(Exception e) {
			System.out.println("Posição inválida!");
		}
		System.out.println();
	}

	private static void obterContatoPosicao(Scanner scan, ArrayList<Contato> lista) {
		int pos = lerInformacaoInt("Informe a posição a ser presquisada", scan);

		try {
			Contato contato = lista.get(pos);

			System.out.println("Contato existente, dados abaixo:");
			System.out.println(contato);
		}catch(Exception e) {
			System.out.println("Posição inválida!");
		}
		System.out.println();
	}

	private static void adicionarContatoFinal(Scanner scan, ArrayList<Contato> lista) {
		System.out.println("Criando um contato, entre com as informações");
		String nome = lerInformacao("Informe o nome", scan);
		String telefone = lerInformacao("Informe o telefone", scan);
		String email = lerInformacao("Informe o email", scan);

		Contato contato = new Contato(nome, telefone, email);
		lista.add(contato);

		System.out.println("Contato adicionado com sucesso!");
		System.out.println(contato);
		System.out.println();
	}

	private static void adicionarContatoPosicao(Scanner scan, ArrayList<Contato> lista) {
		System.out.println("Criando um contato, entre com as informações");
		String nome = lerInformacao("Informe o nome", scan);
		String telefone = lerInformacao("Informe o telefone", scan);
		String email = lerInformacao("Informe o email", scan);

		Contato contato = new Contato(nome, telefone, email);

		int pos = lerInformacaoInt("Informe a posição a adicionar o contato", scan);

		try {
			lista.add(pos, contato);

			System.out.println("Contato adicionado com sucesso!");
			System.out.println(contato);
		}catch(Exception e) {
			System.out.println("Posição inválida, contato não adicionado");
		}	
		System.out.println();
	}

	private static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> lista) {
		Contato contato;

		for(int i=0; i<=quantidade; i++) {
			contato = new Contato();
			contato.setNome("Contato " + i);
			contato.setTelefone("9999-999" + i);
			contato.setEmail("contato" + i + "@email.com");
			lista.add(contato);
		}
	}


}
