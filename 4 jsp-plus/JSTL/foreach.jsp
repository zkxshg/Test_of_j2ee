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
 
<!-- 使用jsp中的for循环来遍历List -->
<table width="200px" align="center" border="1" cellspacing="0">
<tr>
    <td>编号</td>
    <td>英雄</td>
</tr>
   
<%
int i =0;
for (String hero : heros) {
i++;
%>
  
<tr>
    <td><%=i%></td>
    <td><%=hero%></td>
</tr>
  
<%}%>
   
</table>
 
<br>
<!-- 使用JSTL中的c:forEach 循环来遍历List -->
<table width="200px" align="center" border="1" cellspacing="0">
<tr>
    <td>编号</td>
    <td>英雄</td>
</tr>
   
<c:forEach items="${heros}" var="hero" varStatus="st"  >
    <tr>
        <td><c:out value="${st.count}" /></td>
        <td><c:out value="${hero}" /></td>
    </tr>
</c:forEach>
</table>