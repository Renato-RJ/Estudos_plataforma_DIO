package Estruturas;

import java.util.*;

public class Maps {
	public static void main(String[] args) {
		Map<String, String> aluno = new HashMap<>();
		
		aluno.put("Nome", "João");
		aluno.put("Idade", "17");
		aluno.put("Média", "8.5");
		aluno.put("Turma", "3a");
		
		System.out.println(aluno);
		System.out.println(aluno.keySet());
		System.out.println(aluno.values());
		
		List<Map<String, String>> listaAlunos = new ArrayList<>();
		
		Map<String, String> aluno2 = new HashMap<>();
		aluno2.put("Nome", "Maria");
		aluno2.put("Idade", "18");
		aluno2.put("Média", "8.9");
		aluno2.put("Turma", "3b");
		
		listaAlunos.add(aluno);
		listaAlunos.add(aluno2);
		
		System.out.println(listaAlunos);
		
		System.out.println(aluno.containsKey("Nome"));
	}

}
