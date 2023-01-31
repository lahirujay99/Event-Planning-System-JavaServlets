<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form action="updateECProfile" method="post">

		<%
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String usn = request.getParameter("usn");
		String pswd = request.getParameter("pswd");
		%>

		<table>
			<tr>
				<td colspan="2"><input type="hidden" name="id" value="<%=id%>"></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" value="<%=name%>"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email" value="<%=email%>"
					></td>
			</tr>
			<tr>
				<td>phone</td>
				<td><input type="text" name="phone" value="<%=phone%>"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="hidden" name="usn" value="<%=usn%>"
					readonly></td>
			</tr>
			<tr>
				<td colspan="2"><input type="hidden" name="pswd" value="<%=pswd%>" readonly></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" name="submit"
					value="Update" /></td>
			</tr>
		</table>
	</form>


</body>
</html>