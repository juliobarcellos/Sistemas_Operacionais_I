package controller;

import java.io.*;
import java.util.regex.*;

public class Ex1Controller {
	String os = System.getProperty("os.name");
	
	public Ex1Controller () {
		super();
			}

	public void ip() {
		
		if (os.contains("Win")){
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
		else if (os.contains("Linux")) {
			try {
				Process processo = Runtime.getRuntime().exec("ifconfig");
				InputStream fluxo = processo.getInputStream();
				InputStreamReader leitor = new InputStreamReader(fluxo);
				BufferedReader buffer = new BufferedReader(leitor);
				String linha = buffer.readLine();
				String adaptador = "";
				while (linha != null) {
					if (linha.contains("flag")) {
						adaptador = ("Adaptador: "+linha.substring(0, linha.indexOf(":"))+" - ");
					}
					else if (linha.contains("inet ")) {
						String ipv4=("IPv4: "+ExtraiIP(linha));					
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
		else {
			System.out.println("sistema não reconhecido");
		}
	}
	
	public void ping () {
		if (os.contains("Win")){
			
			try {
				Process processo = Runtime.getRuntime().exec("ping -n 10 www.autocj.co.jp");
				InputStream fluxo = processo.getInputStream();
				InputStreamReader leitor = new InputStreamReader(fluxo);
				BufferedReader buffer = new BufferedReader(leitor);
				String linha = buffer.readLine();
				while (linha != null) {
					if ((linha.contains("ximo"))||(linha.contains("average"))) {
						String mdping = ExtraiPing(linha);
						System.out.println("MÃ©dia de ping: "+mdping);
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
		else if (os.contains("Linux")) {
			try {
				Process processo = Runtime.getRuntime().exec("ping -c 10 www.autocj.co.jp");
				InputStream fluxo = processo.getInputStream();
				InputStreamReader leitor = new InputStreamReader(fluxo);
				BufferedReader buffer = new BufferedReader(leitor);
				String linha = buffer.readLine();
				while (linha != null) {
					if (linha.contains("rtt")) {
						String mdping = ExtraiPing(linha);
						System.out.println("MÃ©dia de ping: "+mdping);
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
		else {
			System.out.println("Sistema não encontrado");
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
		String LINUX_PATTERN = "[\\d]+\\.[\\d]+\\/[\\d]+\\.[\\d]+";
		Pattern pattern = Pattern.compile(PING_PATTERN);
		Pattern padrao = Pattern.compile(PING_PADRAO);
		Pattern linuxp = Pattern.compile(LINUX_PATTERN);
		Matcher matcher = pattern.matcher(ping);
		Matcher combinador = padrao.matcher(ping);
		Matcher linuxm = linuxp.matcher(ping);
		if (matcher.find()) {
		    return matcher.group().substring(6);
		} else if (combinador.find()) {
			return combinador.group().substring(6);
		}else if (linuxm.find()) {
			return linuxm.group().substring(linuxm.group().indexOf("/")+1).replace(".", ",")+"ms";
		} else{
			return "error";
		}
	}


}
