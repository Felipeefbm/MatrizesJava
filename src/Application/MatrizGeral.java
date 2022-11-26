package Application;

import java.util.Locale;
import java.util.Scanner;

public class MatrizGeral {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a ordem da matriz? ");
		int n = sc.nextInt();
		double [][] mat = new double [n][n];
		double soma = 0;
		

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.printf("Elemento [%d,%d]: ", i,j);
				mat[i][j] = sc.nextDouble();
			}
		}
		
		System.out.println();
		System.out.print("soma dos positivos: ");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if (mat[i][j] > 0) {
					soma = soma + mat[i][j];
				}
			}
		}
		System.out.print(soma);
		
		System.out.println();
		System.out.println();
		System.out.print("Escolha uma linha: ");
		int linha = sc.nextInt();
		
		System.out.print("LINNHA ESCOLHIDA: ");
		for(int i = linha; i <= linha; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(mat[i][j] + " ");		
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.print("ESCOLHA UMA COLUNA: ");
		int coluna = sc.nextInt();
		
		System.out.print("COLUNA ESCOLHIDA: ");
		for(int i = 0; i < n; i++) {
			for(int j = coluna; j <= coluna; j++) {
				System.out.print(mat[i][j] + " ");		
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.print("DIAGONAL PRINCIPAL: ");
		for(int i = 0; i < n; i++ ) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();
		System.out.println("MATRIZ ALTERADA: ");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if (mat[i][j] < 0) {
					mat[i][j] = mat[i][j] * mat[i][j];
				}
				System.out.print(mat[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		
		
		
		
		
		
		sc.close();
	}

}
