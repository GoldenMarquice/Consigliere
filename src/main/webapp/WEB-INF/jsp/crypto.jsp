<%@page import="java.util.List"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crypto</title>
    <!-- Bootstrap core CSS -->   
    <!-- Custom styles for this template -->
     <link href="<c:url value="/resources/css/index.css" />" rel="stylesheet">
  </head>

<body>

<div class="links">
	<a  href="/">Consigliere</a>
	<a  href="/login">Login</a>
        <a  href="/sign-up">Sign-Up</a>
        <a  href="/collection">Collection</a>
        <a  href="/gainers">Gainers</a>
        <a  href="/losers">Dips</a>
        <a  href="/crypto">Coins</a>
</div>

<div class="welcome">
	<div class="welcome-text">
		<h1>Consigliere</h1>
		<h2> You Owe Your Don A Service. He Has No Doubt That You Will Repay Him.</h2>
	</div>
</div>
<c:forEach items="${cryptos}" var="crypto">

<style>
 {
  box-sizing: border-box;
}

.row {
  margin-left:-5px;
  margin-right:-5px;
}
  
.column {
  float: left;
  width: 50%;
  padding: 5px;
}

/* Clearfix (clear floats) */
.row::after {
  content: "";
  clear: both;
  display: table;
}

table {
  border-collapse: collapse;
  border-spacing: 0;
  width: 100%;
  border: 1px solid #ddd;
}

th, td {
  text-align: left;
  padding: 16px;
}

tr:nth-child(even) {
  background-color: #f2f2f2;
}
</style>
  <div class="column">
<table>
   <colgroup>
    <col span="7" style="background-color: #D6EEEE">
  </colgroup>
<tr>
<th>Symbol</th>
<th>Stock Name</th>
<th>Change</th>
<th>Price</th>
<th>Percentage Change</th>
<th>Year High</th>
<th>Year Low</th>
</tr>

<form:form method="get" action = "/cryptos" modelAttribute="finalconsigliere" >
<tr>
<td><button type="submit" class="btn btn-primary" >${crypto.symbol}</button></td>
<td>${crypto.name}</td>
<td>${crypto.change}</td>
<td>${crypto.price}</td>
<td>${crypto.changesPercentage}</td>
<td>${crypto.yearHigh}</td>
<td>${crypto.yearLow}</td>
</tr>
</form:form>

</table>


</div>
<br>
<br>
</c:forEach>



</body>
</html>