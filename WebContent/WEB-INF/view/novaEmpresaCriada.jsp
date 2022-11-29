<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Gerenciador de Empresas</title>
</head>
<body>


	<c:import url="logout-parcial.jsp"></c:import>


	<c:if test="${ not empty empresa }">
			Empresa ${empresa} Cadastrada com sucesso!
		</c:if>

	<c:if test="${ empty empresa }">
			Nenhuma Empresa Cadastrada!
		</c:if>

</body>
</html>
