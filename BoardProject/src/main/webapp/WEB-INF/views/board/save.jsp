<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>save.jsp</h2>
	
		<form action="/board/save" method=POST>
		작성자:<input type="text" name="b_writer"><br>
		비밀번호:<input type="password" name="b_password"><br>
		제목:<input type="text" name="b_title"><br>
		내용:<textarea name="b_contents" rows="5"></textarea><br>
		<input type="submit" value="작성">	
	</form>

</body>
</html>