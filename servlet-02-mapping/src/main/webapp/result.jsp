<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dynamic Mapping Result</title>
</head>
<body>

	<h1>Mapping Result</h1>
	
	<table>
		<tr>
			<td>Servlet Name</td>
			<td>
				${mapping.servletName}
			</td>
		</tr>
		<tr>
			<td>Pattern</td>
			<td>
				${mapping.pattern}
			</td>
		</tr>
		<tr>
			<td>Mapping Match</td>
			<td>
				${mapping.mappingMatch}
			</td>
		</tr>
		<tr>
			<td>Match Value</td>
			<td>
				${mapping.matchValue}
			</td>
		</tr>
	</table>
	
	<c:url var="home" value="/index.jsp"></c:url>
	<a href="${home}">Home</a>

</body>
</html>