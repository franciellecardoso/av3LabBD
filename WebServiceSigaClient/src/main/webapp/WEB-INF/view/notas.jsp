<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css"
	href='<c:url value="./resources/css/styles.css" />'>
<title>Notas</title>
</head>
<body>
	<div>
		<jsp:include page="menu.jsp" />
	</div>
	<div align="center">
		<c:if test="${not empty saida }">
			<p>
				<c:out value="${saida }" />
			</p>
		</c:if>
		<c:if test="${not empty erro }">
			<h2 style="color: red">
				<c:out value="${erro }" />
			</h2>
		</c:if>
	</div>
	<div align="center">
		<c:if test="${not empty alunos }">
			<table border="1">
				<thead>
					<tr>
						<th>RA</th>
						<th>Nome</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="a" items="${alunos }">
						<tr>
							<td>${a.ra }</td>
							<td>${a.nome }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
		<c:if test="${not empty discs }">
			<table border="1">
				<thead>
					<tr>
						<th>Codigo</th>
						<th>Nome</th>
						<th>Sigla</th>
						<th>Turno</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="d" items="${discs }">
						<tr>
							<td>${d.codigo }</td>
							<td>${d.nome }</td>
							<td>${d.sigla }</td>
							<td>${d.turno }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
		<br />
		<br />
		<form action="notas" method="post">
			<table>
				<tr>
					<td colspan="3"><input type="number" id="codigo" name="codigo"
						placeholder="Código Disciplina"></td>
					<td colspan="3"><input type="number" id="ra" name="ra"
						placeholder="Ra do Aluno"></td>
					<td><input type="submit" value="Procurar notas" id="button"
						name="button"></td>
				</tr>
				<c:if test="${not empty notas }">
					<tr>
						<td colspan="3"><input type="number" id="nota" name="nota"
							placeholder="Nota"></td>
						<td><input type="submit" value="Atualizar notas" id="button"
							name="button"></td>
					</tr>
				</c:if>
			</table>
		</form>
		<c:if test="${not empty notas }">
			<table border="1">
				<thead>
					<tr>
						<th>RA</th>
						<th>Nome</th>
						<th>Disciplina</th>
						<th>Turno</th>
						<th>P1</th>
						<th>P2</th>
						<th>P3</th>
						<th>P4</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>${notas[0].raAluno }</td>
						<td>${notas[0].nomeAluno }</td>
						<td>${notas[0].nomeDisciplina }</td>
						<td>${notas[0].turno }</td>
						<c:forEach var="n" items="${notas }">
							<td><input type="number" id="nota" name="nota"
								value="${n.nota }" placeholder="Nota"></td>
						</c:forEach>
					</tr>
				</tbody>
			</table>
		</c:if>
	</div>
</body>
</html>