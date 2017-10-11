package view.frames;

import javax.swing.JFrame;
import javax.swing.JPanel;

import view.panels.BarChart;

@SuppressWarnings("serial")
public class FrameBarChart extends JFrame {
	private BarChart barChart;
	private JPanel chartPanel;
	
	public FrameBarChart() {
		initComponents();
	}

	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 350, 450, 300);
		this.barChart = new BarChart();
		this.chartPanel = this.barChart.createChartPanel();
		this.add(this.chartPanel);
		setVisible(true);
	}

	public BarChart getBarChart() {
		return barChart;
	}
}
