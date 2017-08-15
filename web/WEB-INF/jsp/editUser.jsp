<%--
  Created by IntelliJ IDEA.
  User: roc_peng
  Date: 2017/8/14
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!-- 上传图片是需要指定属性 enctype="multipart/form-data" -->
<!-- <form id="itemForm" action="" method="post" enctype="multipart/form-data"> -->
<form id="itemForm"	action="${root}/user/updateUser" method="post">
    <input type="hidden" name="id" value="${user.id}" /> 修改人员信息：
    <input type="hidden" name="birthday" value="${user.birthday}" />
    <table width="100%" border=1>
        <tr>
            <td>姓名</td>
            <td><input type="text" name="username" value="${user.username}" /></td>
        </tr>
        <tr>
            <td>性别</td>
            <td><input type="text" name="sex" value="${user.sex }" /></td>
        </tr>
        <tr>
            <td>地址</td>
            <td><textarea rows="3" cols="30" name="address">${user.address }</textarea>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="提交" />
            </td>
        </tr>
    </table>

</form>
</body>
</html>
