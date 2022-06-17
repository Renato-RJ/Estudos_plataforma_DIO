package loops;

import java.util.Scanner;

public class AulaFor {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int tabuada = 0;

		System.out.println("Número: ");
		tabuada = Integer.parseInt(teclado.nextLine());
		teclado.close();

		for (int i = 0; i <= 10; i++) {
			System.out.println(tabuada + " X " + i + " = " + tabuada * i);
		}
	}
}
