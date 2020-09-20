package com.estruturadados.pilha.labs;

import java.util.Stack;

public class Ex04 {

	public static void main(String[] args) {
		
		Stack<Livro> stack = new Stack<Livro>();
				
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
		
		System.out.println("Pilha de livros criada. Pilha está vazia? " + stack.isEmpty());
	
		System.out.println("Empilhando livros na pilha:");
		stack.push(livro1);
		stack.push(livro2);
		stack.push(livro3);
		stack.push(livro4);
		stack.push(livro5);
		stack.push(livro6);
		System.out.println(stack.size() + " livros foram empilhados:");
		System.out.println(stack);
		
		System.out.println("Pilha de livros criada. Pilha está vazia? " + stack.isEmpty());
		
		System.out.println("Espiando o topo da pilha: " + stack.peek());
		
		System.out.println("Desempilhando livros da pilha:");
		while(!stack.isEmpty()) {
			System.out.println("Desempilhando livro " + stack.pop());
		}
		
		System.out.println("Todos os livros foram desempilhados. Pilha está vazia? " + stack.isEmpty());
		
	}

}
