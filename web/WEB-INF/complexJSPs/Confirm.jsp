<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Confirmation Page with Edit/Process Options</title>
  </head>
  <body>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
   <p>This is a simple HTML page that has a form in it.</p>
    <ul>
      <li>Secret Code: ${assist.data.password}
      <li>Level of Happiness: ${assist.data.happiness}
      <li>Extras:
        <ul>
        <core:forEach var="extra" items="${assist.data.extra}">
          <li>${extra}
        </core:forEach>
        </ul>
      <li>Comments: ${assist.data.comments}
      <li>Grade: ${assist.data.grade}
      <li>Teams:
        <ul>
        <core:forEach var="team" items="${assist.data.team}">
          <li>${team}
        </core:forEach>
        </ul>
    </ul>
    <form method="post" action="Controller">
      <p>
        <input type="submit" name="editButton" value="Edit">
        <input type="submit" name="processButton" value="Process">
      </p>
    </form>
  </body>
</html>
