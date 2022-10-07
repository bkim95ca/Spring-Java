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
<title>Insert title here</title>
</head>
<body>
	<div>
		<h1>Expense Details</h1>
		<a href="/expenses">Go Back</a>
	</div>
	<div>
		<h4>Expense Name: <c:out value="${oneExpense.expenseName}"/></h4>
		<h4>Description: <c:out value="${oneExpense.description}"/></h4>
		<h4>Vendor: <c:out value="${oneExpense.vendor}"/></h4>
		<h4>Amount Spent: <c:out value="${oneExpense.amount}"/></h4>
	</div>
</body>
</html>