import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Por favor, digite seu valor em binario para conversao em decimal: ");
		
		int numerobin;
		
		numerobin = teclado.nextInt();
		
		conversor(numerobin);
		
		
		

	}
	
	public static void conversor(int x) {
		
		int decimal = 0, expoente = 0, numerofinal; // iniciar as variaveis 
		
		
		do { 
			numerofinal = x % 10;
			decimal += numerofinal * Math.pow(2, expoente);
			x = x/10;
			expoente++;
			
		} while ( x!=0);
		
		System.out.println(decimal);
			
	}
		
		
	
}
	
	
