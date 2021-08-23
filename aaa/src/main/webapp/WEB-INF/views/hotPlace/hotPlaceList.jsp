<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>핫플레이스</h1>
	<div>지역</div>
	<select name="seoul">
	 <c:forEach items="${list}" var="list">
		<option value="${list.s_idx }">${list.zone }</option>
	</c:forEach>
	</select>
	<div>테마</div>
	<select name="thema">
	<%-- <c:forEach items="${list2}" var="list"> --%>
		<option value="${list2.t_idx }">${list2.thema }</option>
	<%-- </c:forEach> --%>
	</select>
	<button type="submit" onclick="">검색</button>
	
	<table border="1" width="700px">
		<%-- <c:forEach items="${list3}" var="list3"> --%>
		<tr>
			<th rowspan="6">이미지공간</th>
		</tr>
		<tr>
			<th>상호</th>
			<td>${list3.shopname }</td>
		</tr>
		<tr>
			<th>위치</th>
			<td>데이터</td>
		</tr>
		<tr>
			<th>영업시간</th>
			<td>데이터</td>
		</tr>
		<tr>
			<th>메뉴 & 가격</th>
			<td>데이터</td>
		</tr>
		<tr>
			<th>댓글</th>
			<td>상호데이터</td>
		</tr>
		<%-- </c:forEach> --%>
	</table>
	
</body>
</html>