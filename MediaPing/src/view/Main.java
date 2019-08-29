package view;

import javax.swing.JOptionPane;

import controller.RedesController;

public class Main {

	public static void main(String[] args) {
		RedesController rc = new RedesController();
		int Opc =0;
		do {
			Opc=Integer.parseInt(JOptionPane.showInputDialog("Menu Principal\n\n1 - Mostrar IPv4 dos adaptadores\n2 - Média de ping\n9 - Fim"));
			switch (Opc) {
			case 1:
				rc.ip();
				break;
			case 2:
				rc.ping();
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
