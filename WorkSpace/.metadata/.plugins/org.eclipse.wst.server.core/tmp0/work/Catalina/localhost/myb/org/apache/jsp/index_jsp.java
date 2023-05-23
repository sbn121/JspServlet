/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.75
 * Generated at: 2023-05-23 03:06:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=CHROME\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>실습용 테마</title>\r\n");
      out.write("<link rel=\"icon\" href=\"favicon.ico\" type=\"image/x-icon\">\r\n");
      out.write("<script src=\"https://kit.fontawesome.com/c47106c6a7.js\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("<script src=\"js/ie.js\"></script>\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\"\r\n");
      out.write("	integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("	integrity=\"sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<header>\r\n");
      out.write("		<div class=\"inner\">\r\n");
      out.write("			<h1>\r\n");
      out.write("				<a href=\"#\">HANUL202</a>\r\n");
      out.write("			</h1>\r\n");
      out.write("			<ul id=\"gnb\">\r\n");
      out.write("				<li><a href=\"list.js\">JSTL(TEST_DB)</a></li>\r\n");
      out.write("				<li><a href=\"#\">사원목록</a></li>\r\n");
      out.write("				<li><a href=\"#\">고객관리</a></li>\r\n");
      out.write("				<li><a href=\"list.sbn\">SBN</a></li>\r\n");
      out.write("				<!-- list.sbn을 ㅇ -->\r\n");
      out.write("				\r\n");
      out.write("				<li><a href=\"#\">게시판</a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("			<ul class=\"util\">\r\n");
      out.write("				<li><a href=\"#\">로그인</a></li>\r\n");
      out.write("				<li><a href=\"#\">회원가입</a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("	</header>\r\n");
      out.write("<body>\r\n");
      out.write("	<figure>\r\n");
      out.write("		<video src=\"img/visual.mp4\" autoplay muted loop></video>\r\n");
      out.write("		<div class=\"inner\">\r\n");
      out.write("			<h1>INNOVATION</h1>\r\n");
      out.write("			<p>\r\n");
      out.write("				Lorem ipsum dolor, sit amet consectetur adipisicing elit. <br>\r\n");
      out.write("\r\n");
      out.write("				Id praesentium molestias similique quaerat magni facere in a?\r\n");
      out.write("				Adipisci, possimus reprehenderit!\r\n");
      out.write("			</p>\r\n");
      out.write("\r\n");
      out.write("			<a href=\"#\">view detail</a>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("	</figure>\r\n");
      out.write("\r\n");
      out.write("	<section>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"inner\">\r\n");
      out.write("\r\n");
      out.write("			<h1>소개 영상</h1>\r\n");
      out.write("			<h6 style=\"text-align: center;\">유튜브 사용해보기</h6>\r\n");
      out.write("			<div class=\"wrap\">\r\n");
      out.write("				<article>\r\n");
      out.write("					<div class=\"youtube\">\r\n");
      out.write("					\r\n");
      out.write("					</div>\r\n");
      out.write("					<h2>\r\n");
      out.write("						<a href=\"#\">Lorem ipsum dolor sit.</a>\r\n");
      out.write("					</h2>\r\n");
      out.write("					<p>Lorem ipsum dolor sit, amet consectetur adipisicing elit.\r\n");
      out.write("						Vitae minus, eaque corrupti vero ad maiores!</p>\r\n");
      out.write("				</article>\r\n");
      out.write("				<article>\r\n");
      out.write("					<div class=\"youtube\">\r\n");
      out.write("					\r\n");
      out.write("					</div>\r\n");
      out.write("					<h2>\r\n");
      out.write("						<a href=\"#\">Lorem ipsum dolor sit.</a>\r\n");
      out.write("					</h2>\r\n");
      out.write("					<p>Lorem ipsum dolor sit, amet consectetur adipisicing elit.\r\n");
      out.write("						Vitae minus, eaque corrupti vero ad maiores!</p>\r\n");
      out.write("				</article>\r\n");
      out.write("				<article>\r\n");
      out.write("					<div class=\"youtube\">\r\n");
      out.write("						\r\n");
      out.write("					</div>\r\n");
      out.write("					<h2>\r\n");
      out.write("						<a href=\"#\">Lorem ipsum dolor sit.</a>\r\n");
      out.write("					</h2>\r\n");
      out.write("					<p>Lorem ipsum dolor sit, amet consectetur adipisicing elit.\r\n");
      out.write("						Vitae minus, eaque corrupti vero ad maiores!</p>\r\n");
      out.write("				</article>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("	<footer>\r\n");
      out.write("		<div class=\"inner\">\r\n");
      out.write("			<div class=\"upper\">\r\n");
      out.write("				<h1>한울직업전문학교</h1>\r\n");
      out.write("				<ul>\r\n");
      out.write("					<li><a href=\"#\">Policy</a></li>\r\n");
      out.write("					<li><a href=\"#\">Terms</a></li>\r\n");
      out.write("					<li><a href=\"#\">Family Site</a></li>\r\n");
      out.write("					<li><a href=\"#\">Sitemap</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"lower\">\r\n");
      out.write("				<address>\r\n");
      out.write("					Lorem ipsum dolor sit amet consectetur adipisicing elit. Quas,\r\n");
      out.write("					facere.<br> TEL : 062-111-1234 C.P : 010-1234-5678\r\n");
      out.write("				</address>\r\n");
      out.write("				<p>2022 Hanul &copy; copyright all right reserved.</p>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</footer>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
