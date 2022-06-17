package loops;

import java.util.Scanner;

public class AulaWhile2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int nota = 0;

		System.out.println("Nota: ");
		nota = Integer.parseInt(teclado.nextLine());
		if (nota < 0 || nota > 10) {
			while (nota < 0 || nota > 10) {
				System.out.println("Nota inválida, informe uma nota válida, entre 0 e 10.");
				nota = Integer.parseInt(teclado.nextLine());
			}
			teclado.close();
		}
		System.out.println("Fim!");
	}
}
