<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Add plan Form</title>
<style type="text/css">
@import
url(
"<c:url value="
/
css
/main.css"/>");
</style>
</head>
<body>

	<div id="global">
		<form:form commandName="plan" action="save-plan" method="post">
			<fieldset>
				<legend>Add a plan</legend>
				<p>
					<label for="person">Person: </label>
					<form:select id="person" path="person.name" items="${persons}"
						itemLabel="name" itemValue="name" />
				</p>
				<p>
					<label for="subject">Subject: </label>
					<form:input id="subject" path="subject" />
				</p>
				<p>
					<label for="description">Description: </label>
					<form:textarea rows="4" id="description" path="description" placeholder="请描述具体计划步骤："/>
				</p>
				<p>
					<label for="startDate">StartDate: </label>
					<form:input id="startDate" path="startDate" />
				</p>
				<p>
					<label for="reportDate">ReportDate: </label>
					<form:input id="reportDate" path="reportDate" />
				</p>
				<p>
					<label for="expiryDate">ExpiryDate: </label>
					<form:input id="expiryDate" path="expiryDate" />
				</p>

				<p>
					<label for="status">Status: </label>
					<form:input id="status" path="status" />
				</p>
				<p>
					<label for="memo">Memo: </label>
					<form:input id="memo" path="memo" />
				</p>

				<p id="buttons">
					<input id="reset" type="reset" tabindex="4"> <input
						id="submit" type="submit" tabindex="5" value="Add Plan">
				</p>
			</fieldset>
		</form:form>
	</div>
</body>
</html>