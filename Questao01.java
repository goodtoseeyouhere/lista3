package listaVetores;
import java.util.Scanner;
public class Questao01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int tamanho = 5;
		int[] valores = new int[tamanho];
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("Digite o valor " + (i + 1) + ": ");
			valores[i] = ler.nextInt();
		}
		
		ler.close();
	}

}
