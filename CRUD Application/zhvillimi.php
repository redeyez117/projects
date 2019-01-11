
<?php require_once 'database.php';?>
<html>
  <head>
     <title>Zhvillimi</title>
           <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.0/jquery.min.js"></script>
           <script src="jquery-3.3.1.min.js"></script>
           <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
           <script src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>
           <script src="https://cdn.datatables.net/1.10.12/js/dataTables.bootstrap.min.js"></script>
           <link rel="stylesheet" href="https://cdn.datatables.net/1.10.12/css/dataTables.bootstrap.min.css" />

  </head>
    <body>
    <br /><br />

<div class="container-fluid">
  <div class="row justify-content:center">
    <div class="col-md-4" style="margin-left:44%">
      <input type="button" class="btn btn-info btn-md" id="addNew" value="Add New Employee">
  </div>
  </div>
</div>

    <!-- Modal -->
    <div id="myModal" class="modal fade" role="dialog">
      <div class="modal-dialog">
        <!-- Modal content-->
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal">&times;</button>
            <h4 class="modal-title">Modal Header</h4>
          </div>
          <div class="modal-body">
            <input type="text" class="form-control" placeholder="Enter Name..." id="newName"><br>
            <input type="text" class="form-control" placeholder="Enter Lastname..." id="newLastname"><br>
            <input type="email" class="form-control" placeholder="Enter Email..." id="newEmail"><br>
            <input type="hidden" id="editRowID" value="0"/>
          </div>
          <div class="modal-footer">
            <input type="button" class="btn btn-success" onclick="save('addNew')" value="Save"/>
          </div>
        </div>

      </div>
    </div>


    <?php

    $connection= new mysqli($servername , $username , $password , $dbname);

    $query = "SELECT * from user INNER JOIN Department ON user.Dep_ID = Department.ID WHERE Department.Dep_name='Zhvillimi' ";
   
    $result = $connection->query($query);
    
        ?>

    <div class="container">

       <div class="table-responsive">

          <table id ="employee_data" class="table table-stripped table-bordered">
              <thead>
                 <tr>
                   
                   <td>Name</td>
                   <td>Lastname</td>
                   <td>Email</td>
                   
                   <td>Edit</td>
                   <td>Delete</td>
                 </tr>
              </thead>

                <?php

                    while($row = mysqli_fetch_array($result)){
                      echo'
                       <tr>
                       
                       <td>'.$row["Name"].'</td>
                       <td>'.$row["Lastname"].'</td>
                       <td id="email_'.$row["Email"].'">'.$row["Email"].'</td>
                      
                       <td><input type="button" name="update" class="btn btn-info" value="Edit"/></td>
                       <td><input type="button" name="Delete" class="btn btn-danger" value="Delete"/></td>
                       </tr>


                            ';


                    }


                ?>
          </table>

       </div>
    </div>

    <script type="text/javascript">

$(document).ready(function(){
    $("#addNew").on('click', function(){
      $("#myModal").modal('show');
    
    });
});


function save(key){

var newName = $("#newName");
var newLastname=$("#newLastname");
var newEmail = $("#newEmail");
var editRowID = $("#editRowID");

if(notEmpty(newName) && notEmpty(newLastname) && notEmpty(newEmail)){
       $.ajax({
         url:'fetch.php',
         method:'POST',
         dataType:'text',
         data: {
           key:key,
           newName:newName.val(),
           newLastname:newLastname.val(),
           newEmail:newEmail.val(),
           rowID : editRowID.val() 
         },success: function(response){
           alert(response);
         }
         


       });

 }

}

function notEmpty(value){
  if(value.val()==""){
    value.css('border' , '1px solid red');
    return false;
  }else
    value.css('border' , '');
    return true;
  
}


    </script>

  </body>
  </html>

  <script>
$(document).ready(function(){
$('#employee_data').DataTable();

});


</script>
