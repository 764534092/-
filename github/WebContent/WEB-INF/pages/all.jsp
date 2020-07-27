<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String appPath = request.getContextPath(); %>
<%
    pageContext.setAttribute("path", request.getContextPath());
%>
<html>
<head>
    <title>信息</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                   客户管理系统
                </h1>
            </div>
        </div>
    </div>
</div>

<div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>客户列表 —— 显示所有客户</small>
                </h1>
            </div>
        </div>
</div>
    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${path }/add">新增</a>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>名字</th>
                    <th>金额</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                 <c:forEach items="${list}" var="account" >
                 <tr>
                      <td> ${account.name}</td>
                      <td> ${account.money}</td>
                      <td>
                      <a href="${path}/update">修改</a>
                      <a href="${path}/del/${account.name}">删除</a>              
         
                      </td>>
                 </tr>
                 </c:forEach>
                 </tbody>
                 </table>
        </div>
    </div>
    </body>
</html>
