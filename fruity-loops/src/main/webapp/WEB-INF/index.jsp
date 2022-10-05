<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 class="text-primary">Fruit Store</h1>
	<table class="table-primary">
	<thead>
		<tr>
			<th>Name</th>
			<th>Price</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="oneFruit" items="${fruits}">
			<tr>
				<td><c:out value="${oneFruit.name}"/></td>
				<td><c:out value="${oneFruit.price}"/></td>
			</tr>
		</c:forEach>
	</tbody>
	</table>
</body>
</html>