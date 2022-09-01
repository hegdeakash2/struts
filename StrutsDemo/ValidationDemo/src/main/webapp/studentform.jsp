<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:form action="sregister">
			<s:textfield name="student.name" label="Name"></s:textfield>
			<s:textfield name="student.password" label="City"></s:textfield>
			<s:textfield name="student.age" label="Age"></s:textfield> 
			<s:textfield name="student.email" label="Email"></s:textfield> 
		    <s:radio  name="student.gender"  label="gender" list="{'male','female'}"></s:radio>
		
			<s:select name= "student.course" label="Course " list="{'java','spring','angular','html','struts'}"></s:select>
			<s:textfield name="student.mobile" label="Mobile"></s:textfield>
			<s:textfield name="student.allowance" label="Allowance"></s:textfield>
			<s:submit value="Register"></s:submit>
			</s:form>
</body>
</body>
</html> 