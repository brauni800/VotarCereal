package controller;

import controller.observer.Observado;
import model.Archivos;
import view.frames.Ventana;

public class ObserverController extends Observado {

	private Ventana view;
	
	public ObserverController(Ventana view) {
		this.view = view;
	}

	@Override
	protected void notificar() {
		super.notificar();
		for (int i = 0; i < this.observador.size(); i++) {
            this.observador.get(i).update(this.view);
        }
	}

	@Override
	public void addVotos(String name) {
		super.addVotos(name);
		Archivos file = new Archivos(name);
		file.insertarFecha();
		notificar();
	}

	@Override
	public String getLinesNumbers(String name) {
		Archivos file = new Archivos(name);
		return String.valueOf(file.contarLineas());
	}
}
