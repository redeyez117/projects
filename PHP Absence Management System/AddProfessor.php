<?php

include("db_connection.php");
if(isset($_POST['name']) && isset($_POST['lastname']) && isset($_POST['email']) && isset($_POST['password'])) {
$name = $_POST['name'];
$lastname = $_POST['lastname'];
$email = $_POST['email'];
$password = $_POST['password'];

$query = mysqli_query($dbc, "Insert into user (firstname, lastname, username, password) values ('$name', '$lastname', '$email', '$password')");
$registered = mysqli_affected_rows($dbc);
	header('Location: ' . $_SERVER['HTTP_REFERER']);

if ($registered > 0) {
	echo "<script>User added successfully</script>";
} else {
	echo "<p>User not added</p>";
}
}
 ?>