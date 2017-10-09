package mvc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DefaultElements {

	private String ruta = "buttons.txt";
	private Ventana view;
	
	public DefaultElements(Ventana view) {
		this.view = view;
	}
	
	public void load() {
		try {
			loadButtons(new BufferedReader(new FileReader(ruta)));
		} catch (IOException e) {
			System.out.println("No hay más lineas");
			e.getStackTrace();
		}
		loadLabels();
	}
	
	private void loadButtons(BufferedReader bf) throws IOException {
		this.view.getBtn1().setText(bf.readLine());
		this.view.getBtn2().setText(bf.readLine());
		this.view.getBtn3().setText(bf.readLine());
	}
	
	private void loadLabels() {
		this.view.getLbl1().setText(String.valueOf(new Archivos(this.view.getBtn1().getText()).contarLineas()));
		this.view.getLbl2().setText(String.valueOf(new Archivos(this.view.getBtn2().getText()).contarLineas()));
		this.view.getLbl3().setText(String.valueOf(new Archivos(this.view.getBtn3().getText()).contarLineas()));
	}
}
