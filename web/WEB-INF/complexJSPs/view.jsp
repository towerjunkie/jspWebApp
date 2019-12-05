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
            <core:forEach var="row" items="${baseData}">
                <tr>
                    <td><core:out value="${row.id}" /></td> 
                    <td><core:forEach var="land" items="${row.land}">
                    ${land}
                    </core:forEach>
                    </td>
                    <td><core:forEach var="crop" items="${row.crop}">  
                    ${crop}
                    </core:forEach>
                    </td>
                    
                    <td><core:out value="${row.region}" /></td>
                    <td><core:out value="${row.acres}" /></td>
                </tr>
            </core:forEach>
        </table>
        <form method="POST" action="Controller">

            <p>
                <input type="submit" name="editButton" 
                       value="Edit">
            <form method="GET" action="Controller">
                <p>
                    <input type="submit" name="editButton" 
                           value="New">
                </p>
                </body>
                </html>