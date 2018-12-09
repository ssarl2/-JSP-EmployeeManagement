<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<title>부서정보</title>
<link href="./bootstrap/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<jsp:include page="/multiIncluding/Header.jsp"/>
   <div style="margin-top:50px; margin-bottom:30px; margin-left:70px;">
	  <button type="button" onclick="location.href='http://localhost:8090/ESystem/info'" class="btn btn-primary" style="font-size: 1.5em;">INFO</button> <!--맨위 버튼 -->
	  <button type="button" onclick="location.href='http://localhost:8090/ESystem/commute'" class="btn btn-success" style="font-size: 1.5em;">TIME</button>
	  <button type="button" onclick="location.href='http://localhost:8090/ESystem/data'" class="btn btn-info" style="font-size: 1.5em;">DATA</button>
	  <button type="button" onclick="location.href='http://localhost:8090/ESystem/dept'" class="btn btn-warning" style="font-size: 1.5em;" disabled>DEPT</button>
   </div>
   
<a href='deptAdd' class="btn btn-default pull-left" style="margin-left:15px; margin-top:35px;">부서추가</a>
<table class="table table-striped">
  <thead>
    <tr>
      <th>부서번호</th>
      <th>부서명</th>
      <th>부장</th>
    </tr>
  </thead>
  <tbody>
	<c:forEach var="esDept" items="${esDept}">
		<tr>
	      <td>${esDept.deptNo}</td>
	      <td>${esDept.deptName}</td>
	      <td>${esDept.manager}</td>
	      <td>
		      <a href='deptUpdate?deptno=${esDept.deptNo}' class='btn btn-info btn-xs'><span class="glyphicon glyphicon-edit"></span>Edit</a>
		      <a href='deptDelete?deptno=${esDept.deptNo}' class="btn btn-danger btn-xs"><span class="glyphicon glyphicon-remove"></span>Del</a>
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