package com.estruturadados.fila.labs;

import java.util.Random;

import com.estruturadados.fila.FilaComPrioridade;

public class PSNovosPacientes implements Runnable{

	private FilaComPrioridade<Pessoa> fila;
	private Random prioridade = new Random();
	
	public PSNovosPacientes(FilaComPrioridade<Pessoa> fila) {
		super();
		this.fila = fila;
	}

	@Override
	public void run() {
		for(int i=7; i<15; i++) {
			try {
				Thread.sleep(5000);
				Pessoa p = new Pessoa("" + i, prioridade.nextInt(3));
				fila.enfileira(p);
				System.out.println(p + " enfileirada");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
