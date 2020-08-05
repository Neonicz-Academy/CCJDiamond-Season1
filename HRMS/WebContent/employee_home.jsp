<%@ page import ="java.util.ArrayList"%>
<%@ page import ="java.util.List"%>
<%@ page import ="java.util.Map"%>
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
							<h1><span class="fa fa-signal" aria-hidden="true"></span> HRMS<label></label></h1>
						</a>
					</div>
					<!--/.navbar-header-->

					<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
						<nav class="link-effect-2" id="link-effect-2">
							<ul class="nav navbar-nav">
										
								<li><a href="LeaveApplication" class="effect-3">Leave Application</a></li>
								<li><a href="LeaveSummaryEmployee" class="effect-3">Leave Summary</a></li>
								<li><a href="login.html" class="effect-3">Logout</a></li>
							</ul>
						</nav>
					</div>
					<!--/.navbar-collapse-->
					<!--/.navbar-->
				</div>
			</nav>
		</div>
	</div>
	<!-- banner -->
	<div class="inner_page_agile">
		<h3>My Profile</h3>
				
		

	</div>
	<!--//banner -->
	<!--/w3_short-->
	<div class="services-breadcrumb_w3layouts">
		<div class="inner_breadcrumb">

			<ul class="short_w3ls"_w3ls>
				
			</ul>
		</div>
	</div>
	<!--//w3_short-->
	<!-- /inner_content -->
	
	
	
	<%  
		List<Map<String,String>> employeeProfile  = (List<Map<String,String>>) request.getAttribute("employeeProfile");
		
		if(employeeProfile  == null){	%>
					
	   			<div class="alert alert-warning">
					No Data found
				</div>
		<% } else { 
			for(Map<String,String> row :employeeProfile ){	%>
	
	
	
	
	
	<div class="inner_content_info_agileits">
		<div class="container">
			
			<div >
				<div class="col-md-1"></div>
				<div class="col-md-7 banner_bottom_left">
					<h3 class="tittle"><%= row.get("firstName") %><%= row.get("lastName") %></h3>
					<p style="padding-left: 250px;"> EMP<%= row.get("empId") %> | Tester</p>

					<ul class="some_agile_facts">
						
						<li><span class="fa fa-phone" aria-hidden="true"></span><label></label><%= row.get("phone") %></li>
						<li><span class="fa fa-envelope-o" aria-hidden="true"></span><%= row.get("email") %></li>
						
						<p>Department       : <%= row.get("department") %></p>
						<p>Date of joining  : <%= row.get("firstName") %></p>					
					</ul>			
						
						<p><b>Personal Information</b></p4>
											
							<p>Gender   		: <%= row.get("gender") %></p>
							<p>Date of Birth   		: <%= row.get("dateOfBirth") %></p>
							<p>Address   		: <%= row.get("address") %></p>
						
						
					
									
					
					<div class="clearfix"> </div>
				</div>
				<div class="col-md-4 banner_bottom_right">
					
					<div class="agileits_w3layouts_banner_bottom_grid">
						
						<img src="assets/images/ab.png" alt=" " class="img-responsive" />
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
	
	<% } } %>
	
	
	
	
	<!-- //banner-bottom -->
	
	
	<!-- //services -->
	<!-- /mid-services -->
	<
	<!-- //mid-services -->

	<!-- //inner_content -->
	
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
	<script type="text/javascript" src="assets/js/jquery-2.1.4.min.js"></script>

	<script type="text/javascript" src="assets/js/bootstrap.js"></script>
</body>

</html>