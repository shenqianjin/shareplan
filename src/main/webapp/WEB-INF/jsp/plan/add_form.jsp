<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head >
    <title>新建邮件夹输入框</title>
    <SCRIPT>
      <!--
        function bconfirm(){
           opener.document.all['inboxname'].value=document.form1.inboxname.value;
           opener.opensub();
           window.close();
        }
       
        function bcancel(){
           window.close();
        }
      -->
    </SCRIPT>
</head>                                
                   
<body bgcolor=#66CD00>
    <FONT size=5>请输入新邮件夹的名称：</FONT>
    <FORM method=post name=form1 action="">
      <INPUT type=text name=inboxname size=35><p>
      <INPUT type=button name=inputboxbt value=确定 onclick="bconfirm();">
      <INPUT type=button name=inputboxbs value=取消 onclick="bcancel();">
    </FORM>
    <FORM> 
<INPUT TYPE='BUTTON' value='关闭' onClick='window.close()'> 
</FORM> 
   
</body>
</html>