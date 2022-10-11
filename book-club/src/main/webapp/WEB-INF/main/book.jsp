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
<title>Page of Books</title>
</head>
<body>
	<div class="d-flex justify-content-between">
		<h1>Welcome <c:out value="${loggedInUser.userName}"/></h1>
		<a href="/logout" class="btn btn-outline-danger btn-warning">Logout</a>
	</div>
	<div class="d-flex justify-content-between">
		<p>Books from everyone's shelves: </p>
		<a href="/books/new" class="btn btn-primary">+ Add a book to my shelf!</a>
	</div>
	<table class="table table-dark">
		<thead>
			<tr>
				<th scope="col">id</th>
				<th scope="col">Title</th>
				<th scope="col">Author Name</th>
				<th scope="col">Posted By</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="book" items="${allBooks}" >
				<tr>
					<td>${book.id}</td>
					<td><a href="/books/${book.id}">${book.title}</a></td>
					<td>${book.author}</td>
					<td>${book.postedBy.userName}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>