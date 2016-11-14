<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML>
<html>
	<head>
		<base href="<%=basePath%>">

		<title>修改学生</title>
		<link rel="stylesheet" type="text/css"
			href="<%=basePath%>jslib/bootstrap/css/bootstrap.css">
		<link rel="stylesheet" type="text/css"
			href="<%=basePath%>css/theme.css">
		<link rel="stylesheet"
			href="<%=basePath%>jslib/font-awesome/css/font-awesome.css">
		<script src="<%=basePath%>jslib/jquery-1.7.2.min.js"
			type="text/javascript"></script>
	</head>

	<body class="content1">
		<div class="header">
			<h1 class="page-title">
				修改学生
			</h1>
		</div>

		<ul class="breadcrumb">
			<li>
				<a href="index.html">商品学生</a>
				<span class="divider">/</span>
			</li>
			<li class="active">
				修改学生
			</li>
		</ul>

		<div class="container-fluid">
			<div class="row-fluid">
				<form method="post" action="<%=basePath%>edit">
					<div class="btn-toolbar">
						<input type="submit" class="btn btn-primary" value="保存 ">
						<a href="<%=basePath%>goodlist" class="btn">取消</a>
					</div>

					<div class="well">
						<div class="tab-pane active in">	
						    <label>
								学生ID：
							</label>
							<input type="text" name="sid" value="${student.sid}" maxlength="100">
							<label>
								学生姓名：
							</label>
							<input type="text" name="sname" value="${student.sname}" maxlength="100">
							<label>
								学生性别：
							</label>
							<input type="text" name="ssex" value="${student.ssex}" maxlength="100" ">
							<label>
								学生专业：
							</label>
							<input type="text" name="spro" value="${student.spro}" maxlength="100">	
							<label>
								学生班级：
							</label>
							<input type="text" name="sclass" value="${student.sclass}" maxlength="100">
							<label>
								学生密码：
							</label>
							<input type="text" name="spass" value="${student.spass}" maxlength="100">
						</div>
					</div>
				</form>
			</div>
		</div>
	</body>
</html>
