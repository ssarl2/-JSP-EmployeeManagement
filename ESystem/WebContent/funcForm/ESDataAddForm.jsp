<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<title>자료추가</title>
<link href="./bootstrap/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<jsp:include page="/multiIncluding/Header.jsp"/><br>
<h1>자료추가</h1>
<form action='dataAdd' method='post'>
<label>권한등급: 
<select name="power">
<option value="1">브론즈</option>
<option value="2">실버</option>
<option value="3">골드</option>
<option value="4">마스터</option>
</select>
</label><br>
자료: <textarea rows="5" cols="30" name='data'></textarea><br>
<input type='submit' value='추가'>
<input type='button' value='취소' onclick='location.href="data"'>
</form>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="./bootstrap/js/bootstrap.min.js"></script>
<jsp:include page="/multiIncluding/Tail.jsp"/>
</body>
</html>