import java.util.Scanner;

public class Exercicio5 {
	
	public static char[] inverteString(String stringEntrada) {
		
		int tamanhoString = stringEntrada.length();
		char[] letras = new char[tamanhoString];
		int j=0;
		
		for(int i = (tamanhoString - 1) ; i > -1 ; i--) {
			letras[j] = stringEntrada.charAt(i);
			j++;
		}
		return letras;
	}
	
	public static void imprimeStringInvertida(String stringEntrada) {
		char[] stringInvertida = inverteString(stringEntrada);
		
		for(char letra : stringInvertida ) {
			System.out.printf("%c", letra);
		}
	}

	public static void main(String[] args) {
		System.out.println("Digite uma palavra para que ela seja invertida:");
		Scanner sc = new Scanner(System.in);
		String stringEntrada = sc.nextLine();
		
		imprimeStringInvertida(stringEntrada);

	}

}
