<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Add a player to <c:out value="${teamName}"/></h1>

<form action="/Rosters/Players" method="POST">
	<input type="text" name="firstName" placeholder="firstName">
	<input type="hidden" name="id" value="${id}">
	<input type="text" name="lastName" placeholder="last      name">
	<input type="text" name="age" placeholder="18 mo">
	<input type="submit" value="SUBMIT">
</form>

</body>
</html>