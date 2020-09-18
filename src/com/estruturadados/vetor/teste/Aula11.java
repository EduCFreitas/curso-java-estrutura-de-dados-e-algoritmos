package com.estruturadados.vetor.teste;

import com.estruturadados.vetor.Lista;

public class Aula11 {

	public static void main(String[] args) {
		
		Lista<Contato> vetor = new Lista<Contato>(1);
		
		Contato c1 = new Contato("Contato1", "1234-5678", "contato1@email.com");
		Contato c2 = new Contato("Contato2", "9012-3456", "contato2@email.com");
		Contato c3 = new Contato("Contato3", "7890-1234", "contato3@email.com");
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);

	}

}
