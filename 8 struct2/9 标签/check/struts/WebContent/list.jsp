<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib prefix="s" uri="/struts-tags"%>

<%@page isELIgnored="false"%>

<s:checkboxlist value="selectedProducts" name="product.id"
	list="products" listValue="name" listKey="id" />
