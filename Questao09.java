package listaVetores;
import java.util.Scanner;
public class Questao09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int tamanho = 5;
		
		int[] vetorUm = new int[tamanho];
		int[] vetorDois = new int[tamanho];
		int[] vetorTres;
		int contadorInterseccao = 0;
		int indice = 0;
		
		for(int i = 0; i < tamanho; i++) {
			System.out.printf("Digite o valor " + (i+1) + " do primeiro vetor: ");
			vetorUm[i] = ler.nextInt();
		}
		
		for(int i = 0; i < tamanho; i++) {
			System.out.printf("Digite o valor " + (i+1) +" do segundo vetor: ");
			vetorDois[i] = ler.nextInt();
		}
		
		for(int i = 0; i < tamanho; i++) {
			for(int j = 0; j < tamanho; j++) {
				if(vetorUm[i] == vetorDois[j]) {
					contadorInterseccao++;
				}				
			}
		}
		
		vetorTres = new int[contadorInterseccao];
		
		for(int i = 0; i < tamanho; i++) {
			for(int j = 0; j < tamanho; j++) {
				if(vetorUm[i] == vetorDois[j]) {
					vetorTres[indice] = vetorUm[i];
					indice++;
				}
			}
		}
		
		System.out.println("Primeiro vetor: ");	
		
		for(int i = 0; i < tamanho; i++) {
			System.out.println(vetorUm[i]);
		}
		
		System.out.println("Segundo vetor: ");
		
		for(int i = 0; i < tamanho; i++) {
			System.out.println(vetorDois[i]);
		}
		
		System.out.println("Vetor Intersecção: ");
		
		for(int i = 0; i < contadorInterseccao; i++) {
			System.out.println(vetorTres[i]);
		}
		
		ler.close();	
						
		
	}

}
