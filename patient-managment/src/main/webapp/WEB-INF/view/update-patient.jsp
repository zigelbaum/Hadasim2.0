<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=windows-1255"
	pageEncoding="windows-1255"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1255">
<title>Insert title here</title>
</head>
<body>

	<div align="center">

		<h3>Update Patient</h3>

		<!-- create a spring form for the user to add data -->

		<form:form action="update-patient" modelAttribute="patient" method="POST">

			<form:hidden path="id" />

			<br />

			<label>Last_name : </label>
			<form:input path="last_name" />

			<br />

			<label>First_name : </label>
			<form:input path="first_name" />

			<br />

			<label>Address : </label>
			<form:input path="address" />

			<br />

			<label>Tel_num : </label>
			<form:input path="tel_num" />

			<br />

			<label>Cell_num : </label>
			<form:input path="cell_num" />

			<br />

			<input type="submit" value="Submit">

		</form:form>

	</div>

</body>
</html>