/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.38
 * Generated at: 2019-03-19 02:03:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin.product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.NumberFormat;
import com.fashion.model.domain.Product;
import java.util.List;
import com.fashion.model.repository.ProductDAO;
import com.fashion.model.domain.Admin;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

 
	ProductDAO productDAO = new ProductDAO();

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/admin/inc/header.jsp", Long.valueOf(1552957627456L));
    _jspx_dependants.put("/admin/inc/head.jsp", Long.valueOf(1552957627425L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.fashion.model.repository.ProductDAO");
    _jspx_imports_classes.add("com.fashion.model.domain.Admin");
    _jspx_imports_classes.add("com.fashion.model.domain.Product");
    _jspx_imports_classes.add("java.text.NumberFormat");
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');

	List<Product> productList=productDAO.selectAll();

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<style>\n");
      out.write("table {\n");
      out.write("\tborder-collapse: collapse;\n");
      out.write("\tborder-spacing: 0;\n");
      out.write("\twidth: 100%;\n");
      out.write("\tborder: 1px solid #ddd;\n");
      out.write("}\n");
      out.write("\n");
      out.write("th, td {\n");
      out.write("\ttext-align: left;\n");
      out.write("\tpadding: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("tr:nth-child(even) {\n");
      out.write("\tbackground-color: #f2f2f2\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/admin/static/css/main-nav.css\"/>\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>");
      out.write("\n");
      out.write("<script>\n");
      out.write("$(function(){\n");
      out.write("\t$(\"button\").click(function(){\n");
      out.write("\t\t$(location).attr(\"href\",\"/admin/product/\");\n");
      out.write("\t});\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t");
      out.write('\n');
      out.write('\n');

	if(session.getAttribute("admin")==null){
		out.print("<script>");
		out.print("alert('올바르지 않은 경로로 접근하였네요');");
		out.print("location.href='/admin/login';");
		out.print("</script>");
	}else{
	//로그인에 성공한 사람이라면, 세션에 무언가 담은 사람이다.
	//따라서 이 요청과 관련된 세션을 세션을 얻어와 그 안에 있는
	//데이터를 끄집어 내서, 로그인 서비스를 제공하자!!
	Admin admin=(Admin)session.getAttribute("admin");
	//out.print("반갑습니다 "+admin.getName()+"님");
	//로그인을 거치지 않고 접근하려는 자는 막자!!!
	//방법?) 로그인을 하지 않았다면,  session 에 객체를 담은 적이 없기 때문에
	//         session.getAttribute("admin") 은 null 임을 이용하자!!
	

      out.write("\n");
      out.write("<div class=\"subnav\">\n");
      out.write("\t");
      out.print(admin.getName());
      out.write("님 반갑습니다\n");
      out.write("\t<a href=\"/admin/login/logout.jsp\">로그아웃</a>\n");
      out.write("</div>\n");
      out.write("<div class=\"topnav\">\n");
      out.write("  <a class=\"active\" href=\"#home\">Home</a>\n");
      out.write("  <a href=\"/admin/store\">상점관리</a>\n");
      out.write("  <a href=\"/admin/sales\">매출관리</a>\n");
      out.write("  <a href=\"/admin/product\">상품관리</a>\n");
      out.write("  <a href=\"/admin/member\">회원관리</a>\n");
      out.write("  <a href=\"/admin/cs\">고객센터</a>\n");
      out.write("</div>\n");
} 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<h2>Zebra Striped Table</h2>\n");
      out.write("\t<p>For zebra-striped tables, use the nth-child() selector and add a\n");
      out.write("\t\tbackground-color to all even (or odd) table rows:</p>\n");
      out.write("\n");
      out.write("\t<table>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<th>No</th>\n");
      out.write("\t\t\t<th>이미지</th>\n");
      out.write("\t\t\t<th>카테고리</th>\n");
      out.write("\t\t\t<th>상품명</th>\n");
      out.write("\t\t\t<th>가격</th>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t");
int num=productList.size(); 
      out.write('\n');
      out.write('	');
      out.write('	');
for(int i=0;i<productList.size();i++){
      out.write('\n');
      out.write('	');
      out.write('	');
Product product=productList.get(i); 
      out.write("\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td>");
      out.print(num-- );
      out.write("</td>\n");
      out.write("\t\t\t<td><img src=\"/data/");
      out.print(product.getFilename());
      out.write("\" width=\"50px\"/></td>\n");
      out.write("\t\t\t<td>");
      out.print(product.getSubcategory().getSub_name());
      out.write("</td>\n");
      out.write("\t\t\t<td>");
      out.print(product.getProduct_name() );
      out.write("</td>\n");
      out.write("\t\t\t<td>");
      out.print(product.getPrice() );
      out.write("</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t");
}
      out.write("\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td colspan=\"5\">\n");
      out.write("\t\t\t\t<button>상품등록</button>\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\n");
      out.write("\t</table>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
