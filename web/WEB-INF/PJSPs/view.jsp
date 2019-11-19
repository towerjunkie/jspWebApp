<%-- 
    Document   : view
    Created on : Nov 18, 2019, 7:29:50 PM
    Author     : dllan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Page</title>
    </head>
    <body>
        <h1>View Page</h1>
        Table View
       <p>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
             prefix="core" %>
      <core:forEach var="row" items="${database}">
        ${row.id}, 
        ${row.land}, 
        ${row.region},
        ${row.crop},
        ${row.acres}<br>
      </core:forEach>
        
         <form method="POST" action="Controller">
      <p>
      <input type="submit" name="editButton" 
                           value="Edit">
    </form>
    <form method="GET" action="Controller">
      <p>
      <input type="submit" name="editButton" 
                           value="New">
      
      
    </form>
      
    </body>
</html>
