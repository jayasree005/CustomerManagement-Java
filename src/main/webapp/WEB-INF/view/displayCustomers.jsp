<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Management</title>
<link rel="stylesheet" type="text/css" href="/CustomerManagementSystem/urltoresoucefolder/Resources/css/displaycustomers_style.css">
</head>
<body>
<div class="heading"><h1><i>Rolling Customers</i></h1></div><br>

<form action="showAddCustomer">
  <div class="add"><input type="submit" value="ADD CUSTOMER" style="color:blue;background-color:yellow;border:3px solid darkblue"></div><br>
</form>

<div class="table">
<table border="1">
      <tr>
        <td>Customer ID</td>
         <td>Name</td>
          <td>Phone Number</td>
         <td>Number of Sarees</td>
          <td>Given Date</td>
           <td>Delivery Status</td>
           <td>Total amount </td>
           <td>Cover(type)</td>
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
       <td>${customer.getCover()}</td>
       <td><a href="/CustomerManagementSystem/showUpdateCustomer?userid=${customer.getCid()}">update</a></td>
       <td><a href="/CustomerManagementSystem/deleteCustomer?userid=${customer.getCid()}" onclick="if(!(confirm('ARE YOU SURE YOU WANT TO DELETE DATA')))return false">Delete</a></td>
     </tr>
  </c:forEach>
</table> 

</div> 
</body>
</html>