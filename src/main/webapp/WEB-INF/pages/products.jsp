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
    <title>Products page</title>
    <link href="<c:url value="/resources/style.css" />" rel="stylesheet" type="text/css"/></head>
<body>
<a href="../../index.jsp">Back to main page.</a>

<br/>
<br/>

<h1>Product List</h1>
<c:if test="${!empty allProducts}">
    <table class="tg">
        <tr>
            <th width="40">ID</th>
            <th width="100">Name</th>
            <th width="120">Producer</th>
            <th width="60">Cost</th>
            <th width="200">Description</th>
            <th width="50">Edit</th>
            <th width="50">Delete</th>
        </tr>
        <c:forEach items="${allProducts}" var="product">
            <tr>
                <td>${product.id}</td>
                <td><a href="/productinfo/${product.id}" target="_blank"> ${product.name}</a></td>
                <td>${product.producer}</td>
                <td>${product.cost}</td>
                <td>${product.description}</td>
                <td><a href="<c:url value="/edit/${product.id}"/>"/> Edit</td>
                <td><a href="<c:url value="/delete/${product.id}"/>"/>Delete</td>
            </tr>
        </c:forEach>
    </table>
</c:if>

<h1>Add a product</h1>

<c:url var="addAction" value="/products/add"/>
<form:form action="${addAction}" commandName="product">
    <table>
        <c:if test="${!empty product.name}">
            <tr>
                <td>
                    <form:label path="id">
                        <spring:message text="ID"/>
                    </form:label>
                </td>
                <td>
                    <form:input path="id" readonly="true" size="8" disabled="true"/>
                    <form:hidden path="id"/>
                </td>
            </tr>
        </c:if>
        <tr>
            <td>
                <form:label path="name">
                    <spring:message text="Name"/>
                </form:label>
            </td>
            <td>
                <form:input path="name"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="producer">
                    <spring:message text="Producer"/>
                </form:label>
            </td>
            <td>
                <form:input path="producer"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="cost">
                    <spring:message text="Cost"/>
                </form:label>
            </td>
            <td>
                <form:input path="cost"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="description">
                    <spring:message text="Description"/>
                </form:label>
            </td>
            <td>
                <form:input path="description"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <c:if test="${!empty product.name}">
                    <input type="submit" value="<spring:message text="Edit product"/> "/>
                    <%--<button class="btn btn-lg btn-primary btn-block" type="submit">"Edit product"</button>--%>
                </c:if>
                <c:if test="${empty product.name}">
                    <input type="submit" value="<spring:message text="Add product"/> "/>
                    <%--<button class="btn btn-lg btn-primary btn-block" type="submit">"Edit product"</button>--%>
                </c:if>
            </td>
        </tr>
    </table>
</form:form>

</body>
</html>
