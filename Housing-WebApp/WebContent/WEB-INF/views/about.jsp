<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
  margin: 0;
}

html {
  box-sizing: border-box;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.column {
  float: left;
  width: 33.3%;
  margin-bottom: 16px;
  padding: 0 8px;
}

.card {
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
  margin: 8px;
}

.about-section {
  padding: 50px;
  text-align: center;
  background-color: #474e5d;
  color: white;
}

.container {
  padding: 0 16px;
}

.container::after, .row::after {
  content: "";
  clear: both;
  display: table;
}

.title {
  color: grey;
}

.button {
  border: none;
  outline: 0;
  display: inline-block;
  padding: 8px;
  color: white;
  background-color: #000;
  text-align: center;
  cursor: pointer;
  width: 100%;
}

.button:hover {
  background-color: #555;
}

@media screen and (max-width: 650px) {
  .column {
    width: 100%;
    display: block;
  }
}
</style>
</head>
<body>

<div class="about-section">
  <h1>Canada Rental</h1>
  <p>We're building the best apartment hunting experience in Canada. 
Our team focuses on exceptional design and support to make the process of searching for a new home in Canada easier.</p>
 
</div>

<h2 style="text-align:center">Our Team</h2>
<div class="row">
  <div class="column">
    <div class="card">
      <img src="http://localhost:8080/Housing-WebApp/images/team1.jpg" alt="Jane" style="width:100%">
      <div class="container">
        <h2>Sara Adams</h2>
        <p class="title">CEO & Founder</p>
        <p>Sara is a successful tech entrepreneur with more than 15 years experience in buidling successful businesses.</p>
        <p>sara@canadarental.com</p>
        <p><button class="button">Contact</button></p>
      </div>
    </div>
  </div>

  <div class="column">
    <div class="card">
      <img src="http://localhost:8080/Housing-WebApp/images/team2.jpg" alt="Mike" style="width:100%">
      <div class="container">
        <h2>Mike Ross</h2>
        <p class="title">CTO</p>
        <p>Mike is an expert in managing companies with more than 30 years experience in software engineering and management. </p>
        <p>mike@canadarental.com</p>
        <p><button class="button">Contact</button></p>
      </div>
    </div>
  </div>
  
  <div class="column">
    <div class="card">
      <img src="http://localhost:8080/Housing-WebApp/images/team3.jpg" alt="John" style="width:100%">
      <div class="container">
        <h2>John Green</h2>
        <p class="title">Designer</p>
        <p>John is a skillful website designer.</p>
        <p>john@canadarental.com</p>
        <p><button class="button">Contact</button></p>
      </div>
    </div>
  </div>
</div>

</body>
</html>