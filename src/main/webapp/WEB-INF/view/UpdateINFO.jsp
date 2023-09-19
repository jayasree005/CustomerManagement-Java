<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UPDATE INFORMATION</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/CustomerManagementSystem/urltoresoucefolder/Resources/css/style.css">
</head>
<body>
<h2><i>UPDATE CUSTOMER INFORMATION</i></h2>
<div class="form-outer">
<div class="form">
    <form:form action="updateCustomer" method="post" modelAttribute="customer">
    <form:hidden path="cid"/>
       
       <div class="form-group">
     <label class="control-label col-sm-2 class="label">NAME:</label>
      <div class="col-sm-10">
        <form:input path="name" class="form-control" placeholder="Enter Name"/><br>
      </div>
      </div>
  
  
   <div class="form-group">
     <label class="control-label col-sm-2 "class="label">PHONE NUMBER :</label>
      <div class="col-sm-10">
        <form:input path="phonenumber" class="form-control" placeholder="Enter Phone Number"/><br>
      </div>
      </div>
      
      
       
   <div class="form-group">
     <label class="control-label col-sm-2" class="label">NUMBER OF SAREES :</label>
      <div class="col-sm-10">
        <form:input path="numberofsarees" class="form-control" placeholder="Enter Number of sarees"/><br>
      </div>
      </div>
    
    <div class="form-group">
     <label class="control-label col-sm-2" class="label">GIVEN DATE :</label>
      <div class="col-sm-10">
        <form:input path="givendate" class="form-control" placeholder="Enter Date"/><br>
      </div>
      </div>
    
    
    <div class="form-group">
     <label class="control-label col-sm-2" class="label">TOTAL AMOUNT :</label>
      <div class="col-sm-10">
        <form:input path="cost" class="form-control" placeholder="Enter Amount"/><br>
      </div>
      </div>
      
       <div class="form-group">
     <label class="control-label col-sm-2" class="label">DELIVERY STATUS :</label>
      <div class="col-sm-10">
        <form:input path="deliverystatus" class="form-control" placeholder="Delivery status"/><br>
      </div>
      </div>
      
       <div class="form-group">
     <label class="control-label col-sm-2" class="label">COVER :</label>
      <div class="col-sm-10">
        <form:input path="Cover" class="form-control" placeholder="Enter the type of cover"/><br>
      </div>
      </div>
    
    
     <div class="sub"><input type="submit" value="UPDATE" style="color:blue;background-color:yellow"></div>
      
    </form:form>
  </div>
  </div>
</body>
</html>