<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib prefix="s" uri="/struts-tags"%>

<%@page isELIgnored="false"%>

<s:radio name="product.id" value="2" list="products" listValue="name"
	listKey="id" />