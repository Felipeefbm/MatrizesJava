package Application;

import java.util.Locale;
import java.util.Scanner;

public class AcimaDiagonal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a ordem da matriz? ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		int soma = 0;
	
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.printf("Elemento [%d,%d]: ", i,j);
				mat [i][j] = sc.nextInt();
				if (i < j) {          // soma, acima da diagonal
					soma = soma + mat[i][j];
				}
				
			}
		}
		
		System.out.println("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = " + soma);
		
		
		
		
		
		sc.close();
	}

}
