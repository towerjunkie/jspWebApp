<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirm page</title>
        <link rel="stylesheet"
              href="/dllan011/Styles/Styles.css"
              type="text/css">
    </head>
    <body>
        <p>Confirm</p>
        <br>
        Your name is  <strong>${helper.data.hobby}.</strong> <br>
        Your hobby is <strong>${helper.data.name}.</strong> 
        <form action ="Controller">

            <p></p>
            <em> Press edit to go back</em>
            <p></p>
            <em> Press process to confirm </em>
            <p></p>
            <br>
            <input type="hidden" name="name" value="${helper.data.name}">
            <input type="hidden" name="hobby" value="${helper.data.hobby}">
            <input type="Submit" name="editButton" value="Edit">

            <input type="Submit" name="processButton" value="Process">
        </form>

    </body>
</html>
