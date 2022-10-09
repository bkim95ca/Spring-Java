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
	<form:form action="/ninjas/new" method="post" modelAttribute="ninja">
		<form:select path="dojo">
	    	<c:forEach var="dojo" items="${allDojos}">
	    		<form:option value="${dojo.id}" path="dojo"> 
	    			<c:out value="${dojo.name}"/>
	    		</form:option>
	    	</c:forEach>
	    </form:select>
	    <div>
	        <form:label path="firstName">First Name: </form:label>
	        <form:errors path="firstName" type="text"/>
	        <form:input path="firstName"/>
	    </div>
	    <div>
	        <form:label path="lastName">Last Name: </form:label>
	        <form:errors path="lastName" type="text"/>
	        <form:input path="lastName"/>
	    </div>
		<div>
	        <form:label path="age">Age: </form:label>
	        <form:errors path="age" type="number"/>
	        <form:input path="age"/>
	    </div>
	    <button type="submit">Create Ninja</button>
	</form:form>  
</body>
</html>