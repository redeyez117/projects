
<!DOCTYPE HTML>
<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<link rel="stylesheet" type="text/css" href="homepage.css">

<title>Administrator Panel</title>
</head>

<body>

<h1 class="mainHeader"> Welcome to the administrator panel</h1>
<h2 class="secondHeader"> Please log in<h2>


<div class="container">
<div class="row">
<div class="col-md-6">
<form action="authetication.php" method="POST">
  <div class="form-group">
    <label for="email">Email:</label>
    <input type="email" class="form-control" name="email" id="email" required>
  </div>
  <div class="form-group">
    <label for="password">Password:</label>
    <input type="password" class="form-control" name="password" id="password" required>
  </div>
    <button type="submit" name="login" class="btn btn-default">Login</button>
</form>
</div>
</div>

</div>




</body>
</html>
