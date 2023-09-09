package controller;

//extends Thread
//Parâmetros por Construtor
//método run

public class ThreadId extends Thread {

	private int idThread;
	
	public ThreadId(int idThread) {
		this.idThread = idThread;
		
	}

	@Override
	public void run() {
		// Só executa o que está aqui Dentro
		System.out.println(idThread);
	}
	
}
