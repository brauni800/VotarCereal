package view.frames;

import javax.swing.JFrame;
import javax.swing.JPanel;

import view.panels.PieChart;

@SuppressWarnings("serial")
public class FramePieChart extends JFrame {

	private PieChart pieChart;
	private JPanel chartPanel;
	
	public FramePieChart() {
		initComponents();
	}

	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 350, 450, 300);
		this.pieChart = new PieChart();
		this.chartPanel = this.pieChart.createChartPanel();
		this.add(this.chartPanel);
		setVisible(true);
	}

	public PieChart getPieChart() {
		return pieChart;
	}
}
