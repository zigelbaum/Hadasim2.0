<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=windows-1255"
	pageEncoding="windows-1255"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1255">
<title>Insert title here</title>
</head>
<body>
	<div align="center">

		<h3>Add Injection</h3>

		<!-- create a spring form for the user to add data -->

		<form:form action="save-injection" modelAttribute="injection"
			method="POST">

			<label>Id : </label>
			<form:input path="id" />

			<br />

			<label>Date of injection : </label>
			<form:input path="date" />

			<br />

			<label>Company : </label>
			<form:input path="company" />

			<br />


			<input type="submit" value="Submit">

		</form:form>

	</div>

</body>
</html>