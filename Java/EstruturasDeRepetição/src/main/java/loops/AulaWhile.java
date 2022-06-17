package loops;

import java.util.Scanner;

public class AulaWhile {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome = " ";
		Integer idade;
		
		while (true) {
		System.out.println("Nome: ");
		nome = teclado.nextLine();
		if (nome.equals("0")) {
			teclado.close();
			break;
		}
		System.out.println("Idade: ");
		idade = Integer.parseInt(teclado.nextLine());
		}
		teclado.close();
		System.out.println("Fim!");
	}

}
