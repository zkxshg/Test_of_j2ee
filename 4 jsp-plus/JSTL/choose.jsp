<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<c:set var="hp" value="${3}" scope="request" />
 
<c:choose>
    <c:when test="${hp<5}">
        <p>���Ӣ��Ҫ����</p>
    </c:when>
    <c:otherwise>
        <p>���Ӣ�۾����Լ�����������������</p>
    </c:otherwise>
</c:choose>