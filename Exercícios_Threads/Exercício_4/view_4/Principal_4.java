package view_4;

import controller_4.*;

public class Principal_4 {

	public static void main(String[] args) {
		String[] SaposNomes = { "Sapo-cururu", "Sapo-verde", "Chapada Rocket Frog", "Pumpkin toadle", "Sapo-macaco" };
		threadSapo[] sapos = new threadSapo[5];

		for (int i = 0; i < 5; i++) {
			sapos[i] = new threadSapo(SaposNomes[i], 15);
			sapos[i].start();

		}
		for (int i = 0; i < 5; i++) {
			try {
				sapos[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Auxiliar[] saposOrdenados = ordenaChegada(sapos);
		System.out.println();

		for (int i = 0; i < 5; i++) {
			System.out.println("O Sapo: " + saposOrdenados[i].nome + " Foi o " + (i + 1) + " colocado com o Tempo de "
					+ saposOrdenados[i].tempo + " segundos.");
		}
	}

	private static Auxiliar[] ordenaChegada(threadSapo[] sapos) {
	    Auxiliar[] Sapo = new Auxiliar[5];

	    for (int i = 0; i < 5; i++) {
	        Sapo[i] = new Auxiliar("", 0.0); // Inicializa cada elemento do array
	        Sapo[i].nome = sapos[i].pegaNome();
	        Sapo[i].tempo = sapos[i].pegaTempo();
	    }

	    for (int i = 0; i < 5 - 1; i++) {
	        for (int j = 0; j < 5 - i - 1; j++) {
	            if (Sapo[j].tempo > Sapo[j + 1].tempo) {
	                Auxiliar temp = Sapo[j];
	                Sapo[j] = Sapo[j + 1];
	                Sapo[j + 1] = temp;
	            }
	        }
	    }
	    return Sapo;
	}


}