package ex1.view;

import javax.swing.JOptionPane;

import ex1.controller.RedesController;

public class MainEx1 {

	public static void main(String[] args) {
		RedesController rc = new RedesController();
//		String teste = System.getProperty("os.name");
//		System.out.println(teste);
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
