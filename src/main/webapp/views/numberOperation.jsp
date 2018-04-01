<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix = "f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Number Operations</title>
</head>
<body>
	<h2>Number Addition</h2>
	<f:form method="POST" action="addNumber">
		<table>
			<tr>
				<td><f:label path="number1">Number1:</f:label></td>
				<td><f:input path="number1"/></td>
			</tr>
			<tr>
				<td><f:label path="number2">Number2:</f:label></td>
				<td><f:input path="number2"/></td>
			</tr>
			<tr>
				<td><f:label path="number3">Number3:</f:label></td>
				<td><f:input path="number3"/></td>
			</tr>
			<tr>
               <td colspan = "2">
                  <input type = "submit" value = "Get Summation"/>
               </td>
            </tr>
		</table>
	</f:form>
	${summation}
</body>
</html>