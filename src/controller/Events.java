package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.observer.Observado;
import view.panels.BarChart;
import view.panels.PieChart;
import view.frames.Ventana;

public class Events implements ActionListener {

	private Ventana view;
	private PieChart pieChart;
	private BarChart barChart;
	private Observado obs;

	public Events(Ventana view, PieChart pieChart, BarChart barChart) {
		super();
		this.view = view;
		this.pieChart = pieChart;
		this.barChart = barChart;
		initComponents();
		initEvents();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if (comando.equals(view.getBtn1().getText())) {
			this.obs.addVotos(view.getBtn1().getText());
			this.view.getLbl1().setText(this.obs.getLinesNumbers(view.getBtn1().getText()));
		} else if (comando.equals(view.getBtn2().getText())) {
			this.obs.addVotos(view.getBtn2().getText());
			this.view.getLbl2().setText(this.obs.getLinesNumbers(view.getBtn2().getText()));
		} else if (comando.equals(view.getBtn3().getText())) {
			this.obs.addVotos(view.getBtn3().getText());
			this.view.getLbl3().setText(this.obs.getLinesNumbers(view.getBtn3().getText()));
		}
	}

	private void initEvents() {
		this.view.getBtn1().addActionListener(this);
		this.view.getBtn1().setActionCommand(view.getBtn1().getText());
		
		this.view.getBtn2().addActionListener(this);
		this.view.getBtn2().setActionCommand(view.getBtn2().getText());
		
		this.view.getBtn3().addActionListener(this);
		this.view.getBtn3().setActionCommand(view.getBtn3().getText());
	}
	
	private void initComponents() {
		this.obs = new ObserverController(this.view);
		this.obs.add(this.pieChart);
		this.obs.add(this.barChart);
	}
}
