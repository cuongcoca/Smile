<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello World</title>
</head>
<body>
<h2>Thêm mới User</h2>
<form action="<%=request.getContextPath()%>/user/add" method="post" accept-charset="ut">
    <input type="text" placeholder="Nhập userName" name="userName">
    <input type="submit" value="Add">
</form>
</body>
</html>
