package listaVetores;
import java.util.Scanner;
public class Questao07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		int tamanho = 5;		
		int quantidadeEncontrada = 0;
		double[] vetor = new double[tamanho];		
		
		for(int i = 0; i < tamanho; i++) {
			System.out.printf("Digite o valor " + (i+1) +": ");
			vetor[i] = ler.nextDouble();			
		}
		
		boolean encontrado = false;		
		
		for(int i = 0; i < tamanho; i++) {
			if(vetor[i] == 7) {
				encontrado = true;
				quantidadeEncontrada++;
			}
		}

		if(encontrado) {
			System.out.println("O numero 7 foi encontrado.");
			System.out.println("Indices do numero sete: ");
			
			for(int i = 0; i < tamanho; i++) {
				if(vetor[i] == 7) {
					System.out.println(i);
				}								
			}
			
			System.out.printf("Quantidade de vezes encontrado: %d", quantidadeEncontrada);
							
		}
		
		else {
			System.out.printf("O numero 7 não foi encontrado");
		}
		
		ler.close();
	}

}
