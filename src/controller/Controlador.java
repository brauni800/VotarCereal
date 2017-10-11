package controller;

import view.frames.FrameBarChart;
import view.frames.FramePieChart;
import view.frames.Ventana;

public class Controlador {
	public Controlador() {
		Ventana view = new Ventana();
		new DefaultElements(view).load();
		
		FramePieChart pieChart = new FramePieChart();
		new DefaultElements(view, pieChart.getPieChart()).loadCharts();
		
		FrameBarChart barChart = new FrameBarChart();
		new DefaultElements(view, barChart.getBarChart()).loadCharts();
		
		new Events(view, pieChart.getPieChart(), barChart.getBarChart());
	}
}
