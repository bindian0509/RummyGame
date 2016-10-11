<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page import="com.bharat.rummy.dao.PlayerDaoImpl"%>
<jsp:useBean id="obj" class="com.bharat.rummy.domain.Player" />
<jsp:setProperty property="*" name="obj" />
<html>
<head>
<title>MOBIKWIK | BHARAT VERMA | RUMMY GAME | PLAYER DASHBOARD</title>
<spring:url value="/resources/static/public/main.css" var="maincss" />
<link href="${maincss}" rel="stylesheet" />
</head>
<body>
	<center>
		<br /> <br /> <br /> <b>Player Dashboard | Mobikwik Rummy Game
		</b><br /> <br />
		<table>

			<span class="error-msg">Welcome you have been successfully logged in!</span>

			<tr>
				<td><a href="newgame">New Game</a></td>
				<td><a href="invite">Invite player</a></td>
				<td><a href="leaderboard">Check Scores</a></td>
				<td><a href="gameList?playerId=${playerId}">Games
						Played</a></td>
			</tr>
			<tr>
				<td colspan="4"></td>
			</tr>
			<tr>
				<td colspan="4"></td>
			</tr>
			<tr>
				<td colspan="4"></td>
			</tr>
			<tr>
				<td colspan="4"><a href="gameList?playerId=${playerId}">Continue
						Playing Game</a></td>
			</tr>
			<tr>
				<td colspan="4"></td>
			</tr>
			<tr>
				<td colspan="4"></td>
			</tr>
		</table>


	</center>
</body>
</html>