<script src="/resources/js/modernizr.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.0.0/jquery.min.js"></script>
<script>
    if (!window.jQuery) document.write('<script src="js/jquery-3.0.0.min.js"><\/script>');
</script>
<script src="/resources/js/main.js"></script> <!-- Resource jQuery -->
<!-- MDB core JavaScript -->
<script type="text/javascript" src="/resources/js/mdb.min.js"></script>


<link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:400,600" rel="stylesheet">
<link rel="stylesheet" href="/resources/css/reset.css"> <!-- CSS reset -->
<link rel="stylesheet" href="/resources/css/style.css"> <!-- Resource style -->
<link rel="stylesheet" href="/resources/css/myStyle.css">


<div class="cd-schedule loading">
    <div class="timeline">
        <ul>
            <li><span>08:30</span></li>
            <li><span>09:00</span></li>
            <li><span>09:30</span></li>
            <li><span>10:00</span></li>
            <li><span>10:30</span></li>
            <li><span>11:00</span></li>
            <li><span>11:30</span></li>
            <li><span>12:00</span></li>
            <li><span>12:30</span></li>
            <li><span>13:00</span></li>
            <li><span>13:30</span></li>
            <li><span>14:00</span></li>
            <li><span>14:30</span></li>
            <li><span>15:00</span></li>
            <li><span>15:30</span></li>
            <li><span>16:00</span></li>
            <li><span>16:30</span></li>
            <li><span>17:00</span></li>
            <li><span>17:30</span></li>
            <li><span>18:00</span></li>
        </ul>
    </div> <!-- .timeline -->

    <div class="events">
        <ul>
            <li class="events-group">
                <div class="top-info"><span>Monday</span></div>

                <ul>

                    <#list list as l>
                    <#if l.getDay() == "Monday">
                    <li class="single-event" data-start="${l.getBegin_time()}" data-end="${l.getEnd_time()}" data-event="event-1">
                        <a href="#0">
                            <em class="event-name">${l.getName()}</em>
                        </a>
                    </li>
                    </#if>
                    </#list>
                </ul>
            </li>

            <li class="events-group">
                <div class="top-info"><span>Tuesday</span></div>

                <ul>

                    <#list list as l>
                    <#if l.getDay() == "Tuesday">
                    <li class="single-event" data-start="${l.getBegin_time()}" data-end="${l.getEnd_time()}" data-event="event-2">
                        <a href="#0">
                            <em class="event-name">${l.getName()}</em>
                        </a>
                    </li>
                    </#if>
                    </#list>

                </ul>
            </li>

            <li class="events-group">
                <div class="top-info"><span>Wednesday</span></div>

                <ul>
                    <#list list as l>
                    <#if l.getDay() == "Wednesday">
                    <li class="single-event" data-start="${l.getBegin_time()}" data-end="${l.getEnd_time()}" data-event="event-3">
                        <a href="#0">
                            <em class="event-name">${l.getName()}</em>
                        </a>
                    </li>
                    </#if>
                    </#list>

                </ul>
            </li>

            <li class="events-group">
                <div class="top-info"><span>Thursday</span></div>

                <ul>
                    <#list list as l>
                    <#if l.getDay() == "Thursday">
                    <li class="single-event" data-start="${l.getBegin_time()}" data-end="${l.getEnd_time()}" data-event="event-4">
                        <a href="#0">
                            <em class="event-name">${l.getName()}</em>
                        </a>
                    </li>
                    </#if>
                    </#list>


                </ul>
            </li>

            <li class="events-group">
                <div class="top-info"><span>Friday</span></div>

                <ul>
                    <#list list as l>
                    <#if l.getDay() == "Friday">
                    <li class="single-event" data-start="${l.getBegin_time()}" data-end="${l.getEnd_time()}" data-event="event-5">
                        <a href="#0">
                            <em class="event-name">${l.getName()}</em>
                        </a>
                    </li>
                    </#if>
                    </#list>

                </ul>
            </li>

            <li class="events-group">
                <div class="top-info"><span>Saturday</span></div>

                <ul>
                    <#list list as l>
                    <#if l.getDay() == "Saturday">
                    <li class="single-event" data-start="${l.getBegin_time()}" data-end="${l.getEnd_time()}" data-event="event-1">
                        <a href="#0">
                            <em class="event-name">${l.getName()}</em>
                        </a>
                    </li>
                    </#if>
                    </#list>

                </ul>
            </li>


        </ul>
    </div>

    <div class="event-modal">
        <header class="header">
            <div class="content">
                <span class="event-date"></span>
                <h3 class="event-name"></h3>
            </div>

            <div class="header-bg"></div>
        </header>

        <div class="body">
            <div class="event-info"></div>
            <div class="body-bg"></div>
        </div>

        <a href="#0" class="close">Close</a>
    </div>

    <div class="cover-layer"></div>
</div> <!-- .cd-schedule -->

