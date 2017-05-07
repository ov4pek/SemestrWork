<#import "spring.ftl" as spring>
<html>
<head>
    <meta content="text/html; charset=UTF-8">

    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="x-ua-compatible" content="ie=edge">

    <link rel="stylesheet" href="/resources/css/style.css"/>
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.0/css/font-awesome.min.css">


    <!-- Bootstrap core CSS -->
    <link href="/resources/css/bootstrap.css" rel="stylesheet"/>
    <!-- Material Design Bootstrap -->
    <link href="/resources/css/mdb.css" rel="stylesheet"/>


    <link rel='stylesheet' id='style.css-css'
          href='https://mdbootstrap.com/wp-content/themes/mdbootstrap4/style.css?ver=4.7.4' type='text/css'
          media='all'/>


    <link rel='stylesheet' id='compiled.css-css'
          href='https://mdbootstrap.com/wp-content/themes/mdbootstrap4/css/compiled.min.css?ver=4.7.4' type='text/css'/>

</head>
<body>

<br><br>

<div class="col-lg-4 col-md-8 mx-auto">
    <div class="card">
        <div class="card-block">

            <!--Header-->
            <div class="form-header  purple darken-4">
                <h3><i class="fa fa-lock"></i> Login:</h3>
            </div>

            <!--Body-->
            <form method="post">
                <div class="md-form">
                    <i class="fa fa-envelope prefix"></i>
                    <input type="text" id="form2" class="form-control">
                    <label for="form2">Your email</label>
                </div>

                <div class="md-form">
                    <i class="fa fa-lock prefix"></i>
                    <input type="password" id="form4" class="form-control">
                    <label for="form4">Your password</label>
                </div>

                <div class="text-center">
                    <button class="btn btn-deep-purple">Login</button>
                </div>
            </form>

        </div>

        <!--Footer-->
        <div class="modal-footer">
            <div class="options">
                <p>Not a member? <a href="#">Sign Up</a></p>
                <p>Forgot <a href="#">Password?</a></p>
            </div>
        </div>

    </div>

</div>
<script type="text/javascript" src="/resources/js/jquery-3.1.1.js"></script>

<!-- Bootstrap core JavaScript -->
<script type="text/javascript" src="/resources/js/tether.min.js"></script>
<!-- Bootstrap tooltips -->
<script type="text/javascript" src="/resources/js/bootstrap.min.js"></script>


<!-- MDB core JavaScript -->
<script type="text/javascript" src="/resources/js/mdb.min.js"></script>
</body>
</html>