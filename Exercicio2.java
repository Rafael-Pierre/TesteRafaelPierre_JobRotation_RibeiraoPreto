import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {
	
	public static boolean verificaValor(int valorEntrada) {
		ArrayList<Integer> sequenciaVerificadora = montaSequenciaFibonacci(valorEntrada);
		
		for(int verifica : sequenciaVerificadora ) {
			
			if(verifica == valorEntrada) {
				return true;
			}	
		}				
		return false;
		}
		
	
	public static ArrayList<Integer> montaSequenciaFibonacci(int valorEntrada) {
		ArrayList<Integer> sequenciaFibonacci = new ArrayList<>();
		
		int fibonacciAnterior=0, fibonacciAtual=1, fibonacciProximo=0 ;
		
		sequenciaFibonacci.add(fibonacciAnterior);
		sequenciaFibonacci.add(fibonacciAtual);
		
		while(fibonacciProximo <= valorEntrada) {
			
			fibonacciProximo = fibonacciAnterior + fibonacciAtual;
			fibonacciAnterior = fibonacciAtual;
			fibonacciAtual = fibonacciProximo;
			
			sequenciaFibonacci.add(fibonacciProximo);
			
		}
		return sequenciaFibonacci;
	}
	
	public static void main(String[] args) {
		System.out.println("Digite um valor para saber se ele pertence na sequencia fibonacci:");
		Scanner sc = new Scanner(System.in);
		int valorEntrada = sc.nextInt();
		sc.close();
		
		Boolean booValorPertence = verificaValor(valorEntrada);
		
		if(booValorPertence) {
			System.out.println("O numero digitado pertence a sequencia!");
		}
		else {
			System.out.println("O numero digitado nao pertence a sequencia...");
		}
	}
	
}
