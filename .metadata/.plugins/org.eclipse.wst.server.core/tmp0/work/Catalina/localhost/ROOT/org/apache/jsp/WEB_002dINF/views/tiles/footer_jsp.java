/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.38
 * Generated at: 2020-10-08 11:43:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.tiles;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

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
  }

  public void _jspDestroy() {
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      out.write("<footer class=\"ftco-footer\">\r\n");
      out.write("\t<div class=\"container mb-5 pb-4\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-lg col-md-6\">\r\n");
      out.write("\t\t\t\t<div class=\"ftco-footer-widget\">\r\n");
      out.write("\t\t\t\t\t<h2 class=\"ftco-heading-2 logo d-flex align-items-center\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><span class=\"flaticon-road-roller flaticon\"></span><span>Equipo</span></a>\r\n");
      out.write("\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t<p>Far far away, behind the word mountains, far from the\r\n");
      out.write("\t\t\t\t\t\tcountries.</p>\r\n");
      out.write("\t\t\t\t\t<ul class=\"ftco-footer-social list-unstyled mt-4\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"fa fa-twitter\"></span></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"fa fa-facebook\"></span></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"fa fa-instagram\"></span></a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-lg col-md-6\">\r\n");
      out.write("\t\t\t\t<div class=\"ftco-footer-widget\">\r\n");
      out.write("\t\t\t\t\t<h2 class=\"ftco-heading-2\">Links</h2>\r\n");
      out.write("\t\t\t\t\t<ul class=\"list-unstyled\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"fa fa-chevron-right mr-2\"></span>Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"fa fa-chevron-right mr-2\"></span>About\r\n");
      out.write("\t\t\t\t\t\t\t\tUs</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"fa fa-chevron-right mr-2\"></span>Rental\r\n");
      out.write("\t\t\t\t\t\t\t\tServices</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"fa fa-chevron-right mr-2\"></span>Blog</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"fa fa-chevron-right mr-2\"></span>Contact</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-lg col-md-6\">\r\n");
      out.write("\t\t\t\t<div class=\"ftco-footer-widget\">\r\n");
      out.write("\t\t\t\t\t<h2 class=\"ftco-heading-2\">Services</h2>\r\n");
      out.write("\t\t\t\t\t<ul class=\"list-unstyled\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"fa fa-chevron-right mr-2\"></span>Customer\r\n");
      out.write("\t\t\t\t\t\t\t\tServices</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"fa fa-chevron-right mr-2\"></span>Prompt\r\n");
      out.write("\t\t\t\t\t\t\t\tDelivery</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"fa fa-chevron-right mr-2\"></span>Reliable\r\n");
      out.write("\t\t\t\t\t\t\t\tEquipment</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"fa fa-chevron-right mr-2\"></span>New\r\n");
      out.write("\t\t\t\t\t\t\t\tHeavy Equipment</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-lg col-md-6\">\r\n");
      out.write("\t\t\t\t<div class=\"ftco-footer-widget\">\r\n");
      out.write("\t\t\t\t\t<h2 class=\"ftco-heading-2\">Have a Questions?</h2>\r\n");
      out.write("\t\t\t\t\t<div class=\"block-23 mb-3\">\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><span class=\"fa fa-map-marker mr-3\"></span><span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"text\">203 Fake St. Mountain View, San Francisco,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tCalifornia, USA</span></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><span class=\"fa fa-phone mr-3\"></span><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"text\">+2 392 3929 210</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><span class=\"fa fa-paper-plane mr-3\"></span><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"text\">info@yourdomain.com</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"container-fluid bg-primary py-5\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-12 text-center\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<p class=\"mb-0\">\r\n");
      out.write("\t\t\t\t\t<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\r\n");
      out.write("\t\t\t\t\tCopyright &copy;\r\n");
      out.write("\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\tdocument.write(new Date().getFullYear());\r\n");
      out.write("\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\tAll rights reserved | This template is made with <i\r\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-heart\" aria-hidden=\"true\"></i> by <a\r\n");
      out.write("\t\t\t\t\t\thref=\"https://colorlib.com\" target=\"_blank\">Colorlib</a>\r\n");
      out.write("\t\t\t\t\t<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</footer>");
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
