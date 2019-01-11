<?php require_once 'database.php';

session_start();
$conn = new mysqli($servername, $username, $password , $dbname);


// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

$query="SELECT * from user WHERE email = '".$_SESSION['email']."'";

$result= $conn->query($query);


$row = mysqli_fetch_assoc($result);

  $name= $row['Name'];
  $lastname= $row['Lastname'];
  $email= $row['Email'];
  $role= $row['Role_ID'];
  $department=$row['Dep_ID'];
  $id=$row['ID'];

$query2 = "SELECT role.Name from role inner join user on user.Role_ID = role.ID WHERE email = '".$_SESSION['email']."'";

$result2 = $conn->query($query2);
$row2 = mysqli_fetch_assoc($result2);

$role_name = $row2['Name'];


$query3 = "SELECT department.Dep_Name from department inner join user on user.Dep_ID = department.ID WHERE email = '".$_SESSION['email']."'";

$result3 = $conn->query($query3);
$row3 = mysqli_fetch_assoc($result3);

$department_name = $row3['Dep_Name'];


$query4 = "SELECT picture.picture from picture inner join user on user.profile_pic_id = picture.picture_id WHERE email = '".$_SESSION['email']."'";

$result4 = $conn->query($query4);
$row4 = mysqli_fetch_assoc($result4);

$picture_name = $row4['picture'];


?>

<html>
<head>
  <!-- Latest compiled and minified CSS -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

  <!-- jQuery library -->
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

  <!-- Latest compiled JavaScript -->
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src="jquery-3.3.1.min.js"></script>

  <link rel="stylesheet" type="text/css" href="homepage.css">
<title>Employee Profile</title>
</head>

<body>
<div class="panel panel-success" style="text-align:center">
<div class="panel-heading"><h3>Welcome to Employee panel<h3></div>

</div>
<div class="container" style="background-color:black ; margin-top:50px ; border-style:solid ; border-radius:4px">

<div class="col-md-4">

<div class="profilePicture" style="margin-top:20px" ><img src="<?php echo  $picture_name; ?>" width="100" height="70" class="img-responsive"/> </div>
<div style=" margin-right:320px ; margin-top:10px "><button type="button" class="btn btn-primary">Change</button></div>


<div class="info">

<div id= "<?php echo $row['ID'];?>" style="color:white ; position:relative ; left:450px ; padding-bottom:50px ; top:-120px" >

<?php
echo '<li data-target="name">'.$name.'</li>';
echo '<li data-target="lastname">' .$lastname.'</li>';
echo '<li data-target="email">' .$email. '</li>';
echo '<li data-target="role_name">'.$role_name.'</li>';
echo '<li data-target="department_name">' .$department_name.'</li>';
?>
</div>
</div>



<input type="button" name="edit" value="Edit" id="$id" class="btn btn-info edit_data" style="position:relative ; left:480px ; margin-bottom:40px"/>

<!-- Modal -->
<div id="myModal" class="modal fade" role="dialog">
  <div class="modal-dialog">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">Update Information</h4>
      </div>
      <div class="modal-body">
          <div class="form-group">
            <label>Name</label>
            <input type="text" name="name" id="name" class="form-control">
          </div>
          <div class="form-group">
            <label>Lastname</label>
            <input type="text" name="lastbane" id="lastname" class="form-control">
          </div>
          <div class="form-group">
            <label>Email</label>
            <input type="email" name="email" id="email" class="form-control">
          </div>
          <input type="hidden" id="user_Id" name="user_id" class="form-control">
      </div>
      <div class="modal-footer">
        <input type="submit" name="update" id="update" class="btn btn-primary pull-left">Update</a>
        <button type="button" class="btn btn-default pull-left" style="margin-left:195px" data-dismiss="modal">Close</button>
      </div>
    </div>

  </div>
</div>
</div>
</div>
</div>


</body>


<script>

</script>

</html>
