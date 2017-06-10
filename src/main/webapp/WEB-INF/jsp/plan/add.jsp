<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Add plan Form</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>

<script language="javascript" type="text/javascript">     
      function ShowPasswordBox()
      {
    	  window.alert("Hello World!");
        // 显示密码输入框
        var pwd = window.open ("add_form","Sample","fullscreen=no,toolbar=no,location=no,directories=no,status=no,menubar=no,scrollbars=no,resizable=no, copyhistory=no,width=350,height=140,left=200,top=300");
        if(pwd)
        {
          // 设置显示内容为输入框中的内容
          document.getElementById("showpwd").value = pwd;
        }        
      }
    </script>
    
</head>
<body>

	<div id="global">
		<form:form commandName="plan" action="plan/save" method="post">
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
	
	<input type="button" value="button" onclick="ShowPasswordBox()"/>
    <input type="text" name="showpwd" id="showpwd" />
    
</body>
</html>