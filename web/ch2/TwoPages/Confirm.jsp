<!DOCTYPE HTML>
<html>
  <head>
    <meta charset="utf-8">
    <title>Confirmation Page with Edit Option</title>
  </head>
  <body>
    <p>The value of the hobby that was sent to 
       this page is: <strong>${param.hobby}</strong>.
    <form action="Edit.jsp">
      <p>
        If there is an error, please select <em>Edit</em>.
        <br>
        <input type="hidden" name="hobby" 
                             value="${param.hobby}">
        <input type="submit" name="editButton" 
                             value="Edit">    
    </form>
  </body>
</html>
