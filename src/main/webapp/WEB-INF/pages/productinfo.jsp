<%--
  Created by IntelliJ IDEA.
  User: DlogushIV
  Date: 15.03.2017
  Time: 17:35
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product information</title>
    <link href="<c:url value="/resources/style.css" />" rel="stylesheet" type="text/css"/></head>
</head>
<body>
<a href="/../products">Back to products list page.</a>

<br/>
<br/>

<h1>Product information</h1>

<table class="tg">
    <tr>
        <th width="40">ID</th>
        <th width="100">Name</th>
        <th width="120">Producer</th>
        <th width="60">Cost</th>
        <th width="200">Description</th>
    </tr>
    <tr>
        <td>${product.id}</td>
        <td>${product.name}</td>
        <td>${product.producer}</td>
        <td>${product.cost}</td>
        <td>${product.description}</td>
    </tr>
</table>

</body>
</html>
