<%--
  Created by IntelliJ IDEA.
  User: dbuxy
  Date: 1/19/2023
  Time: 11:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Spring Registration Form</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.2.3/css/bootstrap.css">
</head>
<body style="background: black">
<center>
    <div style="width: 800px">
        <h2>User List</h2>
        <div class="table-responsive-sm">
            <table class="table table-bordered" style="color: chartreuse; background: #272822">
                <tr style="color: forestgreen;">
                    <td>
                        uid
                    </td>
                    <td>
                        first name
                    </td>
                    <td>
                        last name
                    </td>
                    <td>
                        email
                    </td>
                    <td>
                        password
                    </td>
                    <td>
                        actions
                    </td>
                </tr>
                <c:forEach var="u" items="${users}">
                    <tr>
                        <td>
                            <c:out value="${u.id}"/>
                        </td>
                        <td>
                            <c:out value="${u.firstName}"/>
                        </td>
                        <td>
                            <c:out value="${u.lastName}"/>
                        </td>
                        <td>
                            <c:out value="${u.email}"/>
                        </td>
                        <td>
                            <c:out value="${u.password}"/>
                        </td>
                        <td>
                            <a href="/editUser?id=${u.id}" class="btn btn-outline-primary">✏️</a>
                            <a href="/deleteUser?id=${u.id}" class="btn btn-outline-warning">❌</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</center>
</body>
</html>

