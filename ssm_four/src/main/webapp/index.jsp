<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
		<base target="main" />
		<title>欢迎进入-中北在线商城-系统</title>
		<link rel="stylesheet" type="text/css"
			href="<%=basePath%>jslib/bootstrap/css/bootstrap.css">
		<link rel="stylesheet" type="text/css"
			href="<%=basePath%>css/theme.css">
		<link rel="stylesheet"
			href="<%=basePath%>jslib/font-awesome/css/font-awesome.css">
		<script src="<%=basePath%>jslib/jquery-1.7.2.min.js"
			type="text/javascript"></script>

		<style type="text/css">
#line-chart {
	height: 300px;
	width: 800px;
	margin: 0px auto;
	margin-top: 1em;
}

.brand {
	font-family: georgia, serif;
}

.brand .first {
	color: #ccc;
	font-style: italic;
}

.brand .second {
	color: #fff;
	font-weight: bold;
}
.logo{
	text-align:center;
	background:url("/img/1.jpg")
}
.fl{
	font-weight:bold;
	font-size:15px;
	text-align:center;
	vertical-align:middle;
	line-height:3;
	color: rgb(247,255,0);
/* 	background-image: -webkit-gradient(linear, 0 0, 0 bottom, from(rgba(238,238,238, 1)), to(rgba(247,255,0, 1)));
     -webkit-background-clip: text;
     -webkit-text-fill-color: transparent; */
}

</style>
	</head>

	<body class="">
		<!--<![endif]-->

		<div class="navbar">
			<div class="navbar-inner">
				<ul class="nav pull-right">
					<li id="fat-menu" class="dropdown">
						<a href="#" role="button" class="dropdown-toggle"
							data-toggle="dropdown" color: #fff>用户登录 <i class="icon-user"></i>
							${user.usertruename}(${user.rolename}) <i class="icon-caret-down"></i>
						</a>

						<ul class="dropdown-menu">
						<li class="divider visible-phone"></li>
							<li>
								<a tabindex="-1" href="/AdminLogin" target="_top">管理员登陆</a>
							</li>
							<!-- <li class="divider"></li>
							<li>
								<a tabindex="-1" class="visible-phone" href="#">Settings</a>
							</li> -->
							<li class="divider visible-phone"></li>
							<li>
								<a tabindex="-1" href="/TeacherLogin" target="_top">老师登陆</a>
							</li>
							<li class="divider visible-phone"></li>
							<li>
								<a tabindex="-1" href="StudentLogin" target="_top">学生登陆</a>
							</li>
						</ul>
					</li>

				</ul>
				<a class="brand" href="#"><span class="first">欢迎使用</span>
				 <span	class="second">远程能力测试评价-系统</span> </a>
				 <div class="fl"><!--#begineditable name="当前时间" action="webber.wbst.com.util.CalendarAction" layout="/system/_component/calendar/calendar7.jsp" tpltype="0" contype="" clone="" viewid="126843" contentviewid="" tagname="当前时间"-->
				 <div id="js126843jsclock"></div></div>
<script>
function js126843jstick() {
try{
var hoursjs126843js, minutesjs126843js, secondsjs126843js, xfilejs126843js;
var intHoursjs126843js, intMinutesjs126843js, intSecondsjs126843js;
var todayjs126843js, thedayjs126843js;
var timeStringjs126843js="";
todayjs126843js = new Date();
function initArrayjs126843js(){
this.length=initArrayjs126843js.arguments.length
for(var i=0;i<this.length;i++)
this[i+1]=initArrayjs126843js.arguments[i] }
var d=new initArrayjs126843js(
"星期日",
"星期一",
"星期二",
"星期三",
"星期四",
"星期五",
"星期六");
thedayjs126843js = (todayjs126843js.getYear()<1900?todayjs126843js.getYear()+1900:todayjs126843js.getYear())+"年" + [todayjs126843js.getMonth()+1]+"月" +todayjs126843js.getDate()+"日" ;
intHoursjs126843js = todayjs126843js.getHours();
intMinutesjs126843js = todayjs126843js.getMinutes();
intSecondsjs126843js = todayjs126843js.getSeconds();
hoursjs126843js =intHoursjs126843js;
if (intHoursjs126843js == 0) {
    xfilejs126843js = "午夜";
} else if (intHoursjs126843js < 12) {
    xfilejs126843js = "上午";
} else if (intHoursjs126843js == 12) {
    xfilejs126843js = "正午";
} else {
    xfilejs126843js = "下午";
}
if (intMinutesjs126843js < 10) {
    minutesjs126843js = "0"+intMinutesjs126843js+":";
} else {
    minutesjs126843js = intMinutesjs126843js+":";
}
if (intSecondsjs126843js < 10) {
    secondsjs126843js = "0"+intSecondsjs126843js+" ";
} else {
    secondsjs126843js = intSecondsjs126843js+" ";
}

    timeStringjs126843js += thedayjs126843js;

    timeStringjs126843js +=  d[todayjs126843js.getDay()+1];


    timeStringjs126843js += hoursjs126843js+":"+minutesjs126843js+secondsjs126843js;

document.getElementById("js126843jsclock").innerHTML = '<span  class="fontstyle126843" >'+timeStringjs126843js+'</font>';
window.setTimeout("js126843jstick();", 1000);
}catch(e){}
}
js126843jstick();
</script><!--#endeditable--></div>
				 
			</div>
		</div>

		<div class="sidebar-nav">
			<c:forEach items="${list}" var="top">
				<c:if test="${top.funpid==\"-1\"}">
					<a href="#error-menu${top.funid}" class="nav-header collapsed"
						data-toggle="collapse"><i class="icon-briefcase"></i>${top.funname}<i
						class="icon-chevron-up"></i> </a>
					<ul id="error-menu${top.funid}" class="nav nav-list collapse">
						<c:forEach items="${list}" var="child">
							<c:if test="${child.funpid==top.funid}">
								<li>
									<a href="<%=basePath%>${child.funurl}">${child.funname}</a>
								</li>
							</c:if>
						</c:forEach>
					</ul>
				</c:if>
			</c:forEach>
		</div>
		<div class="content">
		
		<div class="top">
		<div class="logo">
		<a href="http://www.ehuatong.org/">
			<marquee behavior=alternate>
				<img width="173" border="0" height="59" src="http://img.25pp.com/uploadfile/soft/images/2015/0713/20150713094806631.jpg" alt="图书商城">
			</marquee>
		</a>
		</div>
		<div class="sou">
		<ul class="sou_nav">
		</div>
		<div class="vip"> </div>
		</div>
		
		<div style="text-align:center"><h3>远程能力测试评价-系统</h3></div>
		<h5><p>&nbsp;&nbsp;&nbsp;&nbsp;中北-远程能力测试评价-系统是国内最大远程能力测试评价-系统，网上购物就到远程能力测试评价-系统！</p>
		<p>&nbsp;&nbsp;&nbsp;&nbsp;<b>远程能力测试评价-系统 </b> 是知名的综合性网上购物商城，由国内著名出版机构科文公司、美国老虎基金、美国IDG集团、卢森堡剑桥集团、亚洲创业投资基金（原名软银中国创业基金）共同投资成立。
		从1999年11月正式开通至今，<b>远程能力测试评价-系统</b>  已从早期的网上卖书拓展到网上卖各品类百货，包括图书音像、美妆、家居、母婴、服装和3C数码等几十个大类，数百万种商品。物流方面，图书商城在全国600个城市实现“111全天达”，在1200多个区县实现了次日达，货到付款(COD)方面覆盖全国2700个区县。
		图书商城  于美国时间2016年11月11日在纽约证券交易所正式挂牌上市，成为中国第一家完全基于线上业务、在美国上市的B2C网上商城。
				</p></h5>
			<iframe name="main" height="600px" width="100%" scrolling="auto"
				frameborder="0" src="">
				
			</iframe>
		</div>
		<script src="<%=basePath%>jslib/bootstrap/js/bootstrap.js"></script>
	<!-- 	<iframe src="/login" frameBorder="0" width="900" scrolling="no" height="900"></iframe> -->
	</body>
</html>