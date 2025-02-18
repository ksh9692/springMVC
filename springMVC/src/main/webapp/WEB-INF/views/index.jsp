<%@page import="org.springframework.web.context.request.RequestScope"%>
<%@page import="com.controller.springMVC.UserController"%>
<%@page import="org.apache.ibatis.reflection.SystemMetaObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인페이지</title>
<link href="${path}/resources/css/common.css" rel="stylesheet"/> 
</head>
<body>
	<div id="wrap">
		<%@ include file="header.jsp" %>
		<section>
			<p>컨텐츠 보이는 부분</p>
		</section>
		<%@ include file="footer.jsp" %>
	</div>
</body>
</html>