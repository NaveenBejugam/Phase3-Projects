<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Authentication Page</title>
</head>
<h2>Login Page</h2>
<body>
welcome to the authentication page
	
<form:form action="Auth" method="post" commandName="login">
	<labelfor="username">Username:</label>
	<inputname="username"id="username"type="text"placeholder="Username"/>
	<labelfor="password">Password:</label>
	<inputname="password"id="password"type="password"placholder="Password"/>
	<inputtype="submit"name="Submit"/>
</form:form>
</body>
</html>
