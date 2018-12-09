<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<title>부서수정</title>
<link href="./bootstrap/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<jsp:include page="/multiIncluding/Header.jsp"/><br>
<h1>부서수정</h1>
<form action='deptUpdate' method='post'>
부서번호: <input type='text' name='deptno' value='${esDept.deptNo}' readonly><br>
부서명: <input type='text' name='deptname' value='${esDept.deptName}'><br>
부장: <input type='text' name='manager' value='${esDept.manager}'><br>
<input type='submit' value='저장'>
<input type='button' value='삭제' 
  onclick='location.href="deptDelete?eno=${esDept.deptNo}";'>
<input type='button' value='취소' onclick='location.href="dept"'>
</form>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="./bootstrap.min.js"></script>
<jsp:include page="/multiIncluding/Tail.jsp"/>
</body>
</html>