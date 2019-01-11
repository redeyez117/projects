<html>
<head>
<title>Admin Profile</title>

<link rel="stylesheet" type="text/css" href="trelist.css">

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="jquery-3.3.1.min.js"></script>
<link href="bootstrap.css" rel="stylesheet">

<!-- Required Javascript -->
<script src="jquery.js"></script>
<script src="bootstrap-treeview.js"></script>

</head>

<body>

  <div class="panel panel-success" style="text-align:center">
    <div class="panel-heading">
      <h3>Welcome to Admin panel<h3>
    </div>
  </div>
  <div class="container" style="margin-top:100px" >
      <div class="row" style="margin-left:400px">
          <div class="col-md-6" style="border-style:solid ; border-width:1px ; border-color:black ; border-radius:3px">
              <ul id="tree1">

                  <li><a href="#">Departments</a>

                      <ul>
                          <li>IT & Support
                              <ul>
                               <li><a href="support.php">View Employees</a></li>

                              </ul>

                          </li>
                          <li>Financa
                            <ul>
                             <li><a href="financa.php">View Employees</a></li>

                            </ul>

                          </li>
                          <li>Human Resources
                            <ul>
                             <li><a href="hr.php">View Employees</a></li>

                            </ul>


                          </li>
                          <li>Zhvillimi


                            <ul>
                             <li><a href="zhvillimi.php">View Employees</a></li>

                            </ul>

                          </li>
                          <li>Transporti

                            <ul>
                             <li><a href="transporti.php">View Employees</a></li>

                            </ul>

                          </li>
                      </ul>
                    </ul>
          </div>

  </div>
</div>


<script>

$.fn.extend({
    treed: function (o) {

      var openedClass = 'glyphicon-minus-sign';
      var closedClass = 'glyphicon-plus-sign';

      if (typeof o != 'undefined'){
        if (typeof o.openedClass != 'undefined'){
        openedClass = o.openedClass;
        }
        if (typeof o.closedClass != 'undefined'){
        closedClass = o.closedClass;
        }
      };

        //initialize each of the top levels
        var tree = $(this);
        tree.addClass("tree");
        tree.find('li').has("ul").each(function () {
            var branch = $(this); //li with children ul
            branch.prepend("<i class='indicator glyphicon " + closedClass + "'></i>");
            branch.addClass('branch');
            branch.on('click', function (e) {
                if (this == e.target) {
                    var icon = $(this).children('i:first');
                    icon.toggleClass(openedClass + " " + closedClass);
                    $(this).children().children().toggle();
                }
            })
            branch.children().children().toggle();
        });
        //fire event from the dynamically added icon
      tree.find('.branch .indicator').each(function(){
        $(this).on('click', function () {
            $(this).closest('li').click();
        });
      });
        //fire event to open branch if the li contains an anchor instead of text
        tree.find('.branch>a').each(function () {
            $(this).on('click', function (e) {
                $(this).closest('li').click();
                e.preventDefault();
            });
        });
        //fire event to open branch if the li contains a button instead of text
        tree.find('.branch>button').each(function () {
            $(this).on('click', function (e) {
                $(this).closest('li').click();
                e.preventDefault();
            });
        });
    }
});

//Initialization of treeviews

$('#tree1').treed();

$('#tree2').treed({openedClass:'glyphicon-folder-open', closedClass:'glyphicon-folder-close'});

$('#tree3').treed({openedClass:'glyphicon-chevron-right', closedClass:'glyphicon-chevron-down'});

</script>

</body>
</html>
