<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%
	String token_value = null;
	if(session.isNew()){
		token_value = "___________________";
		session.setAttribute("cfrs", token_value);
	}else{
		token_value = (String)session.getAttribute("cfrs");
	}
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<!--[if lt IE 9]>
  <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
  <![endif]-->
</head>
<body>
<script>
		$(document).ready(function() {
			var csrf_token = '<%= token_value %>';
			
			$("body").bind("ajaxSend", function(elm, xhr, s){
			   if (s.type == "POST") {
			      xhr.setRequestHeader('X-CSRF-Token', csrf_token);
			   }
			});
			
			$("#btnLogin").click(function(){
				
				 $.ajax({
					method: "POST",
					url: "rest/utente/login",
					data: $('#formLogin').serialize(),
					success: function(data, textStatus, jqXHR){
						alert(data.password);
					},
					error: function(jqXHR, textStatus, errorThrown){
						alert(jqXHR+"-"+textStatus+"-"+errorThrown);
					}
				});
			});
		});
</script>

	<div class="container-fluid">
		<div class="row" style="height: 10px; background-color: #C2CDD6;"></div>
		<div class="row" style="background-color: #9FB2C2;">
			<div class="col-sm-12">
				<img src="imgs/logo_02b_contorni.svg"
					class="img-responsive col-centered" alt="PHOTOSHOOTERS">
			</div>
		</div>
		<div class="row" style="background-color: #9FB2C2;">

			<div class="col-sm-2"></div>
			<div class="col-sm-8">
				<nav id="publicmenu" class="navbar navbar-default" role="navigation">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse"
							data-target=".navbar-collapse">
							<span class="icon-bar"></span> <span class="icon-bar"></span> <span
								class="icon-bar"></span>
						</button>
					</div>
					<div class="navbar-collapse collapse">
						<ul class="nav navbar-nav navbar-left">
							<li><a href="#">HOMe</a></li>
							<li><a href="#about">PHOTOSHOOTERs</a></li>
							<li><a href="#about">CASTINg|LAVORo</a></li>
							<li><a href="#about">FORUm</a></li>
						</ul>
						<ul class="nav navbar-nav navbar-right">
							<li><a href="#" id="registrati">REGISTRATi</a></li>
							<li class="dropdown" id="menuLogin"><a
								class="dropdown-toggle" href="#" data-toggle="dropdown"
								id="navLogin">LOGIn</a>
								<div class="dropdown-menu" style="padding: 17px;">
									<form id="formLogin" class="form">
										<label>Login</label> <input name="_csrf" id="token"
											type="hidden" value="Dx1PSN3x-Cvhjxt14MvzLJe64jn26ekPUe4c">
										<input name="username" id="username" type="text"
											placeholder="Username" pattern="^[a-z,A-Z,0-9,_]{6,15}$"
											data-valid-min="6" title="Enter your username"
											required="required"> <input name="password"
											id="password" type="password" placeholder="Password"
											title="Enter your password" required="required"><br>
										<button type="button" id="btnLogin" class="btn">Login</button>
									</form>
								</div></li>
						</ul>
					</div>
				</nav>
			</div>
			<div class="col-sm-2"></div>
		</div>
		<div class="row"
			style="height: 35px; background-color: #80959E; border-bottom: solid 1px black;"></div>
		<div class="row">
			<div class="col-sm-2"></div>
			<div class="col-sm-8">
				<!-- <div class="bgimage-inside"></div> -->
				<div>
					<img src="imgs/IMG_2055blu.jpg" class="img-responsive"
						alt="Eleonora">
				</div>
			</div>
			<div class="col-sm-2"></div>
		</div>










		<nav class="navbar navbar-default navbar-fixed-bottom">
			<div class="container-fluid">
				<div class="row"
					style="height: 10px; background-color: #C2CDD6; border-top: solid 1px black;"></div>
				<div class="row" style="height: 20px; background-color: #9FB2C2;"></div>
				<div class="row" style="background-color: #80959E;">
					<div class="col-sm-6 text-center">
						<img src="imgs/social-31-facebook.png" class="img-responsive"
							style="display: inline-block; margin: 7px 0 7px 0; height: 35px; width: 35px;"></img>
						<img src="imgs/social-32-twitter.png" class="img-responsive"
							style="display: inline-block; margin: 7px 0 7px 0; height: 35px; width: 35px;"></img>
						<img src="imgs/social-9-tumblr.png" class="img-responsive"
							style="display: inline-block; margin: 7px 0 7px 0; height: 35px; width: 35px;"></img>
					</div>
					<div class="col-sm-6 text-center">
						<span style="display: inline-block; margin-top: 15px;">2015-2099
							photoshooters.net | All Rights Reserved</span>
					</div>
				</div>
			</div>
		</nav>


	</div>


</body>
</html>