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
    <p>
      Thank you for your information. Your hobby of 
      <strong>${helper.data.land}</strong> that is practiced
      <strong>${helper.data.region}</strong> days per week
      and aversion of
      <strong>${helper.data.crop}</strong> will be added to our
      records.
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
    <p>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
             prefix="core" %>
      <core:forEach var="row" items="${database}">
        ${row.id}, 
        ${row.land}, 
        ${row.region},
        ${row.crop}<br>
      </core:forEach>
  </body>
</html>

