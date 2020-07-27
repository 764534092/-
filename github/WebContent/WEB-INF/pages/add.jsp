<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加客户信息</title>
</head>
<body>
<h2>增加客户信息</h2>
<form action="account/save" method="post">
    姓名：<input type="text" name="name" /><br/>
    金额：<input type="text" name="money" /><br/>
    <input type="submit" value="增加"/><br/>
</form>
</body>
</html>

