<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration</title>
</head>
<body> 
	<f:form method="POST" action="/springapp/addStudent">
		<table>
			<tr>
				<td><f:label path="id">Id</f:label></td>
				<td><f:input path="id"/></td>
			</tr>
			<tr>
				<td><f:label path="name">Name</f:label></td>
				<td><f:input path="name"/></td>
			</tr>
			<tr>
				<td><f:label path="age">Age</f:label></td>
				<td><f:input path="age"/></td>
			</tr>
			<tr>
				<td><f:label path="sex">Gender</f:label></td>
				<td>
					<%-- <f:select path="sex">
						<f:option value="0" label="Select"/>
						<f:option value="M" label="Male"/>
						<f:option value="F" label="Female"/>
					</f:select>  --%>
					<f:radiobutton path="sex" value="M" label="Male"/>
					<f:radiobutton path="sex" value="F" label="Female"/>
				</td>
			</tr>
			<tr>
				<td><f:label path="aboutYou">About You</f:label></td>
				<td><f:textarea path="aboutYou"/></td>
			</tr>
			<tr>
				<td><f:label path="country">Country</f:label></td>
				<td>
					<f:select path="country">
						<f:option value="0" label="Select"></f:option>
						<f:options items="${countryList}" 
							itemLabel="countryName"
							itemValue="countryId"/>
					</f:select>
				</td>
			</tr>
			<tr>
				<td><f:label path="community">Community</f:label></td>
				<td>
					<f:checkboxes path="communityList" items="${communityList}" 
					itemLabel="key" itemValue="value"
					/>
				</td>
			</tr>
			<tr>
				<td></td>
				<td><f:checkbox path="mailingList"
					label="Would you like to join our mailinglist?" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Register"></td>
			</tr>
		</table>
	</f:form>
</body>
</html>