package Application;

import java.util.Locale;
import java.util.Scanner;

public class exe1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("digite a ordem da matriz: ");
		int n = sc.nextInt();
		int [][] mati = new int [n][n];
		int negativos = 0;
		
		
		for(int i = 0; i < mati.length; i++){
			for (int j = 0; j < mati.length; j++) {
				System.out.print("digite o elemento da posição [" + i + "," + j + "]: ");
				mati [i][j] = sc.nextInt();
			}			
		}
		
		System.out.println(" ");
		System.out.println("Diagonal principal: ");
			for(int i = 0; i < n; i++) {
			
			System.out.print(mati[i][i] + " ");
		}
		
		
		
		for(int i = 0; i < mati.length; i++){
			for (int j = 0; j < mati.length; j++) {
				if( mati[i][j] < 0){
					negativos  =+ 1;
					
				}
			}			
		}
		System.out.println();
		System.out.println("quantidade de negativos: " + negativos);
		
		
		
		sc.close();
	}

}
