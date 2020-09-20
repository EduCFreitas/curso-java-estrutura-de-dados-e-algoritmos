package com.estruturadados.pilha.labs;

import java.util.Scanner;

import com.estruturadados.pilha.Pilha;

public class Ex02 {

	public static void main(String[] args) {

		Pilha<Integer> par = new Pilha<Integer>();
		Pilha<Integer> impar = new Pilha<Integer>();
		Scanner scan = new Scanner(System.in);

		for (int i=1; i<=10; i++) {
			System.out.println("Informe um número inteiro:");
			int num = scan.nextInt();

			if(num==0) {
				Integer desempilhado = par.desempilha();

				if(desempilhado==null) {
					System.out.println("Pilha par vazia");
				}else {
					System.out.println("Número 0. Desempilhando da par: " + desempilhado);
				}

				desempilhado = impar.desempilha();

				if(desempilhado==null) {
					System.out.println("Pilha ímpar vazia");
				}else {
					System.out.println("Número 0. Desempilhando da ímpar: " + desempilhado);
				}
			}else if(num%2==0) {
				System.out.println("Par. Empilhando: " + num);
				par.empilha(num);
			}else {
				System.out.println("Ímpar. Empilhando: " + num);
				impar.empilha(num);
			}
		}
		
		System.out.println("Desempilhando toos os números da pilha par:");
		while(!par.estaVazia()) {
			System.out.println("Desempilhando da pilha par: " + par.desempilha());
		}
		
		System.out.println("Desempilhando toos os números da pilha ímpar:");
		while(!impar.estaVazia()) {
			System.out.println("Desempilhando da pilha ímpar: " + impar.desempilha());
		}
		
		System.out.println("Fim");

	}

}
