package controller;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class ArquivosController implements IArquivosController {

	//Faz a leitura de um diretório e imprime no console o que é pasta e o que é arquivo
	@Override
	public void readDir(String path) throws IOException {
		File dir = new File(path);
		if (dir.exists() && dir.isDirectory()) {
			File[] files = dir.listFiles();
			for (File f : files) {
				if (f.isFile()) {
					System.out.println("     \t" + f.getName());
				} else {
					System.out.println("<DIR>\t" + f.getName());
				}
			}
		} else {
			throw new IOException("Diretório Inválido");
		}

	}

	//Cria ou concatena texto em um arquivo usando o método geraTxt
	@Override
	public void createFile(String path, String nome) throws IOException {
		File dir = new File(path);
		File arq = new File(path, nome);
		if (dir.exists() && dir.isDirectory()) {
			boolean existe = false;
			if (arq.exists()) {
				existe = true;
			}
			String conteudo = geraTxt();
			FileWriter fw = new FileWriter(arq, existe);
			PrintWriter pw = new PrintWriter(fw);
			pw.write(conteudo);
			pw.flush();
			pw.close();
			fw.close();
		} else {
			throw new IOException("Diretório inválido");
		}

	}

	//grava o texto digitado no arquivo até que seja enviado o texto "fim"
	private String geraTxt() {
		StringBuffer sb = new StringBuffer();
		String linha = "";
		while (!linha.equalsIgnoreCase("fim")) {
			linha = JOptionPane.showInputDialog(null, "digite uma frase", "Entrada de texto",
					JOptionPane.INFORMATION_MESSAGE);
			if (!linha.equalsIgnoreCase("fim")) {
				sb.append(linha + "\r\n");
			}
		}
		return sb.toString();
	}

	//faz a leitura do texto de um arquivo para o console
	@Override
	public void readFile(String path, String nome) throws IOException {
		File arq = new File(path, nome);
		if (arq.exists() && arq.isFile()) {
			FileInputStream fis = new FileInputStream(arq);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			String linha = br.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
			br.close();
		} else {
			throw new IOException("Arquivo inválido");
		}

	}

	//abre um arquivo
	@Override
	public void openFile(String path, String nome) throws IOException {
		File arq = new File(path, nome);
		if (arq.exists() && arq.isFile()) {
			Desktop desk = Desktop.getDesktop();
			desk.open(arq);
		} else {
			throw new IOException("Arquivo inválido");
		}

	}

}
