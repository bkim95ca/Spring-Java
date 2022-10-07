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
		<h1 class="primary-text">Edit Expense</h1>
		<a href="/expenses">Go Back</a>
	</div>
	<form:form action="/expenses/edit/${travels.id}" method="post" modelAttribute="travels">
		<input type="hidden" name="_method" value="put"/>
	    <div>
	        <form:label path="expenseName">Expense name:</form:label>
	        <form:errors path="expenseName" type="text"/>
	        <form:input path="expenseName"/>
	    </div>
	    <div>
	        <form:label path="vendor">Vendor</form:label>
	        <form:errors path="vendor" type="text"/>
	        <form:input path="vendor"/>
	    </div>
	    <div>
	        <form:label path="amount">Amount</form:label>
	        <form:errors path="amount" type="number"/>
	        <form:input path="amount"/>
	    </div>
	    <div>
	        <form:label path="description">Description</form:label>
	        <form:errors path="description" type="text"/>
	        <form:textarea path="description"/>
	    </div>    
	    <button type="submit">Submit</button>
	</form:form>  
</body>
</html>