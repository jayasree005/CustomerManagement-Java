<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Management</title>
</head>
<body>
<h1><i>Rolling Customers</i></h1>
<form action="showAddCustomer">
  <input type="submit" value="ADD">
</form>
<table border="1">
      <tr>
        <td>Customer ID</td>
         <td>Name</td>
          <td>Phone Number</td>
         <td>Number of Sarees</td>
          <td>Given Date</td>
           <td>Delivery Status</td>
           <td>Total amount </td>
      </tr>
  <c:forEach var="customer" items="${customer}">
     <tr>
       <td>${customer.getCid()}</td>
       <td>${customer.getName()}</td>
       <td>${customer.getPhonenumber()}</td>
       <td>${customer.getNumberofsarees()}</td>
       <td>${customer.getGivendate()}</td>
       <td>${customer.getDeliverystatus()}</td>
       <td>${customer.getCost()}</td>
       <td><a href="/CustomerManagementSystem/showUpdateCustomer?userid=${customer.getCid()}">update</a>
       <td><a href="/CustomerManagementSystem/deleteCustomer?userid=${customer.getCid()}">Delete</a>
     </tr>
  </c:forEach>
</table>  
</body>
</html>