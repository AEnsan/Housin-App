<!DOCTYPE html>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="com.fdmgroup.model.Property" %>
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

		 <%! ArrayList<Property> posts=new ArrayList<Property>(); int counter=0;%>
				<%!  HashMap<Integer, ArrayList<String>> mymap= new  HashMap<Integer, ArrayList<String>>(); %>
				<%   posts=(ArrayList<Property>)request.getAttribute("posts"); %>
				<%   mymap=(HashMap<Integer, ArrayList<String>>)request.getAttribute("imageNames");%>
						
					<% for (Property property: posts){ counter++;%>

					<% ArrayList<String> imagePaths=mymap.get(property.getPropertyId());%>

		<div class="row">
			<div class="main-col">
				<iframe
					src="https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d41653.80683393439!2d-123.12808619999998!3d49.2695199!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sen!2sca!4v1592930447675!5m2!1sen!2sca"
					width="400" height="300" frameborder="0" style="border: 0;"
					allowfullscreen="" aria-hidden="false" tabindex="0"></iframe>
			</div>

			<div class="main-col">

		
			
		
	<div>				
<div>
<p>This is image <%=property.getPropertyId() %></p>
<img class="mySlides" src="http://localhost:8080/Housing-WebApp/images/im1.jpg" style=" width:100%">			
 <!--  <div class="w3-content w3-display-container" id="contain">				
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
						
					
				
					<%} %>
				
						</div>
			
				</div>

	

	

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
</body>



</html>