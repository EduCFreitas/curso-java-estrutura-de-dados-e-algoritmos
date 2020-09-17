package com.estruturadados.vetor.teste;

import com.estruturadados.vetor.VetorObjetos;

public class Aula10 {

	public static void main(String[] args) {
		
		VetorObjetos vetor = new VetorObjetos(3);
		
		Contato c1 = new Contato("Contato1", "1234-5678", "contato1@email.com");
		Contato c2 = new Contato("Contato2", "9012-3456", "contato2@email.com");
		Contato c3 = new Contato("Contato3", "7890-1234", "contato3@email.com");
		
		Contato c4 = new Contato("Contato1", "1234-5678", "contato1@email.com");
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		System.out.println("Tamanho = " + vetor.tamanho());
		
		int pos = vetor.busca(c4);
		if(pos > -1) {
			System.out.println("Elemento existe no vetor");
		}else {
			System.out.println("Elemento não existe no vetor");
		}
		
		System.out.println(vetor);

	}

}
