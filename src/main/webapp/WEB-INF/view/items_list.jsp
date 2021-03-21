<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="org.learn.util.Mappings" %>
<html>
<head>
    <title>ToDo Items</title>
</head>
<body>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>ToDo Items</h2></caption>
        <c:url var="addUrl" value="${Mappings.ADD_ITEM}"/>
        <h2><a href="${addUrl}">Add an item</a></h2>
        <tr>
            <th>Title</th>
            <th>Deadline</th>
            <th>Details</th>
            <th>Edit</th>
            <th>Delete item</th>
        </tr>
        <c:forEach var="item" items="${todoData.items}">
            <c:url var="viewUrl" value="${Mappings.VIEW_ITEM}">
                <c:param name="id" value="${item.id}"/>
            </c:url>
            <c:url var="editUrl" value="${Mappings.ADD_ITEM}">
                <c:param name="id" value="${item.id}"/>
            </c:url>
            <c:url var="deleteUrl" value="${Mappings.DELETE_ITEM}">
                <c:param name="id" value="${item.id}"/>
            </c:url>
            <tr>
                <td><c:out value="${item.title}"/></td>
                <td><c:out value="${item.deadline}"/></td>
                <td><a href="${viewUrl}">Details</a></td>
                <td><a href="${editUrl}">Edit</a></td>
                <td><a href="${deleteUrl}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
