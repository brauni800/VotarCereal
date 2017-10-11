package controller;

import controller.observer.Observador;
import model.Archivos;
import view.frames.Ventana;

public class DefaultElements {

	private Ventana view;
	private Observador observador;

	public DefaultElements(Ventana view) {
		this.view = view;
	}
	
	public DefaultElements(Ventana view, Observador observador) {
		this.view = view;
		this.observador = observador;
	}

	public void load() {
		loadButtons(new Archivos("buttons").getButtonsNames());
		loadLabels();
	}
	
	public void loadCharts() {
		this.observador.update(this.view);
	}

	private void loadButtons(String[] buttonNames) {
		this.view.getBtn1().setText(buttonNames[0]);
		this.view.getBtn2().setText(buttonNames[1]);
		this.view.getBtn3().setText(buttonNames[2]);
	}
	
	private void loadLabels() {
		this.view.getLbl1().setText(String.valueOf(new Archivos(this.view.getBtn1().getText()).contarLineas()));
		this.view.getLbl2().setText(String.valueOf(new Archivos(this.view.getBtn2().getText()).contarLineas()));
		this.view.getLbl3().setText(String.valueOf(new Archivos(this.view.getBtn3().getText()).contarLineas()));
	}
}
