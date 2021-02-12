package view;

import controller.ProcController;

public class Principal {

	public static void main(String[] args) {
		ProcController pc = new ProcController();
		String processo = "notepad.exe";
//		Se quiser posso colocar o caminho completo de uma aplicação no processo que também resolve (ex: C://Programfiles/avast/avast.exe)
//		Se eu tentar chamar algum processo que precise de direitos de administrador (regedit.exe por ex), vai dar erro 740. 
		pc.chamaProcesso(processo);

		String nome = "notepad.exe";
		pc.MataProcesso(nome);

		String parametro = "5812";
		pc.MataProcesso(parametro);

		// String Nomeprocesso = "TASKLIST /FO TABLE";
		String Nomeprocesso = "ping -n 10 www.skoob.com.br";
		pc.leProcesso(Nomeprocesso);
	}

}
