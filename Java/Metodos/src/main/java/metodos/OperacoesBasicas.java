package metodos;

import java.util.Scanner;

public class OperacoesBasicas {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe um número para a operação: ");
		Double	numeroUm = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe o segundo número da operação: ");
		Double numeroDois = Double.parseDouble(teclado.nextLine());
		teclado.close();
		System.out.println(OperacoesBasicas.soma(numeroUm, numeroDois));
		System.out.println(OperacoesBasicas.subtracao(numeroUm, numeroDois));
		System.out.println(OperacoesBasicas.multiplicacao(numeroUm, numeroDois));
		System.out.println(OperacoesBasicas.divisao(numeroUm, numeroDois));
		
	}
	public static Double soma(Double a, Double b) {
		return a + b; 
	}
	public static Double subtracao(Double a, Double b) {
		return a - b; 
	}
	public static Double multiplicacao(Double a, Double b) {
		return a * b; 
	}
	public static Double divisao(Double a, Double b) {
		return 	a/b; 
	}
}
