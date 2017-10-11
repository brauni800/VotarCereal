package view.panels;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import controller.observer.Observador;
import view.frames.Ventana;

@SuppressWarnings("serial")
public class PieChart extends JPanel implements Observador {

	private DefaultPieDataset data;
	private JFreeChart chart;
    
	public PieChart() {
		initComponents();
	}

	private void initComponents() {
		setVisible(true);
		setLayout(null);
		this.data = new DefaultPieDataset();
		this.data.setValue("", 0);
		this.data.setValue("", 0);
		this.data.setValue("", 0);
		this.chart = ChartFactory.createPieChart("Votos", this.data, true, true, true);
	}

	public ChartPanel createChartPanel() {
		return new ChartPanel(this.chart);
	}

	@Override
	public void update(Ventana view) {
		this.data.clear();
		this.data.setValue(view.getBtn1().getText(), Integer.parseInt(view.getLbl1().getText()));
		this.data.setValue(view.getBtn2().getText(), Integer.parseInt(view.getLbl2().getText()));
		this.data.setValue(view.getBtn3().getText(), Integer.parseInt(view.getLbl3().getText()));
		this.chart = ChartFactory.createPieChart("Votos", this.data, true, true, true);
	}
}
