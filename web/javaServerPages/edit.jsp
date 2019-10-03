<!DOCTYPE HTML>
<html>
    <head>
        <meta charset="utf-8">
        <title>Edit Page</title>
    </head>
    <body>
        <p>
            This is a simple HTML page that has a form in it.
        <form action="Controller">
            <p>

            <p>

                Your Hobby: <input type="text" name="hobby" 
                                   value="${helper.data.hobby}">
                <br>

                Your Name: <input type="text" name="name" 
                                  value="${helper.data.name}">
                <input type="submit" name="confirmButton" 
                       value="Confirm">     
        </form>
    </body>
</html>