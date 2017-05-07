function ajaxMe(selValue, nextName) {
    var options;

    $.ajax({
        async: true,
        url: selValue+'.html',
        dataType: 'json',
        success: function (data) {
            options = data;
            var spisok = '';

            $.each( options, function(key, value) {
                    spisok += '<option '+'value="'+value.name+'"'+'>'+value.name+'</option>'+"\n";
        });
        $('#'+nextName).html(spisok);}

    });
}
function ajaxMe1(selValue, nextName) {
    var options;

    $.ajax({
        async: true,
        url: "university/"+selValue+'.html',
        dataType: 'json',
        success: function (data) {
            options = data;
            var spisok = '';

            $.each( options, function(key, value) {
                spisok += '<option '+'value="'+value.name+'"'+'>'+value.name+'</option>'+"\n";
            });
            $('#'+nextName).html(spisok);}

    });
}
function ajaxMe2(selValue, nextName) {
    var options;

    $.ajax({
        async: true,
        url: "faculty/"+selValue+'.html',
        dataType: 'json',
        success: function (data) {
            options = data;
            var spisok = '';

            $.each( options, function(key, value) {
                spisok += '<option '+'value="'+value.name+'"'+'>'+value.name+'</option>'+"\n";
            });
            $('#'+nextName).html(spisok);}

    });
}
function f1(selValue){
    $.ajax({
        async: true,
        url: 'href.html',
        dataType: 'text',
        success: function (data) {
            var btn = '<a href="'+data+selValue+'"><button>Submit</button></a>';
            console.log(btn);
            $('#form_submit').html(btn);
        }
    });
}
function clearThirdAndFourth() {
    $('#sel3').text("");
    $('#sel4').text("");
}
function clearFourth() {
    $('#sel4').text("");
}
