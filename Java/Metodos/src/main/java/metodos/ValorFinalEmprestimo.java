package metodos;

import java.util.Scanner;

public class ValorFinalEmprestimo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o valor desejado do empréstimo: ");
		Double valor = Double.parseDouble(teclado.nextLine());
		System.out.println("Infoorme o número desejado de parcelas: ");
		Integer numParcelas = Integer.parseInt(teclado.nextLine());
		teclado.close();
		Double valorFinal = ValorFinalEmprestimo.valorFinal(valor, numParcelas);
		if (valorFinal>0.0)
			System.out.println(String.format("O valor final do empréstimo é de R$%,.2f", valorFinal));
		else
			System.out.println("FAIXA DE VALOR OU NÚMERO DE PARCELAS INCOMPATÍVEL");
	}
	
	
	public static Double valorFinal(Double valor, Integer numParcelas) {
		int a = 1;
		Double valorJuros;
		if (valor >0.1 && valor <1000.00 && numParcelas<=12) {
			while (a<=numParcelas) {
				valorJuros = valor * 0.02;
				valor = valor + valorJuros;
				a++;
			}
			return (double) Math.round(valor * 100.0)/100.0;
		}
		if (valor >=1000 && valor <5000.00 && numParcelas<=24) {
			while (a<=numParcelas) {
				valorJuros = valor * 0.015;
				valor = valor + valorJuros;
				a++;
			}
			return (double) Math.round(valor * 100.0)/100.0;
		}
		if (valor >=5000 && valor <=10000.00 && numParcelas<=36) {
			while (a<=numParcelas) {
				valorJuros = valor * 0.012;
				valor = valor + valorJuros;
				a++;
			}
			return (double) Math.round(valor * 100.0)/100.0;
		}
		else {
			return 0.0;
		}
	}
}
