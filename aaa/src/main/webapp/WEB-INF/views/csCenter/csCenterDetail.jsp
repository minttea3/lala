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
 <h2>Detail page</h2>
    <table border="1">
        <th> 정보 </th>
        <th> 데이터 </th>
        <tr>
            <td>작성일자</td>
            <td><fmt:formatDate value="${data.writedate}" pattern="yyyy년 MM월 dd일" /></td>
        </tr>
        <tr>
            <td>글번호</td><td>${data.idx}</td>
        </tr>
        <tr>
            <td>글쓴이</td><td>${data.writer}</td>
        </tr>
        <tr>
            <td>제목</td><td>${data.subject}</td>
        </tr>
        <tr><td>내용</td><td>${data.content}</td></tr>
    </table>
</body>
</html>