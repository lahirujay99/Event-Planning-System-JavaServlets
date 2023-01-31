<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="css/uikit.min.css" />
    <script src="js/uikit.min.js"></script>
    <script src="js/uikit-icons.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/js/all.min.js"></script>
    <title>Home</title>
</head>
<body>
    <%
    response.setHeader("Cache-Control","no-cache");
    if(session.getAttribute("username")==null){
        response.sendRedirect("login.jsp");
    }
    
    %>
    
    <div class="uk-cover-container">
        <canvas width="400" height="725"></canvas>
        <img src="images/03.jpg" alt="" uk-cover>
    </div>

    <div class="uk-overlay-primary uk-position-cover"></div>
    
        <div style="font-family:'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;">
            <div class="uk-position-center uk-position-small uk-text-center ">
                <h2 class="uk-text-bolder " uk-slideshow-parallax="x: 100,-100" style="color:rgb(189, 215, 215);">A Professional Wedding & Event Planner in Sri Lanka</h2>
            </div>
        </div>

        <!-- Nav Bar -->
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


    <div style="padding: 5%; background-color: rgb(237, 237, 237); color: black; text-align: center; font-size: larger;">
        <P>
            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Cumque ipsam labore quas asperiores officia aliquam adipisci neque quibusdam, accusamus impedit illo libero, harum dolor illum vel eius et nihil consectetur minus eligendi unde magni incidunt. Libero, delectus iusto quo vero debitis, doloribus ex aliquid, voluptates nam obcaecati fugiat accusantium reiciendis exercitationem. Quidem 
        </P>
    </div>

    

    <!-- Events that we have done -->

    <div style="margin:3%;">
        <div class="uk-slider-container-offset" uk-slider>

            <div class="uk-position-relative uk-visible-toggle uk-light" tabindex="-1">
        
                <ul class="uk-slider-items uk-child-width-1-4@s uk-grid">
                    <li>
                        <div class="uk-card uk-card-default">
                            <div class="uk-card-media-top">
                                <img src="images/01.jpg" width="1800" height="1200" alt="">
                            </div>
                            <div class="uk-card-body">
                                <h3 class="uk-card-title">Concert</h3>
                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt.</p>
                            </div>
                        </div>
                    </li>
                    <li>
                        <div class="uk-card uk-card-default">
                            <div class="uk-card-media-top">
                                <img src="images/02.jpg" width="1800" height="1200" alt="">
                            </div>
                            <div class="uk-card-body">
                                <h3 class="uk-card-title">Wedding</h3>
                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt.</p>
                            </div>
                        </div>
                    </li>
                    <li>
                        <div class="uk-card uk-card-default">
                            <div class="uk-card-media-top">
                                <img src="images/03.jpg" width="1800" height="1200" alt="">
                            </div>
                            <div class="uk-card-body">
                                <h3 class="uk-card-title">Bussiness</h3>
                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt.</p>
                            </div>
                        </div>
                    </li>
                    <li>
                        <div class="uk-card uk-card-default">
                            <div class="uk-card-media-top">
                                <img src="images/04.jpg" width="1800" height="1200" alt="">
                            </div>
                            <div class="uk-card-body">
                                <h3 class="uk-card-title">Party</h3>
                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt.</p>
                            </div>
                        </div>
                    </li>
                    <li>
                        <div class="uk-card uk-card-default">
                            <div class="uk-card-media-top">
                                <img src="images/05.jpg" width="1800" height="1200" alt="">
                            </div>
                            <div class="uk-card-body">
                                <h3 class="uk-card-title">Other</h3>
                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt.</p>
                            </div>
                        </div>
                    </li>
                </ul>
        
                <a class="uk-position-center-left uk-position-small uk-hidden-hover" href="#" uk-slidenav-previous uk-slider-item="previous"></a>
                <a class="uk-position-center-right uk-position-small uk-hidden-hover" href="#" uk-slidenav-next uk-slider-item="next"></a>
        
            </div>
        
            <ul class="uk-slider-nav uk-dotnav uk-flex-center uk-margin"></ul>
        
        </div>
    </div>

    <!-- Footer -->
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