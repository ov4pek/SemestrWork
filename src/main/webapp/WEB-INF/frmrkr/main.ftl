<#ftl encoding="utf-8">
<html>
<head>
    <title>Welcome!</title>
    <meta charset="utf-8">

    <!-- Bootstrap core CSS -->
    <link href="/resources/css/bootstrap.css" rel="stylesheet"/>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="/resources/js/bootstrap.js"></script>

    <script type="text/javascript" src="/resources/js/tether.js"></script>

</head>
<body>
<div class="container">

    <div id="message">

    </div>

    <div>
        <h1>
            Choose city, university, faculty and group
        </h1>
    </div>

    <form action="/raspis/(${'#sel4'}">
        <div class="form-group">
            <label for="sel1">Select city (select one):</label>
            <select class="form-control" id="sel1" onclick="ajaxMe($('#sel1').val(),'sel2')"
                    onchange="clearThirdAndFourth()">
                <option value="city/kazan">Kazan</option>
                <option value="city/moscow">Moscow</option>
                <option value="city/saratov">Saratov</option>
            </select>
            <br>
            <label for="sel2">Select university (select one):</label>
            <select class="form-control" id="sel2" onclick="ajaxMe1($('#sel2').val(), 'sel3')" onchange="clearFourth()">

            </select>
            <br>
            <label for="sel3">Select faculty (select one):</label>
            <select class="form-control" id="sel3" onclick="ajaxMe2($('#sel3').val(), 'sel4')">

            </select>
            <br>
            <label for="sel4">Select group (select one):</label>
            <select class="form-control" id="sel4">

            </select>
            <br>
        </div>

    </form>
</div>

<script type="text/javascript" src="/resources/js/ajax.js"></script>
</body>
</html>