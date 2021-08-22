<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head><script src="http://code.jquery.com/jquery-1.6.4.min.js"></script>
	<script type="text/javascript">
		$(function(){
			var chkObj = document.getElementsByName("RowCheck");
			var rowCnt = chkObj.length;
			
			$("input[name='allCheck']").click(function(){
				var chk_listArr = $("input[name='RowCheck']");
				for (var i=0; i<chk_listArr.length; i++){
					chk_listArr[i].checked = this.checked;
				}
			});
			$("input[name='RowCheck']").click(function(){
				if($("input[name='RowCheck']:checked").length == rowCnt){
					$("input[name='allCheck']")[0].checked = true;
				}
				else{
					$("input[name='allCheck']")[0].checked = false;
				}
			});
		});
		function deleteValue(){
			var url = "delete";    // Controller로 보내고자 하는 URL
			var valueArr = new Array();
		    var list = $("input[name='RowCheck']");
		    for(var i = 0; i < list.length; i++){
		        if(list[i].checked){ //선택되어 있으면 배열에 값을 저장함
		            valueArr.push(list[i].value);
		        }
		    }
		    if (valueArr.length == 0){
		    	alert("선택된 글이 없습니다.");
		    }
		    else{
				var chk = confirm("정말 삭제하시겠습니까?");				 
				$.ajax({
				    url : url,                    // 전송 URL
				    type : 'POST',                // POST 방식
				    traditional : true,
				    data : {
				    	valueArr : valueArr        // 보내고자 하는 data 변수 설정
				    },
	                success: function(jdata){
	                    if(jdata = 1) {
	                        alert("삭제 성공");
	                        location.replace("csCenterList") //list 로 페이지 새로고침
	                    }
	                    else{
	                        alert("삭제 실패");
	                    }
	                }
				});
			}
		}
	</script>
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
			  <th><input id="allCheck" type="checkbox" name="allCheck"></th>
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
				 	<td><input name="RowCheck" type="checkbox" value="${list.idx }"></td>
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
	<input type="button" value="선택 삭제" class="btn btn-outline-info" onclick="deleteValue();">
</form>
</body>
</html>