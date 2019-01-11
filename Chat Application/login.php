
<?php

require_once('database.php');
session_start();

$conn= new mysqli($servername , $username , $password , $dbname);



$message="";

if(isset($_SESSION['user_ID'])){
    header("location:index.php");
}

if(isset($_POST['username']) && isset($_POST['password'])){

    $query=$conn->query("Select * from login where username = '".$_POST['username']."' AND password = '".$_POST['password']."'");
    $row=mysqli_fetch_assoc($query);

    if($query->num_rows>0){
        $_SESSION['user_id']=$row['id'];
        $_SESSION['username']=$row['username'];
        $query2 = "INSERT INTO login_details (user_id)
                    Values('".$row['id']."')";

        $result=$conn->prepare($query2);
        $result->execute(); 
        $_SESSION['login_details_id']=$conn->insert_id;
        
        header('location:index.php');
    }else{
        $message = "<label>Wrong Username or Password</label>";
    }
    

}

?>

<!DOCTYPE HTML>
<html>
<head>

<title>Chat Application</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="jquery-3.3.1.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>

<div class="container">
<br/>
<h3 style="text-align:center">Welcome to the chat Application</h3>

<div class="panel panel-default">
<div class="panel-heading" style="text-align:center">Please Login</div>
<div class="panel-body">
<p class="text-danger"><?php echo $message;?></p>
<form method="post">
<div class="form-group">
<label>Enter Username</label>
<input type="text" name="username" class="form-control" required>
</div>
<div class="form-group">
<label>Enter Password</label>
<input type="password" name="password" class="form-control" required>
</div>
<div class="form-group">
<input type="submit" name="login" class="btn btn-success" value="Login">
</div>
</form>
</div>


</div>


</div>


</body>
</html>
