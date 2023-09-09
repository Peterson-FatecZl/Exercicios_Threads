package controller_5;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ConsultaPingLinux extends Thread {

	private String nomeDoSite;
	private String site;

	public ConsultaPingLinux(String _nomeDoSite, String _site) {// constructor
		this.nomeDoSite = _nomeDoSite;
		this.site = _site;

	}

	public void run() {
		validaSO();
		try {
			Process processo = Runtime.getRuntime().exec("ping -4 -c 10 " + site);
			InputStream fluxo = processo.getInputStream();
			InputStreamReader StringFluxo = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(StringFluxo);

			String linha = buffer.readLine();
			while (linha != null) {
				if (linha.contains("time=")) {
					String[] vetorDaLinha = linha.split(" ");
					String[] vetorComOTempo = vetorDaLinha[7].split("=");

					System.out.println(nomeDoSite + ": " + vetorComOTempo[1]);

					linha = buffer.readLine();

				} else if (linha.contains("avg")) {
					String[] vetorDaLinha = linha.split("/");
					System.out.println();
					System.out.println(nomeDoSite + " tempo médio do Ping: " + vetorDaLinha[4] + "\n");

					linha = buffer.readLine();

				} else {
					linha = buffer.readLine();
				}

			}
		} catch (Exception e) {
			System.err.println(e);
		}

	}

	private void validaSO() {
		String SO = System.getProperty("os.name");
		if (SO.contains("Lin")) {
			// pass
		} else {
			System.err.println("Esta ação Não é valida em seu Sistema Operacional");
			System.exit(0);
		}

	}

}
