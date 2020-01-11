<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Home</title>
</head>
<body>

	<h1>Admin Home</h1>
	
	<c:out value="${request.remoteUser}"></c:out>
	
	<br />
	
	<c:url value="/admin" var="logout">
		<c:param name="logout"></c:param>
	</c:url>
	
	<a href="${logout}">Logout</a>

</body>
</html>