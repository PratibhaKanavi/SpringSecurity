<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ak.html">
<h1>HIII</h1>
<div>
<h1>Edit EMPLOYEE</h1>
<table>
<tr>
<td>NAME:</td>
<td><input type="text" name="name" value="${emp.name}"></td>
</tr>
<tr>
<tr>
<td>CITY</td>
<td><input type="text" name="city" value="${emp.city}"></td>
</tr>
<tr>
<tr>
<td>DOB</td>
<td><input type="text" name="dob" value="${emp.dob}"></td>
</tr>
<tr>
<td>EMAIL</td>
<td><input type="text" name="email" value="${emp.email}"></td>
</tr>
<tr>
<td>PHONE</td>
<td><input type="text" name="phone" value="${emp.phone}"></td>
</tr>
<tr><td align="center"><input type="submit" value="Submit"/></td></tr>
</table>
</div>
</form>
</body>
</html>