package controller.observer;

import java.util.ArrayList;

public abstract class Observado {

	protected ArrayList<Observador> observador;

    public Observado() {
        this.observador = new ArrayList<Observador>();
    }
    
    public void add(Observador observador) {
        this.observador.add(observador);
    }
    
    public void delete(Observador observador) {
        for (int i = 0; i < this.observador.size(); i++) {
            if (this.observador.get(i).equals(observador)) {
                this.observador.remove(i);
            } else {
                System.out.println("Elemento no encontrado");
            }
        }
    }
    
    public void showWindow() {
        for (int i = 0; i < this.observador.size(); i++) {
            this.observador.get(i).showWindow();
        }
    }
}
