<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>body{
    margin:0px;
    font-family: "Roboto", sans-serif;
	font-size:11pt;
	float:left;
	text-align:justify;
  color: white;  
  background-image: linear-gradient(45deg,#dde6e5,#d6f5e3);
    margin-left: auto;
    margin-right:auto;
    width: 1366px;
    height: 100%;
    overflow:hidden;
}

#testheader{
  background: #f2f2f2;
    width: 100%;
    height: 90px;    
    float: top;
    padding:20px 20px 0px 0px;
    }

#testheader a{
  /* text-decoration: none; */
  color: rgb(114, 112, 112);
  font-family: "Roboto", sans-serif;
}

#testsidebar{
    background: rgb(255, 217, 171);
    float: left;
    width:220px;
	min-height:1000px;
	height:auto !important;
}

#testfooter{
  background: #f2f2f2;
    height: 60px;  
    text-align: center;
    bottom: 0;
    left: 0;
    right: 0;
    padding: 20px 20px 0px 0px;
    position: fixed;
    width: 100%;
    float: bottom;
}

#container{
    overflow: hidden;
    flex: 1;
}

#main_contents{
    background: #ffffff;
    overflow: hidden;
    min-height: 1000px;
    height: auto !important;
    padding-top: 15px;
}

#sub_content{
    padding: 10px;
    margin-left: auto;
    padding-left: 10px;
    overflow :auto ;
    position: absolute ;
    width: 100%;
    height:auto;
    top: 90px;
    bottom: 20px;
    left: 220px;   

}

#contents h3{
    color: rgb(82, 179, 69);
    padding: 20px 20px 20px 20px;
    margin-left: 250px;
    font-size: 20px;
  }

  #stduentTable{
    width: 80%;
  }


/* Login Form css */


.login-page {
  width: 360px;
  padding: 8% 0 0;
  margin: auto;
}
.login-page p {
    color: firebrick;
    font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
}
.login-page .form .login{
  margin-top: -31px;
margin-bottom: 26px;
}
.form {
  position: relative;
  z-index: 1;
  background: #FFFFFF;
  max-width: 360px;
  margin: 0 auto 100px;
  padding: 45px;
  text-align: center;
  box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
}
.form input {
  font-family: "Roboto", sans-serif;
  outline: 0;
  background: #f2f2f2;
  width: 100%;
  border: 0;
  margin: 0 0 15px;
  padding: 15px;
  box-sizing: border-box;
  font-size: 14px;
}
.form button {
  font-family: "Roboto", sans-serif;
  text-transform: uppercase;
  outline: 0;
  background-color: #328f8a;
  background-image: linear-gradient(45deg,#328f8a,#08ac4b);
  width: 100%;
  border: 0;
  padding: 15px;
  color: #FFFFFF;
  font-size: 14px;
  -webkit-transition: all 0.3 ease;
  transition: all 0.3 ease;
  cursor: pointer;
}
.form .message {
  margin: 15px 0 0;
  color: #b3b3b3;
  font-size: 12px;
}
.form .message a {
  color: #4CAF50;
  text-decoration: none;
}

.login-page-body {
  background-color: #328f8a;
  background-image: linear-gradient(45deg,#328f8a,#08ac4b);
  font-family: "Roboto", sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  width: 100%;
    height: 100%;
    overflow: hidden;
    color: rgb(0, 0, 0);
}


/* Fixed sidenav, full height */
.sidenav {
    height: 100%;
    width: 200px;
    position: absolute;
    z-index: 0;
    left: 0;
    font-family: "Roboto", sans-serif;
    /* background-color: rgb(154, 255, 133); */
    background-image: linear-gradient(45deg,#328f8a,#08ac4b);
    overflow-x: hidden;
    padding-top: 20px;
    float: left;
  }
  
  /* Style the sidenav links and the dropdown button */
  .sidenav a, .dropdown-btn {
    padding: 6px 8px 6px 16px;
    text-decoration: none;
    font-size: 16px;
    font-family: "Roboto", sans-serif;
    color: #ffffff;
    display: block;
    border: none;
    background: none;
    width: 100%;
    text-align: left;
    cursor: pointer;
    outline: none;
  }
  
  /* On mouse-over */
  .sidenav a:hover, .dropdown-btn:hover {
    color: #000000;
  }
  
  /* Main content */
  .main {
    margin-left: 200px; /* Same as the width of the sidenav */
    font-size: 20px; /* Increased text to enable scrolling */
    padding: 0px 10px;
  }
  
  /* Add an active class to the active dropdown button */
  .active {
    background-color: rgb(145, 145, 145);
    color: white;
  }
  
  /* Dropdown container (hidden by default). Optional: add a lighter background color and some left padding to change the design of the dropdown content */
  .dropdown-container {
    display: none;
    background-color: rgb(145, 145, 145);
    padding-left: 8px;
  }
  
  /* Optional: Style the caret down icon */
  .fa-caret-down {
    float: right;
    padding-right: 8px;
  }
  
  /* Some media queries for responsiveness */
  @media screen and (max-height: 450px) {
    .sidenav {padding-top: 15px;}
    .sidenav a {font-size: 18px;}
  }</style>
<title> Student Registration LGN001 </title>
</head>
<body class="login-page-body"> 
  
    <div class="login-page">
      <div class="form">
        <div class="login">
          <div class="login-header">
            <h1>Welcome!</h1>
            
          </div>
        </div>
        <p><b style="color:red;">${error}</b></p>
        <form class="login-form" action="UserLogin" method="post">
        <input type="text" placeholder="Name" name="name" value="${bean.name}"/>
          <input type="email" placeholder="E-Mail" name="email" value="${bean.email}"/>
          <input type="password" placeholder="Password" name="pas" value="${bean.pas}"/>
          <button type="submit">login</button>
          <p class="message">Not registered? <a href="USR001.jsp">Create an account</a></p>
        </form>
      </div>
    </div>
</body>

</html>