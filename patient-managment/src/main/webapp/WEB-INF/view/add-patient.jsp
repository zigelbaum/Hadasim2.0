<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
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

<h3>Add Patient</h3>

<!-- create a spring form for the user to add data -->

<form:form action="save-patient" modelAttribute="patient" method="POST">

<label>Id : </label>
<form:input path="id"/>

<br/>

<label>Last_name : </label>
<form:input path="last_name"/>

<br/>

<label>First_name : </label>
<form:input path="first_name"/>

<br/>

<label>Address : </label>
<form:input path="address"/>

<br/>

<label>Date_of_birth : </label>
<form:input path="date_of_birth"/>

<br/>

<label>Tel_num : </label>
<form:input path="tel_num"/>

<br/>

<label>Cell_num : </label>
<form:input path="cell_num"/>

<br/>

<input type="submit" value="Submit">

</form:form>

</div>
</body>
</html>