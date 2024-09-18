package actions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// Nota: Si seguimos las convenciones de Struts 2, podemos omitir o eliminar el archivo de configuración de Struts 2 "struts.xml".

/* Convenciones:
   - Las vistas de Struts 2 deben estar dentro de la carpeta "content" dentro del directorio "WEB-INF.
   - El nombre de la clase Acción de Struts 2 debe comenzar con el nombre de la vista asociada y terminar con "Action".
     (Por ejemplo, si la vista asociada es "saludar.jsp", entonces el nombre de la clase Acción debe ser "SaludarAction.java").
   - También, el nombre de la ruta de la url debe coincidir con el nombre de la vista y el nombre de la case Acción de Struts2.
     (Siguiendo el ejemplo anterior, la ruta de la url debe ser: "esquema://host:puerto:/nombre_app/saludar").
   - Si la ruta de la url es más compleja, como por ejemplo "http://localhost:8080/miApp/usuarios/registrar", debe haber una clase
     Acción de Struts 2 llamada "RegistrarAction" dentro del paquete "**.struts2.usuarios"(** -> los paquetes y subpaquetes que hayan antes).
   - Las clases Acciones de Struts 2 deben estar dentro de un paquete llamado "struts", "struts2", "action" o"actions".
*/

// Nota: Una Acción de Struts 2 representa a un Controlador en el patrón MVC.

public class SaludarAction {
	private static final Logger log = LogManager.getLogger(SaludarAction.class);
	
	private String saludo;
	
	// Una Acción de Struts 2 debe tener un método público llamado "execute" que será ejecutado automáticamente por Struts 2.
	public String execute() {
		log.info("Ejecutanto método execute desde Struts2");
		
		saludo = "Hola desde Struts2 con Convenciones";
		
		// Si usamos las convenciones de Struts 2, este String o etiqueta, que servía para asociarla a una vista Jsp en el archivo de configuración "struts.xml",
		// ya no es necesario porque dicho archivo de configuración es omitido o eliminado.
		return "exito";
	}

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
	
}
