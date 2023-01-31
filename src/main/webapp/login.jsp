<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
    <form action="log" method="post">
        <table  >
            <tr>
                <td>UserName</td>
                <td><input type="text" name="uname" required></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="pswd" required></td>
            </tr>
            <tr>
                <td colspan="2">
                <input type="submit" name="submit" value="Login" />
            </tr>
            <tr>
                <td colspan="2">
                <a href="register.jsp" >Register</a>
            </tr>
        </table>
    </form>  
</body>
</html>