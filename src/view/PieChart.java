package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import controller.observer.Observador;

@SuppressWarnings("serial")
public class PieChart extends JFrame implements Observador {

	private JPanel jPanel1;
	private DefaultPieDataset data;
    private JFreeChart chart;
	/**
	 * Create the frame.
	 */
	public PieChart() {
		initComponents();
		this.data = new DefaultPieDataset();
	}

	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLayout(null);
		setVisible(true);
		
		jPanel1 = new ChartPanel(this.chart);
		jPanel1.setVisible(true);
		jPanel1.setBounds(80, 80, 400, 250);
	}

	@Override
	public void update(Ventana view) {
		this.data.clear();
		this.data.setValue(view.getBtn1().getText(), Integer.parseInt(view.getLbl1().getText()));
		this.data.setValue(view.getBtn2().getText(), Integer.parseInt(view.getLbl2().getText()));
		this.data.setValue(view.getBtn3().getText(), Integer.parseInt(view.getLbl3().getText()));
		this.chart = ChartFactory.createPieChart("Votos", this.data, true, true, true);
		initComponents();
	}

	@Override
	public void showWindow() {
		
	}
}
