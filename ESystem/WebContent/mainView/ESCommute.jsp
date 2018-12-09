<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<title>출퇴근정보</title>
<link href="./bootstrap/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<jsp:include page="/multiIncluding/Header.jsp"/>

   <div style="margin-top:50px; margin-bottom:30px; margin-left:70px;">
	  <button type="button" onclick="location.href='http://localhost:8090/ESystem/info'" class="btn btn-primary" style="font-size:1.5em;">INFO</button> <!--맨위 버튼 -->
	  <button type="button" onclick="location.href='http://localhost:8090/ESystem/commute'" class="btn btn-success" style="font-size:1.5em;" disabled>TIME</button>
	  <button type="button" onclick="location.href='http://localhost:8090/ESystem/data'" class="btn btn-info" style="font-size:1.5em;">DATA</button>
	  <button type="button" onclick="location.href='http://localhost:8090/ESystem/dept'" class="btn btn-warning" style="font-size:1.5em;">DEPT</button>
   </div>
<div style="margin-top:70px;">
<div style="margin-left:15px;">
<form action='commute' method='post'>
사원번호: <input type='text' name='eno'>
  <input type='submit' value='출/퇴근'>
</form>
</div>
</div>
<table class="table table-striped">
  <thead>
    <tr>
      <th>사원번호</th>
      <th>출근시각</th>
      <th>퇴근시각</th>
    </tr>
  </thead>
  <tbody>
	<c:forEach var="esCommute" items="${esCommute}">
		<tr>
	      <td>${esCommute.eno}</td>
	      <td>${esCommute.cin}</td>
	      <td>${esCommute.cout}</td>
	      <td>
	      	<a href='commuteDelete?eno=${esCommute.eno}&cin=${esCommute.cin}' class="btn btn-danger btn-xs"><span class="glyphicon glyphicon-remove"></span>Del</a>
	      </td>
    	</tr>
    </c:forEach>
  </tbody>
</table>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="./bootstrap.min.js"></script>
<jsp:include page="/multiIncluding/Tail.jsp"/>
</body>
</html>