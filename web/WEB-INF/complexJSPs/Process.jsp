<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Process Page</title>
  </head>
  <body>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
             prefix="core" %>
   <P>Thank you for entering your data. Correct
    <ul>
      <li>Secret Code: ${assist.data.password}
      <li>Level of Happiness: ${assist.data.happiness}
      <li>Extras:
      <ul>
        <core:forEach var="element" items="${assist.data.extra}">
          <li>${element}
        </core:forEach>
      </ul>
      <li>Comments: ${assist.data.comments}
      <li>Grade: ${data.grade}
      <li>Teams:
      <ul>
        <core:forEach var="element" 
                      items="${assist.data.team}">
          <li>${element}
        </core:forEach>
      </ul>
    </ul>
    <form method="post" action="Controller">
      <input type="submit" name="editButton" value="Edit">
      </p>
    </form>
    <form method="get" action="Controller">
      <input type="submit" name="editButton" value="New">
      </p>
    </form>
    <table>
      <core:forEach var="record" items="${somethingClever}">
        <tr>
          <td>${record.password}
          <td>${record.happiness}
          <td>
            <ul>
              <core:forEach var="extra" 
                            items="${record.extra}">
                <li>${extra}
              </core:forEach>
            </ul>
          <td>${record.comments}
          <td>${record.grade}
          <td>
            <ul>
              <core:forEach var="team" 
                            items="${record.team}">
                <li>${team}
              </core:forEach>
            </ul>
        </tr>
      </core:forEach>
    </table>
  </body>
</html>



