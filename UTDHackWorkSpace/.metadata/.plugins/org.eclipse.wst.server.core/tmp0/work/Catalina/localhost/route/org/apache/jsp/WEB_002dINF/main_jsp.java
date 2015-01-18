/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.57
 * Generated at: 2015-01-18 03:00:36 UTC
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

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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

      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://utdallas.edu/~george.koshy/bootstrap.min.css\">\r\n");
      out.write("    <style>\r\n");
      out.write("        .form-control {\r\n");
      out.write("            max-width: 400px !important\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("<body style=\"background: url(http://images.psxextreme.com/wallpapers/ps3/seattle_nightlife_926.jpg); background-repeat: no-repeat; background-size: 1368px 662px\">\r\n");
      out.write("<form class=\"form-horizontal\" action=\"/\" method=\"post\">\r\n");
      out.write("    <h1 style=\"padding-left: 136px\">Love Travelling ?!</h1>\r\n");
      out.write("    <br/>\r\n");
      out.write("    <br/>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("        <label for=\"placeTextField\" class=\"col-sm-2 control-label\">Place</label>\r\n");
      out.write("        <div class=\"col-sm-10\">\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"placeTextField\" placeholder=\"Hola, Which City do you want to visit ?\"\r\n");
      out.write("                   name=\"place\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("        <div class=\"col-sm-offset-2 col-sm-10\">\r\n");
      out.write("            <button type=\"button\" class=\"btn btn-primary\" id=\"searchPlacesToVisit\" onclick=\"ajaxCallToShowPlacesToVisit()\">Show places to visit</button>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <table id=\"tableToShowAvailablePlaces\" class=\"table table-striped hidden\">\r\n");
      out.write("        <tr>\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("    <div id=\"hoursFormGroup\" style=\"display: none\">\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("            <label for=\"hoursTextField\" class=\"col-sm-2 control-label\">Enter the total time you have </label>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-sm-10\">\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"hoursTextField\"\r\n");
      out.write("                       placeholder=\"Enter the  total amount of time you have ?\"\r\n");
      out.write("                       name=\"hoursTextField\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("            <div class=\"col-sm-offset-2 col-sm-10\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary\" id=\"hoursButton\" onclick=\"ajaxCallToGetOptimumRoute()\">\r\n");
      out.write("                    Search Optimum Route\r\n");
      out.write("                </button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <table id=\"tableToShowOptimumRoute\" class=\"table table-striped hidden\">\r\n");
      out.write("        <tr>\r\n");
      out.write("           ");
      out.write("\r\n");
      out.write("        </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery.js\"></script>\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    jQuery(document).ready(function () {\r\n");
      out.write("        jQuery(\"#searchPlacesToVisit\").click(function () {\r\n");
      out.write("\r\n");
      out.write("            jQuery(\"#hoursFormGroup\").show();\r\n");
      out.write("        })\r\n");
      out.write("        jQuery().click(function () {\r\n");
      out.write("            //TODO logic to show the json checkboxes\r\n");
      out.write("        })\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("    function ajaxCallToShowPlacesToVisit() {\r\n");
      out.write("        var placesTextFieldValue = jQuery(\"#placeTextField\").val();\r\n");
      out.write("        jQuery.getJSON(\"/urlToPingForGettingThePlaces\", {place : placesTextFieldValue},function(returnedData){\r\n");
      out.write("            if(returnedData) {\r\n");
      out.write("                var length = Object.keys(returnedData).length;\r\n");
      out.write("                var htmlTagsToShowPlacesFromGotJSON = '';\r\n");
      out.write("                if(length>0){\r\n");
      out.write("                    htmlTagsToShowPlacesFromGotJSON = \"<tr>\";\r\n");
      out.write("                    //TODO generate HTML tags for the json that was received\r\n");
      out.write("                }\r\n");
      out.write("                if(htmlTagsToShowPlacesFromGotJSON !== null){\r\n");
      out.write("                    jQuery(\"#tableToShowOptimumRoute\").append(htmlTagsToShowPlacesFromGotJSON).removeClass(\"hidden\");\r\n");
      out.write("                    //TODO change the logic to show the hours check box only when some data is received\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            else{\r\n");
      out.write("                alert(\"There aren't any places in our book yet, get back to us soon !\");\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    function ajaxCallToGetOptimumRoute(){\r\n");
      out.write("        var hoursTextFieldValue = jQuery(\"#hoursTextField\").val();\r\n");
      out.write("        jQuery.getJSON(\"/urlToPingForTheGetRequest\", {hours : hoursTextFieldValue},function(returnedData){\r\n");
      out.write("            //TODO send the selected checkboxes values above\r\n");
      out.write("            if(returnedData){\r\n");
      out.write("                var length = Object.keys(returnedData).length;\r\n");
      out.write("                var htmlTagsToAppendGotFromJSON = '';\r\n");
      out.write("                if(length>0){\r\n");
      out.write("                    htmlTagsToAppendGotFromJSON = \"<tr>\";\r\n");
      out.write("                    //TODO logic to generate the html tags for the json data that was received\r\n");
      out.write("                }\r\n");
      out.write("                if(htmlTagsToAppendGotFromJSON !== null){\r\n");
      out.write("                    jQuery(\"#tableToShowAvailablePlaces\").append(htmlTagsToAppendGotFromJSON).removeClass(\"hidden\");\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            else{\r\n");
      out.write("                alert(\"There is no optimum route for your selection, please try with a different input!\");\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
}
