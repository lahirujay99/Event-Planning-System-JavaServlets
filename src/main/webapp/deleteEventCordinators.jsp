<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="removeCordi" method="post">

<%

String id = request.getParameter("id");
String name = request.getParameter("name");
String email = request.getParameter("email");
String phone = request.getParameter("phone");
String uid = request.getParameter("uid");
String pswd = request.getParameter("pswd");

%>

    <table>
        <tr>
            <td colspan="2"><input type="hidden" name="id" value="<%=id%>"></td>
        </tr>
        <tr>
            <td>Name</td>
            <td><input type="text" name="name" value="<%=name%>" readonly ></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><input type="text" name="email" value="<%=email%>" readonly></td>
        </tr>
        <tr>
            <td>Phone</td> 
            <td><input type="text" name="phone" value="<%=phone%>" readonly></td>
        </tr>
        <tr>
            <td>Username</td>
            <td><input type="text" name="uid" value="<%=uid%>" readonly></td>
        </tr>
        <tr>
            <td colspan="2"><input type="hidden" name="pswd" value="<%=pswd%>" readonly></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" name="submit" value="Delete" />
            </td>
        </tr>
    </table>
</form>

</body>
</html>