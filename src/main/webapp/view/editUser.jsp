<%--
  Created by IntelliJ IDEA.
  User: dbuxy
  Date: 1/20/2023
  Time: 12:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib
        uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Spring Registration Form</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.2.3/css/bootstrap.css">
</head>
<body style="background: black">
<center>
    <div style="width: 500px">
        <form:form action="afterEdit" name="submitForm" method="POST" modelAttribute="user">
            <h2>User Edit</h2>
            <div class="table-responsive-sm">
                <table class="table table-bordered" style="color: #ec246e; background: #272822">
                    <tr style="display: none">
                        <td>
                            <form:label path="id">ID:</form:label>
                        </td>
                        <td>
                            <form:hidden path="id" value="${user.id}"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="firstName">First name:</form:label>
                        </td>
                        <td>
                            <form:input path="firstName" value="${user.firstName}"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="lastName">Last name:</form:label>
                        </td>
                        <td>
                            <form:input path="lastName" value="${user.lastName}"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="email">Email:</form:label>
                        </td>
                        <td>
                            <form:input path="email" value="${user.email}"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="password">Password:</form:label>
                        </td>
                        <td>
                            <form:password path="password" value="${user.password}"/>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <form:button>Update</form:button>
                        </td>
                    </tr>
                </table>
            </div>
        </form:form>
    </div>
</center>
</body>
</html>
