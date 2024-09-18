package actions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//Nota: Una Acción de Struts 2 representa a un Controlador en el patrón MVC.

public class HolaMundoAction {
	private static final Logger log = LogManager.getLogger(HolaMundoAction.class);
	
	private String saludo;
	
	// Una Acción de Struts 2 debe tener un método público llamado "execute" que será ejecutado automáticamente por Struts 2.
	public String execute() {
		log.info("Ejecutanto método execute desde Struts2");
		
		saludo = "Saludos desde Struts2";
		
		// String o etiqueta que será asociada a una vista Jsp en el archivo de configuración "struts.xml".
		return "exito";
	}

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
	
}
