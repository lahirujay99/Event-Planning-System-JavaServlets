<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<title>Insert title here</title>
</head>
<body>

<div class="container">
		<table class="table table-hover table-bordered border-dark">
			<thead>
				<tr>
					<th scope="col">Event Type</th>
					<th scope="col">Number Of Guests</th>
					<th scope="col">Date</th>
					<th scope="col">Venue</th>
					<th scope="col">Special Message</th>
					<th scope="col">UserName</th>
					<!-- <th scope="col" colspan="2"></th> -->

				</tr>
			</thead>
			<c:forEach var="event" items="${acceptedEventList }">


				<c:set var="id" value="${event.id}" />
				<c:set var="etype" value="${event.eventType}" />
				<c:set var="eguest" value="${event.eventGuest}" />
				<c:set var="edate" value="${event.eventDate}" />
				<c:set var="evenue" value="${event.eventVenue}" />
				<c:set var="emsg" value="${event.eventMessage}" />
				<c:set var="uid" value="${event.username}" />

				<tbody>
					<tr>
						<td>${event.eventType}</td>
						<td>${event.eventGuest}</td>
						<td>${event.eventDate}</td>
						<td>${event.eventVenue}</td>
						<td>${event.eventMessage}</td>
						<td>${event.username}</td>


						 <%-- <c:url value="setEventBudget.jsp" var="budget">
							<c:param name="id" value="${id}" />
							<c:param name="etype" value="${etype}" />
							<c:param name="eguest" value="${eguest}" />
							<c:param name="edate" value="${edate}" />
							<c:param name="evenue" value="${evenue}" />
							<c:param name="emsg" value="${emsg}" />
							<c:param name="uid" value="${uid}" />
						</c:url>
						<td><a href="${budget}"><input type="button"
								name="update" value="Set Budget" /></a></td> --%>

						<%-- <c:url value="deleteEvent.jsp" var="eDelete">
							<c:param name="id" value="${id}" />
							<c:param name="etype" value="${etype}" />
							<c:param name="eguest" value="${eguest}" />
							<c:param name="edate" value="${edate}" />
							<c:param name="evenue" value="${evenue}" />
							<c:param name="emsg" value="${emsg}" />
							<c:param name="uid" value="${uid}" />
						</c:url>
						<td><a href="${eDelete}"><input type="button"
								name="update" value="Delete" /></a></td>  --%>
					</tr>

				</tbody>

			</c:forEach>
		</table>
	</div>

</body>
</html>