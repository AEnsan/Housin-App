<html>
<head>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<!-- <link rel="stylesheet" href="http://localhost:8080/Housing-WebApp/WEB-INF/views/style.css"> -->
<title> Canada Rental</title>

<style><%@include file="/WEB-INF/css/style.css"%>

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
<img src="http://localhost:8080/Housing-WebApp/images/realtor.png" width="40px" /> 
  </div>

<div class="main-header-left-right">

<p><a href="about" style="color:white;">About Us</a> </p>

</div>


</div>


<div class="main-header-right">
<nav class="inline-nav">
                    <ul>
                        <li> <a href="LoginPage"> Login</a> </li>
                    <!--     <li> <a href="#">Post</a> </li> -->
                    </ul>
                </nav>

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
    <iframe id="iframe2" src="https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d41653.80683393439!2d-123.12808619999998!3d49.2695199!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sen!2sca!4v1592930447675!5m2!1sen!2sca" width="400" height="300" frameborder="0" style="border:0;" allowfullscreen="" aria-hidden="false" tabindex="0"></iframe>
</div>

<div class="main-col">

<div class="w3-content w3-display-container">

  <img class="mySlides" src="http://localhost:8080/Housing-WebApp/images/im1.jpg" style=" width:100%">
  <img class="mySlides" src="http://localhost:8080/Housing-WebApp/images/im2.jpg" style="width:100%">
  <img class="mySlides" src="http://localhost:8080/Housing-WebApp/images/im3.jpg" style="width:100%">
  <img class="mySlides" src="http://localhost:8080/Housing-WebApp/images/im4.jpg" style="width:100%">

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

    <script>
// Initialize and add the map
function initMap() {
  // The location of Uluru
  var uluru = {lat: -25.344, lng: 131.036};
  // The map, centered at Uluru
  var map = new google.maps.Map(
      document.getElementById('map'), {zoom: 4, center: uluru});
  // The marker, positioned at Uluru
  var marker = new google.maps.Marker({position: uluru, map: map});
}
    </script>
    <!--Load the API from the specified URL
    * The async attribute allows the browser to render the page while the API loads
    * The key parameter will contain your own API key (which is not needed for this tutorial)
    * The callback parameter executes the initMap() function
    -->
    <script async defer
    src="https://maps.googleapis.com/maps/api/js?key=YOUR_API_KEY&callback=initMap">
    </script>
<div class="chat-popup" id="myForm">
  <form action="/action_page.php" class="form-container">
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