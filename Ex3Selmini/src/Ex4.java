import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
        Scanner teclado = new Scanner(System.in);
		
		System.out.println("Por favor, digite seu valor em binario para conversao em decimal: ");
		
		int numerobin;
		
		numerobin = teclado.nextInt();
		
		System.out.println(conversor(numerobin,0));
		
		
		

	}
	
	public static int conversor(int x, int expoente) {
		int numerofinal = x % 10;
		
		if (x==0) {
			return 0;
		}else{
			return (int) (Math.pow(2, expoente)*numerofinal)+conversor(x/10, expoente+1);
		}
					
	}
		
		
	
}
	
	
