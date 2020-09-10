package ex2.controller;

import java.io.*;

public class Ex2Controller {

	public String os() {
		String os = System.getProperty("os.name");
		return os;
	}

	public Ex2Controller() {
		super();
	}

	public void MostraProcessos(String os) {

		if (os.contains("Windows")) {
			try {
				Process processo = Runtime.getRuntime().exec("TASKLIST /FO TABLE");
				InputStream fluxo = processo.getInputStream();
				InputStreamReader leitor = new InputStreamReader(fluxo);
				BufferedReader buffer = new BufferedReader(leitor);
				String linha = buffer.readLine();
				while (linha != null) {
					System.out.println(linha);
					linha = buffer.readLine();
				}

				buffer.close();
				leitor.close();
				fluxo.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		} else if (os.contains("Linux")) {

		} else {
			System.out.println("sistema não reconhecido");
		}
	}

	public void EncerraProcessoNome(String os, String processo) {
		if (os.contains("Windows")) {
			StringBuffer buffer = new StringBuffer();
			buffer.append("TASKKILL /IM ");
			buffer.append(processo);
			try {
				Runtime.getRuntime().exec(buffer.toString());
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else if (os.contains("Linux")) {

		} else {
			System.out.println("Sistema não encontrado");
		}
	}

	public void EncerraProcessoPid(String os, int pid) {
		if (os.contains("Windows")) {
			StringBuffer buffer = new StringBuffer();
			buffer.append("TASKKILL /PID ");
			buffer.append(pid);
			try {
				Runtime.getRuntime().exec(buffer.toString());
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else if (os.contains("Linux")) {

		} else {
			System.out.println("Sistema não encontrado");
		}
	}

}
