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
	<script type="text/javascript" src="/js/jquery-3.4.1.min.js"></script>
	<script type="text/javascript">
		function showPage(pageNum){
		
			/* window.location.href="page?pageNum="+pageNum; */
			<!--阻止浏览器处理默认的事件，在这里解决超链接无法跳转的问题-->
			loadPage(pageNum);
			window.event.returnValue=false; 
		}
		
		function selectAll(){
			var status=$(":checkbox:eq(0)").is(":checked");
			$(":checkbox").each(function(){
				this.checked=status;
			})			
		}
		
		$(function(){
			loadPage(1);
			
			$("#btn").click(function(){
				var idstr='';
				var data=$("table tr td input:checked");
				
				$.each(data,function(i,n){
					if(i!=0){
						idstr+="&";
					}
					idstr+="id="+n.id;				
				})	
				alert(idstr);
				 $.ajax({
					type:"post",
					url:"deleteBatch",
					data:idstr,
					success:function(){
						window.location.href="showPage";
					}
					
				}) 
			})
		})
		
		
		function loadPage(pageNum){
			$.ajax({
					type:"post",
					url:"page",
					data:{
						"pageNum":pageNum,
						"pageSize":3
					},
					success:function(page){
						var data=page.dataList;
						var content='';
						content+='<tr>';
						content+='	<th><input type="checkbox" onchange="selectAll()"></th>';
						content+='	<th>序号</th>';
						content+='	<th>id</th>';
						content+='	<th>用户名</th>';
						content+='	<th>密码</th>';
						content+='	<th>操作</th>';
						content+='</tr>';
						$.each(data,function(i,n){
							content+='<tr>';
							content+='	<td><input type="checkbox" id='+n.id+'></td>';
							content+='	<td>'+(i+1)+'</td>';
							content+='	<td>'+n.id+'</td>';
							content+='	<td>'+n.name+'</td>';
							content+='	<td>'+n.pwd+'</td>';
							content+='	<td>';
							content+='		<a href="update.jsp?id='+n.id+'">修改</a>';
							content+='		<a href="delete?id='+n.id+'">删除</a>';
							content+='	</td>';
							content+='</tr>';
							$("table").html(content);
						})
						
						var contentBar='';
						if(page.pageNum==1){
							contentBar+='<a href="javascript:void(0);">上一页</a>';
						}else{
							contentBar+='<a href="#" onclick="showPage('+(page.pageNum-1)+')">上一页</a>'
						}
						contentBar+=page.pageNum
						if(page.pageNum==page.totalNum){
							contentBar+='<a href="javascript:void(0);">下一页</a>';
						}else{
							contentBar+='<a href="#" onclick="showPage('+(page.pageNum+1)+')">下一页</a>'
						}
						$("tfooter").html(contentBar);
					},
					error:function(){
						alert("加载失败");
					}	
				})	
		}
	</script>
  </head>
  
  <body>
  <form action="select" method="post">
  	根据用户名查询：<input type="text" name="name">
 	<input type="submit" value="查询"> 
  </form>
  <a href="add.jsp">新增用户</a>
  <button type="button" id="btn">批量删除</button>
  <table border="1px">
  	<tr>
  		<td>序号</td>
  		<td>id</td>
  		<td>用户名</td>
  		<td>密码</td>
  		<td>操作</td>
  	</tr>
	  	<%-- <c:forEach items="${page.dataList }" var="lists" varStatus="status">
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
	  	</c:forEach> --%>
  </table>
  
  	<%-- <tfooter>
	  <c:if test="${page.pageNum ==1}">  
	   	<a href="javascript:void(0);">上一页</a>
	  </c:if>
	  <c:if test="${page.pageNum !=1 }">
	  	<a href="#" onclick="showPage(${page.pageNum-1})">上一页</a>
	  </c:if>
	  
	  <label>${page.pageNum }</label>
	  <select>
	  	<option selected="selected">1</option>
	  	<c:forEach begin="2" end="${page.totalNum }" varStatus="num">
	  		<option>${num.count }</option>
	  	</c:forEach>
	  </select>
	  <c:if test="${page.pageNum == page.totalNum }">  
	   	<a href="javascript:void(0);">下一页</a>
	  </c:if>
	  <c:if test="${page.pageNum != page.totalNum }">  
	   	<a href="#" onclick="showPage(${page.pageNum+1})">下一页</a>
	  </c:if>
	  <a href="add.jsp">新增用户</a>
	</tfooter> --%>
	<tfooter></tfooter>
  </body>
  
</html>
