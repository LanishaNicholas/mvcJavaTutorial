<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="user" method="post">
		<table>
			<tr>
				<th>User name : </th>
				<td>
					<input type="text" name="username" />
				</td>
			</tr>
			<tr>
				<th>User job : </th>
				<td>
					<input type="text" name="job" />
				</td>
			</tr>
			<tr>
				<th>Salary : </th>
				<td>
					<input type="text" name="salary" />
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="submit" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>