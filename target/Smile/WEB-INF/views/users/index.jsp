<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Add Success</title>
    <meta charshet="utf-8" />
</head>
<body>
<h2>Danh sách User</h2>
<c:forEach var="item" items="${list}">
    <h4><c:out value = "${item.userName}"/></h4>
<%--    <h4>${item.userName}</h4>--%>
</c:forEach>
<a class="btn" href="<%=request.getContextPath()%>/user/add">Về trang thêm mới</a>
</body>
</html>
