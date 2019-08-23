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

  </head>
  
  <body>
  <form action="select" method="post">
  	根据用户名查询：<input type="text" name="name">
 	<input type="submit" value="查询"> 
  </form>
  
  <table border="1px">
  	<tr>
  		<td>id</td>
  		<td>用户名</td>
  		<td>密码</td>
  		<td>操作</td>
  	</tr>
  	<c:forEach items="${list }" var="lists">
  		<tr>
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
   <a href="add.jsp">上一页</a>
    <a href="add.jsp">下一页</a>
  <a href="add.jsp">新增用户</a>
  </body>
  
</html>
