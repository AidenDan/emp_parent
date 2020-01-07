<%--
  Created by IntelliJ IDEA.
  User: LIKUS
  Date: 2019-12-8
  Time: 22:43:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>一次上传多张图片到磁盘</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/img/aimg" enctype="multipart/form-data" method="post">
    选择图片：<input type="file" multiple name="upimg">
    <input type="submit" value="提交">
</form>
</body>
</html>
