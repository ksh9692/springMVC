<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>책 수정</h1>  
	<form method="POST">  
		<p>제목 : <input type="text" name="title" value="${ data.title }" /></p>  
		<p>카테고리 : <input type="text" name="category"  value="${ data.category }" /></p>  
		<p>가격 : <input type="text" name="price"  value="${ data.price }" /></p>  
		<p><input type="submit" value="저장" />  
	</form> 
</body>
</html>