package view_3;

import controller_3.ThreadVetor;

public class Principal_3 {
	public static void main(String[] args) {
		int[] vetor = new int[1000];
		for (int random : vetor) {
			vetor[random] = (int)(Math.random() * 100 + 1);
		}
		Thread threadValorPar = new ThreadVetor(1, vetor);
		Thread threadValorImpar = new ThreadVetor(2, vetor);

		threadValorImpar.start();
		threadValorPar.start();
	}

}
