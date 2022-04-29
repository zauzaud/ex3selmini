import java.util.Random;

public class Ex1Selmini {

	public static void main(String[] args) {
	
		
			int vetor [] = new int[10]; // declarando vetor 10 posicoes
			
			preencher(vetor);  // metodo que preenche
			impressao(vetor);  // metodo que imprime
			System.out.println();
			
			System.out.println("A soma dos elementos armazenados em seu array eh: " + soma(vetor));
		}
	
	public static void preencher(int vetor[]) { // preenche o vetor
		Random gerador = new Random();
		
		for(int i = 0; i<vetor.length;i++) {
			vetor[i] = gerador.nextInt(10);
		}
	}
	
		
	public static void impressao(int vetor[]) { // imprime o vetor
			for(int i = 0; i<vetor.length;i++) {
				System.out.print(vetor[i] + "\t");
			}
			System.out.println();
		}
		
		
	public static int soma(int vetor[]) {  // retornar soma
			int x =0;
			
			for(int i=0;i<vetor.length;i++) {
				x+= vetor[i];
			}
			return x;
		}

}
