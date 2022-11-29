<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.List,br.com.alura.gerenciador.modelo.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gerenciador de Empresas</title>
</head>
<body>

	<c:import url="logout-parcial.jsp"></c:import>

	<br> Usuario Logado: ${ usuarioLogado.login }
	<br>
	<br>
	<br>
	<c:if test="${ not empty empresa }">
			Empresa ${empresa} Cadastrada com sucesso!
			<br />
		<br />
	</c:if>


	lista de empresas:
	<br />

	<ul>
		<c:forEach items="${ empresas   }" var="empresa">

			<li>
				${ empresa.nome }-<fmt:formatDate value="${ empresa.dataAbertura }" pattern="dd/MM/yyyy" /> 
				<a href="/gerenciador/entrada?acao=MostraEmpresa&id=${ empresa.id }">Editar</a>
				<a href="/gerenciador/entrada?acao=RemoveEmpresa&id=${ empresa.id }">Remove</a>

			</li>

		</c:forEach>
	</ul>
	<br>
	<a href="/gerenciador/entrada?acao=NovaEmpresaForm">Formulário</a>
</body>
</html>