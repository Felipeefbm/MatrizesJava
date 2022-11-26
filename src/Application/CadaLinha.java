package Application;

import java.util.Locale;
import java.util.Scanner;

public class CadaLinha {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a ordem da matriz? ");
		int n = sc.nextInt();
		int maior = 0;
		int[][] mat  = new int[n][n];
		int[] vet = new int[n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.printf("Elemento[%d,%d]: ", i, j);
				mat[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < n; i++) {    // linha
			for(int j = 0; j < n; j++) {  //coluna
				if(mat[i][j] > maior ) {
					maior = mat[i][j];
				}
			}
			vet[i] = maior;
			maior = 0;
		}
		
		System.out.printf("Maior elemento de cada linha: \n");
		for(int i = 0; i < n; i++) {
			System.out.printf("%d \n", vet[i]);
		}
		
		sc.close();
	}

}
