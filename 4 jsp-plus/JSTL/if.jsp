<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<c:set var="hp" value="${10}" scope="request" />
 
<c:if test="${hp<5}">
    <p>���Ӣ��Ҫ����</p>
</c:if>
 
<c:if test="${!(hp<5)}">
    <p>���Ӣ�۾����Լ�����������������</p>
</c:if>
 
<%
    pageContext.setAttribute("weapon", null);
    pageContext.setAttribute("lastwords", "");
    pageContext.setAttribute("items", new ArrayList());
%>
 
<c:if test="${empty weapon}">
    <p>û��װ������</p>
</c:if>
<c:if test="${empty lastwords}">
    <p>����Ҳû������</p>
</c:if>
<c:if test="${empty items}">
    <p>��Ʒ��Ϊ��</p>
</c:if>