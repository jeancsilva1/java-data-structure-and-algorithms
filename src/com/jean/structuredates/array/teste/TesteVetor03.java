package com.jean.structuredates.array.teste;

import com.jean.structuredates.array.Vetor;

public class TesteVetor03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vetor vetor = new Vetor(10);
		try {
		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(vetor.busca("elemento 1"));
	}

}
