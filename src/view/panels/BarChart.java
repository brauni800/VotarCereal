package view.panels;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import controller.observer.Observador;
import view.frames.Ventana;

@SuppressWarnings("serial")
public class BarChart extends JPanel implements Observador {

	private DefaultCategoryDataset data;
    private JFreeChart chart;
    
    public BarChart() {
    	initComponents();
	}

    private void initComponents() {
		setVisible(true);
		setLayout(null);
		this.data = new DefaultCategoryDataset();
		this.data.setValue(0, "", "");
		this.data.setValue(0, "", "");
		this.data.setValue(0, "", "");
		this.chart = ChartFactory.createBarChart("Votos", "Cereales", "Numero de votos", this.data, PlotOrientation.VERTICAL, true, true, true);
	}

    public ChartPanel createChartPanel() {
		return new ChartPanel(this.chart);
	}

	@Override
	public void update(Ventana view) {
		this.data.clear();
		this.data.setValue(Integer.parseInt(view.getLbl1().getText()), view.getBtn1().getText(), view.getBtn1().getText());
		this.data.setValue(Integer.parseInt(view.getLbl2().getText()), view.getBtn2().getText(), view.getBtn2().getText());
		this.data.setValue(Integer.parseInt(view.getLbl3().getText()), view.getBtn3().getText(), view.getBtn3().getText());
		this.chart = ChartFactory.createBarChart("Votos", "Cereales", "Numero de votos", this.data, PlotOrientation.VERTICAL, true, true, true);
	}
}
