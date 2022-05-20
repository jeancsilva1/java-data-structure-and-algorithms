package com.jean.structuredates.array.teste;

import com.jean.structuredates.array.Vetor;

public class TesteVetor {
	public static void main(String[] args) {
		
	Vetor vetor = new Vetor(5);
	
	try {
	vetor.adiciona("elemento 1");
	vetor.adiciona("elemento 2");
	vetor.adiciona("elemento 3");
	}
	catch(Exception e) {
		e.printStackTrace();
		
	}
	}

}
