package metodos;

public class Anagramas {
	public static void main(String[] args) {
		System.out.println("As palavras são anagramas? " + anagramas("corra", "cooar"));
	}

	public static Boolean anagramas(String a, String b) {
		Boolean eAnagrama = false;
		if (a.length() == b.length()) {
			for (int i = 0; i < a.length(); i++) {
				eAnagrama = b.contains(a.substring(i, i + 1)) && a.contains(b.substring(i, i + 1));
				if (eAnagrama == false) {
					break;
				}
			}
		}
		return eAnagrama;
	}
}
