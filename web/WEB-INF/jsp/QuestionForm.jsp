<%--
  Created by IntelliJ IDEA.
  User: fsuser
  Date: 2017-11-06
  Time: 21:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Question Form</title>
</head>
<body>
<c:forEach items="${questions}" var="question">
    <p>${question.description}</p>
</c:forEach>
</body>
</html>
