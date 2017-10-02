package mvc;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Ventana extends JFrame {


	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 200);
		setVisible(true);
		getContentPane().setLayout(null);
		
		JButton btnZucaritas = new JButton("zucaritas");
		btnZucaritas.setBounds(30, 50, 117, 25);
		getContentPane().add(btnZucaritas);
		
		JButton btnFruitloops = new JButton("fruitloops");
		btnFruitloops.setBounds(183, 50, 117, 25);
		getContentPane().add(btnFruitloops);
		
		JButton btnChocokripis = new JButton("chocokripis");
		btnChocokripis.setBounds(328, 50, 117, 25);
		getContentPane().add(btnChocokripis);
		
		JLabel label = new JLabel("0");
		label.setBounds(85, 100, 20, 20);
		label.setVisible(true);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("0");
		label_1.setBounds(235, 100, 20, 20);
		label_1.setVisible(true);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("0");
		label_2.setBounds(380, 100, 20, 20);
		label_2.setVisible(true);
		getContentPane().add(label_2);
	}
	public static void main(String[] args) {
		new Ventana();
	}
}
