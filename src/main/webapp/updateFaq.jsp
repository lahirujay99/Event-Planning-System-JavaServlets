<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="faqUpdate" method="post">

		<%
		String id = request.getParameter("id");
		String question = request.getParameter("question");
		String solution = request.getParameter("solution");
		%>
		<table>
			<tr>
				<td colspan="2"><input type="hidden" name="id" value="<%=id%>"></td>
			</tr>
			<tr>
				<td>Question</td>
				<td><input type="text" name="question" value="<%=question%>"></td>
			</tr>
			<tr>
				<td>Solution</td>
				<td><input type="text" name="solution" value="<%=solution%>"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" name="submit"
					value="update" /></td>
			</tr>
		</table>
	</form>

</body>
</html>