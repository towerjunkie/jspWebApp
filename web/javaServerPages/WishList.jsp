<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Process </title>
        <link rel="stylesheet"
              href="/styles/stylesheet.css"
              type="text/css">
    </head>
    <body>
        <h1>Your Wish List</h1>
        <p>You may use this wish list to add and save any products or services 
        <br>we offer to view and purchase at a later time. For now, the wishlist
        <br>displays the initial information collected from the user.
        <br>Currently, your wish list has saved the following properties:
        </p>

        <strong>${helper.data.usage}</strong>
        <br>
        <strong>${helper.data.crop}</strong>
        <br>
        <strong>${helper.data.region}</strong>

        <form action="Controller">
            <input type="hidden" name="usage" 
                   value="${helper.data.usage}">
            <input type="hidden" name="crop" 
                   value="${helper.data.crop}">
            <input type="hidden" name="region" 
                   value="${helper.data.region}">
            <p>
                <input type="submit" name="editButton" 
                       value="Edit">
                <input type="submit" name="confirmButton" 
                       value="Confirm"> 
        </form>

    </body>
</html>
