<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Omikuji Form</title>
</head>
<body>
	<h1>Send an Omikuji!</h1>
	<form action="/omikuji" method="post" class="form-control">
		<div>
			<p><c:out value="${numberError}"/></p>
			<label for="number">Pick any number from 5 to 25</label>
			<input type="number" name="number" />
		</div>
		<div>
			<p><c:out value="${cityError}"/></p>
			<label for="city">Enter the name of any city.</label>
			<input type="text" name="city" />
		</div>
		<div>
			<p><c:out value="${personError}"/></p>
			<label for="person">Enter the name of any real person</label>
			<input type="text" name="person" />
		</div>
		<div>
			<p><c:out value="${hobbyError}"/></p>
			<label for="hobby">Enter professional endeavor or hobby:</label>
			<input type="text" name="hobby" />
		</div>
		<div>
			<p><c:out value="${thingError}"/></p>
			<label for="thing">Enter any type of living thing.</label>
			<input type="text" name="thing" />
		</div>
		<div>
			<p><c:out value="${niceError}"/></p>
			<label for="nice">Say something nice to someone:</label>
			<textarea name="nice" id=""></textarea>
		</div>
		<p>Send and show a friend</p>
		<button type="submit">Send</button>
	</form>
</body>
</html>