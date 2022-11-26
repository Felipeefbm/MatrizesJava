package Application;

import java.util.Locale;
import java.util.Scanner;

public class exe3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("qual a ordem da matriz? ");
		int n = sc.nextInt();
		int mat [][] = new int[n][n];
		int negativos = 0;
		
		System.out.println();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("digite o elemento na posição [" + i + ","+ j + "]: ");
				mat [i][j] = sc.nextInt();
			}
		}
		
		System.out.println("diagonal principal: ");
		for (int i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");
			for (int j = 0; j < n; j++) {
				
				if (mat[i][j] < 0) {
					negativos = negativos + 1;
				}
			}
		}
		
		System.out.println();
		System.out.println("quantidade de negativos: " + negativos);
		
		sc.close();
	}

}
