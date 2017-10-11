package controller;

import view.frames.FrameBarChart;
import view.frames.FramePieChart;
import view.frames.Ventana;

public class Controlador {
	public Controlador() {
		Ventana view = new Ventana();
		new DefaultElements(view).load();
		FramePieChart pieChart = new FramePieChart();
		FrameBarChart barChart = new FrameBarChart();
		new Events(view, pieChart.getPieChart(), barChart.getBarChart());
	}
}
