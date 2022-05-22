package com.jean.structuredates.array.teste;

import com.jean.structuredates.array.Vetor;

public class TesteVetor04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vetor vetor = new Vetor(10);
		try {
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("E");
		vetor.adiciona("F");
		vetor.adiciona("G");
		
		System.out.println(vetor);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		vetor.adiciona(0, "A");
		System.out.println(vetor);
	}

}
