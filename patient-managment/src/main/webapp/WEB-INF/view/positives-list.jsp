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
<h1 align="center">Positives</h1>


	<div align="center">

		<form action="showAddPositive">
			<input type="submit" value="ADD">
		</form>

		<br />

		<table border="1">
			<thead>
				<tr>
					<td>id</td>
					<td>date_of_pos</td>
					<td>date_of_rec</td>
				</tr>
			</thead>


			<c:forEach var="positive" items="${positives}">
				<tr>
					<td>${positive.id}</td>
					<td>${positive.date_of_pos}</td>
					<td>${positive.date_of_rec}</td>
					<td><a
						href="/patient-managment/showUpdatePositive?positiveId=${positive.id}">
							Update</a></td>
					<td><a
						href="/patient-managment/showDeletePositive?positiveId=${positive.id}">
							Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>