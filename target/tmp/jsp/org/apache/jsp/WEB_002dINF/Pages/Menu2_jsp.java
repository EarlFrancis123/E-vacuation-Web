/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.7.v20170914
 * Generated at: 2022-07-25 13:18:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.Pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Menu2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/Sherw/.m2/repository/org/apache/struts/struts2-core/2.5.30/struts2-core-2.5.30.jar!/META-INF/struts-tags.tld", Long.valueOf(1647323392000L));
    _jspx_dependants.put("file:/C:/Users/Sherw/.m2/repository/org/apache/struts/struts2-core/2.5.30/struts2-core-2.5.30.jar", Long.valueOf(1652784399634L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005faction_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fa_0026_005fhref_005fclass;

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
    _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fa_0026_005fhref_005fclass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005faction_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fa_0026_005fhref_005fclass.release();
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
      response.setContentType("text/html");
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
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@300;400&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<header role=\"banner\">\r\n");
      out.write("  <nav class=\"navbar navbar-expand-md navbar-dark bg-dark\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("  <a class=\"navbar-brand\" href=\"http://localhost:8080/basic-struts/index.jsp\">E-Vacuation</a>\r\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarsExample05\" aria-controls=\"navbarsExample05\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("  <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("  </button>\r\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarsExample05\">\r\n");
      out.write("  <ul class=\"navbar-nav ml-auto pl-lg-5 pl-0\">\r\n");
      out.write("  <li class=\"nav-item\">\r\n");
      out.write("  <a class=\"nav-link active\" href=\"index.jsp\">Home</a>\r\n");
      out.write("  </li>\r\n");
      out.write("  <li class=\"nav-item\">\r\n");
      out.write("    ");
      if (_jspx_meth_s_005furl_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    ");
      if (_jspx_meth_s_005fa_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("  </li>\r\n");
      out.write("  <li class=\"nav-item\">\r\n");
      out.write("    ");
      if (_jspx_meth_s_005furl_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    ");
      if (_jspx_meth_s_005fa_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("  </li>\r\n");
      out.write("  <li class=\"nav-item\">\r\n");
      out.write("    ");
      if (_jspx_meth_s_005furl_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    ");
      if (_jspx_meth_s_005fa_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("  </li>\r\n");
      out.write("\r\n");
      out.write("  </ul>\r\n");
      out.write("  <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("  <li class=\"nav-item cta-btn\">\r\n");
      out.write("    ");
      if (_jspx_meth_s_005furl_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    ");
      if (_jspx_meth_s_005fa_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("  </li>\r\n");
      out.write("  </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  </nav>\r\n");
      out.write("  </header>");
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

  private boolean _jspx_meth_s_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_005furl_005f0 = (org.apache.struts2.views.jsp.URLTag) _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005faction_005fnobody.get(org.apache.struts2.views.jsp.URLTag.class);
    try {
      _jspx_th_s_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005furl_005f0.setParent(null);
      // /WEB-INF/Pages/Menu2.jsp(21,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005furl_005f0.setVar("ListEvacuation2");
      // /WEB-INF/Pages/Menu2.jsp(21,4) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005furl_005f0.setAction("ListEvacuation2");
      int _jspx_eval_s_005furl_005f0 = _jspx_th_s_005furl_005f0.doStartTag();
      if (_jspx_th_s_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_s_005fa_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_005fa_005f0 = (org.apache.struts2.views.jsp.ui.AnchorTag) _005fjspx_005ftagPool_005fs_005fa_0026_005fhref_005fclass.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    try {
      _jspx_th_s_005fa_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005fa_005f0.setParent(null);
      // /WEB-INF/Pages/Menu2.jsp(22,4) name = href type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fa_005f0.setHref("%{ListEvacuation2}");
      // /WEB-INF/Pages/Menu2.jsp(22,4) name = class type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fa_005f0.setCssClass("nav-link");
      int _jspx_eval_s_005fa_005f0 = _jspx_th_s_005fa_005f0.doStartTag();
      if (_jspx_eval_s_005fa_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_005fa_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_s_005fa_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_s_005fa_005f0.doInitBody();
        }
        do {
          out.write("Evacuations");
          int evalDoAfterBody = _jspx_th_s_005fa_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_005fa_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_s_005fa_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fs_005fa_0026_005fhref_005fclass.reuse(_jspx_th_s_005fa_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_s_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_005furl_005f1 = (org.apache.struts2.views.jsp.URLTag) _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005faction_005fnobody.get(org.apache.struts2.views.jsp.URLTag.class);
    try {
      _jspx_th_s_005furl_005f1.setPageContext(_jspx_page_context);
      _jspx_th_s_005furl_005f1.setParent(null);
      // /WEB-INF/Pages/Menu2.jsp(25,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005furl_005f1.setVar("ListEvacuee2");
      // /WEB-INF/Pages/Menu2.jsp(25,4) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005furl_005f1.setAction("ListEvacuee2");
      int _jspx_eval_s_005furl_005f1 = _jspx_th_s_005furl_005f1.doStartTag();
      if (_jspx_th_s_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_s_005fa_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_005fa_005f1 = (org.apache.struts2.views.jsp.ui.AnchorTag) _005fjspx_005ftagPool_005fs_005fa_0026_005fhref_005fclass.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    try {
      _jspx_th_s_005fa_005f1.setPageContext(_jspx_page_context);
      _jspx_th_s_005fa_005f1.setParent(null);
      // /WEB-INF/Pages/Menu2.jsp(26,4) name = href type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fa_005f1.setHref("%{ListEvacuee2}");
      // /WEB-INF/Pages/Menu2.jsp(26,4) name = class type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fa_005f1.setCssClass("nav-link");
      int _jspx_eval_s_005fa_005f1 = _jspx_th_s_005fa_005f1.doStartTag();
      if (_jspx_eval_s_005fa_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_005fa_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_s_005fa_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_s_005fa_005f1.doInitBody();
        }
        do {
          out.write("Evacuees");
          int evalDoAfterBody = _jspx_th_s_005fa_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_005fa_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_s_005fa_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fs_005fa_0026_005fhref_005fclass.reuse(_jspx_th_s_005fa_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_s_005furl_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_005furl_005f2 = (org.apache.struts2.views.jsp.URLTag) _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005faction_005fnobody.get(org.apache.struts2.views.jsp.URLTag.class);
    try {
      _jspx_th_s_005furl_005f2.setPageContext(_jspx_page_context);
      _jspx_th_s_005furl_005f2.setParent(null);
      // /WEB-INF/Pages/Menu2.jsp(29,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005furl_005f2.setVar("Weather2");
      // /WEB-INF/Pages/Menu2.jsp(29,4) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005furl_005f2.setAction("Weather2");
      int _jspx_eval_s_005furl_005f2 = _jspx_th_s_005furl_005f2.doStartTag();
      if (_jspx_th_s_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_s_005fa_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_005fa_005f2 = (org.apache.struts2.views.jsp.ui.AnchorTag) _005fjspx_005ftagPool_005fs_005fa_0026_005fhref_005fclass.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    try {
      _jspx_th_s_005fa_005f2.setPageContext(_jspx_page_context);
      _jspx_th_s_005fa_005f2.setParent(null);
      // /WEB-INF/Pages/Menu2.jsp(30,4) name = href type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fa_005f2.setHref("%{Weather2}");
      // /WEB-INF/Pages/Menu2.jsp(30,4) name = class type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fa_005f2.setCssClass("nav-link");
      int _jspx_eval_s_005fa_005f2 = _jspx_th_s_005fa_005f2.doStartTag();
      if (_jspx_eval_s_005fa_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_005fa_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_s_005fa_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_s_005fa_005f2.doInitBody();
        }
        do {
          out.write("Weather Forcast");
          int evalDoAfterBody = _jspx_th_s_005fa_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_005fa_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_s_005fa_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fs_005fa_0026_005fhref_005fclass.reuse(_jspx_th_s_005fa_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_s_005furl_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_005furl_005f3 = (org.apache.struts2.views.jsp.URLTag) _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005faction_005fnobody.get(org.apache.struts2.views.jsp.URLTag.class);
    try {
      _jspx_th_s_005furl_005f3.setPageContext(_jspx_page_context);
      _jspx_th_s_005furl_005f3.setParent(null);
      // /WEB-INF/Pages/Menu2.jsp(36,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005furl_005f3.setVar("loginPage");
      // /WEB-INF/Pages/Menu2.jsp(36,4) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005furl_005f3.setAction("LoginA");
      int _jspx_eval_s_005furl_005f3 = _jspx_th_s_005furl_005f3.doStartTag();
      if (_jspx_th_s_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fs_005furl_0026_005fvar_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_s_005fa_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_005fa_005f3 = (org.apache.struts2.views.jsp.ui.AnchorTag) _005fjspx_005ftagPool_005fs_005fa_0026_005fhref_005fclass.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    try {
      _jspx_th_s_005fa_005f3.setPageContext(_jspx_page_context);
      _jspx_th_s_005fa_005f3.setParent(null);
      // /WEB-INF/Pages/Menu2.jsp(37,4) name = href type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fa_005f3.setHref("%{loginPage}");
      // /WEB-INF/Pages/Menu2.jsp(37,4) name = class type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fa_005f3.setCssClass("nav-link");
      int _jspx_eval_s_005fa_005f3 = _jspx_th_s_005fa_005f3.doStartTag();
      if (_jspx_eval_s_005fa_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_005fa_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_s_005fa_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_s_005fa_005f3.doInitBody();
        }
        do {
          out.write("Login");
          int evalDoAfterBody = _jspx_th_s_005fa_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_005fa_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_s_005fa_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fs_005fa_0026_005fhref_005fclass.reuse(_jspx_th_s_005fa_005f3);
    }
    return false;
  }
}