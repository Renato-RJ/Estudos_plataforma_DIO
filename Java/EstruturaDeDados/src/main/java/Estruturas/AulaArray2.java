package Estruturas;

import java.util.Scanner;

public class AulaArray2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String caracteres[] = new String[6];
		int quantidadeConsoantes = 0;

		for (int i = 0; i < 6; i++) {
			System.out.println("Informe um caractere para o índice " + i + " do vetor: ");
			caracteres[i] = teclado.nextLine();
		}
		teclado.close();

		for (int i = 0; i < 6; i++) {
			if (!"aeiou".contains(caracteres[i]))
				quantidadeConsoantes++;
		}

		System.out.println("O vetor contem " + quantidadeConsoantes + " consotante(s)");

	}
}
