<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ page errorPage="Ex02_Error.jsp" %>
	<p><%=5%0 %></p>
	<%int[] i = new int[1]; %>
	<p><%=i[5] %>></p>
	<h1>오류 발생 페이지 메인</h1>
</body>
</html>