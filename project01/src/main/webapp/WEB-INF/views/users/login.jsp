<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:choose>
			<c:when test="${not empty sessionScope.id }">
				<p>
					<strong>${sessionScope.id }</strong>님 로그인 되었습니다.
					<a href="${requestScope.url }">확인</a>
				</p>
			</c:when>
			<c:otherwise>
				<p>
					아이디 혹은 비밀 번호가 틀려요
					<a href="loginform?url=${requestScope.encodedUrl }">다시 시도</a>
				</p>
			</c:otherwise>
		</c:choose>
</body>
</html>