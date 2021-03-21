<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="org.learn.util.Mappings" %>

<html>
<head>
    <title>Todo List application</title>
</head>
<body>
<div align="center">
    <c:url var="itemsUrl" value="${Mappings.ITEMS}"/>
    <h2><a href="${itemsUrl}">Show Todo Items</a> </h2>
</div>
</body>
</html>
