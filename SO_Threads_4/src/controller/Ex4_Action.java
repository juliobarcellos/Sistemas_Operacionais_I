package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class Ex4_Action implements ActionListener {

	private JLabel[] lblSapo, lblPlace;
	private Ex4_Thread[] Ex3Threads;

	public Ex4_Action(JLabel[] lblSapo, JLabel[] lblPlace) {
		this.lblSapo = lblSapo;
		this.lblPlace = lblPlace;
		Ex3Threads = new Ex4_Thread[lblSapo.length];
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < Ex3Threads.length; i++) {
			lblPlace[i].setText(i + 1 + "º lugar");
			lblPlace[i].setForeground(Color.black);
			lblSapo[i].setBounds(0, (i + 1) * 60, 56, 16);
			Ex3Threads[i] = new Ex4_Thread(i, lblPlace, lblSapo[i]);
			Ex3Threads[i].start();
		}
	}

}
