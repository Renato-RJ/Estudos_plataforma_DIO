package Estruturas;

import java.util.Random;

public class AulaArrayMultidimensional {
	public static void main(String[] args) {
		Random aleatório = new Random();
		Integer matriz[][] = new Integer[4][4];

		for (int i = 0; i < 4; i++) {
			for (int x = 0; x < 4; x++) {
				matriz[i][x] = aleatório.nextInt(9);
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int x = 0; x < 4; x++) {
				System.out.println("O número na linha " + i + " e coluna " + x + " é = " + matriz[i][x]);
			}
		}
	}

}
