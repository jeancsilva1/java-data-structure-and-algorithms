package com.jean.structuredates.list;

import java.lang.reflect.Array;

public class Lista<T> {
	
	private T[] elementos;
	private int tamanho;
	
	public Lista(int capacidade) {
		this.elementos = (T[]) new String[capacidade];
		this.tamanho = 0;
	}
	
	public Lista(int capacidade, Class<T> tipoClasse) {
		this.elementos =(T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;
	}
	
	
	/*
	public void adiciona(String elemento) {
		for(int i = 0; i<this.elementos.length; i++) {
			if(this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}
	*/
	
	public void adiciona(T elemento) throws Exception {
		if(this.tamanho < this.elementos.length) {
	this.elementos[this.tamanho] = elemento;
	this.tamanho++;
	System.out.println("Elemento adicionado");
		}
		else {
			throw new Exception("Vetor já está cheio");
		}
		this.aumentaCapacidade();
	
	}
	
	private void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new String[this.elementos.length * 2];
			for(int i = 0; i<this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	public void remove(int posicao) {
		if(!(posicao >=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicao Iválida");
		}
		for(int i = posicao; i<this.tamanho -1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
	}
	
	public boolean adiciona(int posicao, T elemento) {
		this.aumentaCapacidade();
		if(!(posicao >=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicao Iválida");
		}
		
		for(int i=this.tamanho -1; i >=posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return true;
	}
	
	public T busca(int posicao) {
		if(!(posicao >=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição Inválida");
		}
		  return this.elementos[posicao];
	}
	
	public int busca (T elemento) {
		for(int i = 0; i<this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for(int i =0; i<this.tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		if(this.tamanho > 0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		
		s.append("]");
		return s.toString();
	}
	

}
