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
<nav class="inline-nav">
                    <ul>
                        <li> <a href="LoginPage"> Show Properties</a> </li>
                       <li> <a href="#"> Show Users</a> </li> 
                       <li> <a href="#">Show Properties</a> </li> 
                          <li> <a href="#">Delete User</a> </li> 
                          <li> <a href="#">Delete Property</a> </li> 
                          <li> <a href="#">Edit Property</a> </li> 
                    </ul>
                </nav>
</div>


</div>


<div class="main-header-right">


</div>


</header>

<section>
<h2> Admin page is under construction</h2>
</section>







</body>
</html>