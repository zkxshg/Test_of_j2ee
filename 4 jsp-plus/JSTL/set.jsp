<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<c:set var="name" value="${'gareen'}" scope="request" />
 
ͨ����ǩ��ȡname: <c:out value="${name}" /> <br>
 
<c:remove var="name" scope="request" /> <br>
 
ͨ����ǩ��ȡname: <c:out value="${name}" /> <br>