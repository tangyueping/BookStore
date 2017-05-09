<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="/header.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <body>
  <br/>
    <a href="${pageContext.request.contextPath}/servlet/ClientServlet?op=showCategoryBooks">所有分类</a>:
    
    <c:forEach items="${cs}" var="c">
    	<a href=""> </a>
    </c:forEach>
    <hr/>
    
    
  
    <table>
    	<tr>
	    		<td>
	    			<img src="${pageContext.request.contextPath}/images/ejb.jpg"/>
	    			<img src="${pageContext.request.contextPath}/images/j2ee.jpg"/>
	    			<img src="${pageContext.request.contextPath}/images/jsf.jpg"/>
	    			<img src="${pageContext.request.contextPath}/images/java.gif"/>
	    			<img src="${pageContext.request.contextPath}/images/javamail.gif"/>
	    			<img src="${pageContext.request.contextPath}/images/javascript.gif"/>
	    			<img src="${pageContext.request.contextPath}/images/javaweb1.gif"/>
	    			<img src="${pageContext.request.contextPath}/images/javaweb2.gif"/>
	    			<img src="${pageContext.request.contextPath}/images/spring.gif"/>
	    			<img src="${pageContext.request.contextPath}/images/oracle.gif"/>
	    			<br/>
	    			书名：EJB3.0<br/>
	    			作者：DAN<br/>
	    			单价：100<br/>
	    			<a href="${pageContext.request.contextPath}/servlet/ClientServlet?op=showBookDetails">查看详细</a>
	    		</td>
    	</tr>
    </table>
    <%@ include file="/commons/page.jsp"%>
  </body>
</html>
