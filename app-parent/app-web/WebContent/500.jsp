<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
{code:0,msg:"系统错误"}
<div>系统执行发生错误，信息描述如下：</div>
<div>错误状态代码是：${pageContext.errorData.statusCode}</div>
<div>错误发生页面是：${pageContext.errorData.requestURI}</div>
<div>错误信息：${pageContext.exception}</div>
<div>
	错误堆栈信息：<br />
	<c:forEach var="trace" items="${pageContext.exception.stackTrace}">
		<p>${trace}</p>
	</c:forEach>
</div>
</body>
</html>