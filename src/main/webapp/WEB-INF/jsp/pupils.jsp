<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pupils Management</title>
</head>
<body>
	<h1>Pupils Data</h1>
	<form:form action="pupils.do" method="POST" commandName="pupils">
		<table>
			<tr>
				<td>Pupils ID</td>
				<td><form:input path="pupilsId" /></td>

			</tr>
			<tr>
				<td>First name</td>
				<td><form:input path="firstname" /></td>

			</tr>
			<tr>
				<td>Last name</td>
				<td><form:input path="lastname" /></td>

			</tr>
			<tr>
				<td>Year Level</td>
				<td><form:input path="yearLevel" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" name="action" value="Add" />
					<input type="submit" name="action" value="Edit" /> <input
					type="submit" name="action" value="Delete" /> <input type="submit"
					name="action" value="Search" /></td>

			</tr>
		</table>

	</form:form>

	<br>
	<table border="1">
	<tr>
		<th>ID</th>
		<th>First name</th>
		<th>Last name</th>
		<th>Year level</th>
		</tr>
		<c:forEach items="${pupilsList} }" var="pupils">
			<tr>
				<td>${pupils.pupilsId}</td>
				<td>${pupils.firstname}</td>
				<td>${pupils.lastname}</td>
				<td>${pupils.yearLevel}</td>
			</tr>

		</c:forEach>

	</table>

</body>
</html>