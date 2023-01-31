<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="addNewCordinator" method="POST">
<table>
    <tr>
        <td>Name</td>
        <td><input type="text" name="name" required></td>
    </tr>
    <tr>
        <td>Email</td>
        <td><input type="text" name="email" required></td>
    </tr>
    <tr>
        <td>Phone</td>
        <td><input type="text" name="phone" required></td>
    </tr>
    <tr>
        <td>User Name</td>
        <td><input type="text" name="uid" required></td>
    </tr>
    <tr>
        <td>Password</td>
        <td><input type="password" name="pwd" required></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" name="submit" value="Register">
        </td>
    </tr>
</table>
</form>

</body>
</html>