<%--
  Created by IntelliJ IDEA.
  User: Waylesange
  Date: 11.12.16
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Index</title>
</head>
<body>
Hello, World! <a href="${pageContext.request.contextPath}/login">Please login...</a>
<sec:authorize access="hasRole('ROLE_ADMIN')">
    <a href="${pageContext.request.contextPath}/admin">Admin, go here!</a>
</sec:authorize>
</body>
</html>
