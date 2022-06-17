package loops;

import java.util.Scanner;

public class AulaDoWhile {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i = 0;
		int maior = 0;
		int media = 0;
		int numero = 0;

		do {
			System.out.println("Número: ");
			numero = Integer.parseInt(teclado.nextLine());
			media += numero;
			if (numero > maior)
				maior = numero;
			i++;
		} while (i < 5);

		teclado.close();
		media /= 5;

		System.out.println("O maior número é: " + maior);
		System.out.println("A média é: " + media);
	}
}
