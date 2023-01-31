<%@page import="java.util.ArrayList"%>
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
	
	<link href='https://fonts.googleapis.com/css?family=Roboto:400,100,300,700' rel='stylesheet' type='text/css'>

	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
	
	<link rel="stylesheet" href="css/style.css">
	
	 
    <link rel="stylesheet" href="css/uikit.min.css" />
    <script src="js/uikit.min.js"></script>
    <script src="js/uikit-icons.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/js/all.min.js"></script>

<title>View Events</title>
</head>
<body>
	   <div class="uk-position-top">
        <nav class="uk-navbar-container uk-navbar-transparent" uk-navbar>
            <div class="uk-navbar-right" style="margin-right: 5%;">
                <ul class="uk-navbar-nav ">
                    <li><a href="homepage.jsp">Home</a></li>
                    <li><a href="eventPlanPage.jsp">Plan Event</a></li>
                    <li><a href="getEventData">View my events</a></li>
                    <li><a href="viewProfile">My Profile</a></li>
                    <li>
                        <a href="#">User</a>
                        <div class="uk-navbar-dropdown">
                            <ul class="uk-nav uk-navbar-dropdown-nav">
                                 <li><a href="register.jsp">Register</a></li>
                                <li><a href="login.jsp">Login</a></li>
                                <li class="uk-nav-divider"></li>
                                <li><a href="logout">Logout</a></li>
                            </ul>
                        </div>
                    </li>
                </ul>
            </div>
        </nav>
    </div>

	<section class="ftco-section">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-md-6 text-center mb-5">
					<h2 class="heading-section">Events</h2>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<h4 class="text-center mb-4">Edit or Delete Your events</h4>
					<div class="table-wrap">
						<table class="table">
					    <thead class="thead-primary">
					      <tr>
							<th scope="col">Event Type</th>
							<th scope="col">Number Of Guests</th>
							<th scope="col">Date</th>
							<th scope="col">Venue</th>
							<th scope="col">Special Message</th>
							<th scope="col" colspan="2"></th>
					      </tr>
					    </thead>

			<c:forEach var="event" items="${edetails }">


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
							<c:url value="updateEventForm.jsp" var="eUpdate">
								<c:param name="id" value="${id}" />
								<c:param name="etype" value="${etype}" />
								<c:param name="eguest" value="${eguest}" />
								<c:param name="edate" value="${edate}" />
								<c:param name="evenue" value="${evenue}" />
								<c:param name="emsg" value="${emsg}" />
								<c:param name="uid" value="${uid}" />
							</c:url>
							<td><a href="${eUpdate}"><input type="button"
									name="update" value="Edit" class="btn btn-primary btn--radius-2" /></a></td>
	
							<c:url value="deleteEvent.jsp" var="eDelete">
								<c:param name="id" value="${id}" />
								<c:param name="etype" value="${etype}" />
								<c:param name="eguest" value="${eguest}" />
								<c:param name="edate" value="${edate}" />
								<c:param name="evenue" value="${evenue}" />
								<c:param name="emsg" value="${emsg}" />
								<c:param name="uid" value="${uid}" />
							</c:url>
							<td><a href="${eDelete}"><input type="button"
									name="update" value="Delete"  class="btn btn-danger btn--radius-2"/></a></td>
					      </tr>
					     
					
					    
					    </tbody>
					    </c:forEach>
					  </table>
					</div>
				</div>
			</div>
		</div>
	</section>
	    <footer style="padding: 5%; background-color: rgb(237, 237, 237); color: black; text-align: left; font-size: larger;">
        <div class="contactInfo">
            <h3><b>Contact Info</b></h3>
            <p><i class="fa-solid fa-envelope icon"></i>Email : Emaxmple@gmail.com</p> 
            <p><i class="fa-solid fa-phone icon"></i>Phone : 077-1234567</p>
            <p><i class="fa-solid fa-location-dot icon"></i>Address : </p>
        </div>
    </footer>
	

</body>
</html>