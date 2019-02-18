<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employees List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Address</th><th>City</th><th>Designation</th><th>DOB</th><th>EMAIL</th><th>PHONE</th>
<th>Edit</th><th>Delete</th></tr>  
   <c:forEach var="emp" items="${list}">   
   <tr>  
   <td>${emp.empid}</td>  
   <td>${emp.name}</td>  
   <td>${emp.address}</td>  
   <td>${emp.city}</td>  
    <td>${emp.designation}</td>  
   <td>${emp.dob}</td>  
  <td>${emp.email}</td> 
  <td>${emp.phone}</td> 
   <td><a href="editemp/${emp.empid}">Edit</a></td>  
   <td><a href="deleteemp/${emp.empid}">Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="#.html">Add New Employee</a>  
</body>
</html>