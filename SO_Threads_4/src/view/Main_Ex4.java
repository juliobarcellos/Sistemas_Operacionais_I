package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controller.Ex4_Action;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Main_Ex4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblSapo[] = new JLabel[5], lblPlace[] = new JLabel[5];
	private JButton btnIniciarCorrida;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Ex4 frame = new Main_Ex4();
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
	public Main_Ex4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setTitle("Corrida de Sapos");

		btnIniciarCorrida = new JButton("Iniciar Corrida");
		btnIniciarCorrida.setBounds(0, 0, 135, 25);
		contentPane.add(btnIniciarCorrida);
		Ex4_Action Ex3Action = new Ex4_Action(lblSapo, lblPlace);
		btnIniciarCorrida.addActionListener(Ex3Action);

		for (int i = 0; i < 5; i++) {
			lblSapo[i] = new JLabel("Sapo" + (i + 1));
			lblSapo[i].setBounds(0, (i + 1) * 60, 56, 16);
			contentPane.add(lblSapo[i]);
		}

		for (int i = 0; i < 5; i++) {
			lblPlace[i] = new JLabel((i + 1) + "º lugar");
			lblPlace[i].setBounds(400 + (i + 1) * 55, 0, 50, 50);
			contentPane.add(lblPlace[i]);
		}

	}
}
