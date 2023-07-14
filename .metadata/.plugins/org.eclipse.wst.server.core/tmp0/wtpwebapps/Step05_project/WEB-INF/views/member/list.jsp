<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	 <div class="container">
		<a href="${pageContext.request.contextPath }/member/upload_form">업로드 하기</a>
		<h3>자료실 목록 보기</h3>
		<table class="table table-striped">
			<thead class="table-dark">
				<tr>
					<th>번호</th>
					<th>작성자</th>
					<th>제목</th>
					<th>등록일</th>
					<th>삭제</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="tmp" items="${list }">
				<tr>
					<td>${tmp.num }</td>
					<td>${tmp.writer }</td>
					<td>${tmp.title }</td>
					<td>${tmp.regdate }</td>
					<td>
						<c:if test="${tmp.writer eq sessionScope.id }">
							<a href="javascript:deleteConfirm(${tmp.num })">삭제</a>
						</c:if>
					</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
</body>
</html>