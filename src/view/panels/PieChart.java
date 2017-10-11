package view.panels;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import controller.observer.Observador;
import view.frames.Ventana;

@SuppressWarnings("serial")
public class PieChart extends ChartPanel implements Observador {

	private DefaultPieDataset data;
    @SuppressWarnings("unused")
	private JFreeChart chart;
    
	public PieChart(JFreeChart chart) {
		super(chart);
		this.chart = chart;
		initComponents();
	}

	private void initComponents() {
		this.data = new DefaultPieDataset();
		this.data.setValue("", 0);
		this.data.setValue("", 0);
		this.data.setValue("", 0);
		this.chart = ChartFactory.createPieChart("Votos", this.data, true, true, true);
	}

	@Override
	public void update(Ventana view) {
		this.data.clear();
		this.data.setValue(view.getBtn1().getText(), Integer.parseInt(view.getLbl1().getText()));
		this.data.setValue(view.getBtn2().getText(), Integer.parseInt(view.getLbl2().getText()));
		this.data.setValue(view.getBtn3().getText(), Integer.parseInt(view.getLbl3().getText()));
		this.chart = ChartFactory.createPieChart("Votos", this.data, true, true, true);
	}

	@Override
	public void showWindow() {
		
	}
}
