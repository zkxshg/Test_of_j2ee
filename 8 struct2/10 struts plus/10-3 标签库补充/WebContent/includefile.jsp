<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>include</title>
</head>
<body>
	<h4>这是被包含页面includefile.jsp</h4><br>
	传递的用户为：<% out.print(request.getParameter("user"));%>
</body>
</html>