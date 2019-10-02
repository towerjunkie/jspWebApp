<!DOCTYPE HTML>
<html>
  <head>
    <meta charset="utf-8">
    <title>Confirm Page</title>
    <link rel="stylesheet"
              href="/Tutorials/styles/tutorialStyle.css"
              type="text/css">
  </head>
  <body>
    <p>
      This is a simple HTML page that has a form in it.
     <p>
      The value of the hobby that was sent to 
      this page is: <strong>${param.hobby}</strong>
      <br>
      The value of the aversion that was sent to 
      this page is: <strong>${param.aversion}</strong>
    <p>
      If there is an error, please select <em>Edit</em>, 
      otherwise please select <em>Process</em>. 
    <form action="Controller">
      <input type="hidden" name="hobby" 
                           value="${param.hobby}">
      <input type="hidden" name="aversion" 
                           value="${param.aversion}">
      <p>
      <input type="submit" name="editButton" 
                           value="Edit">
      <input type="submit" name="processButton" 
                           value="Process">
    </form>
  </body>
</html>
