package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Events implements ActionListener {

	private Ventana view;

	public Events(Ventana view) {
		super();
		this.view = view;
		initEvents();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		Archivos file;
		if (comando.equals(view.getBtn1().getText())) {
			file = new Archivos(view.getBtn1().getText());
			file.insertarFecha();
			this.view.getLbl1().setText(String.valueOf(file.contarLineas()));
		} else if (comando.equals(view.getBtn2().getText())) {
			file = new Archivos(view.getBtn2().getText());
			file.insertarFecha();
			this.view.getLbl2().setText(String.valueOf(file.contarLineas()));
		} else if (comando.equals(view.getBtn3().getText())) {
			file = new Archivos(view.getBtn3().getText());
			file.insertarFecha();
			this.view.getLbl3().setText(String.valueOf(file.contarLineas()));
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
}
