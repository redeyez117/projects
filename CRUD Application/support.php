
<?php require_once 'database.php';?>
<html>
  <head>
     <title>Support</title>
     <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.0/jquery.min.js"></script>
           <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
           <script src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>
           <script src="https://cdn.datatables.net/1.10.12/js/dataTables.bootstrap.min.js"></script>
           <link rel="stylesheet" href="https://cdn.datatables.net/1.10.12/css/dataTables.bootstrap.min.css" />
  </head>
    <body>
    <br /><br />

    <div class="container-fluid">
      <div class="row justify-content:center">
        <div class="col-md-4" style="margin-left:44%">
          <button type="button" class="btn btn-info btn-md" data-toggle="modal" data-target="#myModal">Add New Employee</button>
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
            <p>Some text in the modal.</p>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
          </div>
        </div>

      </div>
    </div>

    <?php

    $connection= new mysqli($servername , $username , $password , $dbname);

    $query = "SELECT * from user  INNER JOIN Department ON user.Dep_ID = Department.ID WHERE Department.Dep_name='IT&Support' ";

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
                   <td>Role</td>
                   <td>Edit</td>
                   <td>Delete</td>
                 </tr>
              </thead>

                <?php

                    while($row =mysqli_fetch_array($result)){
                      echo'
                       <tr>
                       <td>'.$row["Name"].'</td>
                       <td>'.$row["Lastname"].'</td>
                       <td>'.$row["Email"].'</td>
                       <td>'.$row["Role_ID"].'</td>
                       <td><a href="#" class="btn btn-info" name="Edit">Edit</a> </td>
                       <td><a href="#" class="btn btn-danger" name="Delete">Delete</a></td>
                       </tr>


                            ';


                    }


                ?>
          </table>

       </div>
    </div>

  </body>
  </html>

  <script>
$(document).ready(function(){
$('#employee_data').DataTable();

});


</script>
