/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2024-04-29 16:33:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class USR003_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/D:/vsCode/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/StudentRegistration_Servlet/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153361682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1676305892000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("      	<style>\r\n");
      out.write("      	@charset \"UTF-8\";\r\n");
      out.write("      	body{\r\n");
      out.write("    margin:0px;\r\n");
      out.write("    font-family: \"Roboto\", sans-serif;\r\n");
      out.write("	font-size:11pt;\r\n");
      out.write("	float:left;\r\n");
      out.write("	text-align:justify;\r\n");
      out.write("  color: white;  \r\n");
      out.write("  background-image: linear-gradient(45deg,#dde6e5,#d6f5e3);\r\n");
      out.write("    margin-left: auto;\r\n");
      out.write("    margin-right:auto;\r\n");
      out.write("    width: 1366px;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    overflow:hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#testheader{\r\n");
      out.write("  background: #f2f2f2;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 90px;    \r\n");
      out.write("    float: top;\r\n");
      out.write("    padding:20px 20px 0px 0px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("#testheader a{\r\n");
      out.write("  /* text-decoration: none; */\r\n");
      out.write("  color: rgb(114, 112, 112);\r\n");
      out.write("  font-family: \"Roboto\", sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#testsidebar{\r\n");
      out.write("    background: rgb(255, 217, 171);\r\n");
      out.write("    float: left;\r\n");
      out.write("    width:220px;\r\n");
      out.write("	min-height:1000px;\r\n");
      out.write("	height:auto !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#testfooter{\r\n");
      out.write("  background: #f2f2f2;\r\n");
      out.write("    height: 60px;  \r\n");
      out.write("    text-align: center;\r\n");
      out.write("    bottom: 0;\r\n");
      out.write("    left: 0;\r\n");
      out.write("    right: 0;\r\n");
      out.write("    padding: 20px 20px 0px 0px;\r\n");
      out.write("    position: fixed;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    float: bottom;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#container{\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("    flex: 1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#main_contents{\r\n");
      out.write("    background: #ffffff;\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("    min-height: 1000px;\r\n");
      out.write("    height: auto !important;\r\n");
      out.write("    padding-top: 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#sub_content{\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("    margin-left: auto;\r\n");
      out.write("    padding-left: 10px;\r\n");
      out.write("    overflow :auto ;\r\n");
      out.write("    position: absolute ;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height:auto;\r\n");
      out.write("    top: 90px;\r\n");
      out.write("    bottom: 20px;\r\n");
      out.write("    left: 220px;   \r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#contents h3{\r\n");
      out.write("    color: rgb(82, 179, 69);\r\n");
      out.write("    padding: 20px 20px 20px 20px;\r\n");
      out.write("    margin-left: 250px;\r\n");
      out.write("    font-size: 20px;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  #stduentTable{\r\n");
      out.write("    width: 80%;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/* Login Form css */\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".login-page {\r\n");
      out.write("  width: 360px;\r\n");
      out.write("  padding: 8% 0 0;\r\n");
      out.write("  margin: auto;\r\n");
      out.write("}\r\n");
      out.write(".login-page p {\r\n");
      out.write("    color: firebrick;\r\n");
      out.write("    font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;\r\n");
      out.write("}\r\n");
      out.write(".login-page .form .login{\r\n");
      out.write("  margin-top: -31px;\r\n");
      out.write("margin-bottom: 26px;\r\n");
      out.write("}\r\n");
      out.write(".form {\r\n");
      out.write("  position: relative;\r\n");
      out.write("  z-index: 1;\r\n");
      out.write("  background: #FFFFFF;\r\n");
      out.write("  max-width: 360px;\r\n");
      out.write("  margin: 0 auto 100px;\r\n");
      out.write("  padding: 45px;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);\r\n");
      out.write("}\r\n");
      out.write(".form input {\r\n");
      out.write("  font-family: \"Roboto\", sans-serif;\r\n");
      out.write("  outline: 0;\r\n");
      out.write("  background: #f2f2f2;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  border: 0;\r\n");
      out.write("  margin: 0 0 15px;\r\n");
      out.write("  padding: 15px;\r\n");
      out.write("  box-sizing: border-box;\r\n");
      out.write("  font-size: 14px;\r\n");
      out.write("}\r\n");
      out.write(".form button {\r\n");
      out.write("  font-family: \"Roboto\", sans-serif;\r\n");
      out.write("  text-transform: uppercase;\r\n");
      out.write("  outline: 0;\r\n");
      out.write("  background-color: #328f8a;\r\n");
      out.write("  background-image: linear-gradient(45deg,#328f8a,#08ac4b);\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  border: 0;\r\n");
      out.write("  padding: 15px;\r\n");
      out.write("  color: #FFFFFF;\r\n");
      out.write("  font-size: 14px;\r\n");
      out.write("  -webkit-transition: all 0.3 ease;\r\n");
      out.write("  transition: all 0.3 ease;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write(".form .message {\r\n");
      out.write("  margin: 15px 0 0;\r\n");
      out.write("  color: #b3b3b3;\r\n");
      out.write("  font-size: 12px;\r\n");
      out.write("}\r\n");
      out.write(".form .message a {\r\n");
      out.write("  color: #4CAF50;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login-page-body {\r\n");
      out.write("  background-color: #328f8a;\r\n");
      out.write("  background-image: linear-gradient(45deg,#328f8a,#08ac4b);\r\n");
      out.write("  font-family: \"Roboto\", sans-serif;\r\n");
      out.write("  -webkit-font-smoothing: antialiased;\r\n");
      out.write("  -moz-osx-font-smoothing: grayscale;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("    color: rgb(0, 0, 0);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/* Fixed sidenav, full height */\r\n");
      out.write(".sidenav {\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    width: 200px;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    z-index: 0;\r\n");
      out.write("    left: 0;\r\n");
      out.write("    font-family: \"Roboto\", sans-serif;\r\n");
      out.write("    /* background-color: rgb(154, 255, 133); */\r\n");
      out.write("    background-image: linear-gradient(45deg,#328f8a,#08ac4b);\r\n");
      out.write("    overflow-x: hidden;\r\n");
      out.write("    padding-top: 20px;\r\n");
      out.write("    float: left;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  /* Style the sidenav links and the dropdown button */\r\n");
      out.write("  .sidenav a, .dropdown-btn {\r\n");
      out.write("    padding: 6px 8px 6px 16px;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    font-family: \"Roboto\", sans-serif;\r\n");
      out.write("    color: #ffffff;\r\n");
      out.write("    display: block;\r\n");
      out.write("    border: none;\r\n");
      out.write("    background: none;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    text-align: left;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    outline: none;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  /* On mouse-over */\r\n");
      out.write("  .sidenav a:hover, .dropdown-btn:hover {\r\n");
      out.write("    color: #000000;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  /* Main content */\r\n");
      out.write("  .main {\r\n");
      out.write("    margin-left: 200px; /* Same as the width of the sidenav */\r\n");
      out.write("    font-size: 20px; /* Increased text to enable scrolling */\r\n");
      out.write("    padding: 0px 10px;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  /* Add an active class to the active dropdown button */\r\n");
      out.write("  .active {\r\n");
      out.write("    background-color: rgb(145, 145, 145);\r\n");
      out.write("    color: white;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  /* Dropdown container (hidden by default). Optional: add a lighter background color and some left padding to change the design of the dropdown content */\r\n");
      out.write("  .dropdown-container {\r\n");
      out.write("    display: none;\r\n");
      out.write("    background-color: rgb(145, 145, 145);\r\n");
      out.write("    padding-left: 8px;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  /* Optional: Style the caret down icon */\r\n");
      out.write("  .fa-caret-down {\r\n");
      out.write("    float: right;\r\n");
      out.write("    padding-right: 8px;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  /* Some media queries for responsiveness */\r\n");
      out.write("  @media screen and (max-height: 450px) {\r\n");
      out.write("    .sidenav {padding-top: 15px;}\r\n");
      out.write("    .sidenav a {font-size: 18px;}\r\n");
      out.write("  }\r\n");
      out.write("      	</style>\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("        integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("        integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("    \r\n");
      out.write("        <title>Course Registration</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div id=\"testheader\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=row>        \r\n");
      out.write("                <div class=\"col-md-5 \">\r\n");
      out.write("            <a href=\"MNU001.jsp\"><h3>Student Registration</h3></a>\r\n");
      out.write("        </div>  \r\n");
      out.write("        <div class=\"col-md-6\">\r\n");
      out.write("            <p>User : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("            <p>CurrentDate : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.date}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("        </div>  \r\n");
      out.write("        <div class=\"col-md-1\" >\r\n");
      out.write("            <input type=\"button\" class=\"btn-basic\" id=\"lgnout-button\" value=\"Log Out\" onclick=\"location.href='LGN001.jsp'\">\r\n");
      out.write("        </div>        \r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("    <!-- <div id=\"testsidebar\">Hello World </div> -->\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("    <div class=\"sidenav\">\r\n");
      out.write("        \r\n");
      out.write("        <button class=\"dropdown-btn\" > Class Management <i class=\"fa fa-caret-down\"></i></button>\r\n");
      out.write("        \r\n");
      out.write("            <div class=\"dropdown-container\">\r\n");
      out.write("          <a href=\"BUD003.jsp\">Course Registration </a>\r\n");
      out.write("          <a href=\"STU001.jsp\">Student Registration </a>\r\n");
      out.write("          <a href=\"ShowStudent\">Student Search </a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <a href=\"ShowUser\">Users Management</a>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"main_contents\">\r\n");
      out.write("    <div id=\"sub_content\">\r\n");
      out.write("    \r\n");
      out.write("        <form action=\"UserSearch\" method=\"post\" class=\"row g-3 mt-3 ms-2\">\r\n");
      out.write("            <div class=\"col-auto\">\r\n");
      out.write("                <label for=\"staticEmail2\" class=\"visually-hidden\">User Id</label>\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"staticEmail2\" placeholder=\"User ID\" name=\"id\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-auto\">\r\n");
      out.write("                <label for=\"inputPassword2\" class=\"visually-hidden\">User Name</label>\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"inputPassword2\" placeholder=\"User Name\" name=\"name\">\r\n");
      out.write("            </div>\r\n");
      out.write("    \r\n");
      out.write("            <div class=\"col-auto\">\r\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary mb-3\">Search</button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-auto\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-secondary \" onclick=\"location.href = 'USR001.jsp';\">\r\n");
      out.write("                \r\n");
      out.write("                    Add\r\n");
      out.write("                </button>\r\n");
      out.write("    \r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-auto\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-danger mb-3\" onclick=\"location.href = 'ShowUser.jav';\">\r\n");
      out.write("                \r\n");
      out.write("                Reset</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    	<p><b style=\"color:red;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${error}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</b></p>\r\n");
      out.write("    	<p><b style=\"color:blue;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</b></p>\r\n");
      out.write("        <table class=\"table table-striped\" id=\"stduentTable\">\r\n");
      out.write("            <thead>\r\n");
      out.write("            \r\n");
      out.write("                <tr>\r\n");
      out.write("                	<th scope=\"col\">#</th>\r\n");
      out.write("                    <th scope=\"col\">User ID</th>\r\n");
      out.write("                    <th scope=\"col\">User Name</th>\r\n");
      out.write("                    <th scope=\"col\">Details</th>\r\n");
      out.write("                    \r\n");
      out.write("                </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            \r\n");
      out.write("             ");
 int i = 1; 
      out.write("\r\n");
      out.write("            ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      boolean _jspx_th_c_005fforEach_005f0_reused = false;
      try {
        _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
        _jspx_th_c_005fforEach_005f0.setParent(null);
        // /USR003.jsp(332,12) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/USR003.jsp(332,12) '${sessionScope.list}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${sessionScope.list}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
        // /USR003.jsp(332,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f0.setVar("data");
        int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
        try {
          int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
          if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("            <tbody>\r\n");
              out.write("                <tr>  \r\n");
              out.write("                   <th scope=\"row\">");
 out.print(i++); 
              out.write("</th>\r\n");
              out.write("                    <td>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${data.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</td>\r\n");
              out.write("                    <td>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${data.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</td>\r\n");
              out.write("                    \r\n");
              out.write("                <td>\r\n");
              out.write("                    <button type=\"button\" class=\"btn btn-success \" onclick=\"location.href = 'UserUpdate?id=");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${data.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("';\">\r\n");
              out.write("                    \r\n");
              out.write("                        Update\r\n");
              out.write("                    </button>\r\n");
              out.write("                </td>\r\n");
              out.write("                <td><button type=\"submit\" class=\"btn btn-secondary mb-3\" data-bs-toggle=\"modal\"\r\n");
              out.write("                    data-bs-target=\"#exampleModal\" onclick=\"location.href = 'UserDelete?id=");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${data.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("';\">\r\n");
              out.write("                  \r\n");
              out.write("                    Delete</button></td>\r\n");
              out.write("    \r\n");
              out.write("                </tr>\r\n");
              out.write("    \r\n");
              out.write("            </tbody>\r\n");
              out.write("            ");
              int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            return;
          }
        } catch (java.lang.Throwable _jspx_exception) {
          while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
            out = _jspx_page_context.popBody();
          _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
        } finally {
          _jspx_th_c_005fforEach_005f0.doFinally();
        }
        _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
        _jspx_th_c_005fforEach_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
      }
      out.write("\r\n");
      out.write("            \r\n");
      out.write("        </table>\r\n");
      out.write("    \r\n");
      out.write("        <div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("            <div class=\"modal-dialog modal-dialog-centered\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-header\">\r\n");
      out.write("                        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Student Deletion</h5>\r\n");
      out.write("                        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-body\">\r\n");
      out.write("                        \r\n");
      out.write("                         <h5 style=\"color: rgb(127, 209, 131);\">Are you sure want to delete !</h5>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-footer\">\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-success col-md-2\" data-bs-dismiss=\"modal\">Ok</button>\r\n");
      out.write("    \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("        <div id=\"testfooter\">\r\n");
      out.write("            <span>Copyright &#169; ACE Inspiration 2022</span>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <script>\r\n");
      out.write("            /* Loop through all dropdown buttons to toggle between hiding and showing its dropdown content - This allows the user to have multiple dropdowns without any conflict */\r\n");
      out.write("            var dropdown = document.getElementsByClassName(\"dropdown-btn\");\r\n");
      out.write("            var i;\r\n");
      out.write("            \r\n");
      out.write("            for (i = 0; i < dropdown.length; i++) {\r\n");
      out.write("              dropdown[i].addEventListener(\"click\", function() {\r\n");
      out.write("              this.classList.toggle(\"active\");\r\n");
      out.write("              var dropdownContent = this.nextElementSibling;\r\n");
      out.write("              if (dropdownContent.style.display === \"block\") {\r\n");
      out.write("              dropdownContent.style.display = \"none\";\r\n");
      out.write("              } else {\r\n");
      out.write("              dropdownContent.style.display = \"block\";\r\n");
      out.write("              }\r\n");
      out.write("              });\r\n");
      out.write("            }\r\n");
      out.write("            </script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
