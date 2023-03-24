<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.error {
	color: red
}
</style>
</head>
<body>
	<h2>Pls fill below form</h2>
	<form:form action="user" modelAttribute="user" method="POST">
		<table>
			<tr>
				<td>Username</td>
				<td><form:input path="uname" /> <form:errors path="uname" cssClass="error"/></td>
			</tr>
			<tr>
				<td>Pwd</td>
				<td><form:password path="pwd" /> <form:errors path="pwd" cssClass="error"/></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><form:input path="email" /> <form:errors path="email" cssClass="error"/></td>
			</tr>
			<tr>
				<td>Phno</td>
				<td><form:input path="phno" /> <form:errors path="phno" cssClass="error"/> </td>
			</tr>
			<tr>
				<td>Age</td>
				<td><form:input path="age" /> <form:errors path="age" cssClass="error"/> </td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Register" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>