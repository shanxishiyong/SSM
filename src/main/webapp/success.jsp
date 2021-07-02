<%--
  Created by IntelliJ IDEA.
  User: sy
  Date: 2021/7/1
  Time: 下午5:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Title</title>
</head>
<body>
用户信息查询成功！<br>
用户信息是：   用户id： ${requestScope.p.id}  用户名：${requestScope.p.name}  密码：${requestScope.p.password} 备注：${requestScope.p.remark}
</body>
</html>
