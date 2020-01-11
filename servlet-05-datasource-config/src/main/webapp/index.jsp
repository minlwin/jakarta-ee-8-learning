<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Using DataSource</title>
</head>
<body>

	<h1>Using DataSource Declaration</h1>
	
	<form action="students" method="post">
	
		<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="email" name="email" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Save" /></td>
			</tr>
		</table>
	</form>
	
	<hr />
	
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Email</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="dto">
				<tr>
					<td>
						<c:out value="${dto.id}"></c:out>
					</td>
					<td>
						<c:out value="${dto.name}"></c:out>
					</td>
					<td>
						<c:out value="${dto.email}"></c:out>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>