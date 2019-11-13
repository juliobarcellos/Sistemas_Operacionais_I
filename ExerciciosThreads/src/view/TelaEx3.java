package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.Ex3Action;

import javax.swing.JButton;
import javax.swing.JLabel;


public class TelaEx3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblSapo[] = new JLabel [5], lblPlace[] = new JLabel [5];
	private JButton btnIniciarCorrida;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEx3 frame = new TelaEx3();
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
	public TelaEx3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnIniciarCorrida = new JButton("Iniciar Corrida");
		btnIniciarCorrida.setBounds(0, 0, 135, 25);
		contentPane.add(btnIniciarCorrida);
		Ex3Action Ex3Action = new Ex3Action(lblSapo, lblPlace);
		btnIniciarCorrida.addActionListener(Ex3Action);

		
		for (int i=0; i<5;i++) {
			lblSapo[i] = new JLabel("Sapo"+(i+1));
			lblSapo[i].setBounds(0,(i+1)*60,56,16);
			contentPane.add(lblSapo[i]);
		}
//		lblSapo1 = new JLabel("Sapo1");
//		lblSapo1.setBounds(0, 60, 56, 16);
//		contentPane.add(lblSapo1);
//		
//		lblSapo2 = new JLabel("Sapo2");
//		lblSapo2.setBounds(0, 110, 56, 16);
//		contentPane.add(lblSapo2);
//		
//		lblSapo3 = new JLabel("Sapo3");
//		lblSapo3.setBounds(0, 170, 56, 16);
//		contentPane.add(lblSapo3);
//		
//		lblSapo4 = new JLabel("Sapo4");
//		lblSapo4.setBounds(0, 230, 56, 16);
//		contentPane.add(lblSapo4);
//		
//		lblSapo5 = new JLabel("Sapo5");
//		lblSapo5.setBounds(0, 290, 56, 16);
//		contentPane.add(lblSapo5);
		for (int i=0; i<5;i++) {
			lblPlace[i] = new JLabel("Place"+(i+1));
			lblPlace[i].setBounds(400+(i+1)*55,0,50,50);
			contentPane.add(lblPlace[i]);
		}
//		lbl1place = new JLabel("1");
//		lbl1place.setBounds(584, 0, 50, 50);
//		contentPane.add(lbl1place);
//		
//		lbl2place = new JLabel("2");
//		lbl2place.setBounds(522, 26, 50, 50);
//		contentPane.add(lbl2place);
//		
//		lbl3place = new JLabel("3");
//		lbl3place.setBounds(646, 26, 50, 50);
//		contentPane.add(lbl3place);
	}
}
