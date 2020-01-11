<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>

	<h1>Login</h1>
	
	<form action="j_security_check" method="post">
		
		<table>
			<tr>
				<td>Login ID</td>
				<td>
					<input type="text" name="j_username" />
				</td>
			</tr>
			<tr>
				<td>Password</td>
				<td>
					<input type="password" name="j_password" />
				</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<input type="submit" value="Login" />
				</td>
			</tr>
		</table>
	
	</form>

</body>
</html>