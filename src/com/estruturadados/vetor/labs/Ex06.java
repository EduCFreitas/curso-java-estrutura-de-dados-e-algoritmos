package com.estruturadados.vetor.labs;

import java.util.Scanner;

import com.estruturadados.vetor.Lista;
import com.estruturadados.vetor.teste.Contato;

public class Ex06 {

	public static void main(String[] args) {

		//Criação das variáveis
		Scanner scan = new Scanner(System.in);

		//Criar um vetor com capacidade 20
		Lista<Contato> lista = new Lista<Contato>(20);

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
	
	
	private static void imprimirVetor(Lista<Contato> lista) {
		System.out.println(lista);
	}
	
	private static void limparVetor(Lista<Contato> lista) {
		lista.limpar();
		System.out.println("Todos os contatos ddo vetor foram excluídos.");
	}
	
	private static void imprimeTamanhoVetor(Lista<Contato> lista) {
		System.out.println("Tamanho do vetor é de: " + lista.tamanho());
	}
	
	private static void excluirPorPosicao(Scanner scan, Lista<Contato> lista) {
		int pos = lerInformacaoInt("Informe a posição a ser removida", scan);

		try {
			lista.remove(pos);
			System.out.println("Contato excluído");
		}catch(Exception e) {
			System.out.println("Posição inválida!");
		}
	}
	
	private static void excluirContato(Scanner scan, Lista<Contato> lista) {
		int pos = lerInformacaoInt("Informe a posição a ser removida", scan);

		try {
			Contato contato = lista.busca(pos);
			
			lista.remove(contato);
			System.out.println("Contato excluído");
		}catch(Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void pesquisarContatoExiste(Scanner scan, Lista<Contato> lista) {
		int pos = lerInformacaoInt("Informe a posição a ser presquisada", scan);

		try {
			Contato contato = lista.busca(pos);
			boolean existe = lista.contem(contato);
			
			if(existe) {
				System.out.println("Contato existente, dados abaixo:");
				System.out.println(contato);
			}else {
				System.out.println("Contato não existe");
			}
		}catch(Exception e) {
			System.out.println("Posição inválida!");
		}
	}
	
	private static void pesquisarUltimoIndice(Scanner scan, Lista<Contato> lista) {
		int pos = lerInformacaoInt("Informe a posição a ser presquisada", scan);

		try {
			Contato contato = lista.busca(pos);

			System.out.println("Contato existente, dados abaixo:");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do último índice do contato encontrado:");
			pos = lista.ultimoIndice(contato);
			System.out.println("Contato encontrado na posição " + pos);
		}catch(Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void obterContato(Scanner scan, Lista<Contato> lista) {
		int pos = lerInformacaoInt("Informe a posição a ser presquisada", scan);

		try {
			Contato contato = lista.busca(pos);

			System.out.println("Contato existente, dados abaixo:");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do contato encontrado:");
			pos = lista.busca(contato);
			System.out.println("Contato encontrado na posição " + pos);
		}catch(Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void obterContatoPosicao(Scanner scan, Lista<Contato> lista) {
		int pos = lerInformacaoInt("Informe a posição a ser presquisada", scan);

		try {
			Contato contato = lista.busca(pos);

			System.out.println("Contato existente, dados abaixo:");
			System.out.println(contato);
		}catch(Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void adicionarContatoFinal(Scanner scan, Lista<Contato> lista) {
		System.out.println("Criando um contato, entre com as informações");
		String nome = lerInformacao("Informe o nome", scan);
		String telefone = lerInformacao("Informe o telefone", scan);
		String email = lerInformacao("Informe o email", scan);

		Contato contato = new Contato(nome, telefone, email);
		lista.adiciona(contato);

		System.out.println("Contato adicionado com sucesso!");
		System.out.println(contato);
	}

	private static void adicionarContatoPosicao(Scanner scan, Lista<Contato> lista) {
		System.out.println("Criando um contato, entre com as informações");
		String nome = lerInformacao("Informe o nome", scan);
		String telefone = lerInformacao("Informe o telefone", scan);
		String email = lerInformacao("Informe o email", scan);

		Contato contato = new Contato(nome, telefone, email);

		int pos = lerInformacaoInt("Informe a posição a adicionar o contato", scan);

		try {
			lista.adiciona(pos, contato);

			System.out.println("Contato adicionado com sucesso!");
			System.out.println(contato);
		}catch(Exception e) {
			System.out.println("Posição inválida, contato não adicionado");
		}	
	}

	private static String lerInformacao(String msg, Scanner scan) {
		System.out.println(msg);
		String entrada = scan.nextLine();

		return entrada;
	}

	private static int lerInformacaoInt(String msg, Scanner scan) {
		boolean entradaValida = false;
		int num = 0;

		while(!entradaValida) {
			try {
				System.out.println(msg);
				String entrada = scan.nextLine();
				num = Integer.parseInt(entrada);
				entradaValida = true;
			}catch(Exception e) {
				System.out.println("Entrada inválida, digite novamente");
			}
		}

		return num;
	}

	private static int obterOpcaoMenu(Scanner scan) {
		boolean entradaValida = false;
		int opcao = 0;
		String entrada = "";

		while(!entradaValida) {
			System.out.println("Digite a opção desejada:");
			System.out.println("1: Adiciona contato no final do vetor");
			System.out.println("2: Adiciona contato em uma posição específica");
			System.out.println("3: Obtém contato de uma posição específica");
			System.out.println("4: Consulta contato");
			System.out.println("5: Consulta o último índice do contato");
			System.out.println("6: Verifica se o contato existe");
			System.out.println("7: Excluir por posição");
			System.out.println("8: Excluir contato");
			System.out.println("9: Verifica tamanho do vetor");
			System.out.println("10: Excluir todos os contatos do vetor");
			System.out.println("11: Imprime vetor");
			System.out.println("0: Sair");

			try {
				entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);

				if(opcao>=0 && opcao<=11) {
					entradaValida = true;
				}else {
					throw new Exception();
				}
			} catch(Exception e) {
				System.out.println("Entrada inválida, digite novamente\n");
			}

		}

		return opcao;
	}

	private static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista) {
		Contato contato = new Contato();

		for(int i=0; i<=quantidade; i++) {
			contato.setNome("Contato " + i);
			contato.setTelefone("9999-999" + i);
			contato.setEmail("contato" + i + "@email.com");
			lista.adiciona(contato);
		}
	}

}
