package listaVetores;
import java.util.Scanner;
public class Questao06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int tamanho = 5;
		int indiceMaiorValor = 0;
		double[] vetor = new double[tamanho];
		double maiorValor = vetor[0];
		
		for(int i = 0; i < tamanho; i++) {
			System.out.printf("Digite o valor " + (i + 1) +": ");
			vetor[i] = ler.nextDouble();
		}	
				
		
		for(int i = 0; i < tamanho; i++) {
			if(vetor[i] > maiorValor) {
				maiorValor = vetor[i];
				indiceMaiorValor = i;
			}
		}
		
		System.out.printf("O indice do maior valor é igual a : %f", indiceMaiorValor);
		
		ler.close();
	}

}
