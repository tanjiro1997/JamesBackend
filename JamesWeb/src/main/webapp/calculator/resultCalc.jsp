<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>계산 결과</title>
	</head>
	<body>
		<h1>계산 결과</h1>
		<h1>계산 결과 : ${requestScope.firstNum} ${requestScope.operator} ${requestScope.secondNum } = ${requestScope.result } 입니다.</h1>
	</body>
</html>