
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
              table {  
                border-collapse: collapse;  
                width: 50%;  
            }  
            th, td {  
                text-align: left;  
                padding: 8px;  
            }  

            tr{background-color: #f2f2f2} 
            th {  
                background-color: #4CAF50;  
                color: white;  
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
                   <%

            Connection con = null;

            PreparedStatement ps = null;

            ResultSet rs = null;

            String driverName = "com.mysql.cj.jdbc.Driver";

            String url = "jdbc:mysql://localhost:3306/doctor";

            String user = "root";

            String password = "java1234";

            String sql = "select usertype from userdetail";

            try {

                Class.forName(driverName);

                con = DriverManager.getConnection(url, user, password);

                ps = con.prepareStatement(sql);

                rs = ps.executeQuery();

        %>

        <form method="post" action="adminproces.jsp" style="background:skyblue"style="margin-bottom: 10px;margin-top: 10px">

            <center><h2 style="color:green">Admin Login</h2></center>

            <table border="1" align="center" >

                <tr>

                    <td>Enter Your Name :</td>

                    <td><input type="text" name="name"/></td>

                </tr>

                <tr>

                    <td>Enter Your Password :</td>

                    <td><input type="password" name="password"/></td>

                </tr>

                <tr>

                    <td>Select UserType</td>

                    <td><select name="usertype">

                            <option value="select">select</option>

                            <%    while (rs.next()) {

                                    String usertype = rs.getString("usertype");

                            %>

                            <option value=<%=usertype%>><%=usertype%></option>

                            <%

                                    }

                                } catch (SQLException sqe) {

                                    out.println("adminlogin" + sqe);

                                }

                            %>

                        </select>

                    </td>

                </tr>

                <tr>

                    <td></td>

                    <td><input type="submit" value="submit"/></td>

            </table>

        </form>

                    
                    
                    
                    
                    
                    
                    
                    
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


