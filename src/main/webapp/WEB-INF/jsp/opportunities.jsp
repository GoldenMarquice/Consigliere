<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Opportunities</title>
    <!-- Bootstrap core CSS -->   
    <!-- Custom styles for this template -->
   
     <link href="<c:url value="/resources/css/index.css" />" rel="stylesheet">
  </head>

</head>
<body>
<div class="links">
	<a  href="/">Consigliere</a>
	<a  href="/login">Login</a>
        <a  href="/sign-up">Sign-Up</a>
        <a  href="/collection">Collection</a>
        <a  href="/gainers">Gainers</a>
        <a  href="/losers"> Dips</a>
        <a  href="/crypto">Crypto</a>
</div>
<div class="welcome">
	<div class="welcome-text">
		<h1>Consigliere</h1>
		<h2> I Didnt Tell mama Anything</h2>
	</div>
</div>
  <form name = "f1">
        <input type = "radio" name = "r1" value = "On" onclick="GetSelectedItem(this)">On
        <input type = "radio" name = "r1" value = "Off" onclick ="GetSelectedItem(stockgains)">Off
    </form>
               return stockGains
</body>
</html>