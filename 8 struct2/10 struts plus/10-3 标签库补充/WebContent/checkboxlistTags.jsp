<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
                      "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>复选框组</title>
</head>
<body>
	<s:form >
	  <s:checkboxlist label="爱好" name="interesters" 
		      list="{'足球','篮球','游泳'}" labelposition="left"/>
	  <s:checkboxlist label="课程" name="education" 
		      list="#{'a':'语文','b':'数学','c':'外语'}"
		      labelposition="left" listKey="key" listValue="value"/>
	</s:form>
</body>
</html>