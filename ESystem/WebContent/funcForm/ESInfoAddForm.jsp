<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<title>사원추가</title>
<link href="./bootstrap/css/bootstrap.min.css" rel="stylesheet">
</head>
<body><jsp:include page="/multiIncluding/Header.jsp"/><br>
<h1>사원추가</h1>
<form action='infoAdd' method='post'>
이름: <input type='text' name='ename'><br>
성별: <input type='text' name='sex'><br>
부서번호: <input type='text' name='deptno'><br>
전화번호: <input type='text' name='phone'><br>
주소: <input type='text' name='address'><br>
<input type='submit' value='추가'>
<input type='button' value='취소' onclick='location.href="info"'>
</form>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="./bootstrap/js/bootstrap.min.js"></script>
<jsp:include page="/multiIncluding/Tail.jsp"/>
</body>
</html>