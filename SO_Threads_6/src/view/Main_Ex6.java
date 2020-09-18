package view;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class Main_Ex6 extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField num1;
	private JTextField num2;
	private JTextField num3;
	private JButton btnJogar;

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
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Caça Níquel");

		num1.setBounds(0, 0, 50, 50);
		contentPane.add(num1);
		num1.setEditable(false);
//
//		num2.setBounds(31, 148, 56, 16);
//		contentPane.add(num2);
//		num2.setEditable(false);
//		
//		num3.setBounds(31, 148, 56, 16);
//		contentPane.add(num3);
//		num3.setEditable(false);
//
//		btnJogar.setText("Correr");
//		Ex6_Action Ex6Action = new Ex6_Action(btnCorrer, lblCarro1, lblCarro2, Vencedor, Perdedor);
//		btnJogar.setBounds(31, 276, 97, 25);
//		contentPane.add(btnJogar);
//		btnJogar.addActionListener(Ex6Action);

	}
}
