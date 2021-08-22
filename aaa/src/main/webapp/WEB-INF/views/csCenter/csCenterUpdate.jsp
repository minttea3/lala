<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h2>Update page</h2>
    <form name="csCenterUpdate" method="POST" action="${path}/csCenter/csCenterUpdate?idx=${data.idx}">
    
        <div>글번호 : ${data.idx}</div>
        <div>작성자 :</div>
        <div><input name="writer" value="${data.writer}" type="text"/></div>
        <div>제목 : </div>
        <div><input name="subject" value="${data.subject}" type="text"/></div>
        <div>내용</div>
        <div><input name="content" value="${data.content}" type="text"/></div>
        <div>작성일자</div>
        <div><fmt:formatDate value="${data.writedate}" pattern="yyyy년 MM월 dd일" /></div>
            <input type="submit" class="btn btn-outline-info" value="완료"/>
            <input type="reset" class="btn btn-outline-info" value="리셋"/>
        </div>
    </form>
</body>
</html>