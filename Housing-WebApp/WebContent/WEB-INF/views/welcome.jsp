<html>
<head>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<!-- <link rel="stylesheet" href="http://localhost:8080/Housing-WebApp/WEB-INF/views/style.css"> -->
<title> Canada Rental</title>

<style><%@include file="/WEB-INF/css/style.css"%></style>

</head>

<body>
<header class="main-header">
<div class="main-header-left">

<div class="main-header-left-left">
<img src="realtor.png" width="40px"> 
</div>

<div class="main-header-left-right">

<p><a id="a1" href="about" style="color:white;">About Us</a> </p>
</div>


</div>


<div class="main-header-right">
<div class="main-header-right-child">
<h3> Welcome ${user.firstName}</h3>
</div>
<div class="main-header-right-child">
<nav class="inline-nav">
                    <ul>
                        <li> <a href="LoginPage"> Login</a> </li>
                      <li> <a href="#">Post</a> </li> 
                      <li> <a href="#">Logout</a> </li> 
                    </ul>
                </nav>
</div>
</div>


</header>

<section  class="main-body">

<div class="row">
<div class="col" >
	<label > Filter</label>
     </div>

     <div class="col">
<div class="selectWrapper">

	<select class="selectBox">
	    <option> Price</option>
	    <option> $500-$1000</option>
<option> $1000-$1500</option>
<option> $1500-$2000</option>
<option> $2000-$2500</option>
<option> $2500-$3000</option>
<option> &gt; $3000</option>
	</select>
</div>
     </div>

     <div class="col">
<div class="selectWrapper">
     <select class="selectBox">
	    <option> Bedroom</option>
	    <option> 0</option>
<option> 1</option>
<option> 2</option>
<option> 3+</option>
	</select>
</div>
     </div>

     <div class="col">
<div class="selectWrapper">
        <select class="selectBox">
	    <option> Type</option>
	    <option> House</option>
<option> Apartment</option>
<option> Condo</option>
<option> Room</option>
	</select>
</div>
     </div>

     <div class="col">
<div class="selectWrapper">
         <select class="selectBox">
	    <option> City</option>
	    <option> Toronto</option>
<option> Vancouver</option>
<option> Montreal</option>
<option> Calgary</option>
	</select>
</div>
     </div>


     <div class="col">
<button> Search </button>
</div>

</div>



<div class="row">
<div class="main-col">

    <iframe src="https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d41653.80683393439!2d-123.12808619999998!3d49.2695199!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sen!2sca!4v1592930447675!5m2!1sen!2sca" width="400" height="300" frameborder="0" style="border:0;" allowfullscreen="" aria-hidden="false" tabindex="0"></iframe>
</div>

<div class="main-col">

<div class="w3-content w3-display-container">

  <img class="mySlides" src="images/im1.jpg" style=" width:100%">
  <img class="mySlides" src="images/im2.jpg" style="width:100%">
  <img class="mySlides" src="images/im3" style="width:100%">
  <img class="mySlides" src="images/im4.jpg" style="width:100%">
 <img class="mySlides" src="images/im5.jpg" style="width:100%">

  <button class="w3-button w3-black w3-display-left" onclick="plusDivs(-1)">&#10094;</button>
  <button class="w3-button w3-black w3-display-right" onclick="plusDivs(1)">&#10095;</button>
</div>
<pre>  <b>Address:</b> 101 Main Street
 <b> Price:</b> $1700/month</pre>
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
  if (n > x.length) {slideIndex = 1}
  if (n < 1) {slideIndex = x.length}
  for (i = 0; i < x.length; i++) {
    x[i].style.display = "none";  
  }
  x[slideIndex-1].style.display = "block";  
}
</script>

<hr/>

<p style="font-size:0.6em;">Copyright @ 2020 canadarent.ca, Inc. All rights reserved.</p>

</body>



</html>