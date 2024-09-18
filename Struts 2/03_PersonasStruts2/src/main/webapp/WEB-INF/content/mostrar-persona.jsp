<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Mostrar Persona con Struts 2</title>
	</head>
	<body>
		<h1>Personas con Struts 2</h1>
		
		<!-- Formulario de Struts 2 -->
		<!-- Cuando se envíe el formulario con el evento submit, se ejecutará el método "execute" de la Acción "MostrarPersonaAction" y,
		     después, se renderizará esta vista otra vez. -->
		<s:form>
		<!-- El atributo "name" debe coincidir con el nombre de la propiedad definida en la Acción de Struts2 -->
			<s:textfield name="nombre" />
			<s:submit value="Enviar" />
		</s:form>
		<div>
			<!-- Muestra el contenido de la propiedad "nombre" a través de su método getter de la Acción de Struts2 -->
			Nombre proporcionado: <s:property value="nombre" />
		</div>
	</body>
</html>