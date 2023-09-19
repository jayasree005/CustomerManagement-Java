<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UPDATE INFORMATION</title>
</head>
<body>
    <form:form action="updateCustomer" method="post" modelAttribute="customer">
    <form:hidden path="cid"/>
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
    
    
     <input type="submit" value="UPDATE">
      
    </form:form>
</body>
</html>