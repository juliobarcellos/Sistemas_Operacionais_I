package view;

import javax.swing.JOptionPane;

import controller.Ex1Controller;

public class MainEx1 {

	public static void main(String[] args) {
		Ex1Controller rc = new Ex1Controller();
		String teste = System.getProperty("os.name");
		System.out.println(teste);
		int Opc =0;
		do {
			Opc=Integer.parseInt(JOptionPane.showInputDialog("Menu Principal\n\n1 - Mostrar IPv4 dos adaptadores\n2 - M�dia de ping\n9 - Fim"));
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
				JOptionPane.showMessageDialog(null, "Digite uma Op��o V�lida!");
			}
		}
		while (Opc!=9);
		
	}

}