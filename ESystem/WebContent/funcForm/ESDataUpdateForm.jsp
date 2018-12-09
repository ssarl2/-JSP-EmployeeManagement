<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<title>자료수정</title>
<link href="./bootstrap/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<jsp:include page="/multiIncluding/Header.jsp"/><br>
<h1>자료수정</h1>
<form action='dataUpdate' method='post'>
자료번호: <input type='text' name='fno' value='${esData.fno}' readonly><br>
<label>권한등급: 
<select name="power">
<option value='${esData.power}'>선택</option>
<option value="1">브론즈</option>
<option value="2">실버</option>
<option value="3">골드</option>
<option value="4">마스터</option>
</select>
</label><br>
자료: <textarea rows="5" cols="30" name='data'>${esData.data}</textarea><br>
<input type='submit' value='저장'>
<input type='button' value='삭제' 
  onclick='location.href="dataDelete?fno=${esData.fno}";'>
<input type='button' value='취소' onclick='location.href="data"'>
</form>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="./bootstrap.min.js"></script>
<jsp:include page="/multiIncluding/Tail.jsp"/>
</body>
</html>