<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="/WEB-INF/views/common/css.jsp"%>
</head>
<body>
	<%@ include file="/WEB-INF/views/common/header.jsp"%>
	<article>
		<h1>Logout Page</h1>
		
		<form action="/user/logout" method="post">
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<button>Logout</button>
		</form>
	</article>
	<%@include file="/WEB-INF/views/common/footer.jsp"%>
	<%@include file="/WEB-INF/views/common/loader.jsp"%>
	<%@include file="/WEB-INF/views/common/js.jsp"%>
</body>
</html>