package loops;

import java.util.Scanner;

public class AulaDoWhile2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int pares = 0;
		int impares = 0;
		int numero = 0;
		int vezes = 0;
		int i = 0;

		System.out.println("Quer rodar quantas vezes? ");
		vezes = Integer.parseInt(teclado.nextLine());

		do {
			System.out.println("Número: ");
			numero = Integer.parseInt(teclado.nextLine());
			if (numero % 2 == 0)
				pares ++;
			else
				impares++;
			i++;
		} while (i < vezes);
		teclado.close();

		System.out.println("Números pares: " + pares);
		System.out.println("Números ímpares: " + impares);
	}

}
