<?php

include("db_connection.php");
if(isset($_POST['name']) && isset($_POST['lastname']) && isset($_POST['courses'])) {
$name = $_POST['name'];
$lastname = $_POST['lastname'];
$courses = $_POST['courses'];


$query = mysqli_query($dbc, "Insert into student (firstname, lastname) values ('$name', '$lastname')");
$registered = mysqli_affected_rows($dbc);
$last_id = mysqli_insert_id($dbc);

$secondQuery = mysqli_query($dbc, "Insert into student_faculty (student_id, faculty_id) values ('$last_id', '$courses')");

header('Location: ' . $_SERVER['HTTP_REFERER']);

if ($registered > 0) {
	echo "<script>User added successfully</script>";
} else {
	echo "<p>User not added</p>";
}
}
 ?>