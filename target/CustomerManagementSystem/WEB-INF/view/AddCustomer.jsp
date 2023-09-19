<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form:form action="addCustomer" method="Post" modelAttribute="customer">
    <label>NAME:</label>
    <form:input path="name"/><br><br>
    
    <label>PHONE NUMBER :</label>
    <form:input path="phonenumber"/><br><br>
    
    <label>NUMBER OF SAREES :</label>
    <form:input path="numberofsarees"/><br><br>
    
    <label>GIVEN DATE :</label>
    <form:input path="givendate"/><br><br>
    
    <label>TOTAL AMOUNT :</label>
    <form:input path="cost"/><br><br>
    
    <label>DELIVERY STATUS :</label>
    <form:input path="deliverystatus"/><br><br>
    
    <label>COVER :</label>
    <form:input path="Cover"/><br><br>
    
    <input type="submit">
  </form:form>
</body>
</html>