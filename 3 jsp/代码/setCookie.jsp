<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="javax.servlet.http.Cookie"%>
 
<%
    Cookie c = new Cookie("name", "Gareen");
    c.setMaxAge(60 * 24 * 60);
    c.setPath("127.0.0.1");
    response.addCookie(c);
%>
 
<a href="getCookie.jsp">��ת����ȡcookie��ҳ��</a>