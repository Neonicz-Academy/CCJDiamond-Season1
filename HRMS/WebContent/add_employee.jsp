
<!DOCTYPE html>
<html>

<head>
	<link rel=icon href="assets/images/icon.png" />
	<title>HRMS:Team-Diamond</title>
	<!-- <link rel = "icon" href ="https://media.geeksforgeeks.org/wp-content/cdn-uploads/gfg_200X200.png" 
        type = "image/x-icon">  -->
		
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
								<li><a href="PendingLeave" class="effect-4">Pending Leave Request</a></li>								
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
	<!-- <div class="inner_page_agile">
		<h3>Employee List</h3>	
	</div> -->
		<!--//banner -->

	<!--/w3_short-->
	<div class="services-breadcrumb_w3layouts">
		<div class="inner_breadcrumb">	
		</div>
	</div>
	<!--//w3_short-->
	<!-- /inner_content -->
	<div class="candidate_cv">
		<div class="tittle_head_w3ls">
			<h3 class="tittle two">Add Employee</h3>
		</div>
		
		<div class="inner_sec_grids_info login-form">
			<form action="AddEmployee" method="post" enctype="multipart/form-data">
				<div class="col-md-6 form-left">
				
					
					<div class="form-inputs name">
						<p>First name<span style="color: red; font-size: 20px;">*</span></p>
						<i class="fa fa-user" aria-hidden="true"></i>
						<input type="text" name="firstName" placeholder="" required="" />
					</div>
					
					<div class="form-inputs name">
						<p>Emp ID<span style="color: red; font-size: 20px;">*</span></p>
						<!-- <i style="font-size:24px" class="fa">&#xf2c3;</i> -->
						<!-- <i class="fa fa-id-badge" aria-hidden="true"></i> -->
						<i class="fa fa-flag" aria-hidden="true"></i>

				        <input type="text" name="empId" placeholder="" required="" />
					</div>
					<div class="form-inputs name">
						<p>Email<span style="color: red; font-size: 20px;">*</span></p>
						<i class="fa fa-envelope" aria-hidden="true"></i>
						<input type="email" name="email" placeholder="" required="" />
					</div>
					<div class="form-inputs name">
						<p>Date of Birth</p>
						<i class="fa fa-calender" aria-hidden="true"></i>
						<input type="date" name="DOB" placeholder="" required="" style="width:378px"/>
					</div>
					<div class="form-inputs name">
						<p>Job Title</p>
						<i class="fa fa-briefcase" aria-hidden="true"></i>
						<input type="text" name="jobTitle" placeholder="" required="" />
					</div>
					<div class="form-inputs name">
						<p>Department</p>
						<i class="fa fa-users" aria-hidden="true"></i>
						<input type="text" name="dept" placeholder="" required="" />
					</div>
					
					
				</div>
				<div class="col-md-6 form-right">
				    <div class="form-inputs name">
						<p>Last name</p>
						<i class="fa fa-user" aria-hidden="true" style="top: 33px;"></i>
						<input type="text" name="lastName" placeholder="" required="" />
					</div>
					<div class="form-inputs name">
						<p>Gender</p>
						<div class="radio-button-div">
							<input type="radio" id="male" name="gender" value="male">
 						 <label for="male" >Male</label>
 						 <input type="radio" id="female" name="gender" value="female">
  						<label for="female">Female</label>
						</div>
						
					</div>
					<div class="form-inputs name">
						<p>Phone<span style="color: red; font-size: 20px;">*</span></p>
						<i class="fa fa-phone" aria-hidden="true" style="top: 33px;"></i>
						<input type="text" name="phone" placeholder="" required=""  />
					</div>
					<div class="form-inputs name">
						<p>Date of Joining</p>
						<i class="fa fa-calender" aria-hidden="true"></i>
						<input type="date" name="DOJ" placeholder="" required="" style="width:363px"/>
					</div>
					<div class="form-inputs name">
						<p>Address</p>
						<i class="fa fa-home"  aria-hidden="true"></i>
						<textarea name="address" rows="3" cols="50" placeholder=""></textarea>
					</div>
					
					
					
				</div>
				<div class="clearfix"></div>
				
				<div class="form-inputs upload">
					<p>Upload your Photo</p>
					<input type="file" id="fileselect" name="fileselect[]" multiple="multiple" />
					<div id="filedrag">Upload</div>
				</div>
				<input type="submit" value="Submit">
			</form>

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
	<script type="text/javascript" src="assets/js/jquery-2.1.4.min.js"></script>
	<script type="text/javascript" src="assets/js/bootstrap.js"></script>
</body>

</html>