package Estruturas;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class AulaMap {
	public static void main(String[] args) {
		Map<String, Double> carrosPopulares = new HashMap();
		carrosPopulares.put("Gol", 14.4);
		carrosPopulares.put("Uno", 15.6);
		carrosPopulares.put("Mobi", 16.1);
		carrosPopulares.put("HB20", 14.5);
		carrosPopulares.put("Kwid", 15.6);
		
	System.out.println(carrosPopulares);
	
	carrosPopulares.put("Gol", 15.2);
	
	System.out.println(carrosPopulares);
	
	System.out.println("Cotem Tucson na lista? " + carrosPopulares.containsKey("Tucson"));
	
	System.out.println("Consumo do Gol: " + carrosPopulares.get("Gol"));
	
	System.out.println(carrosPopulares.keySet()); //Retorna os valores de chave do map
	
	System.out.println(carrosPopulares.values()); //Retorna os valores de cada chave do map
	
	System.out.println("Carro mais econômico: " + Collections.max(carrosPopulares.values()));
	
	carrosPopulares.remove("Kwid", 15.6);
	System.out.println(carrosPopulares);
	}
		
}
