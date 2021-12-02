<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>findAll.jsp</h2><br>
	<h2>회원목록</h2>
	<table class="table table-dark">
	<tr>
		<th>글번호</th>
		<th>작성자</th>
		<th>비밀번호</th>
		<th>제목</th>
		<th>내용</th>
		<th>조회수</th>
		<th>작성시간</th>
	</tr>
	<c:forEach items="${boardList}" var="board">
	
	<tr>
		<td>${board.b_number}</td>
		<td>${board.b_writer}</td>
		<td>${board.b_password}</td>
		<td><a href="/board/detail?b_number=${board.b_number}">${board.b_title}</a></td>
		<td>${board.b_contents}</td>
		<td>${board.b_hits}</td>
		<td>${board.b_date}</td>
	</tr>
	</c:forEach>
	
	</table>
	
	
</body>
</html>