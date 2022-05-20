package com.jean.structuredates.array.teste;

import com.jean.structuredates.array.Vetor;

public class TesteVetor01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vetor vetor = new Vetor(10);

		try {
			vetor.adiciona("elemento 1");
			vetor.adiciona("elemento 2");
			vetor.adiciona("elemento 3");

			System.out.println(vetor.tamanho());
			System.out.println(vetor);
		} catch (Exception e) {
			e.printStackTrace();

		}
		
		

	}

	

}
