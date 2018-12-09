<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<title>자료정보</title>
<link href="./bootstrap/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<jsp:include page="/multiIncluding/Header.jsp"/>
   <div style="margin-top:50px; margin-bottom:30px; margin-left:70px;" >
	  <button type="button" onclick="location.href='http://localhost:8090/ESystem/info'" class="btn btn-primary" style="font-size: 1.5em;">INFO</button> <!--맨위 버튼 -->
	  <button type="button" onclick="location.href='http://localhost:8090/ESystem/commute'" class="btn btn-success" style="font-size: 1.5em;">TIME</button>
	  <button type="button" onclick="location.href='http://localhost:8090/ESystem/data'" class="btn btn-info"  style="font-size: 1.5em;" disabled>DATA</button>
	  <button type="button" onclick="location.href='http://localhost:8090/ESystem/dept'" class="btn btn-warning" style="font-size: 1.5em;">DEPT</button>
   </div>
<a href='dataAdd' class="btn btn-default pull-left" style="mragin-top:30px;margin-left:15px; margin-top:40px;">자료추가</a>
<form action='dataSearch' method='get' style="padding-top:5px;">
사원번호: <input type='text' name='eno'>
  <input type='submit' value='검색'><br>
</form>
<table class="table table-striped">
  <thead>
    <tr>
      <th>자료번호</th>
      <th>권한등급</th>
      <th>사내자료</th>
    </tr>
  </thead>
  <tbody>
	<c:forEach var="esData" items="${esData}">
		<tr>
		  <td>${esData.fno}</td>
	      <td>
		    <c:choose>
				<c:when test="${esData.power == 1}">브론즈</c:when>
				<c:when test="${esData.power == 2}">실버</c:when>
				<c:when test="${esData.power == 3}">골드</c:when>
				<c:when test="${esData.power == 4}">마스터</c:when>
	      	</c:choose>
	      </td>
	      <td>${esData.data}</td>
	      <td>
		      <a href='dataUpdate?fno=${esData.fno}' class='btn btn-info btn-xs'><span class="glyphicon glyphicon-edit"></span>Edit</a>
		      <a href='dataDelete?fno=${esData.fno}' class="btn btn-danger btn-xs"><span class="glyphicon glyphicon-remove"></span>Del</a>
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