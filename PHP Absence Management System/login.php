<?php

error_reporting(0);

include("db_connection.php");

//grab values email and password from login form

$login_username = $_POST['username'];
$login_password = $_POST['password'];

//create the query and number of rows returned from the query

$query = mysqli_query($dbc, "SELECT * FROM user WHERE username='".$login_username."'");

$numrows = mysqli_num_rows($query);

if($_SERVER['REQUEST_METHOD'] == 'POST'){

//create condition to check if there is 1 row with that email

if($numrows != 0){

//grab the email and password from that row returned before

	while($row = mysqli_fetch_array($query)){
	
		$dbemail = $row['Username'];
		$dbpass = $row['Password'];
		$dbfirstname = $row['Firstname'];
		
	}
	
//create condition to check if email and password are equal to the returned row	
	
	if($login_username==$dbemail){
		if($login_password==$dbpass){
			if(strtolower($dbemail) == 'sokol.beshi@cit.edu.al') {
				header("Location: AdminView.html"); /* Redirect browser */
			} else {
				header("Location: ProfessorView.html"); /* Redirect browser */				
			}
			}
	}else{
	
		
	
	}
	
}else{



}


}
?>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" type="text/css" href="style.css">

</head>



<body>


<div class="loginbox">

<img src="Images/b666f811889067.562541eff3013.png" class="avatar"/>

<h1>Login Here</h1>

<form method="post" action="Login.php">

<p>Username</p>
<input type ="text" name="username" placeholder="Enter Username">
<p>Password</p>
<input type="password" name="password" placeholder="Enter Password">

<input type="submit" name="submit" value="login">

</form>

</div>

</body>
</html>