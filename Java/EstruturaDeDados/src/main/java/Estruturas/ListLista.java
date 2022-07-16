package Estruturas;

import java.util.ArrayList;
import java.util.List;

public class ListLista {
	public static void main(String[] args) {
		List<Carro> listCarros = new ArrayList();
		
		listCarros.add(new Carro("Ford"));
		listCarros.add(new Carro("Chevrolet"));
		listCarros.add(new Carro("Fiat"));
		listCarros.add(new Carro("Peugeot"));
		
		System.out.println(listCarros);	
		System.out.println(listCarros.contains(new Carro("Ford")));		//Verifica se o objeto existe na lista
		System.out.println(listCarros.get(2));							//Seleciona objeto pelo indice, lembrando que indice se inicia em 0
		System.out.println(listCarros.indexOf(new Carro("Peugeot")));	//Retorna o indice do objeto passado.
		listCarros.remove(2);											//Remove objeto orientado pelo indice.
		System.out.println(listCarros);	
		System.out.println(listCarros.indexOf(new Carro("Peugeot")));
	}

}
