<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<%
    List<String> heros = new ArrayList<String>();
    heros.add("hero1");
    heros.add("hero2");
    heros.add("hero3");
    heros.add("hero4");
    heros.add("hero5");
    request.setAttribute("heros",heros);
%>
 
<!-- ʹ��JSTL�е�c:forEach ѭ��������List -->
<table width="200px" align="center" border="1" cellspacing="0">
<tr>
    <td>���</td>
    <td>Ӣ��</td>
</tr>
   
<c:forEach items="${heros}" var="hero" varStatus="st"  >
    <tr>
        <td>${st.count}</td>
        <td>${hero}</td>
    </tr>
</c:forEach>
</table>