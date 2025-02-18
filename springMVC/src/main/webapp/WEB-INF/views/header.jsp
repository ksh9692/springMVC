<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="../css/common.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
String id = request.getParameter("id");
if(id == null || id.isEmpty()){
	
}else{
	System.out.println("id : " + id);	
}
%>
<body>
	<header>
			<div id="menu">메뉴</div>
			<h2 id="title">내가만든 웹사이트</h2>
			<div id="login">
				<%if(id == null || id.isEmpty()){ %>
					<div id="login_content">
						<a href="/login">로그인</a>
						<a href="/join">회원가입</a>
					</div>
				<%}else{ %>
					<div id="login_content">
						<a href="/logout">로그아웃</a>
						<a href="/myPage">마이페이지</a>
					</div>			
				<%} %>
			</div>
		</header>
</body>
</html>