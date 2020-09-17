package com.estruturadados.vetor.teste;

import com.estruturadados.vetor.Vetor;

public class Aula09 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(3);

		vetor.adiciona("B");
		vetor.adiciona("G");
		vetor.adiciona("D");
		vetor.adiciona("E");
		vetor.adiciona("F");
		System.out.println(vetor);
		
		vetor.remove(1);
		System.out.println(vetor);
		
		System.out.println("Remover o elemento E");
		//vetor.remove(vetor.busca("E"));
		int pos = vetor.busca("E");
		if(pos > -1) {
			vetor.remove(pos);
		}else {
			System.out.println("Elemento não existe!");
		}
		System.out.println(vetor);

	}

}
