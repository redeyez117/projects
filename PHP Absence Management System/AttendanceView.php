<?php 
	include("db_connection.php");
	
	$course_id = $_GET['id'];
	
	$query = mysqli_query($dbc, "Select Student.Student_ID, Student.Firstname, Student.Lastname, Course_Student.Absences from Student inner join Course_Student on 
	Student.Student_ID = Course_Student.Student_ID where Course_Student.Course_ID = $course_id");
						  						
	?>

<!DOCTYPE HTML>
<html>
<head>
  <title>Attendances</title>
  <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/responsive/2.2.1/css/responsive.bootstrap.min.css">


</head>

<body>
<div class="container">
  <div class="row">

<div class="col-md-10 col-md-offset-1">

  <table id="courses" class="table table-striped table-bordered dt-responsive nowrap" style="width:100%; margin-top:170px">
        <thead>
            <tr>
                <th>Name</th>
                <th>Last Name</th>
                <th>Absences</th>
				<th>Actions</th>
            </tr>
        </thead>
		<tbody>
		<?php while ($rows = mysqli_fetch_row($query)) {
			 ?>
				<tr>
					<td><?php echo $rows[1]; ?></td>
					<td><?php echo $rows[2]; ?></td>
					<td><?php echo $rows[3]; ?></td>
					<td> <form method="post" action="AddAbsence.php">
					<input type="hidden" name="user_id_input" value="<?php echo $rows[0]; ?>">
					<input type="hidden" name="course_id_input" value="<?php echo $course_id; ?>">
					<button type="submit" class="btn btn-success">Add Absence</button>
					</form>	</td>
				</tr>	
		<?php }  ?> 
		</tbody>
      </table>

</div>
</div>
</div>
</body>

</html>
