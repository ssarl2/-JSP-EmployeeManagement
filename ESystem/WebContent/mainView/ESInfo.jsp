 <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<title>사원정보</title>
<link href="./bootstrap/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<jsp:include page="/multiIncluding/Header.jsp"/>
   <div style="margin-top:50px; margin-bottom:30px; margin-left:70px;" >
	  <button type="button" onclick="location.href='http://localhost:8090/ESystem/info'" class="btn btn-primary" style="font-size:1.5em;" disabled>INFO</button> <!--맨위 버튼 -->
	  <button type="button" onclick="location.href='http://localhost:8090/ESystem/commute'" class="btn btn-success" style="font-size:1.5em;">TIME</button>
	  <button type="button" onclick="location.href='http://localhost:8090/ESystem/data'" class="btn btn-info" style="font-size:1.5em;">DATA</button>
	  <button type="button" onclick="location.href='http://localhost:8090/ESystem/dept'" class="btn btn-warning" style="font-size:1.5em;">DEPT</button>
   </div>
<div style="margin-left:15px; margin-top:40px;">
<div style="margin-bottom:30px;">
<a href='infoAdd' class="btn btn-default pull-left">사원추가</a>
</div>
</div>
<table class="table table-striped">
  <thead>
    <tr>
      <th>사원번호</th>
      <th>이름</th>
      <th>권한등급</th>
      <th>성별</th>
      <th>부서번호</th>
      <th>휴대폰</th>
      <th>주소</th>
      <th>입사날짜</th>
      <th>수정/삭제</th>
    </tr>
  </thead>
  <tbody>
	<c:forEach var="esInfo" items="${esInfo}">
		<tr>
	      <td>${esInfo.eno}</td>
	      <td>${esInfo.ename}</td>
	      <td>
	      	<c:choose>
				<c:when test="${esInfo.power == 1}">브론즈</c:when>
				<c:when test="${esInfo.power == 2}">실버</c:when>
				<c:when test="${esInfo.power == 3}">골드</c:when>
				<c:when test="${esInfo.power == 4}">마스터</c:when>
	      	</c:choose>
	      </td>
	      <td>${esInfo.sex}</td>
	      <td>${esInfo.deptNo}</td>
	      <td>${esInfo.phone}</td>
	      <td>${esInfo.address}</td>
		  <td>${esInfo.joinDate}</td>
	      <td>
		      <a href='infoUpdate?eno=${esInfo.eno}' class='btn btn-info btn-xs'><span class="glyphicon glyphicon-edit"></span>Edit</a>
		      <a href='infoDelete?eno=${esInfo.eno}' class="btn btn-danger btn-xs"><span class="glyphicon glyphicon-remove"></span>Del</a>
		  </td>
    	</tr>
    </c:forEach>
  </tbody>
</table>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="./bootstrap/js/bootstrap.min.js"></script>
<jsp:include page="/multiIncluding/Tail.jsp"/>
</body>
</html>