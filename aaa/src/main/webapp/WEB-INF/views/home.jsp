<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<a href='<c:url value='/csCenter/csCenterList'/>' role="button" class="btn btn-outline-info">방명록 게시판 들어가기~ </a><br>
<a href='<c:url value='/hotPlace/hotPlaceList'/>' role="button" class="btn btn-outline-info">핫플레이스 보러가기~ </a>
</body>
</html>
