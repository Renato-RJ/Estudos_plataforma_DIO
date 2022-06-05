package metodos.sobrecarga;

import java.util.Scanner;

public class CalculoArea {
	public static void main(String[] args) {
		System.out.println(CalculoArea.area(2.5));
		System.out.println(CalculoArea.area(2.6,3.6));
		System.out.println(CalculoArea.area(4.1, 2.5, 6.3));
	
	
	}
	public static String area(Double lado) {
		return "Área do quadrado: " + lado*lado+"m²";
	}
	public static String area(Double lado1, Double lado2) {
		return "Área do retângulo: " + lado1*lado2+"m²";
	}
	public static String area(Double baseMaior, Double baseMenor, Double altura) {
		return "Área do trapézio: " + ((baseMaior+baseMenor)*altura)/2 +"m²";
	}

}
