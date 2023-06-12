package listaVetores;
import java.util.Scanner;
public class Questao08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int tamanho = 5;		
		double[] vetor = new double[tamanho];
		double[] vetorInvertido = new double[tamanho];
		
		
		for(int i = 0; i < tamanho; i++) {
			System.out.printf("Digite o valor " + (i+1) +": ");
			vetor[i] = ler.nextDouble();			
		}
		
		for(int i = 0; i < tamanho; i++) {
			vetorInvertido[i] = vetor[tamanho - i - 1]; 
		}
		
		System.out.println("Vetor invertido: ");
		
		for(int i = 0; i < tamanho; i++) {
			System.out.println(vetorInvertido[i]);
		}
		
		ler.close();
		
	}

}
