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

					<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
						<nav class="link-effect-2" id="link-effect-2">
							<ul class="nav navbar-nav">
								
								<li><a href="EmployeeProfile" class="effect-3">My Profile</a></li>
								<li><a href="LeaveSummaryEmployee" class="effect-3">Leave Summary</a></li>
								<li><a href="LogoutServlet" class="effect-3">Logout</a></li>
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
	
	<!--//banner -->
	<!--/w3_short-->
	<div class="services-breadcrumb_w3layouts">
		<div class="inner_breadcrumb">			
		</div>
	</div>
	<!--//w3_short-->


<!-- //mid-services -->
<div class="candidate_cv">
	<div class="tittle_head_w3ls">
		<h3 class="tittle two">Apply your Leave</h3>
	</div>
	<div class="inner_sec_grids_info login-form">
	
			<%
			Boolean dateValidation = (Boolean)request.getAttribute("dateValidation");
			if(dateValidation!=null && dateValidation){
				System.out.println("inside jsp");
				System.out.println(request.getAttribute("dateValidation"));
			%>
			nnnnnnnnnnnnnnnnnnn
			<div class="alert alert-danger"> Invalid date.</div>
			<% 
			}
			%>
			
		<form action="LeaveApplication" method="post">
			<div class="col-md-6 form-left">
				<div class="form-inputs email">
					<p>Leave Type<span style="color: red; font-size: 20px;">*</span></p>
					<!-- <i class="fa fa-user" aria-hidden="true"></i> -->
					<!-- <input type="text" name="Name" placeholder="" required="" /> -->
					<select name="leave_type" id="country13" onchange="change_country(this.value)" class="frm-field required" style="width: 378px;						
					height: 40px;">
						
						 <option value="Medical Leave">Medical Leave</option>
						<option value="Maternity Leave">Maternity Leave</option>
						<option value="Casual Leave">Casual Leave</option>
						<option value="Annual Leave">Annual Leave</option>							 
					</select>
				</div>
				<div class="form-inputs name">
					<p>Date of Leave<span style="color: red; font-size: 20px;">*</span></p>
					<!-- <i class="fa fa-envelope" aria-hidden="true"></i> -->
					<!-- <input type="email" name="Email" placeholder="" required="" /> -->
					<input type="date" name="date" required="" style="width: 378px;						
							"/>
				</div>
				<div class="form-inputs name">
					<p>Number of Days<span style="color: red; font-size: 20px;">*</span></p>
					<!-- <i class="fa fa-phone" aria-hidden="true"></i> -->
					<!-- <input type="text" name="Phone" placeholder="" required="" /> -->
					<input type="text" name="no_of_days"  required="" />
				</div>

			</div>
			<div class="col-md-6 form-right">
				<div class="form-inputs name">
					<p>Reason<span style="color: red; font-size: 20px;">*</span></p>
					<!-- <i class="fa fa-comment" aria-hidden="true"></i> -->
					<textarea name="reason" placeholder="" style="height: 192px;" required=""></textarea>
				</div>
			</div>
			<div class="clearfix"></div>
			
			
			<input type="submit" value="Apply">
		</form>

	</div>
</div>


	
	
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