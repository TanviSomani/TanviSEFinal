<%--
  Created by IntelliJ IDEA.
  User: tanvi
  Date: 2020-12-12
  Time: 5:08 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
          rel="stylesheet">

    <style>
        h1 {
            text-align: center;
        }
    </style>

</head>
<body>

<h1>Student Records</h1>

<h1> ${name}</h1>

<div class="container">
    <table class="table table-striped">
        <caption>The following are the student records.</caption>

        <thead>
        <tr>
            <th>Student Number</th>
            <th>Student Name</th>
            <th>GPA</th>
        </tr>
        </thead>

        <tbody>
        <c:forEach items="${data}" var="todo">
            <tr>
                <td>${data.snumber}</td>
                <td>${data.sname}</td>
                <td>${data.gpa}</td>
                <td>

                    <a type="button" class="btn btn-primary"
                       href="update-todo?id=${todo.id}">Edit</a>

                    <a type="button" class="btn btn-warning"
                       href="delete-todo?id=${todo.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <div>
        <a class="btn btn-success" href="add-new-record">Add</a>
    </div>
</div>

<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>