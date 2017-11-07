<%--
  Created by IntelliJ IDEA.
  User: fsuser
  Date: 2017-11-06
  Time: 21:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Question Form</title>
</head>
<body>
<form action="get_result" method="post">

    <c:forEach items="${questions}" var="question" varStatus="status">
        <p>
            ${question.id}:${question.description}
            <input name="answers[${status.index}].questionId" value="${question.id}"/>
            <input name="answers[${status.index}].answer"/>
        </p>

    </c:forEach>
    <input type="submit" value="commit"/>
</form>

</form>
</body>
</html>
