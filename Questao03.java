package listaVetores;
import java.util.Scanner;
public class Questao03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int tamanho = 5;		
		int[] valores = new int[tamanho];

		for(int i = 0; i < tamanho; i++) {
			System.out.printf("Digite o valor " + (i + 1) + ": ");
			valores[i] = ler.nextInt();
			}
		
		int contadorPar = 0;
		int contadorImpar = 0;
		
        for (int i = 0; i < tamanho; i++) {
            if (valores[i] % 2 == 0) {
                contadorPar++;
            } else {
                contadorImpar++;
            }
        }
		
        int [] par = new int[contadorPar];
        int [] impar = new int[contadorImpar];
        
        int indicePar = 0;
        int indiceImpar = 0;
        
        for(int i = 0; i < tamanho; i++) {
        	if(valores[i] % 2 == 0) {
        		par[indicePar] = valores[i];
        		indicePar++;
        	}
        	else {
        		impar[indiceImpar] = valores[i];
        		indiceImpar++;
        	}
        	
        }
        
        int somaPar = 0;
        int somaImpar = 0;
        
        for(int i = 0; i < contadorPar; i++) {
        	somaPar = somaPar + par[i];
        }
        
        for (int i = 0; i < contadorImpar; i++) {
            somaImpar = somaImpar + impar[i];
        }

        if(somaPar > somaImpar) {
        	System.out.printf("O vetor de numeros pares tem um somatorio maior que os dos impares e é igual a %d", somaPar);
        }
        else if(somaImpar > somaPar) {
        	System.out.printf("O vetor de numeros impares tem um somatorio maior que o dos pares e é igual a %d", somaImpar);
        	
        }
        else {
        	System.out.printf("O vetores de numeros pares e impares possuem o mesmo somatorio", somaPar);
        }
        
        
        ler.close();       
     
		
		
	}
		
		
		
}
