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
	<h1>Save Travels</h1>
	<table class="table">
		<thead>
			<tr>
				<th>Expense</th>
				<th>Vendor</th>
				<th>Amount</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="travels" items="${allTravels}">
				<tr>
					<td><a href="/expenses/${travels.id}"><c:out value="${travels.expenseName}"/></a></td>
					<td><c:out value="${travels.vendor}"/></td>
					<td><c:out value="${travels.amount}"/></td>
					<td class="d-flex">
						<a class="btn btn-primary" href="/expenses/edit/${travels.id}">Edit</a>
						<form action="/expenses/delete/${travels.id}" method="post">
							<input type="hidden" name="_method" value="delete" />
							<input class="btn btn-danger" type="submit" value="Delete" />
						</form>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<form:form action="/expenses" method="post" modelAttribute="travels">
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