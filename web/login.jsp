<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>登录界面</title>
    
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
   <div>
   <form action="${pageContext.request.contextPath}/servlet/ClientServlet?op=login" method="post" >
     <table border="1" width="438">
    		<tr>
    			<td>用户名：
    				<input type="text" name="username" />
    			</td>
    		</tr>
    		
    		<tr>
    			<td>密码：&nbsp;&nbsp;&nbsp;
    				<input type="password" name="password"/>
    			</td>
    		</tr>
    		<tr>
    			<td colspan="2">
    				<input type="submit" value="登录"/>
    			</td>
    		</tr>
    	</table>
   </form>
   </div>

  </body>
</html>
