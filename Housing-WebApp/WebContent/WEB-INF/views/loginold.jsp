<%@ page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%response.setHeader("cache-control","no-cache,no-store,must-revalidate"); %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index</title>
<style type="text/css">
	.error{
		color:red
	}
	.info{
	color:green
	}
</style>
</head>
<body>
	<h2 class="error">${errorMsg}</h2>
	<h2 class="info">${infoMsg}</h2>
	<form action="login" method="post">
		Username:<input type="text" name="username"><br/>
		Password:<input type="password" name="password"><br/>
		<input type="submit" value="Login">
	</form>
	
		<form action="submit" method="post">
		
		Username:<input type="text" name="username"><br/>
		Password:<input type="password" name="password"><br/>
		Email:<input type="text" name="email"><br/>
		First Name:<input type="text" name="firstName"><br/>
		Last Name:<input type="text" name="lastName"><br/>
		Status:
		<select id="s1">
		<option> </option>
		<option value="t"> Tenant</option>
		<option value="l"> Landlord</option>
		</select>
		<input type="submit" value="Login">
	</form>
	
	
</body>
</html>


