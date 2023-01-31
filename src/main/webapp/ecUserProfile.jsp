<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<title>User-Profile</title>
</head>
<body>
	<div class="container">
		<table class="table table-hover table-bordered border-dark">
			<thead>
				<tr>
					<th scope="col">User Name</th>
					<th scope="col">Email</th>
					<th scope="col">Contact No</th>
					<th scope="col">UserName</th>
					<th scope="col"></th>


				</tr>
			</thead>

			<c:forEach var="user" items="${userData }">

				<c:set var="id" value="${user.id}" />
				<c:set var="name" value="${user.name}" />
				<c:set var="email" value="${user.email}" />
				<c:set var="phone" value="${user.phone}" />
				<c:set var="username" value="${user.username}" />
				<c:set var="password" value="${user.password}" />


				<tbody>
					<tr>
						<td>${user.name}</td>
						<td>${user.email}</td>
						<td>${user.phone}</td>
						<td>${user.username}</td>

						<c:url value="updateUserProfile.jsp" var="eUpdate">
							<c:param name="id" value="${id}" />
							<c:param name="name" value="${name}" />
							<c:param name="email" value="${email}" />
							<c:param name="phone" value="${phone}" />
							<c:param name="usn" value="${username}" />
							<c:param name="pswd" value="${password}" />
						</c:url>
						<td><a href="${eUpdate}"><input type="button"
								name="update" value="Update" /></a></td>

					</tr>

				</tbody>


			</c:forEach>
		</table>
	</div>

</body>
</html>