package Estruturas;

import java.util.LinkedList;
import java.util.Queue;

public class QueueFila {
	public static void main(String[] args) {
	Queue<Carro> filaCarros = new LinkedList();
	filaCarros.add(new Carro("Ford"));
	filaCarros.add(new Carro("Chevrolet"));		//Método add adiciona itens a fila.
	filaCarros.add(new Carro("Fiat"));
	
	System.out.println(filaCarros);
	System.out.println(filaCarros.peek());		//Pega o primeiro item da fila, porém, não o remove. Se estiver vazia, retorna null
	System.out.println(filaCarros);
	System.out.println(filaCarros.poll());		//Remove o primeiro objeto da fila. (FIFO)
	System.out.println(filaCarros);
	System.out.println(filaCarros.isEmpty());	//Exibe se a fila está vazia.
	System.out.println(filaCarros.size());		//Mostra a quantidade de itens da fila.
	}
}