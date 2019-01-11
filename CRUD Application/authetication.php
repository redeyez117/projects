<?php require 'database.php';

session_start();
$conn = new mysqli($servername, $username, $password , $dbname);


// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

$email = $_POST['email'];
$password = $_POST['password'];

if(isset($_POST['email'])AND isset($_POST['password'])){
    $_SESSION['email'] = $_POST['email'];
    $result = $conn->query("SELECT * FROM user WHERE email='$email' AND password='$password'");
    $row = mysqli_fetch_assoc($result);


if($result->num_rows > 0 && $row['Role_ID'] ==1){


    header("location:admin.php");

} elseif($result->num_rows > 0  && $row['Role_ID'] ==2 ){

    header("location:employee.php");
}else{
    echo "error";

}
}

?>
