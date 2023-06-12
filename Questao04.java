package listaVetores;
import java.util.Scanner;
public class Questao04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int tamanho = 10;
		double[] vetorUm = new double[tamanho];
		double[] vetorDois = new double[tamanho];
		double[] vetorMultiplicacao = new double[tamanho];
		
		for(int i = 0; i < tamanho; i++) {
			System.out.printf("Digite o valor " + (i + 1) + ": ");
			vetorUm[i] = ler.nextDouble();
		}
		
		for(int i = 0; i < tamanho; i++) {
			System.out.printf("Digite o valor " + (i + 1) +": ");
			vetorDois[i] = ler.nextDouble();
		}
		
		for(int i = 0; i < tamanho; i++) {
			vetorMultiplicacao[i] = vetorUm[i] * vetorDois[i];
		}
		
		for(int i = 0; i < tamanho; i++) {
			System.out.printf("%f\n", vetorMultiplicacao[i]);
		}
		
		ler.close();
		
	}

}
