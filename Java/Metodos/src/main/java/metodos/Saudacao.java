package metodos;

import java.time.LocalTime;


public class Saudacao {
	public static void main(String[] args) {
		LocalTime hora = LocalTime.now();
		System.out.println(Saudacao.saudar(hora));
	}
	public static String saudar(LocalTime hora) {
		LocalTime bDia = LocalTime.of(6, 0);
		LocalTime bTarde = LocalTime.of(12, 0);
		LocalTime bNoite = LocalTime.of(18, 0);
		
		if (hora.isAfter(bDia) && hora.isBefore(bTarde)){
			return "Bom dia!";
		}
		if (hora.isAfter(bTarde) && hora.isBefore(bNoite)){
			return "Boa Tarde!";
		}
		else{
			return "Boa Noite!";
		}
	}
}
