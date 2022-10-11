<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>  
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Login and Register</title>
</head>
<body>
	<div class="container d-flex">
		<div class="row">
		<h1 class="text-info">Book Club</h1>
		<p>A place for friends to share thoughts on books</p>
			<div class="col d-flex justify-content-between">
				<div>
				<h1>Register</h1>
				<form:form action="/register" method="post" modelAttribute="newUser">
					<div class="form-group">
						<label>User Name</label>
						<form:input path="userName" class="form-control"/>
						<form:errors path="userName" class="text-danger"/>
					</div>
					<div class="form-group">
						<label>Email</label>
						<form:input path="email" class="form-control"/>
						<form:errors path="email" class="text-danger"/>
					</div>
					<div class="form-group">
						<label>Password</label>
						<form:input type="password" path="password" class="form-control"/>
						<form:errors path="password" class="text-danger"/>
					</div>
					<div class="form-group">
						<label>Confirm Password</label>
						<form:input path="confirmPassword" class="form-control"/>
						<form:errors path="confirmPassword" class="text-danger"/>
					</div>
					<input type="submit" value="Register User" class="btn btn-primary" />
				</form:form>
				</div>
				<div>
				<h1>Log in</h1>
				<form:form action="/login" method="post" modelAttribute="loginUser">
					<div class="form-group">
						<label>Email</label>
						<form:input path="email" class="form-control"/>
						<form:errors path="email" class="text-danger"/>
					</div>
					<div class="form-group">
						<label>Password</label>
						<form:input path="password" class="form-control"/>
						<form:errors path="password" class="text-danger"/>
					</div>
					<input type="submit" value="Login" class="btn btn-primary" />
				</form:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>