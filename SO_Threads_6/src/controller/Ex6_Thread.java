package controller;

import javax.swing.JButton;
import javax.swing.JTextField;

public class Ex6_Thread extends Thread {
	private JTextField num;
	private JButton btnJogar;
	public static int threadsFinalizadas = 0;

	public Ex6_Thread(JTextField num, JButton btnJogar) {
		this.num = num;
		this.btnJogar = btnJogar;
		this.threadsFinalizadas = 0;
	}

	@Override
	public void run() {
		jogar();
	}

	private void jogar() {
		btnJogar.setVisible(false);
		int numGiros = (int) (Math.random() * (150 - 1) + 1);
		for (int i = 0; i < numGiros; i++) {
			int t = (int) (Math.random() * (8 - 1) + 1);
			num.setText("" + t);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		threadsFinalizadas++;
		if (threadsFinalizadas == 3) {
			btnJogar.setVisible(true);
		}
	}
}
