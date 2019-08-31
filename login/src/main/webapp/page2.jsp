<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
		function showPage(pageNum){
		
			window.location.href="page?pageNum="+pageNum;
			<!--阻止浏览器处理默认的事件，在这里解决超链接无法跳转的问题-->
			window.event.returnValue=false; 
		}
	</script>
  </head>
  
  <body>
  <form action="select" method="post">
  	根据用户名查询：<input type="text" name="name">
 	<input type="submit" value="查询"> 
  </form>
  
  <table border="1px">
  	<tr>
  		<td>序号</td>
  		<td>id</td>
  		<td>用户名</td>
  		<td>密码</td>
  		<td>操作</td>
  	</tr>
  	<c:forEach items="${page.dataList }" var="lists" varStatus="status">
  		<tr>
  			<td>${ status.count }</td>
  			<td>${lists.id })</td>
  			<td>${lists.name }</td>
  			<td>${lists.pwd }</td>
  			<td>
			  	<a href="update.jsp?id=${lists.id }">修改</a>
  				<a href="delete?id=${lists.id }">删除</a>
  			</td>
  				
  		</tr>
  	</c:forEach>
  </table>
  
  <c:if test="${page.pageNum ==1}">  
   	<a href="javascript:void(0);">上一页</a>
  </c:if>
  <c:if test="${page.pageNum !=1 }">
  	<a href="#" onclick="showPage(${page.pageNum-1})">上一页</a>
  </c:if>
  
  <label>${page.pageNum }</label>
  <%-- <select>
  	<option selected="selected">1</option>
  	<c:forEach begin="2" end="${page.totalNum }" varStatus="num">
  		<option>${num.count }</option>
  	</c:forEach>
  </select> --%>
  <c:if test="${page.pageNum == page.totalNum }">  
   	<a href="javascript:void(0);">下一页</a>
  </c:if>
  <c:if test="${page.pageNum != page.totalNum }">  
   	<a href="#" onclick="showPage(${page.pageNum+1})">下一页</a>
  </c:if>
  <a href="add.jsp">新增用户</a>
  </body>
  
</html>
