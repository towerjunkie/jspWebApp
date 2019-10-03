<!DOCTYPE HTML>
<html>
    <head>
        <meta charset="utf-8">
        <title>Edit Page</title>
        <link rel="stylesheet"
              href="/dllan011/Styles/Styles.css"
              type="text/css">
    </head>
    <body>
        <p>
            Please enter your name and hobby.
        <form action="Controller">
            <p>

            <p>

                Hobby: <input type="text" name="hobby" 
                                   value="${helper.data.hobby}">
                <br>

                Name: <input type="text" name="name" 
                                  value="${helper.data.name}">
                <input type="submit" name="confirmButton" 
                       value="Confirm">     
        </form>
    </body>
</html>