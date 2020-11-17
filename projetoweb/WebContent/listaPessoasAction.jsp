<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista Pessoas</title>
</head>
<body>
	<header>
		<h1>Lista de Pessoas</h1>
		<hr />
	</header>

	<main>
	<table style="width: 80%;">
		<thead>
			<tr>
				<td>#</td>
				<td>Nome</td>
				<td>Nascimento</td>
				<td>Sexo</td>
				<td>Ações</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="pessoa" items="${listaPessoas}">
				<tr>
					<td><c:out value="${pessoa.id}" /> </td>
					<td><c:out value="${pessoa.nome}" /> </td>
					<td><c:out value="${pessoa.dtNascimento}" /> </td>
					<td><c:out value="${pessoa.sexo}" /> </td>
					<td> <button>Ver</button> | <button>Apagar</button> </td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</main>
</body>
</html>