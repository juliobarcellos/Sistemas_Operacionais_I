package view;

import controller.ProcController;

public class Principal {

	public static void main(String[] args) {
		ProcController pc = new ProcController();
		//String os = pc.os();
		//System.out.println(os);
		
		//String processo="notepad.exe";
		//Se quiser posso colocar o caminho completo de uma aplica��o no processo que tamb�m resolve (ex: C://Programfiles/avast/avast.exe)
		//Se eu tentar chamar algum processo que precise de direitos de administrador (regedit.exe por ex), vai dar erro 740. 
		//pc.chamaProcesso(processo);
		
		//String Nomeprocesso = "TASKLIST /FO TABLE";
		//String Nomeprocesso = "PING -t www.skoob.com.br";
		//pc.leProcesso(Nomeprocesso);
		
		String Parametro = "5812";
		pc.MataProcesso(Parametro);
	}

}
