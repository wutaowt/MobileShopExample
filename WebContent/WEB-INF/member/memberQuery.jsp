<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
th, td {
	border: 2px solid gray;
	text-align: center;
	padding: 2px 10px;
	width: 160px;
}

table {
	border-collapse: collapse;
}

body {
	text-align: center;
}

a {
	text-decoration: none
}

a:hover {
	text-decoration: underline;
	color: #FF0000;
	background-color: pink
}
 span {
	color:green;
}
</style>
</head>
<body>
	<h2>会员数据查询  <a  href="memberServlet?opt=add">新增</a></h2>

	<!-- jstl -->
	<table>
		<tr>
			<th>会员编号</th>
			<th>会员名</th>
			<th>性别</th>
			<th>邮箱</th>
			<th>手机号码</th>
			<th colspan="2">操作</th>
		</tr>
		<c:forEach items="${dataList}" var="member">
			<tr>
				<td>${member.member_id}</td>
				<td>${member.uname}</td>
				<td><c:if test='${member.sex eq "0"}'>男</c:if> <c:if
						test='${member.sex eq "1"}'>女</c:if></td>
				<td>${member.email}</td>
				<td>${member.mobile}</td>
				<td><a
					href="memberServlet?opt=edit&&member_id=${member.member_id}">编辑</a></td>
				<td><a
					href="memberServlet?opt=delete&&member_id=${member.member_id}">删除</a>&nbsp;<span><sup>ajax</sup></span></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>