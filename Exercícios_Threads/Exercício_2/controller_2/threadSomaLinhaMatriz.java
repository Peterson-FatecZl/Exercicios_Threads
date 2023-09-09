package controller_2;

public class threadSomaLinhaMatriz extends Thread {

	private int[] vt;
	private int _indexLinha;

	public threadSomaLinhaMatriz(int indexLinha, int vetor[]) {
		this.vt = vetor;
		this._indexLinha = indexLinha;

	}

	public void run() {
		int soma = 0;
		for (int X = 0; X < vt.length; X++) {
			soma += vt[X];
		}
		System.out.println("A soma da linha " + _indexLinha + " é " + soma);
	}

}
