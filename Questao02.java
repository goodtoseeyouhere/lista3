package listaVetores;
import java.util.Scanner;
public class Questao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int tamanho = 5;
        double[] valores = new double[tamanho];
       
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Digite o valor " + (i + 1) + ": ");
            valores[i] = ler.nextDouble();
        }

        
        double soma = 0;
        for (int i = 0; i < tamanho; i++) {
            soma += valores[i];
        }
        double media = soma / tamanho;

        System.out.printf("A média aritmética é: " + media);

        ler.close();        
        
	}

}
