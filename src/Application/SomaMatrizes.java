package Application;

import java.util.Locale;
import java.util.Scanner;

public class SomaMatrizes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas linhas vai ter cada matriz? ");
		int m = sc.nextInt();
		System.out.print("Quantas colunas vai ter cada matriz? ");
		int n = sc.nextInt();
		
		int[][] A = new int [m][n], B = new int [m][n], C = new int [m][n];
		
		System.out.println("digite os valores da matriz A: ");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.printf("elemento [%d,%d]: ", i,j);
				A [i][j] = sc.nextInt();
			}
		}
		
		System.out.println("digite os valores da matriz B: ");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n;  j++) {
				System.out.printf("elemento [%d,%d]: ", i,j);
				B[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Matriz Soma: ");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n;  j++) {
				C[i][j] = A [i][j] + B[i][j];
				
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}
		
		
		sc.close();
	}

}
