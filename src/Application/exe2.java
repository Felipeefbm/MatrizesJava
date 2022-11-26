package Application;

import java.util.Locale;
import java.util.Scanner;

public class exe2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("digite o numero de linhas: ");
		int m = sc.nextInt();
		System.out.print("digite o numero de colunas: ");
		int n = sc.nextInt();
		
		double somaLinha;
		double [][] mat = new double [m][n];  // matriz 
		double[] vetor = new double [m];  // vetor
		
		for(int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Digite os elementos da " + (i+1) + "° linha: ");
				mat[i][j] = sc.nextDouble();
			}
		}
		
		for (int i = 0; i < m; i++) {
			somaLinha = 0;
			
			for (int j = 0; j < n; j++ ) {
				somaLinha = somaLinha + mat[i][j];  // =+ nao funciona 
			}
			vetor[i] = somaLinha;
		}
		
		System.out.println("Vetor gerado: ");
		
		for (int i = 0; i < m; i++) {
			System.out.println(String.format("%.2f", vetor[i] ));
		}
		
	
		
	
		sc.close();
	}

}
