package Estruturas;

import java.util.Stack;

public class StackPilha {
	public static void main(String[] args) {
		Stack<Carro> stackCarros = new Stack();
		stackCarros.push(new Carro("Ford"));
		stackCarros.push(new Carro("Chevrolet"));		//Em pilhas, adicionamos os objetos através do push.
		stackCarros.push(new Carro("Fiat"));
		
		System.out.println(stackCarros);
		stackCarros.pop();								//O pop faz a remoção do último obejto inserido.(LIFO)
		System.out.println(stackCarros);
		System.out.println(stackCarros.peek());			//O peek seleciona o último item inserido na fila, porém não faz remoção.
		System.out.println(stackCarros.empty()); 		//Exibe se  a pilha está vazia.
	}

}
