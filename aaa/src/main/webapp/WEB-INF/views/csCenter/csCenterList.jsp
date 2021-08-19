<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!--  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">  -->
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="userForm">
	<h1> 방명록 😊<h1>
	<!-- <div> 글을 남겨 주세요~ </div> -->
	<table border="1" cellspacing="0">
		<!--  <thead> -->
			  <tr>
				  <th> No. </th>
				  <th>글쓴이</th>
				  <th>제목</th>
				  <th>내용</th>
				  <th>작성일</th>
			  </tr>
		 <!-- </thead> -->
		 
		<!--  <tbody> -->
			 <c:forEach items="${list}" var="list">
				 <tr>
		            <td>${list.idx}&nbsp;</td>
		            <td><a href="${path}/csCenter/csCenterDetail?idx=${list.idx}">${list.writer}&nbsp;</a></td>
		            <td>${list.subject}&nbsp;</td>
		            <td style="width:200;">${list.content}&nbsp;</td>
		            <td><fmt:formatDate value="${list.writedate}" pattern="yyyy년 MM월 dd일" /></td>
				 </tr>
			</c:forEach>
		 <!-- </tbody> -->
	</table>
	<a href="<c:url value='/csCenter/csCenterCreate'/>" role="button" class="btn btn-outline-info">글쓰기</a>
</form>
</body>
</html>