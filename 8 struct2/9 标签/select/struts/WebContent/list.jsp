<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
 
<%@ taglib prefix="s" uri="/struts-tags"%>
 
<%@page isELIgnored="false"%>
 
<s:select label="products"
       name="product.id"
       list="products"
       listKey="id"
       listValue="name"
       multiple="true"
       size="3"
       value="selectedProducts"
/>