<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="/Security/update.html">
<div>
<h1>Edit EMPLOYEE</h1>
<table>
<tr>
<td>NAME:</td>
<td><input type="hidden" name="empid" value="${emp.empid}" ></td>
</tr>
<tr>
<td>NAME:</td>
<td><input type="text" name="name" value="${emp.name}"></td>
</tr>
<tr>
<td>ADDRESS</td>
<td><input type="text" name="address" value="${emp.address}"></td>
</tr>
<tr>
<td>CITY</td>
<td><input type="text" name="city" value="${emp.city}"></td>
</tr>
<tr>
<td>DESIGNATION</td>
<td><input type="text" name="designation" value="${emp.designation}"></td>
</tr>
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
<tr><td align="center"><input type="submit" value="Update" /></td></tr>
</table>

</div>
</form>
</body>
</html>