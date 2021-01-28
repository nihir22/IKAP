<%-- 
    Document   : home
    Created on : 13 Jan, 2021, 4:37:38 PM
    Author     : Nihir
--%>

<!doctype html>
<html lang="en-US">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="Content-Type" content="text/html">
        <title>IKAP Home</title>
        <link rel="stylesheet" type="text/css" media="all" href="css/styles.css">
        <link rel="stylesheet" type="text/css" media="all" href="css/main.css">
    </head>

    <body>
        <div class="container text-center"><a href=#> <img alt="Logo" src="images/iitkgp_logo.png" class="logo"> </a></div>
        <h1>Alumni Portal</h1>

        <nav id="navigation" role="navigation">
            <div id="main-menu">
                <ul class="menu l_tinynavNaN">
                    <li class="first leaf"><a href="toMain">Home</a></li>
                    <li class="expanded"><a href="#" title="">Events</a>
                        <ul class="menu">
                            <li class="first leaf"><a href="#">Joined Events</a></li>
                            <li class="leaf"><a href="#">New Events</a></li>
                            <li class="leaf"><a href="#">Passed Events</a></li>
                        </ul>
                    </li>
                    <li class="expanded"><a href="#" title="">Chapters</a>
                        <ul class="menu">
                            <li class="first leaf"><a href="#">Local</a></li>
                            <li class="leaf"><a href="#">Kolkata</a></li>
                            <li class="expanded"><a href="#" title="">Global</a>
                        </ul>
                    </li>
                    <li class="leaf"><a href="#">Groups</a></li>
                    <li class="leaf"><a href="nameTo">Profile</a></li>
                    <li class="last leaf"><a href="#">Contact Us</a></li>
                    <li class="last leaf"><a href="index.jsp">Sign Out</a></li>
                </ul>
            </div>
        </nav>
        <h2>Welcome to your homepage, ${alum.alum_fname}!</h2>

    </body>
    <html>