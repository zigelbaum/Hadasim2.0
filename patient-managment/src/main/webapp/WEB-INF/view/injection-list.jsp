<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=windows-1255"
	pageEncoding="windows-1255" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1255">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Injections</h1>


	<div align="center">

		<form action="showAddInjection">
			<input type="submit" value="ADD">
		</form>

		<br />

		<table border="1">
			<thead>
				<tr>
					<td>id</td>
					<td>date</td>
					<td>company</td>
				</tr>
			</thead>


			<c:forEach var="injection" items="${injections}">
				<tr>
					<td>${injection.id}</td>
					<td>${injection.date}</td>
					<td>${injection.company}</td>
					<td><a
						href="/patient-managment/showUpdateInjection?injectionId=${injection.id}">
							Update</a></td>
					<td><a
						href="/patient-managment/showDeleteInjection?injectionId=${injection.id}">
							Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>


</body>
</html>