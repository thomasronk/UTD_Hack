/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.57
 * Generated at: 2015-01-18 19:35:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("    <title>Fun Voyage</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap Core CSS -->\r\n");
      out.write("    <!--<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">-->\r\n");
      out.write("\t<link  rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" />\r\n");
      out.write("    <!-- Custom CSS -->\r\n");
      out.write("    <link href=\"css/stylish-portfolio.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom Fonts -->\r\n");
      out.write("    <link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <link href=\"http://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,700,300italic,400italic,700italic\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("    <style>\r\n");
      out.write("      #map-canvas {\r\n");
      out.write("        width: 75%;\r\n");
      out.write("        height: 500px;\r\n");
      out.write("        align:center;\r\n");
      out.write("        margin-right:3%;\r\n");
      out.write("      }\r\n");
      out.write("    </style>\r\n");
      out.write("    <script src=\"https://maps.googleapis.com/maps/api/js?v=3.exp\"></script>\r\n");
      out.write("    <script src=\"js/jquery.js\"></script>\r\n");
      out.write("    <script src=\"js/BpTspSolver.js\"></script>\r\n");
      out.write("     <script>\r\n");
      out.write("        var directionsDisplay;\r\n");
      out.write("        var directionsService = new google.maps.DirectionsService();\r\n");
      out.write("        var map;\r\n");
      out.write("        var TravelTime = 0;\r\n");
      out.write("\r\n");
      out.write("        function initialize() {\r\n");
      out.write("            directionsDisplay = new google.maps.DirectionsRenderer();\r\n");
      out.write("            var mapCanvas = document.getElementById('map-canvas');\r\n");
      out.write("            var mapOptions = {\r\n");
      out.write("                center: new google.maps.LatLng(32, -96.750260),\r\n");
      out.write("                zoom: 12,\r\n");
      out.write("                mapTypeId: google.maps.MapTypeId.ROADMAP\r\n");
      out.write("            };\r\n");
      out.write("            map = new google.maps.Map(document.getElementById('map-canvas'), mapOptions);\r\n");
      out.write("            directionsDisplay.setMap(map);\r\n");
      out.write("        }\r\n");
      out.write("        function mapDraw(index,addArr) {\r\n");
      out.write("        \t\r\n");
      out.write("            var start = addArr[0];\r\n");
      out.write("            console.log(addArr[0]);\r\n");
      out.write("            var end = addArr[addArr.length - 1];\r\n");
      out.write("            var between = [];\r\n");
      out.write("\t\t\tfor(var i = 1 ; i < addArr.length - 1 ; i++ )\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tbetween.push ({\r\n");
      out.write("\t\t\t\t\t\tlocation:addArr[i],\r\n");
      out.write("\t\t\t\t\t\tstopover:true\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("            var request = {\r\n");
      out.write("                origin: start,\r\n");
      out.write("                destination: end,\r\n");
      out.write("                waypoints: between,\r\n");
      out.write("                travelMode: google.maps.TravelMode.DRIVING\r\n");
      out.write("            };\r\n");
      out.write("            directionsService.route(request, function (response, status) {\r\n");
      out.write("                if (status == google.maps.DirectionsStatus.OK) {\r\n");
      out.write("                    directionsDisplay.setDirections(response);\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        \r\n");
      out.write("        }\r\n");
      out.write("     \r\n");
      out.write("        function estimateTimeTravel(Address, DrawFlag) {\r\n");
      out.write("        \t\r\n");
      out.write("            tsp = new BpTspSolver(map, null);\r\n");
      out.write("            for (var i = 0 ; i < Address.length ; i++) {\r\n");
      out.write("                tsp.addAddress(Address[i], 1);\r\n");
      out.write("            }\r\n");
      out.write(" \r\n");
      out.write("            tsp.setTravelMode(google.maps.DirectionsTravelMode.DRIVING);\r\n");
      out.write("            \r\n");
      out.write("           \t\ttsp.solveRoundTrip(function () {\r\n");
      out.write("\r\n");
      out.write("                var order = tsp.getOrder();\r\n");
      out.write("                \r\n");
      out.write("                console.log(order);\r\n");
      out.write("                \r\n");
      out.write("                // get the time\r\n");
      out.write("\r\n");
      out.write("                var start = Address[order[1] ];\r\n");
      out.write("                var end = Address[order[order.length -1]];\r\n");
      out.write("                var waypts = [];\r\n");
      out.write("                for (var i = 2; i < order.length - 1; i++) {\r\n");
      out.write("                    waypts.push({\r\n");
      out.write("                        location: Address[order[i] ],\r\n");
      out.write("                        stopover: true\r\n");
      out.write("                    });\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                var request = {\r\n");
      out.write("                    origin: start,\r\n");
      out.write("                    destination: end,\r\n");
      out.write("                    waypoints: waypts,\r\n");
      out.write("                    optimizeWaypoints: true,\r\n");
      out.write("                    travelMode: google.maps.TravelMode.DRIVING\r\n");
      out.write("                };\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                //directionsDisplay = tsp.getGDirections();\r\n");
      out.write("                directionsService.route(request, function (response, status) {\r\n");
      out.write("                    if (status == google.maps.DirectionsStatus.OK) {\r\n");
      out.write("                        if(DrawFlag == 1)\r\n");
      out.write("                        directionsDisplay.setDirections(response);\r\n");
      out.write("                        var route = response.routes[0];\r\n");
      out.write("                        \r\n");
      out.write("                        //var summaryPanel = document.getElementById('directions_panel');\r\n");
      out.write("                        //summaryPanel.innerHTML = '';\r\n");
      out.write("                        // For each route, display summary information.\r\n");
      out.write("                        for (var i = 0; i < route.legs.length; i++) {\r\n");
      out.write("                            var routeSegment = i + 1;\r\n");
      out.write("\r\n");
      out.write("                            console.log(route.legs[i].start_address + ' to ');\r\n");
      out.write("                            console.log(route.legs[i].end_address);\r\n");
      out.write("                            console.log(route.legs[i].distance.text);\r\n");
      out.write("                            console.log(route.legs[i].duration.value);\r\n");
      out.write("                            TravelTime = TravelTime + route.legs[i].duration.value;\r\n");
      out.write("                        }\r\n");
      out.write("                        console.log(\"Total time for journey is \" + TravelTime / 3600 + \"hours\");\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("               \r\n");
      out.write("   \r\n");
      out.write("            });  \r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("        google.maps.event.addDomListener(window, 'load', initialize);\r\n");
      out.write("        </script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <!-- Navigation -->\r\n");
      out.write("    <a id=\"menu-toggle\" href=\"#\" class=\"btn btn-dark btn-lg toggle\"><i class=\"fa fa-bars\"></i></a>\r\n");
      out.write("    <nav id=\"sidebar-wrapper\">\r\n");
      out.write("        <ul class=\"sidebar-nav\">\r\n");
      out.write("            <a id=\"menu-close\" href=\"#\" class=\"btn btn-light btn-lg pull-right toggle\"><i class=\"fa fa-times\"></i></a>\r\n");
      out.write("            <li class=\"sidebar-brand\">\r\n");
      out.write("                <a href=\"#top\">Start </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"#top\">Home</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"#about\">About</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <!--  <li>\r\n");
      out.write("                <a href=\"#services\">Services</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"#portfolio\">Portfolio</a>\r\n");
      out.write("            </li>-->\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"#contact\">Contact</a>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("    <!-- Header -->\r\n");
      out.write("    <header id=\"top\" class=\"header\">\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"text-vertical-center\">\r\n");
      out.write("            <h1>Fun Voyage</h1>\r\n");
      out.write("            <!--  <h3>Free Bootstrap Themes &amp; Templates</h3>-->\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"placeTextField\" style=\"margin-left:20%;margin-top:1%;height:40px;width:60%;\"placeholder=\"Hola, Which City do you want to visit ?\"\r\n");
      out.write("                   name=\"place\">\r\n");
      out.write("     \r\n");
      out.write("            <br>\r\n");
      out.write("            <a href=\"#about\" class=\"btn btn-dark btn-lg\">Explore Places</a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    <!-- About -->\r\n");
      out.write("    <section id=\"about\" class=\"about\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12 text-center\">\r\n");
      out.write("                    <h2>\"Traveling allows you to become so many different versions of yourself\"</h2>\r\n");
      out.write("                    <p class=\"lead\">We Plan your trip in best possible way to save your money and time </p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.row -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.container -->\r\n");
      out.write("    </section>\r\n");
      out.write("    \r\n");
      out.write("    <section id=\"services\" class=\"services bg-primary\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div  class=\"row text-center\">\r\n");
      out.write("                <div class=\"col-lg-10 col-lg-offset-1\">\r\n");
      out.write("                    <h2>Select the places you want to visit</h2>\r\n");
      out.write("                    <hr class=\"small\">\r\n");
      out.write("                    <div id=\"divToBePopulated\" class=\"row\">\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- /.row (nested) -->\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.col-lg-10 -->\r\n");
      out.write("                <div id=\"divForTimeAndCost\"><input type=\"text\" id=\"timeTextField\"\r\n");
      out.write("                                               placeholder=\"How much time do you have?\" class=\"form-control\"\r\n");
      out.write("                                               style=\"margin-left:39%;margin-top:1%;height:40px;width:21%;\"/><input\r\n");
      out.write("                    type=\"text\" id=\"costTextField\" placeholder=\"How much money do you have?\" class=\"form-control\"\r\n");
      out.write("                    style=\"margin-left:39%;margin-top:1%;height:40px;width:21%;\"/><a href=\"#route\" style=\"margin-top: 2%\"\r\n");
      out.write("                                                                                     class=\"btn btn-dark btn-lg\"\r\n");
      out.write("                                                                                     id=\"searchOptimumRouteLink\">Search\r\n");
      out.write("                Optimum Route</a></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.row -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.container -->\r\n");
      out.write("    </section>\r\n");
      out.write("    <section>\r\n");
      out.write("    \t<div class=\"container\">\r\n");
      out.write("            <div  class=\"row text-center\">\r\n");
      out.write("            \t<div class=\"col-lg-12 text-center\">\r\n");
      out.write("            \t\t<h2>Your Optimal Route(s) is ready!!</h2>\r\n");
      out.write("            \t</div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>    \r\n");
      out.write("    </section>\r\n");
      out.write("   <aside class=\"callout\">\r\n");
      out.write("        <div style=\"margin-left:8%;width:100px;float:left;\">\r\n");
      out.write("       \t<select multiple class=\"form-control\" id=\"addroutes\">\r\n");
      out.write("  \t\t\t\t\r\n");
      out.write("  \t\t</select>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("       \r\n");
      out.write("       <div style=\"float:right\" id=\"map-canvas\"></div>\r\n");
      out.write("    </aside>\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\t<footer>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-10 col-lg-offset-1 text-center\">\r\n");
      out.write("                    <h4><strong>HACK UTD</strong>\r\n");
      out.write("                    </h4>\r\n");
      out.write("                    <p>University Of Texas at Dallas<br>800 West Campbell Road, Richardson, TX 75080</p>\r\n");
      out.write("                    <ul class=\"list-unstyled\">\r\n");
      out.write("                        <li><i class=\"fa fa-phone fa-fw\"></i> (123) 456-7890</li>\r\n");
      out.write("                        <li><i class=\"fa fa-envelope-o fa-fw\"></i>  <a href=\"mailto:name@example.com\">name@example.com</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <ul class=\"list-inline\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-facebook fa-fw fa-3x\"></i></a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-twitter fa-fw fa-3x\"></i></a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-dribbble fa-fw fa-3x\"></i></a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <hr class=\"small\">\r\n");
      out.write("                    <p class=\"text-muted\">Copyright &copy; Hack_UTD 2014</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("\r\n");
      out.write("    <!-- jQuery -->\r\n");
      out.write("    <script src=\"js/jquery.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom Theme JavaScript -->\r\n");
      out.write("    <script>\r\n");
      out.write("    // Closes the sidebar menu\r\n");
      out.write("    $(\"#menu-close\").click(function(e) {\r\n");
      out.write("        e.preventDefault();\r\n");
      out.write("        $(\"#sidebar-wrapper\").toggleClass(\"active\");\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    // Opens the sidebar menu\r\n");
      out.write("    $(\"#menu-toggle\").click(function(e) {\r\n");
      out.write("        e.preventDefault();\r\n");
      out.write("        $(\"#sidebar-wrapper\").toggleClass(\"active\");\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("        // Scrolls to the selected menu item on the page\r\n");
      out.write("    $(function() {\r\n");
      out.write("    \tvar images = [\"bg0.jpg\", \"bg1.jpg\",\"bg2.jpg\",\"bg3.jpg\",\"bg4.jpg\",\"bg5.jpg\",\"bg6.jpg\"];\r\n");
      out.write("    \tvar cnt = 0;\r\n");
      out.write("    \tsetInterval(function () {\r\n");
      out.write("    \t\t//console.log(\"hi\");\r\n");
      out.write("    \t    cnt == images.length-1 ? cnt = 0 : ++cnt;\r\n");
      out.write("    \t    var url = \"img/\"+images[cnt];\r\n");
      out.write("    \t    \r\n");
      out.write("    \t    $(\".header\").css(\"background-image\", \"url(\" + url + \")\");\r\n");
      out.write("    \t    \r\n");
      out.write("    \t    //$(\".header\").css(\"background-repeat\", \"no-repeat\");\r\n");
      out.write("    \t    //$(\".header\").css(\"background-position\", \"center center\");\r\n");
      out.write("    \t    //$(\".header\").css(\"background-attachment\", \"scroll\");  \t   \r\n");
      out.write("    \t    //$(\".header\").css(\"background\", background);\r\n");
      out.write("    \t}, 3000);\r\n");
      out.write("    \t\r\n");
      out.write("    \t//setInterval(function() { \r\n");
      out.write("    \t\t//  $('.header img')\r\n");
      out.write("    \t\t  //  .fadeOut(1000);\r\n");
      out.write("    \t\t  //cnt == images.length-1 ? cnt = 0 : ++cnt;\r\n");
      out.write("      \t    //var url = \"img/\"+images[cnt];\r\n");
      out.write("      \t    \r\n");
      out.write("    \t\t  //  $(\".header\").css(\"background-image\", \"url(\" + url + \")\");\r\n");
      out.write("    \t\t // $('.header img')\r\n");
      out.write("  \t\t    //.fadeIn(1000);\r\n");
      out.write("  \t\t\t  \r\n");
      out.write("    \t\t//},  3000);\r\n");
      out.write("    \t//setInterval(function() {\r\n");
      out.write("    \t//$(\".header\").animate(1000,function(){ \r\n");
      out.write("    \t\t//cnt == images.length-1 ? cnt = 0 : ++cnt;\r\n");
      out.write("       \t    //var url = \"img/\"+images[cnt];\r\n");
      out.write("       \t    //$(\".header\").css(\"background-image\", \"url(\" + url + \")\").animate(); \r\n");
      out.write("    \t //});\r\n");
      out.write("    \t//},  3000);\r\n");
      out.write("    \t\r\n");
      out.write("        $('a[href*=#]:not([href=#])').click(function() {\r\n");
      out.write("            if (location.pathname.replace(/^\\//, '') == this.pathname.replace(/^\\//, '') || location.hostname == this.hostname) {\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("                var target = $(this.hash);\r\n");
      out.write("                console.log(target);\r\n");
      out.write("                target = target.length ? target : $('[name=' + this.hash.slice(1) + ']');\r\n");
      out.write("                if (target.length) {\r\n");
      out.write("                    $('html,body').animate({\r\n");
      out.write("                        scrollTop: target.offset().top\r\n");
      out.write("                    }, 1000);\r\n");
      out.write("                    $(\"#divToBePopulated\").empty();\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("\r\n");
      out.write("                    var placesTextFieldValue = jQuery(\"#placeTextField\").val();\r\n");
      out.write("                    jQuery.getJSON(\"/route/Place\", {place : decodeURIComponent(placesTextFieldValue)},function(returnedData){\r\n");
      out.write("                        if(returnedData) {\r\n");
      out.write("                            var len = returnedData.length;\r\n");
      out.write("                            if(len>0){\r\n");
      out.write("                                for(var i=0;i<len;i++){\r\n");
      out.write("                                \tvar divToAppend = \"<div class=\\\"col-md-3 col-sm-6\\\"><div class=\\\"service-item\\\"><span class=\\\"fa-stack fa-4x\\\"><img class=\\\"fa-stack-2x text-primary\\\" src=\\\"\" + returnedData[i].imgUrl + \"\\\"/></span><h4><strong>\" + returnedData[i].placeName + \"</strong></h4><p>\" + returnedData[i].address + \"</p><input type=\\\"checkbox\\\" class=\\\"checkedPlaces\\\" value=\\\"\" + returnedData[i].id + \"\\\"/><span style=\\\"display: none\\\">\" + returnedData[i].rating + \"</span><span style=\\\"display: none\\\">\" + returnedData[i].timeSpent + \"</span><span style=\\\"display: none\\\">\" + returnedData[i].cost + \"</span>\";\r\n");
      out.write("                                    jQuery(\"#divToBePopulated\").append(divToAppend);\r\n");
      out.write("                                }\r\n");
      out.write("                            }\r\n");
      out.write("                        }\r\n");
      out.write("                    });\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write(" <script>\r\n");
      out.write(" var routes=null;\r\n");
      out.write("    jQuery(\"#searchOptimumRouteLink\").click(function () {\r\n");
      out.write("    \tconsole.log($(this).attr('href').split(\"#\"));\r\n");
      out.write("    \tvar aTargetName=$(this).attr('href').split(\"#\");\r\n");
      out.write("    \tvar sTargetName = aTargetName[aTargetName.length - 1];\r\n");
      out.write("        var jqTarget = $(\"a[name=\" + sTargetName + \"]\");\r\n");
      out.write("        var checkedNum = jQuery('input[class=\"checkedPlaces[]\"]:checked').length;\r\n");
      out.write("        var sList = \"\";\r\n");
      out.write("        var addressList = new Array();\r\n");
      out.write("        \r\n");
      out.write("        $(\"#addroutes\" ).empty();\r\n");
      out.write("        jQuery('input[type=checkbox]:checked').each(function () {\r\n");
      out.write("            sList += jQuery(this).val() + \",\";\r\n");
      out.write("            addressList.push(jQuery(this).parent().children(\"p\").text());            \r\n");
      out.write("            \r\n");
      out.write("        });\r\n");
      out.write("        estimateTimeTravel(addressList, 0);\r\n");
      out.write("\t\tsetTimeout(function(){console.log(\"asdasd\");},500);\r\n");
      out.write("        console.log(\"Travellll -\" + TravelTime);\r\n");
      out.write("        var str = sList.substring(0, sList.length - 1)\r\n");
      out.write("        console.log(str);\r\n");
      out.write("        var time = jQuery(\"#timeTextField\").val();\r\n");
      out.write("        var cost = jQuery(\"#costTextField\").val();\r\n");
      out.write("        \r\n");
      out.write("        console.log($(this).position());\r\n");
      out.write("        jQuery.ajax({\r\n");
      out.write("            type: \"GET\",\r\n");
      out.write("            url: \"/route/Route\",\r\n");
      out.write("            data: 'ids=' + str + '&timespent=' + time + '&cost=' + cost,\r\n");
      out.write("            success: function (msg) {\r\n");
      out.write("            \troutes= eval(\"(\" + msg + ')');\r\n");
      out.write("            \tconsole.log(routes.length);\r\n");
      out.write("            \tfor(var i=0;i<routes.length;i++){\r\n");
      out.write("            \t\t$(\"#addroutes\").append(\"<option value=\"+(i)+\"> route\"+(i+1)+\" </option>\");\r\n");
      out.write("            \t}\r\n");
      out.write("            \t\r\n");
      out.write("            \t\r\n");
      out.write("            \tmapDraw(0,routes[0].path);\r\n");
      out.write("            \tconsole.log(routes[0].path);\r\n");
      out.write("            \t\r\n");
      out.write("            \t\r\n");
      out.write("            \t\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("        \r\n");
      out.write("        if (jqTarget.length > 0) {\r\n");
      out.write("            // animate view to the target\r\n");
      out.write("            $('html,body').animate({\r\n");
      out.write("                scrollTop: jqTarget.offset().top\r\n");
      out.write("            }, 2000);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("    \r\n");
      out.write("    $(\"#addroutes\" )\r\n");
      out.write("    .change(function() {\r\n");
      out.write("      var str = \"\";\r\n");
      out.write("      $( \"select option:selected\" ).each(function() {\r\n");
      out.write("        //str += $( this ).text() + \" \";\r\n");
      out.write("        console.log($(this).val());\r\n");
      out.write("        var index=$(this).val();\r\n");
      out.write("        //var str=$(this).text();\r\n");
      out.write("        //var len =  $(this).text().length-1;\r\n");
      out.write("        //var index = str.subString(5,len);\r\n");
      out.write("        mapDraw(index,routes[index].path);\r\n");
      out.write("        \r\n");
      out.write("        estimateTimeTravel(routes[index].path, 1)\r\n");
      out.write("      });\r\n");
      out.write("\r\n");
      out.write("    })\r\n");
      out.write("    .trigger( \"change\" );\r\n");
      out.write("</script>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/main.jsp(17,31) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("css/bootstrap.min.css");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }
}
