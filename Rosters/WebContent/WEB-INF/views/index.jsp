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
	
	<a href="/Rosters/Teams">New Team</a>
	
	<table>
  <tr>
    <th>Team</th>
    <th>Players</th> 
    <th>Action</th>
  </tr>
  	<c:forEach var="team" items="${teams}" varStatus="loop">
  <tr>
    	<td><c:out value ="${team.name}"/></td>
    	<td><c:out value="${team.players.size()}"/>
    	<td><a href="/Rosters/Teams?id=${loop.index}">Details</a>
    	<a href="/Rosters/Teams?action=delete&id=${loop.index}">Delete</a></td>

  </tr>
    </c:forEach>
</table>
	
</body>
</html>