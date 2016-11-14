<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<base href="<%=basePath%>">
		<link rel="stylesheet" type="text/css"
			href="<%=basePath%>jslib/bootstrap/css/bootstrap.css">
		<link rel="stylesheet" type="text/css"
			href="<%=basePath%>css/theme.css">
		<link rel="stylesheet"
			href="<%=basePath%>jslib/font-awesome/css/font-awesome.css">
		<script src="<%=basePath%>jslib/jquery-1.7.2.min.js"
			type="text/javascript"></script>

		<!-- <style type="text/css"> -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生-界面</title>
</head>
<body>
<div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
			<ul class="nav nav-tabs">
				<li class="active">
					<a href="#">首页</a>
				</li>
				<li>
					<a href="#">资料</a>
				</li>
				<li class="disabled">
					<a href="#">信息</a>
				</li>
				<li class="dropdown pull-right">
					 <a href="#" data-toggle="dropdown" class="dropdown-toggle">下拉<strong class="caret"></strong></a>
					<ul class="dropdown-menu">
						<li>
							<a href="#">操作</a>
						</li>
						<li>
							<a href="#">设置栏目</a>
						</li>
						<li>
							<a href="#">更多设置</a>
						</li>
						<li class="divider">
						</li>
						<li>
							<a href="#">分割线</a>
						</li>
					</ul>
				</li>
			</ul>
			<form class="form-search">
				<input class="input-medium search-query" type="text" /> <button type="submit" class="btn">查找</button>
			</form>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>
							学生ID
						</th>
						<th>
							学生姓名
						</th>
						<th>
							学生性别
						</th>
						<th>
							学生专业
						</th>
						<th>
							学生班级
						</th>
						<th>
							学生密码
						</th>
						<th style="width: 90px;">
									编辑
						</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${ pi.list }"  var="item">
					<tr>
						<td>
							${student.sid}
						</td>
						<td>
							${student.sname}
						</td>
						<td>
							${student.ssex}
						</td>
						<td>
							${student.spro}
						</td>
						<td>
							${student.sclass}
						</td>
						<td>
							${student.spass}
						</td>
						<td>
										<a href="<%=basePath%>toedit?sid=${student.sid}">编辑</a>
										<a href="<%=basePath%>delete?sid=${student.sid}">删除</a>
						</td>
					</tr>
					
					</c:forEach>
				</tbody>
			</table>
			<div class="page-info">
						<span>当前第${pi.current }页/共${pi.count }条/${pi.total }页</span>
						
						<c:if test="${pi.current gt 1 }">
							<a href="StudentList?current=1">首页</a>
							<a href="StudentList?current=${pi.current - 1 }">上一页</a>
						</c:if>
						
						<c:if test="${pi.current lt pi.total }">
							<a href="StudentList?current=${pi.current + 1 }">下一页</a>
							<a href="StudentList?current=${pi.total }">尾页</a>
						</c:if>
					</div>
		</div>
	</div>
</div>
</body>
</html>