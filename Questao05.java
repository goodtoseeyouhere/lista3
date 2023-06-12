package listaVetores;
import java.util.Scanner;

public class Questao05 {

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	
        Scanner ler = new Scanner(System.in);

        int tamanho = 5;
        double[] vetor = new double[tamanho];
        int quantidadeDiferentes = 0;

        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Digite o valor " + (i + 1) + ": ");
            vetor[i] = ler.nextDouble();
        }
        
        for(int i = 0; i < tamanho; i++) {
            boolean repetido = false;
            for (int j = 0; j < tamanho; j++) {
                if (i != j && vetor[i] == vetor[j]) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                quantidadeDiferentes++;
            }
        }    

        System.out.printf("Total de valores diferentes: %d", quantidadeDiferentes);
        
        ler.close();
    }
}



