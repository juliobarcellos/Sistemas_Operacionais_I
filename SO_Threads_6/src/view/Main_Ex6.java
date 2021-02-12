package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controller.Ex6_Action;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Main_Ex6 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField num1;
	private JTextField num2;
	private JTextField num3;
	private JButton btnJogar;
	private Font fonte = new Font("Tahoma", Font.BOLD, 46);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Ex6 frame = new Main_Ex6();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main_Ex6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setTitle("Caça-Níquel");
		contentPane.setLayout(null);

		num1 = new JTextField();
		num1.setBounds(48, 88, 115, 115);
		contentPane.add(num1);
		num1.setEditable(false);
		num1.setBackground(Color.white);
		num1.setColumns(10);
		num1.setFont(fonte);
		num1.setHorizontalAlignment(JTextField.CENTER);

		num2 = new JTextField();
		num2.setBounds(200, 88, 115, 115);
		contentPane.add(num2);
		num2.setEditable(false);
		num2.setBackground(Color.white);
		num2.setColumns(10);
		num2.setFont(fonte);
		num2.setHorizontalAlignment(JTextField.CENTER);

		num3 = new JTextField();
		num3.setBounds(360, 88, 115, 115);
		contentPane.add(num3);
		num3.setEditable(false);
		num3.setBackground(Color.white);
		num3.setColumns(10);
		num3.setFont(fonte);
		num3.setHorizontalAlignment(JTextField.CENTER);

		JButton btnJogar = new JButton("Jogar");
		btnJogar.setBounds(449, 250, 97, 25);
		contentPane.add(btnJogar);
		Ex6_Action Ex6Action = new Ex6_Action(num1, num2, num3, btnJogar);
		btnJogar.addActionListener(Ex6Action);

	}
}
