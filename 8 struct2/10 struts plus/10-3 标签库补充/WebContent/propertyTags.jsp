<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>property标签</title>
</head>
 <body>
	输出字符串：
	<s:property value="'www.itcast.cn'"/><br>
	忽略HTML代码：
	<s:property value="'<h3>www.itcast.cn</h3>'" escape="true"/><br>
	不忽略HTML代码：
	<s:property value="'<h3>www.itcast.cn</h3>'" escape="false"/><br>
	输出默认值：
	<s:property value="" default="true"/><br>
 </body>
</html>