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
<title>Show one book</title>
</head>
<body>
	<div class="d-flex justify-content-between">
		<h1><c:out value="${book.title}"/></h1>
		<a href="/books">back to the shelves</a>
	</div>
	<h2><c:out value="${book.postedBy.userName}"/> read <c:out value="${book.title}"/> by <c:out value="${book.author}"/></h2>
	<p>Here are <c:out value="${book.postedBy.userName}"/>'s thoughts</p>
	<p><c:out value="${book.thoughts}"/></p>
	<c:if test="${book.postedBy.id==(user_id)}">
		<div class="d-flex gap-3">
		<a href="/books/edit/${book.id}" class="btn btn-primary">Edit</a>
		<form action="/books/delete/${book.id}" method="post">
			<input type="hidden" name="_method" value="delete" />
			<input type="submit" value="Delete" class="btn btn-danger" />
		</form>
		</div>
	</c:if>
</body>
</html>