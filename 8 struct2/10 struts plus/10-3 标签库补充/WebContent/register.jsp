<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
                      "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
</head>
<body>
	<s:form action="login" >
		<s:textfield label="用户名" name="username"/>
		<s:password label="密码" name="password1"/>	
		<s:password label="确认密码" name="password2"/>
		<s:radio name="sex" label="性别" list="#{'0':'男','1':'女'}" value="0"/>
		<s:textarea label="个性签名" name="description" rows="5" cols="15"/>
		<s:submit value="提交"/>
	</s:form>
</body>
</html>