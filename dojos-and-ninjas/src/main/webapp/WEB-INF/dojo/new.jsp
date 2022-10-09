<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="/dojos/new" method="post" modelAttribute="dojo">
	    <div>
	        <form:label path="name">Name: </form:label>
	        <form:errors path="name" type="text"/>
	        <form:input path="name"/>
	    </div>
	    <input type="submit" value="Create Dojo"/>
	</form:form>  
</body>
</html>