<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%
    pageContext.setAttribute("path", request.getContextPath());
%>
<!DOCTYPE HTML>
<html>
<head>
<script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js"></script><!--导入cdn-->
    <title>首页</title>
    <style type="text/css">
        a {
            text-decoration: none;
            color: black;
            font-size: 18px;
        }

        h3 {
            width: 180px;
            height: 38px;
            margin: 100px auto;
            text-align: center;
            line-height: 38px;
            background: deepskyblue;
            border-radius: 4px;
        }
        body {background-image:url('890.JPG');}
    </style>
    <script>
$(document).ready(function()
		{
			$("p").mouseenter(function()
					  {
					    $("p").css("color","yellow");
					  });
					  $("p").mouseleave(function()
					  {
					    $("p").css("color","lightgray");		    
					  });	 
		});
</script>
</head>
<body>
<center style="font-size:50px;"><p >(●ˇ∀ˇ●)WELCOME!(●ˇ∀ˇ●)</p></center>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h2><center>客户管理系统
                    </center>
                </h2> 
            </div>
        </div>
    </div>
</div>
<br><br>
<h3>
    <a href="${path }/all">点击进入管理页面</a>
</h3>
</body>
</html>