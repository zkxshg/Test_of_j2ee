<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
     
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix='fmt' %> 
 
<%
    Date now = new Date();
    pageContext.setAttribute("now",now);
%>
 
��������: <fmt:formatDate value="${now}" pattern="G yyyy��MM��dd�� E"/><br>
����ʱ��: <fmt:formatDate value="${now}" pattern="a HH:mm:ss.S z"/><br>
������ʽ: <fmt:formatDate value="${now}" pattern="yyyy-MM-dd HH:mm:ss"/>