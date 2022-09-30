<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
<c:set var="heros" value="Tim,Eck;Bade|Lex!Caliste" />
 
<c:forTokens items="${heros}" delims=":;|!" var="hero">
    <c:out value="${hero}" /> <br />
</c:forTokens>