package com.jean.structuredates.list;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {

	private String nome;
	private int idade;
	private String cpf; 
	private String rg;
	private List<Disciplina> disciplinas = new ArrayList<>();
	
	public Aluno(String nome, int idade, String cpf, String rg, List<Disciplina> disciplinas) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.rg = rg;
		this.disciplinas = disciplinas;
	}
	public Aluno() {
		super();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cpf, disciplinas, idade, nome, rg);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(disciplinas, other.disciplinas) && idade == other.idade
				&& Objects.equals(nome, other.nome) && Objects.equals(rg, other.rg);
	}
	@Override
	public String toString() {
		return "Nome:" + nome + "\nIdade:" + idade + "\nCpf=" + cpf + "\nRg=" + rg + "\nDisciplinas:"
				+ disciplinas;
	}
	
	public double media() {
		double somaNotas = 0;
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota(); 
			
		}
		
		return somaNotas / disciplinas.size();
	}
	

	public String aprovado() {
		if(this.media() >= 50 && this.media() <=70) {
			return "Aluno está de recuperação";
		}
		else if (this.media() >70){
			return "Aprovado";
			
		}
		
		else {
			return "Reprovado";
		}
		
	}
	
}
