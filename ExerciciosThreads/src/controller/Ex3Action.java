package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class Ex3Action implements ActionListener{

	private JLabel[] lblSapo, lblPlace; 
	private Ex3Thread[] Ex3Threads;
	
	public Ex3Action(JLabel[] lblSapo, JLabel[] lblPlace) {
		this.lblSapo = lblSapo;
		this.lblPlace = lblPlace;
		Ex3Threads = new Ex3Thread[lblSapo.length];
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i=0; i<Ex3Threads.length; i++) {
			lblSapo[i].setBounds(0,(i+1)*60,56,16);
			Ex3Threads[i] = new Ex3Thread(i, lblPlace, lblSapo[i]);
			Ex3Threads[i].start();
		}
	}

}
