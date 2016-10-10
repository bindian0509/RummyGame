<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>MOBIKWIK | BHARAT VERMA | RUMMY GAME | PLAYER DASHBOARD </title>
<style>
body {
	font-size: 20px;
	color: teal;
	font-family: Verdana;
}

td {
	font-size: 12px;
	color: black;
	width: 33%;
	height: 22px;
	text-align: center;
}
.heading {
	font-size: 14px;
	color: white;
	font: bold;
	background-color: orange;
	border: thick;
}
</style>
</head>
<body>
	<center>
		<br /> <br /> <br /> <b>Player Dashboard | Mobikwik Rummy Game </b><br /> <br />					
		<table>
			<tr>
				<td><a href="newgame">Create New Game</a></td>
				<td><a href="invite">Invite player for Game</a></td>
				<td><a href="leaderboard">Check Scores</a></td>
			</tr>
			<tr><td colspan="3"></td></tr>
			<tr><td colspan="3"></td></tr>
			<tr><td colspan="3"></td></tr>
			<tr><td colspan="3"><a href="play">Continue Playing Game</a></td></tr>
			<tr><td colspan="3"></td></tr>
			<tr><td colspan="3"></td></tr>
		</table>

	</center>
</body>
</html>