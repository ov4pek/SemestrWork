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

function clearThirdAndFourth() {
    $('#sel3').text("");
    $('#sel4').text("");
}
function clearFourth() {
    $('#sel4').text("");
}
