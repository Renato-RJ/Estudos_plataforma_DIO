package Estruturas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AulaList {
	public static void main(String[] args) {
		List<Double> notas = new ArrayList<>();
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe as notas a seguir: ");

		for (int i = 0; i < 7; i++) {
			System.out.println("Informe uma nota: ");
			notas.add(Double.parseDouble(teclado.nextLine()));
		}

		System.out.println(notas);

		System.out.println("nota do indice 0: " + notas.get(0));

		System.out.println("Informe uma nova nota para o indice 0: ");
		notas.set(0, Double.parseDouble(teclado.nextLine())); // Cuidado ao atuliazar list, usar SET e não ADD.

		System.out.println("Nota do indice 0 alterada. " + notas);

		System.out.println("Qual nota deseja checar se existe? ");
		System.out.println(notas.contains(Double.parseDouble(teclado.nextLine())));

		System.out.println("A menor nota é: " + Collections.min(notas));
		System.out.println("A maior nota é: " + Collections.max(notas));

		Double soma = 0d;
		Iterator<Double> iterador = notas.iterator();
		while (iterador.hasNext()) {
			Double next = iterador.next();
			soma += next;
		}

		System.out.println("A soma das notas é: " + soma);
		System.out.println("A média é: " + soma / notas.size());
		System.out.println(notas);
		System.out.println(notas.remove(0));
		System.out.println(notas);
		System.out.println("Informe uma remover: ");
		notas.remove(Double.parseDouble(teclado.nextLine())); // No caso do remove, prestar atenção, pois como é double,
																// se não passar o parâmetro D, ele interpreta como
																// inteiro e remove pelo índice.
		System.out.println(notas);

	}

}
