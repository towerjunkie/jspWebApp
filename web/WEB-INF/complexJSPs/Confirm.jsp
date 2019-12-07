<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Confirmation Page with Edit/Process Options</title>
  <link rel="stylesheet"
              href="/styles/stylesheet.css"
              type="text/css">
  </head>
  <body>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
   <h1>Confirm Page</h1>
    <ul>
      <li>Ticket Number ${assist.client.password}
      
      <li>Crops:
        <ul>
        <core:forEach var="crop" items="${assist.client.crop}">
          <li>${crop}
        </core:forEach>
        </ul>
      <li>Acres: ${assist.client.acres}
      <li>Region: ${assist.client.region}
      <li>Land Use:
        <ul>
        <core:forEach var="land" items="${assist.client.land}">
          <li>${land}
        </core:forEach>
        </ul>
    </ul>
    <form method="post" action="Controller">
      <p>
        <input type="submit" name="editButton" value="Edit">
        <input type="submit" name="processButton" value="Process">
        <input type="Submit" name="wishlistButton" value="Wishlist">
      </p>
    </form>
  </body>
</html>
