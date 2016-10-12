<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<title>MOBIKWIK | BHARAT VERMA | RUMMY GAME | PLAYER LIST</title>
<spring:url value="/resources/static/public/main.css" var="maincss" />
<link href="${maincss}" rel="stylesheet" />
</head>
<body>
	<center>
		<br /> <br /> <br /> <b>Games Played
			List | Mobikwik Rummy Game </b><br /> <br />
			
		

		<table border="1">
			<tr>
				<td class="heading">Game Id</td>
				<td class="heading">Player 1</td>
				<td class="heading">Player 2</td>
				<td class="heading">Player 3</td>
				<td class="heading">Games Result</td>
				<td class="heading">Status</td>				
			</tr>
			<c:forEach var="game" items="${gameList}">
				<tr>
					<td>${game.gameId}</td>
					<td>${game.firstPlayer}</td>
					<td>${game.secondPlayer}</td>
					<td>${game.thirdPlayer}</td>
					<td>${game.result}</td>
					<td>${game.status}</td>					
				</tr>
			</c:forEach>
			<tr><td colspan="11"><a href="dashboard">Click here for Dashboard!</a></td></tr>
		</table>

	</center>
</body>
</html>