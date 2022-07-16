package Estruturas;

import java.util.*;

public class SetTreeSetConjunto {
	public static void main(String[] args) {
//		Set <Carro> hashSetCarros = new HashSet<>();
//		
//		hashSetCarros.add(new Carro("Ford"));
//		hashSetCarros.add(new Carro("Chevrolet"));
//		hashSetCarros.add(new Carro("Fiat"));
//		hashSetCarros.add(new Carro("Peugeot"));
//		hashSetCarros.add(new Carro("Zip"));
//		hashSetCarros.add(new Carro("Alfa Romeo"));
//		hashSetCarros.add(new Carro("BMW"));
//		
//		System.out.println(hashSetCarros);							//Os objetos de um Set não obdecem a ordem de inserção dos mesmos, ordem aleatória.
//
		
		NavigableSet<Carro> treeSetCarros = new TreeSet();		//Para fazer o uso do treeSet, é necessário implementar a classe comparable na classe de modelo.
		treeSetCarros.add(new Carro("Ford"));
		treeSetCarros.add(new Carro("Chevrolet"));
		treeSetCarros.add(new Carro("Fiat"));
		treeSetCarros.add(new Carro("Peugeot"));
		treeSetCarros.add(new Carro("Zip"));
		treeSetCarros.add(new Carro("Alfa Romeo"));
		treeSetCarros.add(new Carro("BMW"));
		
		System.out.println(treeSetCarros.contains(new Carro("Alfa Romeo")));	 						//Checando existência de elemento
		System.out.println(treeSetCarros);
		System.out.println("O fiat está no TreeSet? " + treeSetCarros.contains(new Carro("Fiat")));
		treeSetCarros.remove(new Carro("Ford"));														//Removendo por nome
		System.out.println(treeSetCarros);
		System.out.println("O fiat está no TreeSet? " + treeSetCarros.contains(new Carro("Fiat")));
		treeSetCarros.pollFirst();																		//Removendo por localização
		System.out.println(treeSetCarros);
		
//		for (Carro carro : treeSetCarros)
//		System.out.println(carro);

					
	}

}
