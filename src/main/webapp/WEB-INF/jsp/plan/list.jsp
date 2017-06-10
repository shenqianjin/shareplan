<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Plan List</title>
<style type="text/css">
body {
text-align: center;
}
</style>
</head>
<body>
	<div id="global">
		<h1>Plan List</h1>
		<a href="<c:url value="/plan/add"/>">Add Plan</a>
		<br/>
		<br/>
		<br/>
		<table align="center" border="1">
			<tr style="background: #ababff">
				<th width="10%">姓名</th>
				<th width="15%">主题</th>
				<th width="25%">描述</th>
				<th width="10%">状态</th>
				<th width="10%">备注</th>
				<th width="10%">开始日期</th>
				<th width="10%">分享日期</th>
				<th width="10%">过期日期</th>
				<th width="10%">&nbsp;</th>
			</tr>
			<c:forEach items="${plans}" var="plan" varStatus="status">
				<tr>
					<c:if test="${status.count%2 == 0}">
						<tr style="background: #eeeeff">
					</c:if>
					<c:if test="${status.count%2 == 1}">
						<tr style="background: #dedeff">
					</c:if>
					<td>${plan.person.name}</td>
					<td>${plan.subject}</td>
					<td align="left">${plan.description}</td>
					<td>${plan.status}</td>
					<td>${plan.memo}</td>
					<td>${plan.startDate}</td>
					<td>${plan.reportDate}</td>
					<td>${plan.expiryDate}</td>
					<td><a href="edit-plan/${plan.id}">Edit</a></td>
				</tr>
			</c:forEach>

		</table>
	</div>
</body>
</html>