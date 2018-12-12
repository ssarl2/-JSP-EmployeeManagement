<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<title>사원수정</title>
<link href="./bootstrap/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<jsp:include page="/multiIncluding/Header.jsp"/><br>
<h1>사원수정</h1>
<form action='infoUpdate' method='post'>
사원번호: <input type='text' name='eno' value='${esInfo.eno}' readonly><br>
<label>접근권한: 
<select name="power">
<option value='${esInfo.power}'>선택</option>
<option value="1">브론즈</option>
<option value="2">실버</option>
<option value="3">골드</option>
<option value="4">마스터</option>
</select>
</label><br>
부서번호: <input type='text' name='deptno' value='${esInfo.deptNo}'><br>
전화번호: <input type='text' name='phone' value='${esInfo.phone}'><br>
주소: <input type='text' name='address' value='${esInfo.address}'><br>
<input type='submit' value='저장'>
<input type='button' value='삭제' 
  onclick='location.href="infoDelete?eno=${esInfo.eno}";'>
<input type='button' value='취소' onclick='location.href="info"'>
</form>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="./bootstrap.min.js"></script>
<jsp:include page="/multiIncluding/Tail.jsp"/>
</body>
</html>