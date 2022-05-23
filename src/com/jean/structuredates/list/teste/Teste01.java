package com.jean.structuredates.list.teste;

import com.jean.structuredates.list.Lista;

public class Teste01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista<String> vetor = new Lista<String>(1);
		try {
		vetor.adiciona("Elemento");
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(vetor);
	}

}
