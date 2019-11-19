<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Page</title>
        <link rel="stylesheet"
              href="/styles/stylesheet.css"
              type="text/css">
        <style>
            table, th, td {
                border: 1.5px solid black;
            }
        </style>
    </head>
    <body>
        <h1>View Page</h1>
        <p>
            <%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
                       prefix="core" %>
        <table>
            <tr>
                <th>ID</th>
                <th>Land Use</th>
                <th>Crop Type</th>
                <th>Region</th>
                <th>Acreage</th>
            </tr>
            <core:forEach var="row" items="${database}">
                <tr>
                    <td><core:out value="${row.id}" /></td> 
                    <td><core:out value="${row.land}" /></td>
                    <td><core:out value="${row.crop}" /></td>
                    <td><core:out value="${row.region}" /></td>
                    <td><core:out value="${row.acres}" /></td>
                </tr>
            </core:forEach>
        </table>
    </p>
</body>
</html>