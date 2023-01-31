<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<!-- Required meta tags-->
<meta charset="ISO-8859-1">

<!-- Title Page-->
<title>Event Plan</title>

<!-- Icons font CSS-->
<link href="vendor/mdi-font/css/material-design-iconic-font.min.css"
	rel="stylesheet" media="all">
<link href="vendor/font-awesome-4.7/css/font-awesome.min.css"
	rel="stylesheet" media="all">
<!-- Font special for pages-->
<link
	href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Vendor CSS-->
<link href="vendor/select2/select2.min.css" rel="stylesheet" media="all">
<link href="vendor/datepicker/daterangepicker.css" rel="stylesheet"
	media="all">

<!-- Main CSS-->
<link href="css/main.css" rel="stylesheet" media="all">

<link rel="stylesheet" href="style.css">
<link rel="stylesheet" href="css/uikit.min.css" />



<script src="js/uikit.min.js"></script>
<script src="js/uikit-icons.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/js/all.min.js"></script>

</head>

<body>
	<!-- Nav Bar -->
	<div class="uk-position-top">
		<nav class="uk-navbar-container uk-navbar-transparent" uk-navbar>
			<div class="uk-navbar-right" style="margin-right: 5%;">
				<ul class="uk-navbar-nav ">
					<li><a href="homepage.jsp">Home</a></li>
					<li><a href="eventPlanPage.jsp">Plan Event</a></li>
					<li><a href="getEventData">View my events</a></li>
					<li><a href="viewProfile">My Profile</a></li>
					<li><a href="#">User</a>
						<div class="uk-navbar-dropdown">
							<ul class="uk-nav uk-navbar-dropdown-nav">
								<li><a href="register.jsp">Register</a></li>
								<li><a href="login.jsp">Login</a></li>
								<li class="uk-nav-divider"></li>
								<li><a href="logout">Logout</a></li>
							</ul>
						</div></li>
				</ul>
			</div>
		</nav>
	</div>


	<div class="page-wrapper bg-gra-02 p-t-130 p-b-100 font-poppins">
		<div class="wrapper wrapper--w680">
			<div class="card card-4">
				<div class="card-body">
					<h2 class="title">Registration Form</h2>
					<form action="eform" method="post">
						<div class="row row-space">
							<div class="col-2">
								<div class="input-group">
									<label class="label">Event Type</label> <input
										class="input--style-4" type="text" name="etype"required">
								</div>
							</div>
							<div class="col-2">
								<div class="input-group">
									<label class="label">Number of Guests</label> <input
										class="input--style-4" type="text" name="nguest" id=""required">
								</div>
							</div>
						</div>
						<div class="row row-space">
							<div class="col-2">
								<div class="input-group">
									<label class="label">Date</label>
									<div class="input-group-icon">
										<input class="input--style-4 js-datepicker" type="date"
											name="edate" min="2022-11-13" required> <i
											class="zmdi zmdi-calendar-note input-icon js-btn-calendar"></i>
									</div>
								</div>
							</div>
						</div>
						<div class="row row-space">
							<div class="col-2">
								<div class="input-group">
									<label class="label">Venue</label> <input
										class="input--style-4" type="text" name="evenue" id=""
										required>
								</div>
							</div>
						</div>

						<div class="row row-space">
							<div class="col-2">
								<div class="input-group">
									<label class="label">Tell us your Special Message:</label>
									<textarea class="input--style-4" name="smsg" rows="5" cols="50"></textarea>
								</div>
							</div>
						</div>

						<div class="p-t-15">
							<button class="btn btn--radius-2 btn--blue" type="submit">Submit</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<footer
		style="padding: 5%; background-color: rgb(237, 237, 237); color: black; text-align: left; font-size: larger;">
		<div class="contactInfo">
			<h3>
				<b>Contact Info</b>
			</h3>
			<p>
				<i class="fa-solid fa-envelope icon"></i>Email : Emaxmple@gmail.com
			</p>
			<p>
				<i class="fa-solid fa-phone icon"></i>Phone : 077-1234567
			</p>
			<p>
				<i class="fa-solid fa-location-dot icon"></i>Address :
			</p>
		</div>
	</footer>
	<!-- Jquery JS-->
	<script src="vendor/jquery/jquery.min.js"></script>
	<!-- Vendor JS-->
	<script src="vendor/select2/select2.min.js"></script>
	<script src="vendor/datepicker/moment.min.js"></script>
	<script src="vendor/datepicker/daterangepicker.js"></script>

	<!-- Main JS-->
	<script src="js/global.js"></script>

</body>

</html>
<!-- end document-->