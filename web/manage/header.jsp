<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>后台管理</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  
  <body>
   	<br/><br/>
    <h1>后台管理</h1>
    <br/>
    <a href="${pageContext.request.contextPath}/manage/addCategory.jsp">添加分类</a>
    <a href="${pageContext.request.contextPath}/manage/ControlServlet?op=showAllCategories">查询分类</a>
    <a href="${pageContext.request.contextPath}/manage/ControlServlet?op=showAddBookUI">添加图书</a>
    <a href="${pageContext.request.contextPath}/manage/ControlServlet?op=showAllBooks">查询图书</a>
    <a href="">待处理订单</a>
    <a href="">已处理订单</a>
    <br/>