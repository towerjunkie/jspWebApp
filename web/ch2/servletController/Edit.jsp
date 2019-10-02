<!DOCTYPE HTML>
<html>
  <head>
    <meta charset="utf-8">
    <title>Edit Page</title>
    <link rel="stylesheet"
              href="/Tutorials/styles/tutorialStyle.css"
              type="text/css">
  </head>
  <body>
    <p>
      This is a simple HTML page that has a form in it.
    <form action="Controller">
      <p>
        If there are values for the hobby and aversion
        in the query string, then they are used to 
        initialize the hobby and aversion text elements.      
      <p>
        Hobby: 
        <input type="text" name="hobby" 
                           value="${param.hobby}">
        <br>
        Aversion: 
        <input type="text" name="aversion" 
                           value="${param.aversion}">
      <p>
        <input type="submit" name="confirmButton" 
                             value="Confirm">     
    </form>
  </body>
</html>
