<?php


include('database.php');

$conn=new mysqli($servername,$username,$password,$dbname);

session_start();



/*$data= array(
    ':to_user_id'=>$_POST['to_user_id'],
    ':from_user_id'=>$_SESSION['user_id'],
    ':chat_message'=>$_POST['chat_message'],
    
);*/

$query = "INSERT INTO chat_message (to_user_id , from_user_id , chat_message)
          VALUES ('".$_POST['to_user_id']."' , '".$_SESSION['user_id']."' , '".$_POST['chat_message']."')";

$result=$conn->query($query);

if($result===true){
    echo fetch_user_chat_history($_SESSION['user_id'], $_POST['to_user_id'],$conn);
}


?>