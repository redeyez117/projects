<?php

require("database.php");

$conn = new mysqli($servername , $username , $password , $dbname);

session_start();

$query="UPDATE login_details SET last_activity = now() WHERE login_details_id = '".$_SESSION["login_details_id"]."'
";

$statement = $conn->prepare($query);

$statement->execute();


?>