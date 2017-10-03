package mvc;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Ventana extends JFrame {

	private JButton btnZucaritas, btnFruitloops, btnChocokripis;
	private JLabel lblZucaritas, lblFruitloops, lblChocokrispis;

	/**
	 * Create the frame.
	 */
	public Ventana() {
		initComponents();
	}

	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 200);
		setVisible(true);
		getContentPane().setLayout(null);
		
		btnZucaritas = new JButton("zucaritas");
		btnZucaritas.setBounds(30, 50, 117, 25);
		getContentPane().add(btnZucaritas);
		
		btnFruitloops = new JButton("fruitloops");
		btnFruitloops.setBounds(183, 50, 117, 25);
		getContentPane().add(btnFruitloops);
		
		btnChocokripis = new JButton("chocokripis");
		btnChocokripis.setBounds(328, 50, 117, 25);
		getContentPane().add(btnChocokripis);
		
		lblZucaritas = new JLabel("0");
		lblZucaritas.setBounds(85, 100, 20, 20);
		lblZucaritas.setVisible(true);
		getContentPane().add(lblZucaritas);
		
		lblFruitloops = new JLabel("0");
		lblFruitloops.setBounds(235, 100, 20, 20);
		lblFruitloops.setVisible(true);
		getContentPane().add(lblFruitloops);
		
		lblChocokrispis = new JLabel("0");
		lblChocokrispis.setBounds(380, 100, 20, 20);
		lblChocokrispis.setVisible(true);
		getContentPane().add(lblChocokrispis);
	}

	public JButton getBtnZucaritas() {
		return btnZucaritas;
	}

	public JButton getBtnFruitloops() {
		return btnFruitloops;
	}

	public JButton getBtnChocokripis() {
		return btnChocokripis;
	}

	public JLabel getLblZucaritas() {
		return lblZucaritas;
	}

	public JLabel getLblFruitloops() {
		return lblFruitloops;
	}

	public JLabel getLblChocokrispis() {
		return lblChocokrispis;
	}
}
