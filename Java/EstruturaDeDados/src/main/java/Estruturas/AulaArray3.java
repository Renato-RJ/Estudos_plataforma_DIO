package Estruturas;

import java.util.Random;

public class AulaArray3 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		Integer numeros[] = new Integer[20];
		int i = 0;
		int x = 0;

		while (i < 20) {
			numeros[i] = aleatorio.nextInt(100);
			i++;
		}

		do {
			System.out.println("Número: " + numeros[x] + ", sucessor: " + numeros[x + 1]);
			x++;
		} while (x < 19);
	}

}
