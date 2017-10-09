package mvc;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Ventana extends JFrame {

	private JButton btn1, btn2, btn3;
	private JLabel lbl1, lbl2, lbl3;

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
		
		btn1 = new JButton();
		btn1.setBounds(30, 50, 117, 25);
		getContentPane().add(btn1);
		
		btn2 = new JButton();
		btn2.setBounds(183, 50, 117, 25);
		getContentPane().add(btn2);
		
		btn3 = new JButton();
		btn3.setBounds(328, 50, 117, 25);
		getContentPane().add(btn3);
		
		lbl1 = new JLabel("0");
		lbl1.setBounds(85, 100, 20, 20);
		lbl1.setVisible(true);
		getContentPane().add(lbl1);
		
		lbl2 = new JLabel("0");
		lbl2.setBounds(235, 100, 20, 20);
		lbl2.setVisible(true);
		getContentPane().add(lbl2);
		
		lbl3 = new JLabel("0");
		lbl3.setBounds(380, 100, 20, 20);
		lbl3.setVisible(true);
		getContentPane().add(lbl3);
	}

	public JButton getBtn1() {
		return btn1;
	}

	public JButton getBtn2() {
		return btn2;
	}

	public JButton getBtn3() {
		return btn3;
	}

	public JLabel getLbl1() {
		return lbl1;
	}

	public JLabel getLbl2() {
		return lbl2;
	}

	public JLabel getLbl3() {
		return lbl3;
	}
}
