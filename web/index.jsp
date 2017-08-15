<%--
  Created by IntelliJ IDEA.
  User: roc_peng
  Date: 2017/8/14
  Time: 19:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
    <h1>欢迎使用人员管理系统</h1>
    <a href="${root}/user/userList">点我进入人员管理系统</a>
</body>
</html>
