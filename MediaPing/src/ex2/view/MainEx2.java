package view;

import javax.swing.JOptionPane;
import controller.Ex2Controller;

public class MainEx2 {

	public static void main(String[] args) {
		Ex2Controller ex = new Ex2Controller();
		int Opc =0;
		do {
			Opc=Integer.parseInt(JOptionPane.showInputDialog("Menu Principal\n\n1 - Mostrar Processos Ativos\n2 - Encerrar processo\n9 - Fim"));
			switch (Opc) {
			case 1:
				ex.MostraProcessos(ex.os());
				break;
			case 2:
				String processo = JOptionPane.showInputDialog("Digite o nome do processo ou PID para encerrar");
				try {
					int pid= Integer.parseInt(processo);
					ex.EncerraProcessoPid(ex.os(), pid);
				} catch (NumberFormatException e) {
					ex.EncerraProcessoNome(ex.os(), processo);
				}
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Fim");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Digite uma Opção Válida!");
			}
		}
		while (Opc!=9);
		
	}

}
