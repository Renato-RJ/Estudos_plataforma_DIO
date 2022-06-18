package Estruturas;

import java.util.Scanner;

public class AulaArray {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int tamanhoVetor;
		System.out.println("Quantos números serão digitados? ");
		tamanhoVetor = Integer.parseInt(teclado.nextLine());
		Integer vetorNumeros[] = new Integer[tamanhoVetor];

		for (int i = 0; i < tamanhoVetor; i++) {
			System.out.println("Informe um número para o índice " + i + " do vetor: ");
			vetorNumeros[i] = Integer.parseInt(teclado.nextLine());
		}
		teclado.close();

		System.out.println("Vetor original: ");
		for (int i = 0; i <= tamanhoVetor - 1; i++) {
			System.out.println(vetorNumeros[i]);
		}
		
		System.out.println("Vetor invertido: ");
		for (int i = tamanhoVetor - 1; i >= 0; i--) {
			System.out.println(vetorNumeros[i]);
		}

	}

}
