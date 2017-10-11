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
    
    protected void notificar() {}
    
    public void addVotos(String name) {}
    
    public abstract String getLinesNumbers(String name);
}
