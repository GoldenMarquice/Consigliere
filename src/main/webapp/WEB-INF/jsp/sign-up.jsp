<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUp</title>
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
		<h2> Never Asks A Second Favor Once Refused The First</h2>
	</div>
</div>

  <main role="main" class="inner cover">
     
     
<form:form method="post" action = "/sign-up" modelAttribute="consigliere" >
 <div class="form-group col-md-6">
      <label for="inputEmail">Email</label>
      <form:input path="email" type="text" class="form-control" id="inputEmail"/>
    </div>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputFirstName">First Name</label>
      <form:input path="firstName" type="text" class="form-control" id="inputFirstName"/>
    </div>
    <div class="form-group col-md-6">
      <label for="inputLastName">Last Name</label>
      <form:input path="lastName" type="text" class="form-control" id="inputLastName"/>
    </div>
  </div>
    <div class="form-row">
    <div class="form-group col-md-6">
      <label for="age">age</label>
      <form:input path="age" class="form-control"/>
    </div>
  </div>
  <div class="form-group">
    <label for="inputAddress">Street</label>
    <form:input path="street" type="text" class="form-control" id="inputAddress" placeholder="1234 Main St"/>
  </div>

    <div class="form-group col-md-6">
      <label for="inputCity">City</label>
      <form:input path="city" type="text" class="form-control" id="inputCity"/>
    </div>
    <div class="form-group col-md-4">
      <label for="inputState">State</label>
      <form:select path="state" id="inputState" class="form-control">
        <option selected>Choose...</option>
        <option value="UT">UT</option>
        <option value="MO">MO</option>
      </form:select>
    </div>
    <div class="form-group col-md-2">
      <label for="inputZipcode">Zipcode</label>
      
      <form:input path="zipcode" type="text" class="form-control" id="inputZipcode"/>   
    </div>
    <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputUsername4">Username</label>
      <form:input path="username" type="username" class="form-control" id="inputusername4"/>
    </div>
    <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputPassword4">Password</label>
      <form:input path="password" type="password" class="form-control" id="inputPassword4"/>
    </div>
  </div>
  <div class="form-group">
    <div class="form-check">
      <input class="form-check-input" type="checkbox" id="gridCheck"/>
    
      <label class="form-check-label" for="gridCheck">
        Check me out
      </label>
    </div>
  </div>
  <button type="submit" class="btn btn-primary">Sign up</button>
  </div>
</form:form>


  </main>


</body>

</html>
