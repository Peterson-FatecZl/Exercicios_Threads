package view_2;

import controller_2.threadSomaLinhaMatriz;

public class Principal_2 {

	public static void main(String[] args) {
		int [][] matriz = new int[3][5];
		for (int X = 0; X < matriz.length; X++) {
			for (int Y = 0; Y < matriz[X].length; Y++) {
				matriz[X][Y] = (int)(Math.random()*100 + 1);
			}
		}
		for (int X = 0; X < matriz.length; X++) {
			for (int Y = 0; Y < matriz[X].length; Y++) {
				System.out.print(matriz[X][Y]+" ");		
			}
			System.out.println();
		}
		
		for(int ctd = 0; ctd < 3; ctd++) {
			Thread somaMatriz = new threadSomaLinhaMatriz(ctd, matriz[ctd]);
			somaMatriz.start();
		}

	}

}
