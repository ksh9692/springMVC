<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<form method="POST">
		<p>아이디 : <input type="text" name="id"> <button id="duplicateCheckBtn">중복확인</button></p>
		<p>비밀번호 : <input type="password" name="password"></p>
		<p>비밀번호 확인 : <input type="password" name="passwordReConfirm"> <span id="confirmOk">사용가능합니다</span></p>
		<p>이름 : <input type="text" name="name" /></p>
		<p>전화번호 : <input type="number" name="phoneNum" /></p>
		<p>주민번호 : <input type="number" name="birthday" /></p>
		<p><input type="submit" value="저장" />
	</form>
</body>
</html>