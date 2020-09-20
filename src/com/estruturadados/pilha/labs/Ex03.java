package com.estruturadados.pilha.labs;

import com.estruturadados.pilha.Pilha;

public class Ex03 {

	public static void main(String[] args) {
		
		Pilha<Livro> pilha = new Pilha<Livro>(20);
		
		Livro livro1 = new Livro();
		livro1.setNome("Livro1");
		livro1.setAutor("Autor1");;
		livro1.setAnoLancamento(2001);
		livro1.setIsbn("00000001");
		
		Livro livro2 = new Livro();
		livro2.setNome("Livro2");
		livro2.setAutor("Autor2");;
		livro2.setAnoLancamento(2002);
		livro2.setIsbn("00000002");
		
		Livro livro3 = new Livro();
		livro3.setNome("Livro3");
		livro3.setAutor("Autor3");;
		livro3.setAnoLancamento(2003);
		livro3.setIsbn("00000003");
		
		Livro livro4 = new Livro();
		livro4.setNome("Livro4");
		livro4.setAutor("Autor4");;
		livro4.setAnoLancamento(2004);
		livro4.setIsbn("00000004");
		
		Livro livro5 = new Livro();
		livro5.setNome("Livro5");
		livro5.setAutor("Autor5");;
		livro5.setAnoLancamento(2005);
		livro5.setIsbn("00000005");
		
		Livro livro6 = new Livro();
		livro6.setNome("Livro6");
		livro6.setAutor("Autor6");;
		livro6.setAnoLancamento(2006);
		livro6.setIsbn("00000006");
		
		System.out.println("Pilha de livros criada. Pilha está vazia? " + pilha.estaVazia());
		
		System.out.println("Empilhando livros na pilha:");
		pilha.empilha(livro1);
		pilha.empilha(livro2);
		pilha.empilha(livro3);
		pilha.empilha(livro4);
		pilha.empilha(livro5);
		pilha.empilha(livro6);
		System.out.println(pilha.tamanho() + " livros foram empilhados:");
		System.out.println(pilha);
		
		System.out.println("Pilha de livros criada. Pilha está vazia? " + pilha.estaVazia());
		
		System.out.println("Espiando o topo da pilha: " + pilha.topo());
		
		System.out.println("Desempilhando livros da pilha:");
		while(!pilha.estaVazia()) {
			System.out.println("Desempilhando livro " + pilha.desempilha());
		}
		
		System.out.println("Todos os livros foram desempilhados. Pilha está vazia? " + pilha.estaVazia());

	}

}
