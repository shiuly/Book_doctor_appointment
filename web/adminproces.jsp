
<%@ page import="java.sql.*" %>
<?xml version='1.0' encoding='UTF-8' ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://xmlns.jcp.org/jsf/html"
      xmlns:p="http://primefaces.org/ui"
      xmlns:ui="http://xmlns.jcp.org/jsf/facelets">
    <h:head>
        <title>Admin Login</title>
        <meta charset="utf-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1"/>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="js/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <style>
            /* Remove the navbar's default margin-bottom and rounded borders */ 
            .navbar {
                margin-bottom: 0;
                border-radius: 0;
            }

            /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
            .row.content {height: 450px}

            /* Set gray background color and 100% height */
            .sidenav {
                padding-top: 20px;
                background-color: #f1f1f1;
                height: 100%;
            }

            /* Set black background color, white text and some padding */
            footer {
                background-color:whitesmoke;
                color: black;
                padding: 15px;
            }

            /* On small screens, set height to 'auto' for sidenav and grid */
            @media screen and (max-width: 767px) {
                .sidenav {
                    height: auto;
                    padding: 15px;
                }
                .row.content {height:auto;} 
            }
        </style>
    </h:head>
    <h:body>
        <!--   NavBar Starting     -->
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="#"><img src="pic/logo.png" alt="logo"/></a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="#">HOME <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="#">HOW TO USE <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            REGISTRATION
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="#">Patient Registration</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#">Hospital registration</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#">Doctor Registration</a>
                        </div>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="#">APPOINTMENT <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="#"> ADMINLOGIN <span class="sr-only">(current)</span></a>
                    </li>
                </ul>
                <form class="form-inline my-2 my-lg-0">
                    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search"/>
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                </form>
            </div>
        </nav>


        <!--   NavBar Closing     -->
        <hr></hr>

        <div class="container-fluid text-center">  
            <!-- left side bar start -->
            <div class="row content">
                <div class="col-sm-2 sidenav">
                    <p> <img src="pic/PIC.jpg" class="rounded-circle" alt="pic" width="150" height="150"/></p>
                    <h3>Available Doctor</h3>
                    <p>Dr.Shiuly parvin</p>
                    <p>heart specialist</p>
                    <p><p:commandButton action="#" value="Get Appointment"/> </p>
                </div>
                <!-- left side bar END  -->
              
                <div class="col-sm-8 text-left"> 
                      <%! String userdbName;

            String userdbPsw;

            String dbUsertype;

        %>

        <%

        Connection con= null;

        PreparedStatement ps = null;

        ResultSet rs = null;



        String driverName = "com.mysql.cj.jdbc.Driver";

        String url = "jdbc:mysql://localhost:3306/doctor";

        String user = "root";

        String dbpsw = "java1234";



        String sql = "select * from userdetail where name=? and password=? and usertype=?";



        String name = request.getParameter("name");

        String password = request.getParameter("password");

        String usertype = request.getParameter("usertype");



        if((!(name.equals(null) || name.equals("")) && !(password.equals(null) || 
        password.equals(""))) && !usertype.equals("select"))

        {

        try{

        Class.forName(driverName);

        con = DriverManager.getConnection(url, user, dbpsw);

        ps = con.prepareStatement(sql);

        ps.setString(1, name);

        ps.setString(2, password);

        ps.setString(3, usertype);

        rs = ps.executeQuery();

        if(rs.next())

        { 

        userdbName = rs.getString("name");

        userdbPsw = rs.getString("password");

        dbUsertype = rs.getString("usertype");

        if(name.equals(userdbName) && password.equals(userdbPsw) && usertype.equals(dbUsertype))

        {

        session.setAttribute("name",userdbName);

        session.setAttribute("usertype", dbUsertype); 

        response.sendRedirect("welcome.jsp"); 

        } 

        }

        else

        response.sendRedirect("error.jsp");

        rs.close();

        ps.close(); 

        }

        catch(SQLException sqe)

        {

        out.println(sqe);

        } 

        }

        else

        {

        %>

    <center><p style="color:red">Error In Login</p></center>

    <% 

    getServletContext().getRequestDispatcher("/adminlogin.jsp").include(request, 
    response);

    }

    %>

                    
                    
                    
                    
                    
                    
                    
                    
                </div>
                <!-- right side bar start   -->
                <div class="col-sm-2 sidenav">
                    <div class="well">
                        <p>ADS</p>
                    </div>
                    <div class="well">
                        <p>ADS</p>
                    </div>
                </div>
                <!-- right side bar end -->
            </div>
        </div>

        <footer class="container-fluid text-center">

            <div class="container" >
                <div class="row">
                    <div class="col-sm-6 ">
                        <p>@
                            <a href="#">Sebaghar</a>
                            "Help line:
                            <span>01724730346</span>
                            "
                        </p>
                        <p>
                            Address:Dhanmondi,Dhaka;
                        </p>
                        <p>
                            Email:sebaghar@gmail.com
                        </p>

                    </div>
                    <div class="col-sm-6 ">
                        <p>
                            <a href="#"> Please Call Us for doctor appointments and online Prescription</a>
                        </p>


                    </div>
                </div>
            </div>
        </footer>

    </h:body>
</html>



