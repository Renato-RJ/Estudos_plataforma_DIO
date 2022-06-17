package loops;

import java.util.Scanner;

public class AulaFor2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int fatorial = 0;
		int resultado = 0;

		System.out.println("Informe um número para fatorar: ");
		fatorial = Integer.parseInt(teclado.nextLine());
		resultado = fatorial;
		teclado.close();

		for (int i = fatorial - 1; i > 0; i--) {
			resultado *= i;
		}
		System.out.println(fatorial + "! = " + resultado);
	}

}
