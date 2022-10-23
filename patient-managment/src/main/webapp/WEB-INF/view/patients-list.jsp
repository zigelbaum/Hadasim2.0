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

	<h1 align="center">Zigelbaum</h1>
	<div align="center">

		<form action="showAddPatient">
			<input type="submit" value="ADD">
		</form>

		<br/>

		<table border="1">
			<thead>
				<tr>
					<td>id</td>
					<td>last_name</td>
					<td>first_name</td>
					<td>address</td>
					<td>date_of_birth</td>
					<td>tel_num</td>
					<td>cell_num</td>
				</tr>
			</thead>


			<c:forEach var="patient" items="${patients}">
				<tr>
					<td>${patient.id}</td>
					<td>${patient.last_name}</td>
					<td>${patient.first_name}</td>
					<td>${patient.address}</td>
					<td>${patient.date_of_birth}
					<td>${patient.tel_num}
					<td>${patient.cell_num}</td>
				</tr>
			</c:forEach>
		</table>
	</div>


</body>
</html>