<?php

$servername="localhost";
$username="root";
$password="";
$dbname="chat";

date_default_timezone_set('Europe/Rome');

$conn= new mysqli ($servername , $username , $password , $dbname);


function fetch_user_last_activity($id , $conn){

    $query = "SELECT * FROM login_details WHERE user_id = '$id'
    ORDER BY last_activity DESC
    LIMIT 1";
   $result = $conn->query($query);

   $row=mysqli_fetch_assoc($result);


   foreach($result as $row){
       return $row['last_activity'];
   }

}

function fetch_user_chat_history($from_user_id , $to_user_id , $conn){
    $query = "SELECT * FROM chat_message WHERE (from_user_id ='".$from_user_id."'
    AND to_user_id = '".$to_user_id."')
    OR (from_user_id = '".$to_user_id."' AND to_user_id = '".$from_user_id."')
    ORDER BY timestamp DESC
    ";

    $result=$conn->query($query);
    $row=mysqli_fetch_assoc($result);
    $output = '<ul class="list-unstyled">';

    foreach($result as $row){
        $user_name = '';
        if($row["from_user_id"]==$from_user_id){
            $user_name='<b class="text-success">You</b>';
        }else{
            $user_name='<b class="text-danger">'.get_user_name($row['from_user_id'],$conn).'</b>';
        }
        $output .='
        
        <li style="border-bottom:1px dotted #ccc">
          <p>'.$user_name.' - '.$row["chat_message"]. '
          <div align="right">
          -<small><em>'.$row['timestamp'].'</em></small>
          </div>
        </p>
        </li>
        
        ';
    }
    $output .='</ul>';
    
    return $output;
}


function get_user_name($user_id , $conn){
    $query = "SELECT username FROM login WHERE user_id = '$user_id'";
    $result=$conn->query($query);
    
    while($result===true){
        return $row['username'];
    }
}

  
?>