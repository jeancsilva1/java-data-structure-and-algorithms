package com.jean.structuredates.list.teste;

import com.jean.structuredates.list.Aluno;
import com.jean.structuredates.list.Disciplina;
import com.jean.structuredates.list.Resultado;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

public class TesteAluno {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<>();
		HashMap<String, List<Aluno>> maps = new HashMap<>();
		
		/*Comentando lista pra utilizar HASHMAP
		List<Aluno> alunosAprovados = new ArrayList<>();
		List<Aluno> alunosReprovados = new ArrayList<>();
		List<Aluno> alunosRecuperacao = new ArrayList<>();
		*/

		for (int i = 1; i <= 4; i++) {
			Aluno aluno = new Aluno();
			aluno.setNome(JOptionPane.showInputDialog("Qual o nome do Aluno?"));
			aluno.setIdade(Integer.valueOf(JOptionPane.showInputDialog("Qual a sua idade?")));
			//aluno.setCpf(JOptionPane.showInputDialog("Qual o seu CPF?"));
			//aluno.setRg(JOptionPane.showInputDialog("Qual o seu RG?"));

			for (int j = 1; j <= 2; j++) {
				Disciplina disc = new Disciplina();
				disc.setNome(JOptionPane.showInputDialog("Qual o nome da Disciplina" + j + ":"));
				disc.setNota(Double.valueOf(JOptionPane.showInputDialog("Qual a nota " + j + ":")));
				while (disc.getNota() > 100 || disc.getNota() < 0) {
					disc.setNota(Double.valueOf(JOptionPane
							.showInputDialog("Nota não pode ser maior que 100!!! \nQual a nota " + j + ":")));
				}
				aluno.getDisciplinas().add(disc);

			}

			int resposta = (Integer.valueOf(JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?")));
			if (resposta == 0) {
				int escolha = (Integer
						.valueOf(JOptionPane.showInputDialog(null, "Qual disciplina deseja remover? 1, 2, 3 ou 4?")));
				while (escolha != 1 && escolha != 2) {
					escolha = (Integer.valueOf(JOptionPane.showInputDialog(null,
							"Opção Inválida, entre com outra opção. (1, 2, 3 ou 4)?")));
				}
				aluno.getDisciplinas().remove(escolha - 1);
			}

			alunos.add(aluno);
		}
		
		maps.put(Resultado.APROVADO, new ArrayList<Aluno>());
		maps.put(Resultado.REPROVADO, new ArrayList<Aluno>());
		maps.put(Resultado.RECUPARACAO, new ArrayList<Aluno>());
		
		for (Aluno aluno : alunos) {
			if(aluno.aprovado().equals(Resultado.APROVADO)) {
				maps.get(Resultado.APROVADO).add(aluno);
				/*
				 * comentando para utilizar o HASHMAP
				alunosAprovados.add(aluno);
				*/
			} else if(aluno.aprovado().equals(Resultado.REPROVADO)) {
				/*
				 * comentando para utilizar o HASHMAP
				alunosReprovados.add(aluno);
				*/
				maps.get(Resultado.REPROVADO).add(aluno);
			}
			
			else {
				/*
				 * comentando para utilizar o HASHMAP
				alunosRecuperacao.add(aluno);
				*/
				maps.get(Resultado.REPROVADO).add(aluno);
			}
			
		}
		
		for (Aluno aluno : maps.get(Resultado.RECUPARACAO)) {
			JOptionPane.showMessageDialog(null,"Alunos em recuperação:\n" + aluno.getNome());
			
		}
		
		for (Aluno aluno : maps.get(Resultado.REPROVADO)) {
			JOptionPane.showMessageDialog(null,"Alunos Reprovados:\n" + aluno.getNome());
			
		}
		
		for (Aluno aluno : maps.get(Resultado.APROVADO)) {
			JOptionPane.showMessageDialog(null,"Alunos Aprovados:\n" + aluno.getNome());
			
		}
		
		
		for (Aluno aluno2 : alunos) {
			if(aluno2.getNome().equalsIgnoreCase("jean")){
			JOptionPane.showMessageDialog(null, aluno2);
			break;
			}
			else {
				JOptionPane.showMessageDialog(null, aluno2 + "\nMedia:" + aluno2.media() + "\n" + aluno2.aprovado());
				System.out.println(aluno2 + "\nMedia:" + aluno2.media() + "\n" + aluno2.aprovado());
			}
		}
		

	}

}
