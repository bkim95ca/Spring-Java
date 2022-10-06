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
<title>Show one book</title>
</head>
<body>
	<h1><c:out value="${oneBook.bookTitle}"/></h1>
	<h4>Language: <c:out value="${oneBook.language}"/></h4>
	<h4>Number of Pages: <c:out value="${oneBook.pages}"/></h4>
</body>
</html>