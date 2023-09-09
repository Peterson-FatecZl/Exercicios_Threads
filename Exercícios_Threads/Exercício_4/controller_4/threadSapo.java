package controller_4;

public class threadSapo extends Thread {
	
	private String nome;
	private double distanciaPercorrida = 0;
	private int distanciaMaxima;
	private double tempo;
	
	public threadSapo(String nome, int chegada) {
		this.nome = nome;
		this.distanciaMaxima = chegada;
	}
	
	public void run() {
		long tempoInicial = System.currentTimeMillis();
		while(distanciaPercorrida <= distanciaMaxima) {
			double salto = Math.random() * 2 + 1;
			distanciaPercorrida += salto;
			System.out.printf("O Sapo %s Deu um Salto de %.2f e percorreu %.2f",nome, salto, distanciaPercorrida);
			System.out.println();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		long tempoFinal = System.currentTimeMillis();
		long tempoTotal = tempoFinal - tempoInicial;
		tempo = MilissegundosParaSegundos(tempoTotal);
		
	}

	private double MilissegundosParaSegundos(long tempoTotal) {
		return tempoTotal = tempoTotal / 1000;
		
	}
	public double pegaTempo() {
		return tempo;
	}
	public String pegaNome() {
		return nome;
	}

}
