<#import "spring.ftl" as spring>
<#assign sf=JspTaglibs["http://www.springframework.org/tags/form"]>
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
<div class="col-lg-4 col-md-8 mx-auto">
    <!--Form with header-->
    <div class="card">
        <div class="card-block">

            <!--Header-->
            <div class="form-header blue-gradient">
                <h3><i class="fa fa-user"></i> Register:</h3>
            </div>

            <!--Body-->
        <@sf.form method="post" commandName="user">
            <div class="md-form">
                <i class="fa fa-user prefix"></i>
                <@sf.input path="name" id="form3" cssClass="form-control"/>
                <@sf.errors path="name" cssStyle="color:red"/>
            <#--<input type="text" id="form3" class="form-control"/>-->
                <label for="form3">Your name</label>
            </div>
            <div class="md-form">
                <i class="fa fa-envelope prefix"></i>
                <@sf.input path="email" id="form2" cssClass="form-control"/>
                <@sf.errors path="email" cssStyle="color:red"/>
                <label for="form2">Your email</label>
            </div>

            <div class="md-form">
                <i class="fa fa-lock prefix"></i>
                <@sf.password path="password" id="form4" cssClass="form-control"/>
                <@sf.errors path="password" cssStyle="color:red"/>
                <label for="form4">Your password</label>
            </div>

            <div class="text-center">
                <button class="btn btn-indigo">Sign up</button>
                <hr>
                <fieldset class="form-group">
                    <input type="checkbox" id="checkbox1">
                    <label for="checkbox1">Subscribe me to the newsletter</label>
                </fieldset>
            </div>
        </@sf.form>

        </div>
    </div>
    <!--/Form with header-->
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