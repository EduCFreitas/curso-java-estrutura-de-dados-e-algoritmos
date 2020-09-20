package com.estruturadados.pilha.labs;

import java.util.Scanner;

import com.estruturadados.pilha.Pilha;

public class Ex01 {

	public static void main(String[] args) {

		Pilha<Integer> pilha = new Pilha<Integer>();
		Scanner scan = new Scanner(System.in);

		for(int i=0; i<10; i++) {
			System.out.println("Informe um n�mero:");
			int num = scan.nextInt();

			if(num%2==0) {
				System.out.println("Empilhando o n�mero " + num);
				pilha.empilha(num);
			}else {
				Integer desempilhado = pilha.desempilha();

				if(desempilhado == null) {
					System.out.println("Pilha est� vazia");
				}else {
					System.out.println("N�mero �mpar, desempilhando um elemento da pilha: " + desempilhado);
				}
			}
		}

		System.out.println("Todos os n�meros foram lidos, desempilhando n�meros da pilha:");

		while(!pilha.estaVazia()) {
			System.out.println("Desempilhando um elemento da pilha: " + pilha.desempilha());
		}

		System.out.println("Todos os elementos foram desempilhados");
		scan.close();

	}

}
