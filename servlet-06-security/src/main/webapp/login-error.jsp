<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Error</title>
</head>
<body>

	<h1>Login Error</h1>
	
	<p>Please check login id and password.</p>
	
	<c:url value="/login.jsp" var="login"></c:url>
	<a href="${login}">Login</a>

</body>
</html>