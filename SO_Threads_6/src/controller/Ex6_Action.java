package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Ex6_Action implements ActionListener {
	private JTextField num1, num2, num3;
	private JButton btnJogar;

	public Ex6_Action(JTextField num1, JTextField num2, JTextField num3, JButton btnJogar) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.btnJogar = btnJogar;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Ex6_Thread t1 = new Ex6_Thread(num1, btnJogar);
		Ex6_Thread t2 = new Ex6_Thread(num2, btnJogar);
		Ex6_Thread t3 = new Ex6_Thread(num3, btnJogar);
		t1.start();
		t2.start();
		t3.start();
	}
}
