<?php

require('database.php');

session_start();

$conn=new mysqli($servername , $username , $password , $dbname);

$query="SELECT * FROM login WHERE id != '".$_SESSION['user_id']."'";

$result=$conn->query($query);

$row=mysqli_fetch_assoc($result);

$output='
<table class="table table-bordered table-striped">
<tr>
 <td>Username</td>
 <td>Status</td>
 <td>Action</td>


</tr>


';

foreach($result as $row){

    $status='';
    $current_timestamp = strtotime(date('Y-m-d H:i:s') . '-10 second');
    $current_timestamp = date('Y-m-d H:i:s' , $current_timestamp);
    $user_last_activity = fetch_user_last_activity($row['id'], $conn);
    
     if($user_last_activity > $current_timestamp){
         $status = '<span class="label label-success"> Online </span>';
     }else{
        $status = '<span class="label label-danger"> Offline</span>';
     }


$output .= '

<tr>

    <td>'.$row['username'].'</td>
    <td>'.$status.'</td>

    <td><button type="button" class="btn btn-info-xs start_chat" data-touserid="'.$row['id'].'"
        data-tousername="'.$row['username'].'">Start Chat</button></td>
</tr>


';

}

$output .='</table>';

echo $output;

?>