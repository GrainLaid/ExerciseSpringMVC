<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Страница авторизации</title>
</head>
<body>

<br>
<h2>Enter developer information</h2>
<spring:form modelAttribute="users" method="get" action="${pageContext.servletContext.contextPath}/users" >
<table>
    <tr>
        <td><form:label path="userName">userName</form:label></td>
        <td><form:input path="userName" /></td>
    </tr>
    <tr>
        <td><form:label path="email">email</form:label></td>
        <td><form:input path="email" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>
</spring:form>
</body>
</html>