<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<title>MOBIKWIK | BHARAT VERMA | RUMMY GAME | LOGIN PLAYER</title>
<spring:url value="/resources/static/public/main.css" var="maincss" />
<link href="${maincss}" rel="stylesheet" />
</head>
<body>
	<center>
		<br /> <br /> <br /> <b>Mobikwik Rummy Game | Player Login </b> <br />
		<br />
		<div>
		<span><font class="error-msg">${message}</font></span>
			<form:form method="post" action="/login"  modelAttribute="loginBean">
				<table>
					<tr>
						<td>Email :</td>
						<td><form:input id="username" name="username" path="" /></td>
					</tr>
					<tr>
						<td>Password :</td>
						<td><form:password id="password" name="password" path="" /></td>
					</tr>					
					<tr><td colspan="2"></td></tr>
					<tr>
						<td>&nbsp;</td>
						<td><input type="submit" value="Login" /></td>
					</tr>
					<tr><td colspan="2"></td></tr>
					<tr><td colspan="2">New User Click Here to <a href="register">Sign Up </a><td></tr>
				</table>
			</form:form>
		</div>
	</center>
</body>
</html>