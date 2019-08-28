package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ProcController {
	
	public ProcController() {
		super();
	}
	
	public String os(){
		String os = System.getProperty("os.name");
		return os;
		/*
		 * os.arch traz a arquitetura
		 * se o java não estiver atualizado, pode ser que ocorra um erro no nome do SO, por ex windows versão nao encontrada
		*/
	}
	
	public void chamaProcesso (String processo) {
		try {
			Runtime.getRuntime().exec(processo);
		} catch (IOException e) {
			if (e.getMessage().contains("740")) {
				StringBuffer buffer = new StringBuffer();
				buffer.append("cmd /c");
				buffer.append(" ");
				buffer.append(processo);
				try {
					Runtime.getRuntime().exec(buffer.toString());
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			else {
			e.printStackTrace(); 
			}
		}
	}
	
	public void leProcesso (String Nomeprocesso) {
		try {
			Process processo = Runtime.getRuntime().exec(Nomeprocesso);
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
	}
	
	public void MataProcesso (String Parametro) {
		String cmdPid = "TASKKILL /PID ";
		String cmdNome = "TASKKILL /IM ";
		int pid = 0;
		StringBuffer buffer = new StringBuffer();
		
		try{
			pid= Integer.parseInt(Parametro);
			buffer.append(cmdPid);
			buffer.append(pid);
		} catch (NumberFormatException e) {
			buffer.append(cmdNome);
			buffer.append(Parametro);
		}
		chamaProcesso(buffer.toString());
	}
}
