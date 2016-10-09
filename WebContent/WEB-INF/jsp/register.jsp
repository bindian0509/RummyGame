<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>MOBIKWIK | BHARAT VERMA | RUMMY GAME | ADD PLAYER</title>
<style>
body {
	font-size: 20px;
	color: teal;
	font-family: verdana;
}

td {
	font-size: 12px;
	color: black;
	width: 100px;
	height: 22px;
	text-align: left;
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
		<br /> <br /> <br /> <b>Mobikwik Rummy Game | Player Registration Form </b> <br />
		<br />
		<div>
			<form:form method="post" action="/insertPlayer" modelAttribute="player">
				<table>
					<tr>
						<td>Name :</td>
						<td><form:input path="playerName" /></td>
					</tr>
					<tr>
						<td>Email :</td>
						<td><form:input path="playerEmail" /></td>
					</tr>
					<tr>
						<td>Password :</td>
						<td><form:input type="password" path="playerPassword" /></td>
					</tr>
					<tr>
						<td>Skill Level :</td>
						<td><form:select path="playerType" items="${map.typeList}" /></td>
					</tr>
					<tr><td colspan="2"></td></tr>
					<tr>
						<td>&nbsp;</td>
						<td><input type="submit" value="Register" /></td>
					</tr>
					<tr><td colspan="2"></td></tr>
					<tr>
						
						<td colspan="2">Already a member <a href="login">Login here!</a></td>
					</tr>
				</table>
			</form:form>
		</div>
	</center>
</body>
</html>