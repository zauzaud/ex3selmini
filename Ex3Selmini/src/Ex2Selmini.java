import java.util.Random;

public class Ex2Selmini {

	public static void main(String[] args) {
		
		int vetor [] = new int[10]; // declarando vetor 10 posicoes
		
		preencher(vetor);  // metodo que preenche
		impressao(vetor);  // metodo que imprime
		System.out.println();
		
		System.out.println("A soma dos elementos armazenados em seu array eh: " + somarecursiva(vetor,0));
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
	



	
public static int somarecursiva(int vetor[], int auxiliar) {  // retornar soma recursiva
	
	if(auxiliar == vetor.length-1) {
		return vetor[auxiliar];
		
	 }
	return vetor[auxiliar] + somarecursiva(vetor,auxiliar+1);
	
	}

}

	
