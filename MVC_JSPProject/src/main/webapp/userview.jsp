<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>User ID</th>
			<th>User name</th>
			<th>Job</th>
			<th>salary</th>
			<th>Action</th>
		</tr>
		<c:forEach var="data" items="${viewdata }" >
			<tr>
				<td>${data.uid }</td>
				<td>${data.username }</td>
				<td>${data.job }</td>
				<td>${data.salary }</td>
				<td>
					<a href="edit?uid=${data.uid }">Edit</a>
					<a href="delete?uid=${data.uid }">Delete</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>