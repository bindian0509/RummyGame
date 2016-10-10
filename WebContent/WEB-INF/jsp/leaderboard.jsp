<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>MOBIKWIK | BHARAT VERMA | RUMMY GAME | PLAYER LIST</title>
<style>
body {
	font-size: 20px;
	color: teal;
	font-family: Verdana;
}

td {
	font-size: 12px;
	color: black;
	width: 100px;
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
		<br /> <br /> <br /> <b>Player Leaderboard | Mobikwik Rummy Game </b><br /> <br />				
		<table border="1">
			<tr>
				<td class="heading">Player Id</td>
				<td class="heading">Player Name</td>
				<td class="heading">Games Played</td>
				<td class="heading">Total Score</td>
				<td class="heading">Ranking</td>
			</tr>
			<c:forEach var="player" items="${playerList}">
				<tr>
					<td>${player.playerId}</td>
					<td>${player.playerName}</td>
					<td>${player.gamesPlayed}</td>
					<td>${player.score}</td>
					<td>${(player.score/player.gamesPlayed)*100}</td>
				</tr>
			</c:forEach>
			<tr><td colspan="11">Back to the <a href="dashboard">Dashboard</a></td></tr>
		</table>

	</center>
</body>
</html>