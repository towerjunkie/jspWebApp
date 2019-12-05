<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Process </title>
        <link rel="stylesheet"
              href="/styles/stylesheet.css"
              type="text/css">
    </head>
    <body>
        <h1></h1>
    <p>
      
        Your land use is:<strong>${assist.client.land}</strong> <br>
        Your region is:<strong>${assist.client.region}</strong> <br>
        Your crop type is:<strong>${assist.client.crop}</strong> <br>
        Your acreage is:<strong>${assist.client.acres}</strong> <br>
        Total amount of fertilizer:<strong>${assist.client.calculation}</strong> gal/acres.
     
   
    <p>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
             prefix="core" %>
      <core:forEach var="row" items="${somethingclever}">
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
      <input type="Submit" name="viewButton" value="View">
    </form>
    <form method="GET" action="Controller">
      <p>
      <input type="submit" name="editButton" 
                           value="New">
      
      
      
    </form>
  </body>
</html>

