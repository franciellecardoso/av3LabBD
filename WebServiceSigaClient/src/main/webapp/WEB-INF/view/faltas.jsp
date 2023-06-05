<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css"
	href='<c:url value="./resources/css/styles.css" />'>
<title>Faltas</title>
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
		<form action="faltas" method="post">
			<table>
				<tr>
					<td colspan="3"><input type="number" id="codigo" name="codigo"
						placeholder="Código Disciplina"></td>
					<td colspan="3"><input type="number" id="ra" name="ra"
						placeholder="Ra do Aluno"></td>
					<td><input type="submit" value="Procurar faltas" id="button"
						name="button"></td>
				</tr>
				<c:if test="${not empty faltas }">
					<tr>
						<td colspan="3"><input type="date" id="data" name="data"
							placeholder="Data"></td>
						<td colspan="3"><input type="text" id="presenca"
							name="presenca" placeholder="Presenças"></td>
						<td><input type="submit" value="Atualizar faltas" id="button"
							name="button"></td>
					</tr>
				</c:if>
			</table>
		</form>
		<c:if test="${not empty faltas }">
			<table border="1">
				<thead>
					<tr>
						<th>RA</th>
						<th>Nome</th>
						<th>Disciplina</th>
						<th>Turno</th>
						<c:forEach var="f" items="${faltas }">
							<th><p>${f.data }
								<p></th>
						</c:forEach>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>${faltas[0].raAluno }</td>
						<td>${faltas[0].nomeAluno }</td>
						<td>${faltas[0].nomeDisciplina }</td>
						<td>${faltas[0].turno }</td>
						<c:forEach var="f" items="${faltas }">
							<td>${f.presenca }</td>
						</c:forEach>
					</tr>
				</tbody>
			</table>
		</c:if>
	</div>
</body>
</html>