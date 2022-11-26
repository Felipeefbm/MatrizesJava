package Application;

import java.util.Locale;
import java.util.Scanner;

public class negativosMatriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Qual a quantidade de linhas da matriz ? ");
		int M = sc.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz ? ");
		int N = sc.nextInt();
		int mat[][] = new int [M][N];
		
		for (int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				System.out.printf("elemento[%d,%d]: ", i, j);
				mat[i][j] = sc.nextInt();
			}
			
		}
		
		System.out.printf("VALORES NEGATIVOS: \n");
		
		for (int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				if(mat[i][j] < 0) {
					System.out.println(mat[i][j]);
				}
			}
		}
		
		
		sc.close();
	}

}
