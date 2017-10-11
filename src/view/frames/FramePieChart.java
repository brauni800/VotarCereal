package view.frames;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.data.general.DefaultPieDataset;

import view.panels.PieChart;

@SuppressWarnings("serial")
public class FramePieChart extends JFrame {

	private JPanel jPanel1;

	public FramePieChart() {
		initComponents();
	}

	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLayout(null);
		setVisible(true);
		
		this.jPanel1 = new PieChart(ChartFactory.createPieChart("Votos", new DefaultPieDataset(), true, true, true));
		this.jPanel1.setVisible(true);
	}
}
