package controller.observer;

import view.Ventana;

public interface Observador {

	public void update(Ventana view);
    public void showWindow();
}
