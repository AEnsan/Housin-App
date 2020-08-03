<%@page pageEncoding="UTF-8"%>
<html>
<head>

<title>Sign up</title>

<style><%@include file="/WEB-INF/css/signup-style.css"%></style>

</head>
<body>
​<script>
var result="t";
function changeUser1(){
if (result=="l"){
	var x=document.getElementById("status");
     var input = document.createElement("input"); 
     input.type = "text";
     input.id="comp"
     input.placeholder = "Company";
     input.className = "company"; // set the CSS class
     x.parentNode.replaceChild(input, x);
	
}
}

function changeUser2(){
	if (result=="t"){
		var x=document.getElementById("comp");
		 var mydiv=document.createElement("div");
		 mydiv.id="status";
		 var mypar=document.createElement("p");
		 mypar.innerHTML="Your status ";
		var selectList = document.createElement("select");
		selectList.id = "mySelect";
		selectList.name="citizenship"
		//myParent.appendChild(selectList);
		 var option1 = document.createElement("option");
		    option1.value = "Canadian";
		    option1.text = "Canadian";
		    selectList.appendChild(option1)
		    var option2 = document.createElement("option");
		    option2.value = "US";
		    option2.text = "US Citizen";
		    selectList.appendChild(option2)
		    
		    var option3 = document.createElement("option");
		    option3.value = "International";
		    option3.text = "International";
		    selectList.appendChild(option3);
		    selectList.form="signup";
		    
		    mypar.appendChild(selectList);
		    mydiv.appendChild(mypar);

		    x.parentNode.replaceChild(mydiv, x);
		
	}
	}
	
</script>

<div class="container">

    <form id="signup" action="register" method="post">

        <div class="header">
        
            <h3>Sign Up</h3>
            
        </div>
        
        <div class="sep"></div>

        <div class="inputs">
			        
      <p>You are  tenant <input type="radio" name='user-type' value="t" checked="checked" onclick="result='t';changeUser2();"> or landlord 
      <input type="radio" name='user-type' value="l" onclick="result='l';changeUser1();">
      </p>
        	
        	<input id="usr" type="text" name="username" placeholder="Username" />
            <input type="password" name="password" placeholder="Password" />
            <input type="email"  name="email" placeholder="E-mail" autofocus />
            <input type="text" name="firstName" placeholder="First Name" autofocus />
            <input type="text" name="lastName" placeholder="Last Name" autofocus />
            
            
            <div id="status">
            <p> Your status
            <select name="citizenship">
            <option value="Canadian"> Canadian</option>
            <option  value="US"> US Citizen</option>
            <option   value="International"> Internationl</option>
            </select>
            </p>
            </div>
            <div class="checkboxy">
 <input name="cecky" id="checky" value="1" type="checkbox" /><label class="terms">I accept the terms of use</label>
            </div>
            
        <input id ="submit" type="submit" value="register" />
        </div>

    </form>

</div>

	
</body>



</html>


