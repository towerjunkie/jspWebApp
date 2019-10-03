<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Process </title>
        <link rel="stylesheet"
              href="/dllan011/Styles/Styles.css"
              type="text/css">
    </head>
    <body>
        <p>Process Page</p>

        We will process your values of <strong>${helper.data.hobby}</strong> and <strong>${helper.data.name}</strong>
        <form action="Controller">
            <input type="hidden" name="name" 
                   value="${helper.data.name}">
            <input type="hidden" name="hobby" 
                   value="${helper.data.hobby}">
            <p>
                <input type="submit" name="editButton" 
                       value="Edit">
        </form>

    </body>
</html>
