package Application;

import java.util.Locale;
import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite o numero de linhas e colunas: ");
		int n = sc.nextInt();
		int[][] mati = new int [n][n]; // declaração da matriz
		
		
		for (int i = 0; i < mati.length; i++) {			
			for (int j = 0; j < mati[i].length; j++)	{
				System.out.print("digite um numero para posição [" + i + "][" + j + "]: ");
				mati[i][j] = sc.nextInt();
			}

		}
		
		System.out.println("MAIN DIAGONAL: ");
		for(int i = 0; i < n; i++) {
			
			System.out.println(mati[i][i] + " ");
		}
		
		System.out.println();
		int count = 0;
		for (int i = 0; i < mati.length; i++) {			
			for (int j = 0; j < mati[i].length; j++)	{
				if (mati[i] [j] < 0) {
					count++;
				}
			}
		}
		
		System.out.print("negative numbers: " + count);
		
		
		
		sc.close();
	}

}
