<?php 

$servername = "localhost";
$database = "attendances";
$username = "root";
$password = "";

// Create connection
$dbc = new mysqli($servername, $username, $password, $database) OR die("could not connect to database, ERROR: ".mysqli_connect_error());;

mysqli_set_charset($dbc, "utf8");

?>