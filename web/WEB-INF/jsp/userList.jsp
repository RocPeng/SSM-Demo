<%--
  Created by IntelliJ IDEA.
  User: roc_peng
  Date: 2017/8/14
  Time: 19:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>人员列表</title>
</head>
<body>
    <span style="color: red;">${msg}</span>
    <table width="100%" border=1>
        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>生日</td>
            <td>性别</td>
            <td>地址</td>
        </tr>
        <c:forEach items="${userList }" var="user">
            <tr>
                <td>${user.id }</td>
                <td>${user.username }</td>
                <td>${user.birthday }</td>
                <td>${user.sex }</td>
                <td>${user.address}</td>
                <td><a href="${root}/user/addUser">增加</a></td>
                <td><a href="${root}/user/deleteUser?id=${user.id}">删除</a></td>
                <td><a href="${root}/user/editUser?id=${user.id}">修改</a></td>
            </tr>
        </c:forEach>

    </table>
</body>
</html>
