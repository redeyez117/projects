<?php

require_once 'database.php';

if($_POST['key']== 'getRowData'){
$rowID = $conn->($_POST['rowID']);

$sql = $conn->query("SELECT * FROM user WHERE Email = '$row['Email']'");
$data = $sql->fetch_array();
$jsonArray = array(
   'newName'->$data['Name'],
   'newLastname'->$data['Lastname'],
   'newEmail'->$data['Email'],
);

exit(json_encode($jsonArray));
}

if(isset($_POST['key'])){

  $conn= mysqli_connect($servername , $username , $password , $dbname);
  

$newName = $_POST['newName'];
$newLastname = $_POST['newLastname'];
$newEmail = $_POST['newEmail'];

if($_POST['key']=='addNew'){
  $sql = $conn->query("Select * from user where user.Email='$newEmail'");

  if($sql->num_rows > 0){

    exit("This user already exist");
  }else{
    $conn->query("INSERT INTO user (Name , Lastname , Email , Password , Role_ID , Dep_ID)
                   Values ('$newName' , '$newLastname' , '$newEmail' , '1111' , '2', '4')");
                   exit("User added successfully");
  }
}

}

?>
