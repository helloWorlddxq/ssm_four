<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>  
    <title>学生-登录界面</title>
  </head>
  
  <body bgcolor="#ddd" style="font-family:Microsoft YaHei" >
  <div style="text-align:center;margin-top:120px">
    <h1 >请登录</h1>
    <from:form action="/StudentLogin" method="post" >
    	<table style="margin-left:40%">
    		<caption>学生-登录</caption>
    		<tr>
    			<td>登录名:</td>
    			<td><input name="sname" type="text" size="21" ></td>
    		</tr>
    		<tr>
    			<td>密码:</td>
    			<td><input name="spass" type="password" size="21"></td>
    		</tr>
    	</table> 
    	<input type="submit" value="登录">
    	<input type="reset" value="重置"> 
    </from:form>
    <br>
    <a href="/register">新生注册</a>
    </div>
  </body>
</html>