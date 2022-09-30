<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" import="bean.*"%>
  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
<%
    Hero hero =new Hero();
    hero.setName("¸ÇÂ×");
    hero.setHp(616);
     
    request.setAttribute("hero", hero);
%>
  
Ó¢ÐÛÃû×Ö £º ${hero.name} <br>
Ó¢ÐÛÑªÁ¿ £º ${hero.hp}