<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
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
		<h2> I have a special practice I handle one client</h2>
	</div>
</div>
<form:form method="post" action="/login" modelAttribute="consigliere">
                  <div class="form-group">
                     <label>User Name</label>
                     <form:input path="username" type="text" class="form-control" placeholder="User Name" />
                  </div>
                  <div class="form-group">
                     <label>Password</label>
                     <form:input path="password" type="password" class="form-control" placeholder="Password" />
                  </div>
                  <button type="submit" class="btn btn-black">Login</button>
                  <button type="submit" class="btn btn-secondary">Register</button>
               </form:form>
</body>
</html>