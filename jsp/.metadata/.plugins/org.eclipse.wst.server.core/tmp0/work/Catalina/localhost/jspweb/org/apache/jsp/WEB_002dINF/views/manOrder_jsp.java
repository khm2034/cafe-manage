/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M26
 * Generated at: 2017-12-16 17:22:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class manOrder_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/E:/workspace/apache-tomcat-9.0.0.M26/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("file:/E:/workspace/apache-tomcat-9.0.0.M26/lib/jstl-1.2.jar", Long.valueOf(1504193458445L));
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforTokens_0026_005fvar_005fitems_005fdelims;

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
    _005fjspx_005ftagPool_005fc_005fforTokens_0026_005fvar_005fitems_005fdelims = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fforTokens_0026_005fvar_005fitems_005fdelims.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset = \"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("        <title>OTO CAFE</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/dashboard.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/custom.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("    \t<nav class=\"navbar navbar-inverse navbar-fixed-top\">\r\n");
      out.write("      \t\t<div class=\"container-fluid\">\r\n");
      out.write("        \t\t<div class=\"navbar-header\">\r\n");
      out.write("          \t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("\t\t\t            <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("\t\t\t            <span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t            <span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t            <span class=\"icon-bar\"></span>\r\n");
      out.write("          \t\t\t</button>\r\n");
      out.write("         \t\t\t<a class=\"navbar-brand\" href=\"#\">OTO CAFE</a>\r\n");
      out.write("        \t\t</div>\r\n");
      out.write("        \t\t<div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
      out.write("\t\t          <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t            <li><a href=\"manOrder\">주문목록</a></li>\r\n");
      out.write("\t\t            <li><a href=\"manList\">상품리스트</a></li>\r\n");
      out.write("\t\t            <li><a href=\"manSeat\">좌석관리</a></li>\r\n");
      out.write("\t\t            <li><a href=\"manUser\">회원관리</a></li>\r\n");
      out.write("\t\t            <li><a href=\"manStock\">재고관리</a></li>\r\n");
      out.write("\t\t            <li><a href=\"manProfit\">판매실적</a></li>\r\n");
      out.write("\t\t            <li><a href=\"/jspweb/\">로그아웃</a></li>\r\n");
      out.write("\t\t          </ul>\r\n");
      out.write("\t\t        </div>\r\n");
      out.write("\t\t      </div>\r\n");
      out.write("\t\t    </nav>\r\n");
      out.write("\r\n");
      out.write("    \t\t<div class=\"container-fluid\">\r\n");
      out.write("     \t\t\t<div class=\"row\">\r\n");
      out.write("        \t\t\t<div class=\"col-sm-3 col-md-2 sidebar\">\r\n");
      out.write("          \t\t\t\t<ul class=\"nav nav-sidebar form-left-nav\">\r\n");
      out.write("\t\t\t\t            <li class=\"active\"><a href=\"manOrder\">주문목록<span class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("\t\t\t\t            <li><a href=\"manList\">상품리스트</a></li>\r\n");
      out.write("\t\t\t\t            <li><a href=\"manSeat\">좌석관리</a></li>\r\n");
      out.write("\t\t\t\t            <li><a href=\"manUser\">회원관리</a></li>\r\n");
      out.write("\t\t\t\t            <li><a href=\"manStock\">재고관리</a></li>\r\n");
      out.write("\t\t\t           \t\t<li><a href=\"manProfit\">판매실적</a></li>\r\n");
      out.write("\t\t\t\t        </ul>\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main\">\r\n");
      out.write("          <image class=\"img-responsive center-block img-rounded\" src = \"images/main_banner.jpg\">\r\n");
      out.write("            <div class=\"form-subject\">\r\n");
      out.write("                    주문목록\r\n");
      out.write("                </div>\r\n");
      out.write("                <hr class=\"form-hr\">\r\n");
      out.write("                <!--\r\n");
      out.write("          <h1 class=\"page-header\">Dashboard</h1>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"row placeholders\">\r\n");
      out.write("            <div class=\"col-xs-6 col-sm-3 placeholder\">\r\n");
      out.write("              <img data-src=\"holder.js/200x200/auto/sky\" class=\"img-responsive\" alt=\"Generic placeholder thumbnail\">\r\n");
      out.write("              <h4>Label</h4>\r\n");
      out.write("              <span class=\"text-muted\">Something else</span>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-xs-6 col-sm-3 placeholder\">\r\n");
      out.write("              <img data-src=\"holder.js/200x200/auto/vine\" class=\"img-responsive\" alt=\"Generic placeholder thumbnail\">\r\n");
      out.write("              <h4>Label</h4>\r\n");
      out.write("              <span class=\"text-muted\">Something else</span>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-xs-6 col-sm-3 placeholder\">\r\n");
      out.write("              <img data-src=\"holder.js/200x200/auto/sky\" class=\"img-responsive\" alt=\"Generic placeholder thumbnail\">\r\n");
      out.write("              <h4>Label</h4>\r\n");
      out.write("              <span class=\"text-muted\">Something else</span>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-xs-6 col-sm-3 placeholder\">\r\n");
      out.write("              <img data-src=\"holder.js/200x200/auto/vine\" class=\"img-responsive\" alt=\"Generic placeholder thumbnail\">\r\n");
      out.write("              <h4>Label</h4>\r\n");
      out.write("              <span class=\"text-muted\">Something else</span>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <h2 class=\"sub-header\">Section title</h2>\r\n");
      out.write("          -->\r\n");
      out.write("          <div class=\"table-responsive\">\r\n");
      out.write("            <table class=\"table table-striped\">\r\n");
      out.write("              <thead class=\"form-thead\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <th style=\"text-align:center;\">날짜</th>\r\n");
      out.write("                  <th style=\"text-align:center;\">주문번호</th>\r\n");
      out.write("                  <th style=\"text-align:center;\">ID</th>\r\n");
      out.write("                  <th style=\"text-align:center;\">주문메뉴</th>\r\n");
      out.write("                  <th style=\"text-align:center;\">수량</th>\r\n");
      out.write("                  <th style=\"text-align:center;\">사이즈</th>\r\n");
      out.write("                  <th style=\"text-align:center;\">완료확인</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("              </thead>\r\n");
      out.write("              <tbody class=\"form-tbody\">\r\n");
      out.write("                ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("              </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script src= \"https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("        \r\n");
      out.write("        \tvar orderItemNum = parseInt('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${itemLength}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("');\r\n");
      out.write("        \t\r\n");
      out.write("        \t$(document).ready(function(){\r\n");
      out.write("        \t\tsetInterval(checkInsert, 1000);\r\n");
      out.write("        \t});\r\n");
      out.write("        \r\n");
      out.write("        \tfunction submitFunc(orderNum, type){\r\n");
      out.write("        \t\t\r\n");
      out.write("\t\t\t\tvar query = {\"orderNum\":orderNum, \"type\":type};\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\turl : \"manOrder/submit\",\r\n");
      out.write("\t\t\t\t\ttype : \"post\",\r\n");
      out.write("\t\t\t\t\tdata : query,\r\n");
      out.write("\t\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t\tif(data == 1){\r\n");
      out.write("\t\t\t\t\t\t\tlocation.reload();\r\n");
      out.write("\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\t\r\n");
      out.write("        \t}\r\n");
      out.write("        \t\r\n");
      out.write("        \tfunction checkInsert(){\r\n");
      out.write("        \t\t$.ajax({\r\n");
      out.write("\t\t\t\t\turl : \"manOrder/checkCount\",\r\n");
      out.write("\t\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t\tif(orderItemNum != data)\r\n");
      out.write("\t\t\t\t\t\t\tlocation.reload();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\t\r\n");
      out.write("        \t}\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/manOrder.jsp(103,16) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("row");
      // /WEB-INF/views/manOrder.jsp(103,16) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/manOrder.jsp(103,16) '${list}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${list}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t                <tr>\r\n");
            out.write("\t\t                \t<td style=\"text-align:center;\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.date}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t                \t<td style=\"text-align:center;\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.orderNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t                \t<td style=\"text-align:center;\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t                \t<td style=\"text-align:center;\">\r\n");
            out.write("\t\t                \t\t");
            if (_jspx_meth_c_005fforTokens_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("\r\n");
            out.write("\t\t                \t</td>\r\n");
            out.write("\t\t                \t<td style=\"text-align:center;\">\r\n");
            out.write("\t\t                \t\t");
            if (_jspx_meth_c_005fforTokens_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("\r\n");
            out.write("\t\t                \t</td>\r\n");
            out.write("\t\t                \t<td style=\"text-align:center;\">\r\n");
            out.write("\t\t                \t\t");
            if (_jspx_meth_c_005fforTokens_005f2(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("\r\n");
            out.write("\t\t                \t</td>\r\n");
            out.write("\t\t                \t<td style=\"text-align:center;\">\r\n");
            out.write("\t\t               \t\t\t<button type=\"button\" class=\"btn btn-default\" onclick=\"submitFunc('");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.orderNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("', 'complete')\">완료</button>\r\n");
            out.write("\t\t                     \t<button type=\"button\" class=\"btn btn-default\" onclick=\"submitFunc('");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.orderNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("', 'cancle')\">취소</button>\r\n");
            out.write("\t\t                    </td>  \r\n");
            out.write("\t\t                </tr>\r\n");
            out.write("\t\t                ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
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
    return false;
  }

  private boolean _jspx_meth_c_005fforTokens_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forTokens
    org.apache.taglibs.standard.tag.rt.core.ForTokensTag _jspx_th_c_005fforTokens_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForTokensTag) _005fjspx_005ftagPool_005fc_005fforTokens_0026_005fvar_005fitems_005fdelims.get(org.apache.taglibs.standard.tag.rt.core.ForTokensTag.class);
    boolean _jspx_th_c_005fforTokens_005f0_reused = false;
    try {
      _jspx_th_c_005fforTokens_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforTokens_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /WEB-INF/views/manOrder.jsp(109,20) name = items type = javax.el.ValueExpression reqTime = true required = true fragment = false deferredValue = true expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_c_005fforTokens_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/manOrder.jsp(109,20) '${row.fullMenu}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${row.fullMenu}",java.lang.String.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/views/manOrder.jsp(109,20) name = delims type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforTokens_005f0.setDelims(",");
      // /WEB-INF/views/manOrder.jsp(109,20) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforTokens_005f0.setVar("item");
      int[] _jspx_push_body_count_c_005fforTokens_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforTokens_005f0 = _jspx_th_c_005fforTokens_005f0.doStartTag();
        if (_jspx_eval_c_005fforTokens_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t                \t\t\t");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("<br>\r\n");
            out.write("\t\t                \t\t");
            int evalDoAfterBody = _jspx_th_c_005fforTokens_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforTokens_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforTokens_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforTokens_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforTokens_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforTokens_0026_005fvar_005fitems_005fdelims.reuse(_jspx_th_c_005fforTokens_005f0);
      _jspx_th_c_005fforTokens_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforTokens_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforTokens_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforTokens_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forTokens
    org.apache.taglibs.standard.tag.rt.core.ForTokensTag _jspx_th_c_005fforTokens_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForTokensTag) _005fjspx_005ftagPool_005fc_005fforTokens_0026_005fvar_005fitems_005fdelims.get(org.apache.taglibs.standard.tag.rt.core.ForTokensTag.class);
    boolean _jspx_th_c_005fforTokens_005f1_reused = false;
    try {
      _jspx_th_c_005fforTokens_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforTokens_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /WEB-INF/views/manOrder.jsp(114,20) name = items type = javax.el.ValueExpression reqTime = true required = true fragment = false deferredValue = true expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_c_005fforTokens_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/manOrder.jsp(114,20) '${row.count}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${row.count}",java.lang.String.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/views/manOrder.jsp(114,20) name = delims type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforTokens_005f1.setDelims(",");
      // /WEB-INF/views/manOrder.jsp(114,20) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforTokens_005f1.setVar("item");
      int[] _jspx_push_body_count_c_005fforTokens_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforTokens_005f1 = _jspx_th_c_005fforTokens_005f1.doStartTag();
        if (_jspx_eval_c_005fforTokens_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t                \t\t\t");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("<br>\r\n");
            out.write("\t\t                \t\t");
            int evalDoAfterBody = _jspx_th_c_005fforTokens_005f1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforTokens_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforTokens_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforTokens_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforTokens_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforTokens_0026_005fvar_005fitems_005fdelims.reuse(_jspx_th_c_005fforTokens_005f1);
      _jspx_th_c_005fforTokens_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforTokens_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fforTokens_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforTokens_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forTokens
    org.apache.taglibs.standard.tag.rt.core.ForTokensTag _jspx_th_c_005fforTokens_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForTokensTag) _005fjspx_005ftagPool_005fc_005fforTokens_0026_005fvar_005fitems_005fdelims.get(org.apache.taglibs.standard.tag.rt.core.ForTokensTag.class);
    boolean _jspx_th_c_005fforTokens_005f2_reused = false;
    try {
      _jspx_th_c_005fforTokens_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforTokens_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /WEB-INF/views/manOrder.jsp(119,20) name = items type = javax.el.ValueExpression reqTime = true required = true fragment = false deferredValue = true expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_c_005fforTokens_005f2.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/manOrder.jsp(119,20) '${row.size}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${row.size}",java.lang.String.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/views/manOrder.jsp(119,20) name = delims type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforTokens_005f2.setDelims(",");
      // /WEB-INF/views/manOrder.jsp(119,20) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforTokens_005f2.setVar("item");
      int[] _jspx_push_body_count_c_005fforTokens_005f2 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforTokens_005f2 = _jspx_th_c_005fforTokens_005f2.doStartTag();
        if (_jspx_eval_c_005fforTokens_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t                \t\t\t");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("<br>\r\n");
            out.write("\t\t                \t\t");
            int evalDoAfterBody = _jspx_th_c_005fforTokens_005f2.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforTokens_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforTokens_005f2[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforTokens_005f2.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforTokens_005f2.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforTokens_0026_005fvar_005fitems_005fdelims.reuse(_jspx_th_c_005fforTokens_005f2);
      _jspx_th_c_005fforTokens_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforTokens_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fforTokens_005f2_reused);
    }
    return false;
  }
}