<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Details details</title>
</head>
<body>

<h1><c:out value="${thisTeam.name}"/></h1>

	<a href="/Rosters/Players?id=${teamID}">Add a New Player</a>

<table>
  <tr>
    <th>First Name</th>
    <th>Last Name</th> 
    <th>Age</th>
    <th>Action></th>
  </tr>
  	<c:forEach var="player" items="${thisTeam.players}" varStatus="loop">
  <tr>
    	<td><c:out value="${player.firstName}"/></td>
    	<td><c:out value="${player.lastName}"/></td>
    	<td><c:out value="${player.age}"/></td>
    	<td><a href="/Rosters/Players?action=delete&id=${loop.index}">Delete</a></td>
  </tr>
    </c:forEach>
</table>

</body>
</html>