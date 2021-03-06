<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>

<head>
	<link rel=icon href="assets/images/icon.png" />
	<title>HRMS:Team-Diamond</title>
	<!--/tags -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="keywords" content="Soft Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
	<script type="application/x-javascript">
		addEventListener("load", function () {
			setTimeout(hideURLbar, 0);
		}, false);

		function hideURLbar() {
			window.scrollTo(0, 1);
		}
		
	</script>
	<!--//tags -->
	<link href="assets/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
	<link href="assets/css/style.css" rel="stylesheet" type="text/css" media="all" />

	<link href="assets/css/font-awesome.css" rel="stylesheet">
	<!-- //for bootstrap working -->
	<link href="//fonts.googleapis.com/css?family=Work+Sans:200,300,400,500,600,700" rel="stylesheet">
	<link href='//fonts.googleapis.com/css?family=Lato:400,100,100italic,300,300italic,400italic,700,900,900italic,700italic'
	    rel='stylesheet' type='text/css'>
</head>

<body>
	<!-- header -->
	<div class="header" id="home">
		<div class="content white agile-info">
			<nav class="navbar navbar-default" role="navigation">
				<div class="container">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
						<a class="navbar-brand" href="login.html">
							<h1><span class="fa fa-signal" aria-hidden="true"></span> HRMS <label></label></h1>
						</a>
					</div>
					<!--/.navbar-header-->
					
					<!--/.navbar-collapse-->
					<!--/.navbar-->
				</div>
			</nav>
		</div>
	</div>

	<div class="services-breadcrumb_w3layouts">
		<div class="inner_breadcrumb">			
		</div>
	</div>
	<div class="candidate_cv">
		<div class="tittle_head_w3ls">
			<h3 class="tittle two">Login Here</h3>
		</div>

		<div class=" login-form">
			<div class=" login-form-rec">
			<%
			Boolean failed = (Boolean)request.getAttribute("failed");
			if(failed!=null && failed){
			%>
			<div class="alert alert-danger"> Invalid username or password.</div>
			<% 
			}
			%>
				<form action="LoginServlet" method="post">
					<div class=" form-left">
						<div class="form-inputs">
							<p>Username</p>	
							<i class="fa fa-pencil" aria-hidden="true"></i>
							<input type="text" name="username" id="username" placeholder="" required="" />
						</div>
						<div class="form-inputs">
							<p>Password</p>	
								<i class="fa fa-lock" aria-hidden="true"></i>
								<input type="password" name="password"  required="" />
							<!--<input type="password" name="password" placeholder="" style="width:340px;height: 42px;" required="" />-->
						</div>
						
						<div class="form-inputs name">
						
						<div class="radio-button-div">
							<input type="radio" id="admin" name="userRole" value="Admin" required="">
 						 <label for="admin" >Admin</label>
 						 <input type="radio" id="employee" name="userRole" value="Employee">
  						<label for="employee">Employee</label>
						</div>
						
					</div>
						
					</div>
					<div class="clearfix"></div>				
					<input type="submit" value="Login">
					
				</form>
			</div>
			
		
		</div>
	</div>
	<!-- //testimonials -->
	

	<!-- footer -->

	<div class="footer_w3ls">
		<div class="container">
			<div class="footer_bottom">
				<div class="col-md-9 footer_bottom_grid">
					<div class="footer_bottom1">
						<a href="login.html">
							<h2><span class="fa fa-signal" aria-hidden="true"></span> HRMS <label></label></h2>
						</a>
						<p>© 2020 HRMS. All rights reserved | Design by Team Diamond</p>
					</div>
				</div>
				<div class="col-md-3 footer_bottom_grid">
					
				</div>
				
				<div class="clearfix"> </div>
			</div>

		</div>
	</div>
	<!-- //footer -->

	<a href="#home" class="scroll" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
	<!-- js -->
	<script type="text/javascript" src="assets/js/jquery-2.1.4.min.js">
	
	}</script>

	<script type="text/javascript" src="assets/js/bootstrap.js"></script>
</body>

</html>