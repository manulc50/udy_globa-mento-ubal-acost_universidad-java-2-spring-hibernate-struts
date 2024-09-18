package struts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

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

/* Podemos crear una Acción de Struts 2 mediante las siguientes opciones:
   - Una clase que implemente un método público llamado "execute" y que devuelva un String.
   - Una clase que implemente el método abstracto "execute" de la interfaz "Action"(prácticamente equivalente a la opción anterior).
   - Una clase que extienda de la clase "ActionSupport".
   Como norma general, usaremos la última opción cuando sea necesario tener un mayor control sobre la Acción de Struts 2 y usaremos una
   de las 2 primeras opciones cuando queremos crear una Acción de Struts 2 simple.
*/

public class MostrarPersonaAction extends ActionSupport {
	private static final long serialVersionUID = -1006904718735893533L;

	private static final Logger log = LogManager.getLogger(MostrarPersonaAction.class);
	
	private String nombre;
	
	// Una Acción de Struts 2 debe tener un método público llamado "execute" que será ejecutado automáticamente por Struts 2.
	public String execute() {
		log.info("El nombre recibido es: " + nombre);
		
		// Una de las ventajas de extender de la clase "ActionSupport" es que podemos hacer uso de sus constantes como SUCCESS.
		return SUCCESS;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
