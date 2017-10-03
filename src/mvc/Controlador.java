package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener{

	public static final String ZUCARITAS = "zucaritas";
	public static final String FRUITLOOPS = "fruitloops";
	public static final String CHOCOKRISPIS = "chocokrispis";

	private Ventana view;

	public Controlador() {
		super();
		this.view = new Ventana();
		initEvents();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		Archivos file;
		switch(comando) {
		case Controlador.ZUCARITAS:
			file = new Archivos(Controlador.ZUCARITAS);
			file.insertarFecha();
			this.view.getLblZucaritas().setText(String.valueOf(file.contarLineas()));
			break;
		case Controlador.FRUITLOOPS:
			file = new Archivos(Controlador.FRUITLOOPS);
			file.insertarFecha();
			this.view.getLblFruitloops().setText(String.valueOf(file.contarLineas()));
			break;
		case Controlador.CHOCOKRISPIS:
			file = new Archivos(Controlador.CHOCOKRISPIS);
			file.insertarFecha();
			this.view.getLblChocokrispis().setText(String.valueOf(file.contarLineas()));
			break;
		}
	}

	private void initEvents() {
		this.view.getBtnZucaritas().addActionListener(this);
		this.view.getBtnZucaritas().setActionCommand(Controlador.ZUCARITAS);
		
		this.view.getBtnFruitloops().addActionListener(this);
		this.view.getBtnFruitloops().setActionCommand(Controlador.FRUITLOOPS);
		
		this.view.getBtnChocokripis().addActionListener(this);
		this.view.getBtnChocokripis().setActionCommand(Controlador.CHOCOKRISPIS);
	}
}
