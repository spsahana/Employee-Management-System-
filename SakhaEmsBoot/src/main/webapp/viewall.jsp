<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
<th>Employee Id</th>
<th>Name</th>
<th>DOB</th>
<th>salary</th>
<th>generatedId</th>
</tr>
<c:forEach items="${getall}" var="emp">
<tr>
<td>${emp.empId}</td>
<td>${emp.empName}</td>
<td>${emp.dob}</td>
<td>${emp.salary}</td>
<td>${emp.generatedId}</td>
</tr>
</c:forEach>
</table><br><br>
<a href="index.jsp">Home</a>
</body>
</html>