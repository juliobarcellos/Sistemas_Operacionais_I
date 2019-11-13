package controller;


import java.awt.Rectangle;
import javax.swing.JLabel;

public class Ex3Thread extends Thread{
	private int sapo;
	private static int posicao;
	private JLabel lblSapo; 
	private JLabel[] lblPlace;
	private int distanciaPercorrida;
	private int distanciaMax;
	
	public Ex3Thread(int sapo, JLabel[] lblPlace, JLabel lblSapo) {
		this.sapo = sapo;
		this.lblPlace = lblPlace;
		this.lblSapo = lblSapo;
		distanciaPercorrida = 0;
		distanciaMax = 700;
		posicao = 0;
	}
	
	@Override
	public void run() {
		SaltoSapo();
	}
	
	private void SaltoSapo() {
		
		
//		while (distanciaPercorrida<distanciaMax) {
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			distanciaPercorrida+= Math.random()*100;
//			Rectangle posicaoSapo = lblSapo.getBounds();
//			posicaoSapo.x += distanciaPercorrida;
//			lblSapo.setBounds(posicaoSapo);
//			System.out.println("O sapo "+sapo+" andou "+distanciaPercorrida+" metros");
//		}
//		posicao++;
//		lblPlace[posicao-1].setText("Sapo "+(sapo+1));
//		
//		System.out.println("O sapo "+(sapo+1)+" chegou em "+posicao+"º lugar.");
//	}

		
		while (distanciaPercorrida<distanciaMax) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Rectangle posicaoSapo = lblSapo.getBounds();
			distanciaPercorrida+= Math.random()*10;
			if (distanciaPercorrida>=distanciaMax) {
				posicaoSapo.x = distanciaMax;
			}else {
			posicaoSapo.x = distanciaPercorrida;
			}
			lblSapo.setBounds(posicaoSapo);
			System.out.println("O sapo "+(sapo+1)+" andou "+distanciaPercorrida+" metros");
		}
		posicao++;
		lblPlace[posicao-1].setText("Sapo "+(sapo+1));
		
		System.out.println("O sapo "+(sapo+1)+" chegou em "+posicao+"º lugar.");
	}
	
}
