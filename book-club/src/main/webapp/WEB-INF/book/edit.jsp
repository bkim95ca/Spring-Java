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
<title>Insert title here</title>
</head>
<body>
	<div class="d-flex justify-content-between">
		<h1>Change your entry</h1>
		<a href="/books">back to the shelves</a>
	</div>
		<form:form action="/books/edit/${book.id}" method="post" modelAttribute="book">
			<input type="hidden" name="_method" value="put" />
			<form:input type="hidden" path="postedBy" value="${book.postedBy.id}"/>
			<div class="form-group">
				<form:label path="title">Title</form:label>
				<form:input path="title" class="form-control"/>
				<form:errors path="title" class="text-danger"/>
			</div>
			<div class="form-group">
				<form:label path="author">Author</form:label>
				<form:input path="author" class="form-control"/>
				<form:errors path="author" class="text-danger"/>
			</div>
			<div class="form-group">
				<form:label path="thoughts">My Thoughts</form:label>
				<form:textarea path="thoughts" class="form-control"/>
				<form:errors path="thoughts" class="text-danger"/>
			</div>
			<input type="submit" value="Submit" class="btn btn-primary" />
		</form:form>
</body>
</html>