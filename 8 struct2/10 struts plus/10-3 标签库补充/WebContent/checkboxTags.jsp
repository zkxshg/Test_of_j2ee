<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
                      "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>checkboxTags</title>
</head>
<body>
	<s:form action="" >
	 <s:checkbox label="普通用户" name="role_user" value="true" 
	             fieldValue="role_user"/>
	 <s:checkbox label="管理员" name="role_admin"  
	             fieldValue="role_admin"/>
	</s:form>
</body>
</html>