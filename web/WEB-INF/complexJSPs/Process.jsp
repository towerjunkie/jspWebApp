<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Process Page</title>
  <link rel="stylesheet"
              href="/styles/stylesheet.css"
              type="text/css">
  </head>
  <h1>Process Page</h1>
  <body>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
             prefix="core" %>
    <ul>
      <li>Customer ID: ${assist.client.password}
     
      <li>Crops:
      <ul>
        <core:forEach var="element" items="${assist.client.crop}">
          <li>${element}
        </core:forEach>
      </ul>
      <li>Acres: ${assist.client.acres}
      <li>Region: ${assist.client.region}
      <li>Land Use:
      <ul>
        <core:forEach var="element" 
                      items="${assist.client.land}">
          <li>${element}
        </core:forEach>
      </ul>
      <li> Fertilizer:<strong>${assist.client.calculation}</strong> liter
    </ul>
    <form method="post" action="Controller">
      <input type="submit" name="editButton" value="Edit">
      </p>
    </form>
    <form method="get" action="Controller">
      <input type="submit" name="editButton" value="New">
      </p>
    </form>
      <form method="post" action="Controller">
      <input type="Submit" name="viewButton" value="View">
      </p>
    </form>
    <table>
      <core:forEach var="record" items="${base}">
        <tr>
          <td>${record.password}
          <td>
            <ul>
              <core:forEach var="crop" 
                            items="${record.crop}">
                <li>${crop}
              </core:forEach>
            </ul>
          <td>${record.acres}
          <td>${record.region}
          <td>
            <ul>
              <core:forEach var="land" 
                            items="${record.land}">
                <li>${land}
              </core:forEach>
            </ul>
        </tr>
      </core:forEach>
    </table>
  </body>
</html>



