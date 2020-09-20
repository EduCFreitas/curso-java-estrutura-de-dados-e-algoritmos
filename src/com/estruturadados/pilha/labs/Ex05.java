package com.estruturadados.pilha.labs;

import java.util.Scanner;

import com.estruturadados.pilha.Pilha;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a palavra");
		String palavra = scan.next();
		
		imprimeResultado(palavra);
		
		scan.close();

	}
	
	
	public static void imprimeResultado(String palavra) {
		System.out.println(palavra + " é palíndromo? " + testaPalindromo(palavra));
	}
	
	public static boolean testaPalindromo(String palavra) {
		Pilha<Character> pilha = new Pilha<Character>();
		
		for(int i=0; i<palavra.length(); i++) {
			pilha.empilha(palavra.charAt(i));
		}
		
		String palavraInversa = "";
		while(!pilha.estaVazia()) {
			palavraInversa += pilha.desempilha();
		}
		
		if(palavraInversa.equalsIgnoreCase(palavra)) {
			return true;
		}
		return false;
	}

}
