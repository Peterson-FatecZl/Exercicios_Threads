package controller_3;

public class ThreadVetor extends Thread {

	private int V;
	private int[] vet;

	public ThreadVetor(int valor, int[] vetor) {
		this.V = valor;
		this.vet = vetor;
	}

	public void run() {
		if (V % 2 == 0) {
			long startingTime = System.nanoTime();
			for (int i = 0; i < vet.length; i++) {
				// Só percrre o vetor
			}
			long endTime = System.nanoTime();
			long totalTime = endTime - startingTime;
			System.out.println("Tempo usando o for: " + NanoParaSegundo(totalTime));
			
			
		} else {
			long startingTime = System.nanoTime();
			for (int i : vet) {
				// Só percorre o vetor
			}
			long endTime = System.nanoTime();
			long totalTime = endTime - startingTime;
			System.out.println("Tempo usando o forEach: "+ NanoParaSegundo(totalTime));
			
		}
	}

	private double NanoParaSegundo(long NanoSecond) {
		return (NanoSecond / Math.pow(10, 9));
		
	}
}
