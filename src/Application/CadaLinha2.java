package Application;

import java.util.Locale;
import java.util.Scanner;

public class CadaLinha2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a ordem da matriz? ");
		int n = sc.nextInt();
		int maior = 0;
		int[][] mat  = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.printf("Elemento[%d,%d]: ", i, j);
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("MAIOR ELEMENTO DE CADA LINHA: ");
		
		for(int i = 0; i < n; i++) {
			maior = mat[i][0];   // nao esquecer de resetar o maior 
			for(int j = 0; j < n; j++) {
				if(mat[i][j] > maior) {
					maior = mat[i][j];
				}
			}
			System.out.println(maior); // comando executado depois que chega na ultima coluna e pula pra proxima linha
		}
		
		
		
		
		sc.close();
	}

}
