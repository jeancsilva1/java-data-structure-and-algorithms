package com.jean.structuredates.array.teste;

import com.jean.structuredates.array.Vetor;

public class TesteVetor06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vetor vetor = new Vetor(3);
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
		
	
		vetor.remove(2);
		System.out.println(vetor);
	}

}
