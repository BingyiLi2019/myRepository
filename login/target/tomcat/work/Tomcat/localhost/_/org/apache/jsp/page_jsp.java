/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-08-25 13:36:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class page_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
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

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <title>My JSP 'index.jsp' starting page</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/js/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tfunction showPage(pageNum){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t/* window.location.href=\"page?pageNum=\"+pageNum; */\r\n");
      out.write("\t\t\t<!--阻止浏览器处理默认的事件，在这里解决超链接无法跳转的问题-->\r\n");
      out.write("\t\t\tloadPage(pageNum);\r\n");
      out.write("\t\t\twindow.event.returnValue=false; \r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction selectAll(){\r\n");
      out.write("\t\t\tvar status=$(\":checkbox:eq(0)\").is(\":checked\");\r\n");
      out.write("\t\t\t$(\":checkbox\").each(function(){\r\n");
      out.write("\t\t\t\tthis.checked=status;\r\n");
      out.write("\t\t\t})\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(function(){\r\n");
      out.write("\t\t\tloadPage(1);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\"#btn\").click(function(){\r\n");
      out.write("\t\t\t\tvar idstr='';\r\n");
      out.write("\t\t\t\tvar data=$(\"table tr td input:checked\");\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$.each(data,function(i,n){\r\n");
      out.write("\t\t\t\t\tif(i!=0){\r\n");
      out.write("\t\t\t\t\t\tidstr+=\"&\";\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tidstr+=\"id=\"+n.id;\t\t\t\t\r\n");
      out.write("\t\t\t\t})\t\r\n");
      out.write("\t\t\t\talert(idstr);\r\n");
      out.write("\t\t\t\t $.ajax({\r\n");
      out.write("\t\t\t\t\ttype:\"post\",\r\n");
      out.write("\t\t\t\t\turl:\"deleteBatch\",\r\n");
      out.write("\t\t\t\t\tdata:idstr,\r\n");
      out.write("\t\t\t\t\tsuccess:function(){\r\n");
      out.write("\t\t\t\t\t\twindow.location.href=\"showPage\";\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t}) \r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction loadPage(pageNum){\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\ttype:\"post\",\r\n");
      out.write("\t\t\t\t\turl:\"page\",\r\n");
      out.write("\t\t\t\t\tdata:{\r\n");
      out.write("\t\t\t\t\t\t\"pageNum\":pageNum,\r\n");
      out.write("\t\t\t\t\t\t\"pageSize\":3\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tsuccess:function(page){\r\n");
      out.write("\t\t\t\t\t\tvar data=page.dataList;\r\n");
      out.write("\t\t\t\t\t\tvar content='';\r\n");
      out.write("\t\t\t\t\t\tcontent+='<tr>';\r\n");
      out.write("\t\t\t\t\t\tcontent+='\t<th><input type=\"checkbox\" onchange=\"selectAll()\"></th>';\r\n");
      out.write("\t\t\t\t\t\tcontent+='\t<th>序号</th>';\r\n");
      out.write("\t\t\t\t\t\tcontent+='\t<th>id</th>';\r\n");
      out.write("\t\t\t\t\t\tcontent+='\t<th>用户名</th>';\r\n");
      out.write("\t\t\t\t\t\tcontent+='\t<th>密码</th>';\r\n");
      out.write("\t\t\t\t\t\tcontent+='\t<th>操作</th>';\r\n");
      out.write("\t\t\t\t\t\tcontent+='</tr>';\r\n");
      out.write("\t\t\t\t\t\t$.each(data,function(i,n){\r\n");
      out.write("\t\t\t\t\t\t\tcontent+='<tr>';\r\n");
      out.write("\t\t\t\t\t\t\tcontent+='\t<td><input type=\"checkbox\" id='+n.id+'></td>';\r\n");
      out.write("\t\t\t\t\t\t\tcontent+='\t<td>'+(i+1)+'</td>';\r\n");
      out.write("\t\t\t\t\t\t\tcontent+='\t<td>'+n.id+'</td>';\r\n");
      out.write("\t\t\t\t\t\t\tcontent+='\t<td>'+n.name+'</td>';\r\n");
      out.write("\t\t\t\t\t\t\tcontent+='\t<td>'+n.pwd+'</td>';\r\n");
      out.write("\t\t\t\t\t\t\tcontent+='\t<td>';\r\n");
      out.write("\t\t\t\t\t\t\tcontent+='\t\t<a href=\"update.jsp?id='+n.id+'\">修改</a>';\r\n");
      out.write("\t\t\t\t\t\t\tcontent+='\t\t<a href=\"delete?id='+n.id+'\">删除</a>';\r\n");
      out.write("\t\t\t\t\t\t\tcontent+='\t</td>';\r\n");
      out.write("\t\t\t\t\t\t\tcontent+='</tr>';\r\n");
      out.write("\t\t\t\t\t\t\t$(\"table\").html(content);\r\n");
      out.write("\t\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tvar contentBar='';\r\n");
      out.write("\t\t\t\t\t\tif(page.pageNum==1){\r\n");
      out.write("\t\t\t\t\t\t\tcontentBar+='<a href=\"javascript:void(0);\">上一页</a>';\r\n");
      out.write("\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\tcontentBar+='<a href=\"#\" onclick=\"showPage('+(page.pageNum-1)+')\">上一页</a>'\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tcontentBar+=page.pageNum\r\n");
      out.write("\t\t\t\t\t\tif(page.pageNum==page.totalNum){\r\n");
      out.write("\t\t\t\t\t\t\tcontentBar+='<a href=\"javascript:void(0);\">下一页</a>';\r\n");
      out.write("\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\tcontentBar+='<a href=\"#\" onclick=\"showPage('+(page.pageNum+1)+')\">下一页</a>'\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t$(\"tfooter\").html(contentBar);\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\terror:function(){\r\n");
      out.write("\t\t\t\t\t\talert(\"加载失败\");\r\n");
      out.write("\t\t\t\t\t}\t\r\n");
      out.write("\t\t\t\t})\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("  <form action=\"select\" method=\"post\">\r\n");
      out.write("  \t根据用户名查询：<input type=\"text\" name=\"name\">\r\n");
      out.write(" \t<input type=\"submit\" value=\"查询\"> \r\n");
      out.write("  </form>\r\n");
      out.write("  <a href=\"add.jsp\">新增用户</a>\r\n");
      out.write("  <button type=\"button\" id=\"btn\">批量删除</button>\r\n");
      out.write("  <table border=\"1px\">\r\n");
      out.write("  \t<tr>\r\n");
      out.write("  \t\t<td>序号</td>\r\n");
      out.write("  \t\t<td>id</td>\r\n");
      out.write("  \t\t<td>用户名</td>\r\n");
      out.write("  \t\t<td>密码</td>\r\n");
      out.write("  \t\t<td>操作</td>\r\n");
      out.write("  \t</tr>\r\n");
      out.write("\t  \t");
      out.write("\r\n");
      out.write("  </table>\r\n");
      out.write("  \r\n");
      out.write("  \t");
      out.write("\r\n");
      out.write("\t<tfooter></tfooter>\r\n");
      out.write("  </body>\r\n");
      out.write("  \r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}