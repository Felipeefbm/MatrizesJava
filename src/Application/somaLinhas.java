package Application;

import java.util.Locale;
import java.util.Scanner;

public class somaLinhas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a quantidade de linhas da matriz: ");
		int m = sc.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz: ");
		int n = sc.nextInt();
		double [][] mat = new double[m][n];
		double [] vet = new double [m];
		
			// matriz percorrida
		for (int i = 0; i < m; i++) {
			System.out.printf("digite os elementos da %d° linha: \n", (i+1));  // vai ficar aqui pra nao ter repetição e salvar tudo no mesmo lugar
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}
		
		
			//somando a matriz e salvando no vetor
		System.out.println("VETOR GERADO: ");
		for(int i = 0; i < m; i++ ) {
			vet[i] = 0;
			for(int j = 0; j < n; j++) {
				vet[i]= vet[i]+ mat[i][j];	
			}
		}
		
		for(int i = 0; i < m; i++) {
			System.out.printf("%.3f \n", vet[i]);
		}
		
		
		sc.close();
	}

}
