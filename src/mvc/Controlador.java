package mvc;

public class Controlador {
	public Controlador() {
		Ventana view = new Ventana();
		new DefaultElements(view).load();
		new Events(view);
	}
}
