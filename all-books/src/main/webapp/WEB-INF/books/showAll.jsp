<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Show all books</title>
</head>
<body>
	<h1>All books</h1>
	<table class="table">
		<thead>
			<tr>
				<th>ID</th>
				<th>Title</th>
				<th>Language</th>
				<th>Pages</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="book" items="${allBooks}">
				<tr>
					<td><a href="/books/${book.id}"><c:out value="${book.id}"/></a></td>
					<td><c:out value="${book.bookTitle}"/></td>
					<td><c:out value="${book.language}"/></td>
					<td><c:out value="${book.pages}"/></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>