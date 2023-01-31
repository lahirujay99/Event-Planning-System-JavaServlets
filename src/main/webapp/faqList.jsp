<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="insertFaq" method="post">

		<table>
			<tr>
				<td><label for="story">Question:</label></td>

				<td><textarea name="question" rows="5" cols="33"></textarea></td>

			</tr>
			<tr>
				<td><label for="story">Solution:</label></td>

				<td><textarea name="solution" rows="5" cols="33"></textarea></td>

			</tr>
			<tr>
				<td colspan="2"><input type="submit" name="submit"
					value="submit"></td>
			</tr>

		</table>
	</form>


</body>
</html>