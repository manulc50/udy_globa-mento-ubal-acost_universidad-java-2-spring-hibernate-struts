<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Saludos desde Struts 2</title>
	</head>
	<body>
		<!-- Ejecuta el método getter de la propiedad "saludo" mediante Struts 2 -->
		<h1><s:property value="saludo"></s:property></h1>
	</body>
</html>