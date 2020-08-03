<!DOCTYPE html>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="com.fdmgroup.model.Property" %>
<%@ page import="com.fdmgroup.model.User" %>
<html>
<head>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>



<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<!-- <link rel="stylesheet" href="http://localhost:8080/Housing-WebApp/WEB-INF/views/style.css"> -->
<title>Canada Rental</title>

<style>
<%@include file="/WEB-INF/css/style.css"%>
select{text-align-last:center;}
.open-button {
  background-color: #555;
  color: white;
  padding: 5px 5px;
  border: none;
  cursor: pointer;
  opacity: 0.8;
 
  bottom: 10px;
  right: 10px;
  width: 50px;
}

/* The popup chat - hidden by default */
.chat-popup {
  display: none;
  position: fixed;
  bottom: 0;
  right: 15px;
  border: 3px solid #f1f1f1;
  z-index: 9;
}

/* Add styles to the form container */
.form-container {
  max-width: 300px;
  padding: 10px;
  background-color: white;
}

/* Full-width textarea */
.form-container textarea {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  border: none;
  background: #f1f1f1;
  resize: none;
  min-height: 200px;
}

/* When the textarea gets focus, do something */
.form-container textarea:focus {
  background-color: #ddd;
  outline: none;
}

/* Set a style for the submit/send button */
.form-container .btn {
  background-color: #4CAF50;
  color: white;
  padding: 16px 20px;
  border: none;
  cursor: pointer;
  width: 100%;
  margin-bottom:10px;
  opacity: 0.8;
}

/* Add a red background color to the cancel button */
.form-container .cancel {
  background-color: red;
}

/* Add some hover effects to buttons */
.form-container .btn:hover, .open-button:hover {
  opacity: 1;
}
</style>



</head>

<body>
	<header class="main-header">
		<div class="main-header-left">

			<div class="main-header-left-left">
				<img src="http://localhost:8080/Housing-WebApp/images/realtor.png"
					width="40px">
			</div>

			<div class="main-header-left-right">

				<p>
					<a id="a1" href="about" style="color: white;">About Us</a>
				</p>
			</div>


		</div>


		<div class="main-header-right">
			<div class="main-header-right-child">
				<h4>${user.firstName}</h4>
			</div>
			<div class="main-header-right-child">
				<nav class="inline-nav">
					<ul>
						<li><a href="Logout">Logout</a></li>
					</ul>
				</nav>
			</div>
		</div>


	</header>

	<section class="main-body">

		<div class="row">
			<div class="col">
				<label> Filter</label>

			</div>

			<div class="col">
				<div class="selectWrapper">
			
						<select class="selectBox" name="price">

							<option value="no">Price</option>
							<option value="a">$500-$1000</option>
							<option value="b">$1000-$1500</option>
							<option value="c">$1500-$2000</option>
							<option value="d">$2000-$2500</option>
							<option value="e">$2500-$3000</option>
							<option value="f">&gt;$3000</option>
						</select>
					
						
				
				</div>
			</div>

			<div class="col">
				<div class="selectWrapper">
					<select class="selectBox" form="form1" name="bedroom">
						<option value="no">Bedroom</option>
						<option value="one">0</option>
						<option value="two">1</option>
						<option value="three">2</option>
						<option value="more">3+</option>
					</select>
				</div>
			</div>

			<div class="col">
				<div class="selectWrapper">
					<select class="selectBox" form="form1" name="type">
						<option value="no">Type</option>
						<option value="house">House</option>
						<option value="apartment">Apartment</option>
						<option value="condo">Condo</option>
						<option value="room">Room</option>
					</select>
				</div>
			</div>

			<div class="col">
				<div class="selectWrapper">
					<select class="selectBox" form="form1" name="city">
						<option value="no">City</option>
						<option value="Toronto">Toronto</option>
						<option value="Vancouver">Vancouver</option>
						<option value="Montreal">Montreal</option>
						<option  value="Calgary">Calgary</option>
					</select>
				</div>
			</div>


			<div class="col">
				<button type="submit" name="search" class="btn btn-primary" form="form1">Search</button>
			</div>

		</div>

 <%! ArrayList<Property> posts=new ArrayList<Property>(); %>
				<%!  HashMap<Integer, ArrayList<String>> mymap= new  HashMap<Integer, ArrayList<String>>(); %>
				<%   posts=(ArrayList<Property>)request.getAttribute("posts"); int counter=0;  String ownuser="zx";%>
				<%   mymap=(HashMap<Integer, ArrayList<String>>)request.getAttribute("imageNames");%>
				<% for (Property property: posts){counter++;%>

					<% ArrayList<String> imagePaths=mymap.get(property.getPropertyId());%>

		<div class="row">
			<div class="main-col">
			<%if (counter==1) {%>
				<iframe
					src="https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d41653.80683393439!2d-123.12808619999998!3d49.2695199!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sen!2sca!4v1592930447675!5m2!1sen!2sca"
					width="400" height="300" frameborder="0" style="border: 0;"
					allowfullscreen="" aria-hidden="false" tabindex="0"></iframe>
					<%} %>
			</div>

			<div class="main-col">
<div>				
<div>
<img  src="http://localhost:8080/Housing-WebApp/images/im<%=counter%>.jpg" style=" width:100%">
<!-- <img class="mySlides" src="http://localhost:8080/Housing-WebApp/images/im1.jpg" style=" width:100%">			
 --> <!--  <div class="w3-content w3-display-container" id="contain">				
  <img class="mySlides" src="http://localhost:8080/Housing-WebApp/images/im1.jpg" style=" width:100%">
  <img class="mySlides" src="http://localhost:8080/Housing-WebApp/images/im2.jpg" style="width:100%">
  <img class="mySlides" src="http://localhost:8080/Housing-WebApp/images/im3.jpg" style="width:100%">
  <img class="mySlides" src="http://localhost:8080/Housing-WebApp/images/im4.jpg" style="width:100%">


  <button class="w3-button w3-black w3-display-left" onclick="plusDivs(-1)">&#10094;</button>
  <button class="w3-button w3-black w3-display-right" onclick="plusDivs(1)">&#10095;</button> -->
</div>	
			
			
					<div>
					<p> Address: <%=property.getAddress()%></p>
					<p> Bedrooms: <%=property.getBedroom()%></p>
					<p> Price: <%=property.getPrice()%></p>
					<button class="open-button" onclick="openForm()">Chat</button>
					
					</div>
					
	</div>
		<hr/>
					<%-- 	<% for (String item: imagePaths){ %>
						<%String currentPath="/Users/alireza_ensan/Documents/outputimages/"+item; %>
						<p> This is current path<%=currentPath%> </p>
							<img class="mySlides" src="<%=currentPath%>" style="width: 100%">
						 	<button class="w3-button w3-black w3-display-left" onclick="plusDivs(-1)">&#10094;</button>
  							<button class="w3-button w3-black w3-display-right" onclick="plusDivs(1)">&#10095;</button>
						<%} %> --%>
						
							</div>
			
				</div>
					
				
					<%} %>
				
				
	

	

	</section>





	<script>
		var slideIndex = 1;
		showDivs(slideIndex);

		function plusDivs(n) {
			showDivs(slideIndex += n);
		}

		function showDivs(n) {
			var i;
			var x = document.getElementsByClassName("mySlides");
			if (n > x.length) {
				slideIndex = 1
			}
			if (n < 1) {
				slideIndex = x.length
			}
			for (i = 0; i < x.length; i++) {
				x[i].style.display = "none";
			}
			x[slideIndex - 1].style.display = "block";
		}
	</script>

	<hr />

	<p style="font-size: 0.6em;">Copyright @ 2020 canadarent.ca, Inc.
		All rights reserved.</p>
		<form action="filter" method="post" id="form1">	</form>
		
		<div class="chat-popup" id="myForm">
 
 				 <% User u=(User)session.getAttribute("user");
 				HttpSession se=request.getSession();
 				se.setAttribute("userOwner", ownuser);
 				 %>

   <form action="email" class="form-container" method="post">
    <h1>Chat</h1>

    <label for="msg"><b>Message</b></label>
    <textarea placeholder="Type message.." name="msg" required></textarea>

    <button type="submit" class="btn">Send</button>
    <button type="button" class="btn cancel" onclick="closeForm()">Close</button>
  </form>
</div>

<script>
function openForm() {
  document.getElementById("myForm").style.display = "block";
}

function closeForm() {
  document.getElementById("myForm").style.display = "none";
}
</script>
		
</body>



</html>