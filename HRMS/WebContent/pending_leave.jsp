<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<%@page import= "java.util.List" %>
<%@page import= "java.util.Map" %>
<html>

<head>
	<link rel=icon href="../assets/images/icon.png" />
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
								<li><a href="AddEmployee" class="effect-4">Add Employee</a></li>								
								<li><a href="ListEmployee" class="effect-5">Employee List</a></li>								
								<li><a href="LeaveSummaryAdmin" class="effect-6">Leave Summary</a></li>								
								<li><a href="LogoutServlet" class="effect-7">Logout</a></li>
								
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
		<!-- <h3>Leave Summary</h3> -->
		

	</div>
	<!--//banner -->
	<!--/w3_short-->
	<div class="services-breadcrumb_w3layouts">
		<div class="inner_breadcrumb">

			
		</div>
	</div>
	<!--//w3_short-->
	<!-- /inner_content -->
	<div class="inner_content_info_agileits">
		<div class="container">
			<div class="tittle_head_w3ls">
				<h3 class="tittle three">Pending Leave Request</h3>
			</div>
		<div class="box-body">
		
			
		</div>
		
			<div class="inner_sec_grids_info_w3ls">
				<div class="col-md-2 job_info_right"></div>
				<div class="col-md-8 job_info_left">
				
				<%
				List<Map<String, String>> pendingRequestList = (List<Map<String, String>>) request.getAttribute("requestlist");
				if(pendingRequestList == null){
				%>
								<div class="alert alert-warning">
								No Data Found
								</div>
				<%	
				} else {
				for (Map<String, String> pendingRequest : pendingRequestList) {
				
			
				%>
					
					<div class="tab_grid_prof">
						<div class="col-sm-3 loc_1">
							<a href="single.html"><img src=" <%= pendingRequest.get("image") %>" alt=""></a>
						</div>
						<div class="col-sm-9">
							<div class="location_box1">
								<h6><span class="m_2_prof">  <%= pendingRequest.get("firstName") %>  <%= pendingRequest.get("lastName") %> </span></h6>
								<div class="person-info">
									<ul>

										<li><span>Emp ID</span>: <%= pendingRequest.get("empId") %></li>
										<li><span>Leave Type</span>:  <%= pendingRequest.get("leaveType") %></li>
										<li><span>Reason</span>: <%= pendingRequest.get("reason") %></li>
										<li><span>No. of Days</span>: <%= pendingRequest.get("noOfDays") %></li>
										
									</ul>
								</div>
								 <div class="w3-section">
									 
								  <a href="AcceptLeave?applicationId=<%= pendingRequest.get("applicationId") %>"  role="button" style="background-color: #84ed67; border-radius: 8px;
												padding: 5px;color:#594040;"> &nbsp Accept &nbsp </a>
									<a href="RejectLeave?applicationId=<%= pendingRequest.get("applicationId") %>"  role="button" style="background-color: #ff5448; border-radius: 8px;
												padding: 5px;color: #594040;"> &nbsp Decline &nbsp </a>
								
							
								</div>
								
							</div>
						</div>
						<div class="clearfix"> </div>
					</div>
				<%
				}
			}
			%>
				
					
				
				

				

				</div>
				<div class="col-md-2 job_info_right"></div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!-- //inner_content -->
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
	<script type="text/javascript" src="../assets/js/jquery-2.1.4.min.js"></script>
	<script type="text/javascript" src="../assets/js/bootstrap.js"></script>
</body>

</html>