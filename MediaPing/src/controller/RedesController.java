package controller;

import java.io.*;
import java.util.regex.*;

public class RedesController {


	public RedesController () {
		super();
			}
	
	public String os(){
		String os = System.getProperty("os.name");
		return os;
	}
	
	public void ip() {
		try {
			Process processo = Runtime.getRuntime().exec("ipconfig");
			InputStream fluxo = processo.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			String adaptador = "";
			while (linha != null) {
				if (linha.contains("Adaptador")) {
					adaptador = linha;
				}
				else if (linha.contains("IPv4")) {
					String ipv4=ExtraiIP(linha);					
					System.out.println(adaptador+ipv4);
					adaptador ="";
				}
				linha = buffer.readLine();
			}
			
			buffer.close();
			leitor.close();
			fluxo.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void ping () {
		try {
			Process processo = Runtime.getRuntime().exec("ping -n 10 www.autocj.co.jp");
			InputStream fluxo = processo.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			while (linha != null) {
				if (linha.contains("ximo")) {
					String mdping = ExtraiPing(linha);
					System.out.println("Média de ping: "+mdping);
				}
				linha = buffer.readLine();
			}			
			buffer.close();
			leitor.close();
			fluxo.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public String ExtraiIP (String IP) {
		
		String IPADDRESS_PATTERN = 
				"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
						"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
						"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
						"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

		Pattern pattern = Pattern.compile(IPADDRESS_PATTERN);
		Matcher matcher = pattern.matcher(IP);
		if (matcher.find()) {
		    return matcher.group();
		} else{
		    return "error";
		}
	}
	
public String ExtraiPing (String ping) {
		
		String PING_PATTERN = "(age = .*?ms)";
		String PING_PADRAO = "(dia = .*?ms)";		

		Pattern pattern = Pattern.compile(PING_PATTERN);
		Pattern padrao = Pattern.compile(PING_PADRAO);
		Matcher matcher = pattern.matcher(ping);
		Matcher combinador = padrao.matcher(ping);
		if (matcher.find()) {
		    return matcher.group().substring(6);
		} else if (combinador.find()) {
			return combinador.group().substring(6);
		} else{
			return "error";
		}
	}
}
