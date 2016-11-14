<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>  
    <title>注册界面</title>
  </head>
  
  <body bgcolor="#ddd" style="font-family:Microsoft YaHei" >
  <div style="text-align:center;margin-top:120px">
    <h1 >请注册</h1>
    <form action="StudentRegister" method="post">
    	<table style="margin-left:40%">
    		<caption>用户注册</caption>
    		<tr>
    			<td>登录名：</td>
    			<td><input name="sname" type="text" size="21"></td>
    		</tr>
    		<tr>
    			<td>性别：</td>
    			<td><input name="ssex" type="text" size="21"></td>
    		</tr>
    		<tr>
    			<td>专业：</td>
    			<td><input name="spro" type="text" size="21"></td>
    		</tr>
    		<tr>
    			<td>班级：</td>
    			<td><input name="sclass" type="text" size="21"></td>
    		</tr>
    		<tr>
    			<td>密码:</td>
    			<td><input name="spass" type="password" size="21"></td>
    		</tr>
    	</table> 
    	<input type="submit" value="注册">
    	<input type="reset" value="重置"> 
    </form>
    <br>
    <a href="/">登录</a>
    </div>
  </body>
</html>