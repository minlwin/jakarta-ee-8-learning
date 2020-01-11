<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Secirity</title>
</head>
<body>

	<h1>Jakarta EE Security</h1>
	
	<c:url value="/admin" var="admin"></c:url>
	<a href="${admin}">Admin Home</a>

</body>
</html>