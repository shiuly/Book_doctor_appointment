package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class adminlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<?xml version='1.0' encoding='UTF-8' ?>\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\"\n");
      out.write("      xmlns:h=\"http://xmlns.jcp.org/jsf/html\"\n");
      out.write("      xmlns:p=\"http://primefaces.org/ui\"\n");
      out.write("      xmlns:ui=\"http://xmlns.jcp.org/jsf/facelets\">\n");
      out.write("    <h:head>\n");
      out.write("        <title>Admin Login</title>\n");
      out.write("        <meta charset=\"utf-8\"/>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"/>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/jquery-3.3.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <style>\n");
      out.write("            /* Remove the navbar's default margin-bottom and rounded borders */ \n");
      out.write("            .navbar {\n");
      out.write("                margin-bottom: 0;\n");
      out.write("                border-radius: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Set height of the grid so .sidenav can be 100% (adjust as needed) */\n");
      out.write("            .row.content {height: 450px}\n");
      out.write("\n");
      out.write("            /* Set gray background color and 100% height */\n");
      out.write("            .sidenav {\n");
      out.write("                padding-top: 20px;\n");
      out.write("                background-color: #f1f1f1;\n");
      out.write("                height: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Set black background color, white text and some padding */\n");
      out.write("            footer {\n");
      out.write("                background-color:whitesmoke;\n");
      out.write("                color: black;\n");
      out.write("                padding: 15px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* On small screens, set height to 'auto' for sidenav and grid */\n");
      out.write("            @media screen and (max-width: 767px) {\n");
      out.write("                .sidenav {\n");
      out.write("                    height: auto;\n");
      out.write("                    padding: 15px;\n");
      out.write("                }\n");
      out.write("                .row.content {height:auto;} \n");
      out.write("            }\n");
      out.write("              table {  \n");
      out.write("                border-collapse: collapse;  \n");
      out.write("                width: 100%;  \n");
      out.write("            }  \n");
      out.write("            th, td {  \n");
      out.write("                text-align: left;  \n");
      out.write("                padding: 8px;  \n");
      out.write("            }  \n");
      out.write("\n");
      out.write("            tr{background-color: #f2f2f2} \n");
      out.write("            th {  \n");
      out.write("                background-color: #4CAF50;  \n");
      out.write("                color: white;  \n");
      out.write("            }  \n");
      out.write("        </style>\n");
      out.write("    </h:head>\n");
      out.write("    <h:body>\n");
      out.write("        <!--   NavBar Starting     -->\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\"><img src=\"pic/logo.png\" alt=\"logo\"/></a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">HOME <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">HOW TO USE <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            REGISTRATION\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Patient Registration</a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Hospital registration</a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Doctor Registration</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">APPOINTMENT <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\"> ADMINLOGIN <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("                    <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\"/>\n");
      out.write("                    <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--   NavBar Closing     -->\n");
      out.write("        <hr></hr>\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid text-center\">  \n");
      out.write("            <!-- left side bar start -->\n");
      out.write("            <div class=\"row content\">\n");
      out.write("                <div class=\"col-sm-2 sidenav\">\n");
      out.write("                    <p> <img src=\"pic/PIC.jpg\" class=\"rounded-circle\" alt=\"pic\" width=\"150\" height=\"150\"/></p>\n");
      out.write("                    <h3>Available Doctor</h3>\n");
      out.write("                    <p>Dr.Shiuly parvin</p>\n");
      out.write("                    <p>heart specialist</p>\n");
      out.write("                    <p><p:commandButton action=\"#\" value=\"Get Appointment\"/> </p>\n");
      out.write("                </div>\n");
      out.write("                <!-- left side bar END  -->\n");
      out.write("                <div class=\"col-sm-8 text-left\"> \n");
      out.write("                   ");


            Connection con = null;

            PreparedStatement ps = null;

            ResultSet rs = null;

            String driverName = "com.mysql.cj.jdbc.Driver";

            String url = "jdbc:mysql://localhost:3306/doctor";

            String user = "root";

            String password = "apcl123456";

            String sql = "select usertype from userdetail";

            try {

                Class.forName(driverName);

                con = DriverManager.getConnection(url, user, password);

                ps = con.prepareStatement(sql);

                rs = ps.executeQuery();

        
      out.write("\n");
      out.write("\n");
      out.write("        <form method=\"post\" action=\"adminproces.jsp\" style=\"background:skyblue\"style=\"margin-bottom: 10px;margin-top: 10px\">\n");
      out.write("\n");
      out.write("            <center><h2 style=\"color:green\">Admin Login</h2></center>\n");
      out.write("\n");
      out.write("            <table border=\"1\" align=\"center\" >\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("\n");
      out.write("                    <td>Enter Your Name :</td>\n");
      out.write("\n");
      out.write("                    <td><input type=\"text\" name=\"name\"/></td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("\n");
      out.write("                    <td>Enter Your Password :</td>\n");
      out.write("\n");
      out.write("                    <td><input type=\"password\" name=\"password\"/></td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("\n");
      out.write("                    <td>Select UserType</td>\n");
      out.write("\n");
      out.write("                    <td><select name=\"usertype\">\n");
      out.write("\n");
      out.write("                            <option value=\"select\">select</option>\n");
      out.write("\n");
      out.write("                            ");
    while (rs.next()) {

                                    String usertype = rs.getString("usertype");

                            
      out.write("\n");
      out.write("\n");
      out.write("                            <option value=");
      out.print(usertype);
      out.write('>');
      out.print(usertype);
      out.write("</option>\n");
      out.write("\n");
      out.write("                            ");


                                    }

                                } catch (SQLException sqe) {

                                    out.println("adminlogin" + sqe);

                                }

                            
      out.write("\n");
      out.write("\n");
      out.write("                        </select>\n");
      out.write("\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("\n");
      out.write("                    <td></td>\n");
      out.write("\n");
      out.write("                    <td><input type=\"submit\" value=\"submit\"/></td>\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <!-- right side bar start   -->\n");
      out.write("                <div class=\"col-sm-2 sidenav\">\n");
      out.write("                    <div class=\"well\">\n");
      out.write("                        <p>ADS</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"well\">\n");
      out.write("                        <p>ADS</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- right side bar end -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <footer class=\"container-fluid text-center\">\n");
      out.write("\n");
      out.write("            <div class=\"container\" >\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-6 \">\n");
      out.write("                        <p>@\n");
      out.write("                            <a href=\"#\">Sebaghar</a>\n");
      out.write("                            \"Help line:\n");
      out.write("                            <span>01724730346</span>\n");
      out.write("                            \"\n");
      out.write("                        </p>\n");
      out.write("                        <p>\n");
      out.write("                            Address:Dhanmondi,Dhaka;\n");
      out.write("                        </p>\n");
      out.write("                        <p>\n");
      out.write("                            Email:sebaghar@gmail.com\n");
      out.write("                        </p>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-6 \">\n");
      out.write("                        <p>\n");
      out.write("                            <a href=\"#\"> Please Call Us for doctor appointments and online Prescription</a>\n");
      out.write("                        </p>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("    </h:body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
