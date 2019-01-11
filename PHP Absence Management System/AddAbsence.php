<?php 
include('db_connection.php');

		$user_id = $_REQUEST['user_id_input'];
		$course_id = $_REQUEST['course_id_input'];
		
		$absenceQuery = mysqli_query($dbc, "Update Course_Student Set Absences = Absences + 1 where course_id = $course_id and student_id = $user_id");

		header('Location: ' . $_SERVER['HTTP_REFERER']);

?>